package typingsJapgolly.reactCsv.components

import typingsJapgolly.reactCsv.componentsCommonPropTypesMod.Data
import typingsJapgolly.reactCsv.componentsDownloadMod.DownloadPropTypes
import typingsJapgolly.reactCsv.componentsDownloadMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Download {
  
  inline def apply(data: String | Data | (js.Function0[String | Data])): SharedBuilder_DownloadPropTypes_1931146456[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new SharedBuilder_DownloadPropTypes_1931146456[default](js.Array(this.component, __props.asInstanceOf[DownloadPropTypes]))
  }
  
  @JSImport("react-csv/components/Download", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DownloadPropTypes): SharedBuilder_DownloadPropTypes_1931146456[default] = new SharedBuilder_DownloadPropTypes_1931146456[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
