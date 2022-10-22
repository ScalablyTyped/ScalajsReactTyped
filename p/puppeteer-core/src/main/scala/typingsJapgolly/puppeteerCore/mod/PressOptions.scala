package typingsJapgolly.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PressOptions extends StObject {
  
  /**
    * Time to wait between `keydown` and `keyup` in milliseconds. Defaults to 0.
    */
  var delay: js.UndefOr[Double] = js.undefined
  
  /**
    * If specified, generates an input event with this text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object PressOptions {
  
  inline def apply(): PressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PressOptions]
  }
  
  extension [Self <: PressOptions](x: Self) {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
