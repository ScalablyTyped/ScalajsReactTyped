package typingsJapgolly.themeUiComponents

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.emotionReact.mod.jsx.JSX.Element
import typingsJapgolly.themeUiComponents.anon.Size
import typingsJapgolly.themeUiComponents.distDeclarationsSrcIconButtonMod.IconButtonProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMenuButtonMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/MenuButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/components/dist/declarations/src/MenuButton", "MenuButton")
  @js.native
  val MenuButton: ForwardRef[HTMLButtonElement, MenuButtonProps] = js.native
  
  inline def MenuIcon(hasSize: Size): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuIcon")(hasSize.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MenuButtonProps = IconButtonProps
}
