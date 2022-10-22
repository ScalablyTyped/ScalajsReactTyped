package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.distTypesMobilePreviewWidgetMod.MobilePreviewWidgetProps
import typingsJapgolly.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "MobilePreviewWidget")
@js.native
open class MobilePreviewWidget protected ()
  extends Component[MobilePreviewWidgetProps, js.Object, Any] {
  def this(props: MobilePreviewWidgetProps) = this()
  def this(props: MobilePreviewWidgetProps, context: Any) = this()
}
object MobilePreviewWidget {
  
  inline def apply: ComponentClassP[MobilePreviewWidgetProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("MobilePreviewWidget").asInstanceOf[ComponentClassP[MobilePreviewWidgetProps & js.Object]]
}
