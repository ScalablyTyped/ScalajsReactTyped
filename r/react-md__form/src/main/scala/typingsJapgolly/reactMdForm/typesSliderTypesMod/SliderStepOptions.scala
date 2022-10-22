package typingsJapgolly.reactMdForm.typesSliderTypesMod

import typingsJapgolly.reactMdForm.reactMdFormStrings.blur
import typingsJapgolly.reactMdForm.reactMdFormStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderStepOptions
  extends StObject
     with SliderValueOptions {
  
  /**
    * An optional amount to jump by when using the `PageUp` or `PageDown` keys.
    * When this is omitted, it will try to default to 10% of the full range to
    * the nearest step
    */
  var jump: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines when the `value` should be updated from the `useSlider` and
    * `useRangeSlider` hooks. When this is set to `"change"`, the `value` will
    * update immediately as the user interacts with the slider. When this is set
    * to `"blur"`, the `value` will only be updated once the user has tabbed away
    * from the slider or completed the drag via mouse/touch.
    *
    * It is recommended to set this to `"blur"` when the value does not need to
    * be used immediately.
    */
  var updateOn: js.UndefOr[change | blur] = js.undefined
}
object SliderStepOptions {
  
  inline def apply(): SliderStepOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderStepOptions]
  }
  
  extension [Self <: SliderStepOptions](x: Self) {
    
    inline def setJump(value: Double): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
    
    inline def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
    
    inline def setUpdateOn(value: change | blur): Self = StObject.set(x, "updateOn", value.asInstanceOf[js.Any])
    
    inline def setUpdateOnUndefined: Self = StObject.set(x, "updateOn", js.undefined)
  }
}
