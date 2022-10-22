package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.anon.BottomChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FooterLayout {
  
  inline def apply(
    bottomChildren: Any,
    buttonsHeight: Any,
    cancelPrefixIcon: Any,
    cancelSuffixIcon: Any,
    cancelText: Any,
    children: Any,
    confirmPrefixIcon: Any,
    confirmSuffixIcon: Any,
    confirmText: Any,
    enableCancel: Any,
    enableOk: Any,
    newColorsBranding: Any,
    onCancel: Any,
    onOk: Any,
    sideActions: Any,
    theme: Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(bottomChildren = bottomChildren.asInstanceOf[js.Any], buttonsHeight = buttonsHeight.asInstanceOf[js.Any], cancelPrefixIcon = cancelPrefixIcon.asInstanceOf[js.Any], cancelSuffixIcon = cancelSuffixIcon.asInstanceOf[js.Any], cancelText = cancelText.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], confirmPrefixIcon = confirmPrefixIcon.asInstanceOf[js.Any], confirmSuffixIcon = confirmSuffixIcon.asInstanceOf[js.Any], confirmText = confirmText.asInstanceOf[js.Any], enableCancel = enableCancel.asInstanceOf[js.Any], enableOk = enableOk.asInstanceOf[js.Any], newColorsBranding = newColorsBranding.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any], sideActions = sideActions.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BottomChildren]))
  }
  
  @JSImport("wix-style-react/dist/types/MessageBoxFunctionalLayout/FooterLayout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BottomChildren): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
