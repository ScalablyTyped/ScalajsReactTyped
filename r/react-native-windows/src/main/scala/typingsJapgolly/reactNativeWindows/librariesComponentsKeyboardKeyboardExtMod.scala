package typingsJapgolly.reactNativeWindows

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNativeWindows.anon.Children
import typingsJapgolly.reactNativeWindows.librariesComponentsKeyboardKeyboardExtPropsMod.IKeyboardProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsKeyboardKeyboardExtMod {
  
  @JSImport("react-native-windows/Libraries/Components/Keyboard/KeyboardExt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def supportKeyboard[P /* <: Record[String, Any] */](WrappedComponent: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[P & IKeyboardProps & Children]) & RefAttributes[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportKeyboard")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[(PropsWithoutRef[P & IKeyboardProps & Children]) & RefAttributes[Any]]]
}
