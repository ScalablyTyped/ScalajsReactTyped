package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.distTypesBrowserPreviewWidgetMod.BrowserPreviewWidgetProps
import typingsJapgolly.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "BrowserPreviewWidget")
@js.native
open class BrowserPreviewWidget protected ()
  extends Component[BrowserPreviewWidgetProps, js.Object, Any] {
  def this(props: BrowserPreviewWidgetProps) = this()
  def this(props: BrowserPreviewWidgetProps, context: Any) = this()
}
object BrowserPreviewWidget {
  
  inline def apply: ComponentClassP[BrowserPreviewWidgetProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("BrowserPreviewWidget").asInstanceOf[ComponentClassP[BrowserPreviewWidgetProps & js.Object]]
}
