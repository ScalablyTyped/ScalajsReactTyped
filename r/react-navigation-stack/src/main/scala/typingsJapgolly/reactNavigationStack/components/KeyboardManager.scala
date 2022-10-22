package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNavigationStack.anon.OnPageChangeCancel
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsKeyboardManagerMod.Props
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorViewsKeyboardManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyboardManager {
  
  inline def apply(children: OnPageChangeCancel => Node, enabled: Boolean): Default[default] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), enabled = enabled.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/KeyboardManager", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
