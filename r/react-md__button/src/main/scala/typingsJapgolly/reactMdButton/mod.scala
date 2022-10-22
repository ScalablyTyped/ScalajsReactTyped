package typingsJapgolly.reactMdButton

import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdButton.typesButtonMod.ButtonProps
import typingsJapgolly.reactMdButton.typesButtonThemeClassNamesMod.ButtonThemeProps
import typingsJapgolly.reactMdButton.typesFabMod.FABProps
import typingsJapgolly.reactMdButton.typesUnstyledButtonMod.UnstyledButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/button", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[ButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/button", "FAB")
  @js.native
  val FAB: ForwardRefExoticComponent[FABProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/button", "UnstyledButton")
  @js.native
  val UnstyledButton: ForwardRefExoticComponent[UnstyledButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  inline def buttonThemeClassNames(hasPropThemeThemeTypeButtonTypePropDisabledClassName: ButtonThemeProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonThemeClassNames")(hasPropThemeThemeTypeButtonTypePropDisabledClassName.asInstanceOf[js.Any]).asInstanceOf[String]
}
