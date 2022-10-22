package typingsJapgolly.nivoPie.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoPie.anon.Datum
import typingsJapgolly.nivoPie.distTypesTypesMod.ComputedDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PieTooltip {
  
  inline def apply[RawDatum](datum: ComputedDatum[RawDatum]): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[Datum[RawDatum]]))
  }
  
  @JSImport("@nivo/pie/dist/types/PieTooltip", "PieTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[RawDatum](p: Datum[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
