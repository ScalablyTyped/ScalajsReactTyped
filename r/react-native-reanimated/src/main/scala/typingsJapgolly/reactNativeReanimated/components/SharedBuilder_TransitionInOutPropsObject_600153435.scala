package typingsJapgolly.reactNativeReanimated.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-bottom`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-left`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-right`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.`slide-top`
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.bottom
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.easeIn
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.easeInOut
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.easeOut
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.fade
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.left
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.linear
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.right
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.scale
import typingsJapgolly.reactNativeReanimated.reactNativeReanimatedStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TransitionInOutPropsObject_600153435 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def delayMs(value: Double): this.type = set("delayMs", value.asInstanceOf[js.Any])
  
  inline def durationMs(value: Double): this.type = set("durationMs", value.asInstanceOf[js.Any])
  
  inline def interpolation(value: linear | easeIn | easeOut | easeInOut): this.type = set("interpolation", value.asInstanceOf[js.Any])
  
  inline def propagation(value: top | bottom | left | right): this.type = set("propagation", value.asInstanceOf[js.Any])
  
  inline def `type`(value: fade | scale | `slide-top` | `slide-bottom` | `slide-right` | `slide-left`): this.type = set("type", value.asInstanceOf[js.Any])
}
