package typingsJapgolly.winston

import typingsJapgolly.winston.libWinstonConfigMod.CliConfigSetColors
import typingsJapgolly.winston.libWinstonConfigMod.CliConfigSetLevels
import typingsJapgolly.winston.libWinstonConfigMod.NpmConfigSetColors
import typingsJapgolly.winston.libWinstonConfigMod.NpmConfigSetLevels
import typingsJapgolly.winston.libWinstonConfigMod.SyslogConfigSetColors
import typingsJapgolly.winston.libWinstonConfigMod.SyslogConfigSetLevels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bearer extends StObject {
    
    var bearer: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Bearer {
    
    inline def apply(): Bearer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bearer]
    }
    
    extension [Self <: Bearer](x: Self) {
      
      inline def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
      
      inline def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Colors extends StObject {
    
    var colors: CliConfigSetColors
    
    var levels: CliConfigSetLevels
  }
  object Colors {
    
    inline def apply(colors: CliConfigSetColors, levels: CliConfigSetLevels): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setColors(value: CliConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: CliConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorsLevels extends StObject {
    
    var colors: SyslogConfigSetColors
    
    var levels: SyslogConfigSetLevels
  }
  object ColorsLevels {
    
    inline def apply(colors: SyslogConfigSetColors, levels: SyslogConfigSetLevels): ColorsLevels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorsLevels]
    }
    
    extension [Self <: ColorsLevels](x: Self) {
      
      inline def setColors(value: SyslogConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: SyslogConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
  
  trait Levels extends StObject {
    
    var colors: NpmConfigSetColors
    
    var levels: NpmConfigSetLevels
  }
  object Levels {
    
    inline def apply(colors: NpmConfigSetColors, levels: NpmConfigSetLevels): Levels = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Levels]
    }
    
    extension [Self <: Levels](x: Self) {
      
      inline def setColors(value: NpmConfigSetColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: NpmConfigSetLevels): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
    }
  }
}
