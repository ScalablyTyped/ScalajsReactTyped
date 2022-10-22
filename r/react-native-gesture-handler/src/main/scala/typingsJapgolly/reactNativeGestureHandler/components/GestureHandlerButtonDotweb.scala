package typingsJapgolly.reactNativeGestureHandler.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNative.mod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GestureHandlerButtonDotweb {
  
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureHandlerButton.web", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GestureHandlerButtonDotweb.type): Default[View] = new Default[View](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RefAttributes[View]): Default[View] = new Default[View](js.Array(this.component, p.asInstanceOf[js.Any]))
}
