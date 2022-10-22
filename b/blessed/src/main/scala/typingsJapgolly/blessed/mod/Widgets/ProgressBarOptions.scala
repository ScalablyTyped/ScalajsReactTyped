package typingsJapgolly.blessed.mod.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarOptions
  extends StObject
     with BoxOptions {
  
  /**
    * the amount filled (0 - 100).
    */
  var filled: js.UndefOr[Double] = js.undefined
  
  /**
    * enable key support.
    */
  @JSName("keys")
  var keys_ProgressBarOptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * enable mouse support.
    */
  @JSName("mouse")
  var mouse_ProgressBarOptions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * can be `horizontal` or `vertical`.
    */
  var orientation: js.UndefOr[String] = js.undefined
  
  /**
    * the character to fill the bar with (default is space).
    */
  var pch: js.UndefOr[String] = js.undefined
  
  /**
    * same as `filled`.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ProgressBarOptions {
  
  inline def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  
  extension [Self <: ProgressBarOptions](x: Self) {
    
    inline def setFilled(value: Double): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setMouse(value: Boolean): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setMouseUndefined: Self = StObject.set(x, "mouse", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPch(value: String): Self = StObject.set(x, "pch", value.asInstanceOf[js.Any])
    
    inline def setPchUndefined: Self = StObject.set(x, "pch", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
