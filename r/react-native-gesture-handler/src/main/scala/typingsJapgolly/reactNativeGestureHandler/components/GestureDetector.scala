package typingsJapgolly.reactNativeGestureHandler.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureCompositionMod.ComposedGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureDetectorMod.GestureDetectorProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GestureDetector {
  
  @JSImport("react-native-gesture-handler", "GestureDetector")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def gesture(value: ComposedGesture | GestureType): this.type = set("gesture", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GestureDetector.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GestureDetectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
