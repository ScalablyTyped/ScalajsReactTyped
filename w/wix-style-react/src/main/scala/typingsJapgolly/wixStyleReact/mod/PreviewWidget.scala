package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixStyleReact.distTypesPreviewWidgetMod.PreviewWidgetProps
import typingsJapgolly.wixStyleReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("wix-style-react", "PreviewWidget")
@js.native
open class PreviewWidget protected ()
  extends Component[PreviewWidgetProps, js.Object, Any] {
  def this(props: PreviewWidgetProps) = this()
  def this(props: PreviewWidgetProps, context: Any) = this()
}
object PreviewWidget {
  
  inline def apply: ComponentClassP[PreviewWidgetProps & js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("PreviewWidget").asInstanceOf[ComponentClassP[PreviewWidgetProps & js.Object]]
}
