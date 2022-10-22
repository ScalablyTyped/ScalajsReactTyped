package typingsJapgolly.bizcharts.mod

import typingsJapgolly.antvG2.libInterfaceMod.FacetCfg
import typingsJapgolly.antvG2.libInterfaceMod.FacetData
import typingsJapgolly.bizcharts.libComponentsFacetMod.IFacetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("bizcharts", "Facet")
@js.native
open class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected ()
  extends typingsJapgolly.bizcharts.libCoreMod.Facet[C, F] {
  def this(view: typingsJapgolly.antvG2.libChartViewMod.View, cfg: C) = this()
}
object Facet {
  
  @JSImport("bizcharts", "Facet")
  @js.native
  def apply(props: IFacetProps): Any = js.native
}
