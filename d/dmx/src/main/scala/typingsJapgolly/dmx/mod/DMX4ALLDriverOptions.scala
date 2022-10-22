package typingsJapgolly.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DMX4ALLDriverOptions extends StObject {
  
  /** @default 33 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
}
object DMX4ALLDriverOptions {
  
  inline def apply(): DMX4ALLDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DMX4ALLDriverOptions]
  }
  
  extension [Self <: DMX4ALLDriverOptions](x: Self) {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
  }
}
