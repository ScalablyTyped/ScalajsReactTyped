package typingsJapgolly.reactNativeReanimated.mod

import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-bottom`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-left`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-right`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-top`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.fade
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionInOutProps
  extends StObject
     with TransitionProps {
  
  var `type`: js.UndefOr[fade | scale | `slide-top` | `slide-bottom` | `slide-right` | `slide-left`] = js.undefined
}
object TransitionInOutProps {
  
  inline def apply(): TransitionInOutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionInOutProps]
  }
  
  extension [Self <: TransitionInOutProps](x: Self) {
    
    inline def setType(value: fade | scale | `slide-top` | `slide-bottom` | `slide-right` | `slide-left`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
