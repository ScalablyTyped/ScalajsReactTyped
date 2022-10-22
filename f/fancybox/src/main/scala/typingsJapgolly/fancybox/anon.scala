package typingsJapgolly.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoStart_ extends StObject {
    
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object AutoStart_ {
    
    inline def apply(): AutoStart_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoStart_]
    }
    
    extension [Self <: AutoStart_](x: Self) {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  trait Autostart extends StObject {
    
    var autostart: Boolean
  }
  object Autostart {
    
    inline def apply(autostart: Boolean): Autostart = {
      val __obj = js.Dynamic.literal(autostart = autostart.asInstanceOf[js.Any])
      __obj.asInstanceOf[Autostart]
    }
    
    extension [Self <: Autostart](x: Self) {
      
      inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Left {
    
    inline def apply(): Left = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
