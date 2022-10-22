package typingsJapgolly.fitbitWeather

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object companionMod {
  
  @JSImport("fitbit-weather/companion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fitbit-weather/companion", "Providers")
  @js.native
  val Providers: ProvidersCodes = js.native
  
  inline def setup(configuration: Configuration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setup")(configuration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Configuration extends StObject {
    
    var apiKey: String
    
    var provider: Double
  }
  object Configuration {
    
    inline def apply(apiKey: String, provider: Double): Configuration = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: Double): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvidersCodes extends StObject {
    
    var darksky: Double
    
    var openweathermap: Double
    
    var weatherbit: Double
  }
  object ProvidersCodes {
    
    inline def apply(darksky: Double, openweathermap: Double, weatherbit: Double): ProvidersCodes = {
      val __obj = js.Dynamic.literal(darksky = darksky.asInstanceOf[js.Any], openweathermap = openweathermap.asInstanceOf[js.Any], weatherbit = weatherbit.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidersCodes]
    }
    
    extension [Self <: ProvidersCodes](x: Self) {
      
      inline def setDarksky(value: Double): Self = StObject.set(x, "darksky", value.asInstanceOf[js.Any])
      
      inline def setOpenweathermap(value: Double): Self = StObject.set(x, "openweathermap", value.asInstanceOf[js.Any])
      
      inline def setWeatherbit(value: Double): Self = StObject.set(x, "weatherbit", value.asInstanceOf[js.Any])
    }
  }
}
