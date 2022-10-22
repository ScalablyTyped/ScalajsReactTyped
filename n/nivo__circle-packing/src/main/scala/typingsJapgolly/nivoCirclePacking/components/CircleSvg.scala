package typingsJapgolly.nivoCirclePacking.components

import typingsJapgolly.nivoCirclePacking.anon.BorderColor
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CircleProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircleSvg {
  
  inline def apply[RawDatum](node: ComputedDatum[RawDatum], style: BorderColor): SharedBuilder_CircleProps_161172109[RawDatum] = {
    val __props = js.Dynamic.literal(node = node.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    new SharedBuilder_CircleProps_161172109[RawDatum](js.Array(this.component, __props.asInstanceOf[CircleProps[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing/dist/types/CircleSvg", "CircleSvg")
  @js.native
  val component: js.Object = js.native
  
  def withProps[RawDatum](p: CircleProps[RawDatum]): SharedBuilder_CircleProps_161172109[RawDatum] = new SharedBuilder_CircleProps_161172109[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
