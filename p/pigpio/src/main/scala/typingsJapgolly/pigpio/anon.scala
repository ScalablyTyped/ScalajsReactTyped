package typingsJapgolly.pigpio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alert extends StObject {
    
    /**
      * boolean specifying whether or not alert events are emitted when the GPIO changes state (optional, default false)
      */
    var alert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * interrupt edge for inputs. RISING_EDGE, FALLING_EDGE, or EITHER_EDGE (optional, no default)
      */
    var edge: js.UndefOr[Double] = js.undefined
    
    /**
      * INPUT, OUTPUT, ALT0, ALT1, ALT2, ALT3, ALT4, or ALT5 (optional, no default)
      */
    var mode: js.UndefOr[Double] = js.undefined
    
    /**
      * PUD_OFF, PUD_DOWN, or PUD_UP (optional, no default)
      */
    var pullUpDown: js.UndefOr[Double] = js.undefined
    
    /**
      * interrupt timeout in milliseconds (optional, defaults to 0 meaning no timeout if edge specified)
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Alert {
    
    inline def apply(): Alert = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alert]
    }
    
    extension [Self <: Alert](x: Self) {
      
      inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setEdge(value: Double): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPullUpDown(value: Double): Self = StObject.set(x, "pullUpDown", value.asInstanceOf[js.Any])
      
      inline def setPullUpDownUndefined: Self = StObject.set(x, "pullUpDown", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Bits extends StObject {
    
    /**
      * a bit mask indicating the GPIOs of interest, bit0 corresponds to GPIO0, bit1 corresponds to GPIO1, ..., bit31 corresponds to GPIO31.
      * If a bit is set, the corresponding GPIO will be monitored for state changes. (optional, no default)
      */
    var bits: Double
  }
  object Bits {
    
    inline def apply(bits: Double): Bits = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bits]
    }
    
    extension [Self <: Bits](x: Self) {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
    }
  }
}
