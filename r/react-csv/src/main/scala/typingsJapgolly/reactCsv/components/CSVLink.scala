package typingsJapgolly.reactCsv.components

import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.Data
import typingsJapgolly.reactCsv.componentsLinkMod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CSVLink {
  
  inline def apply(data: String | Data | (js.Function0[String | Data])): SharedBuilder_LinkProps_1720482737[typingsJapgolly.reactCsv.mod.CSVLink] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps_1720482737[typingsJapgolly.reactCsv.mod.CSVLink](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("react-csv", "CSVLink")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps_1720482737[typingsJapgolly.reactCsv.mod.CSVLink] = new SharedBuilder_LinkProps_1720482737[typingsJapgolly.reactCsv.mod.CSVLink](js.Array(this.component, p.asInstanceOf[js.Any]))
}
