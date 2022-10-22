package typingsJapgolly.reactCopyToClipboard.components

import typingsJapgolly.reactCopyToClipboard.mod.Props
import typingsJapgolly.reactCopyToClipboard.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCopyToClipboard {
  
  inline def apply(text: String): SharedBuilder_Props_1231192942[^] = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new SharedBuilder_Props_1231192942[^](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-copy-to-clipboard", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_1231192942[^] = new SharedBuilder_Props_1231192942[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
