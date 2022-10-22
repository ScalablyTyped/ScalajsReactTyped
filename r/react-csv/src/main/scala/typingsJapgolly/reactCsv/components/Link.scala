package typingsJapgolly.reactCsv.components

import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.Data
import typingsJapgolly.reactCsv.componentsLinkMod.LinkProps
import typingsJapgolly.reactCsv.componentsLinkMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  inline def apply(data: String | Data | (js.Function0[String | Data])): SharedBuilder_LinkProps_1720482737[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_LinkProps_1720482737[default](js.Array(this.component, __props.asInstanceOf[LinkProps]))
  }
  
  @JSImport("react-csv/components/Link", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LinkProps): SharedBuilder_LinkProps_1720482737[default] = new SharedBuilder_LinkProps_1720482737[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
