package typingsJapgolly.nivoCirclePacking.components

import typingsJapgolly.nivoCirclePacking.anon.Opacity
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.LabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelSvg {
  
  inline def apply[RawDatum](label: String | Double, node: ComputedDatum[RawDatum], style: Opacity): SharedBuilder_LabelProps_835567763[RawDatum] = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    new SharedBuilder_LabelProps_835567763[RawDatum](js.Array(this.component, __props.asInstanceOf[LabelProps[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing/dist/types/LabelSvg", "LabelSvg")
  @js.native
  val component: js.Object = js.native
  
  def withProps[RawDatum](p: LabelProps[RawDatum]): SharedBuilder_LabelProps_835567763[RawDatum] = new SharedBuilder_LabelProps_835567763[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
