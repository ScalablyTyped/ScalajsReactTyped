package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeElements.anon.PickTextInputPropsRefAttr
import typingsJapgolly.reactNativeElements.anon.TextInputPropsRefAttribut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListListItemInputMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/list/ListItemInput", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTextInputPropsRefAttr] | ForwardRefExoticComponent[TextInputPropsRefAttribut] = js.native
  
  type _To = FunctionComponent[PickTextInputPropsRefAttr] | ForwardRefExoticComponent[TextInputPropsRefAttribut]
  
  /* This means you don't have to write `default`, but can instead just say `distListListItemInputMod.foo` */
  override def _to: FunctionComponent[PickTextInputPropsRefAttr] | ForwardRefExoticComponent[TextInputPropsRefAttribut] = default
}
