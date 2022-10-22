package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.anon.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HighlightCellText {
  
  inline def apply(query: String, text: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(query = query.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Query]))
  }
  
  @JSImport("baseui/data-table/text-search", "HighlightCellText")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Query): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
