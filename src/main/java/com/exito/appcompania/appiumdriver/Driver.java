package com.exito.appcompania.appiumdriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    // Declaración de la variable driver, que contendrá la instancia de AppiumDriver
    public static AppiumDriver<MobileElement> driver;

    // Método para iniciar la instancia de AppiumDriver con las configuraciones necesarias
    public static Driver navigator (){
        try {
            // Se crean las capacidades deseadas para el dispositivo y la aplicación
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","M2102J20SG"); // Nombre del dispositivo
            capabilities.setCapability("udid","6a7f6d35"); // ID del dispositivo
            capabilities.setCapability("platformName","Android"); // Plataforma del dispositivo
            capabilities.setCapability("appPackage","com.exito.appcompania"); // Paquete de la aplicación a probar
            capabilities.setCapability("appActivity","com.exito.appcompania.views.initialaccess.activities.SplashActivity"); // Actividad principal de la aplicación
            capabilities.setCapability("noReset","true"); // Evita que la aplicación se reinicie en cada sesión
            capabilities.setCapability("platformVersion","12"); // Versión del sistema operativo

            // Se crea la instancia de AppiumDriver con las capacidades deseadas
            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // Retorna una nueva instancia de la clase Driver, para permitir el encadenamiento de métodos
        return new  Driver();
    }

    // Método para obtener la instancia de AppiumDriver, para su uso en otros métodos
    public AppiumDriver<MobileElement> onDriver () {
        return driver;
    }
}
