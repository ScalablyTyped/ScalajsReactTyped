package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.antvG2.libInterfaceMod.FacetCfg
import typingsJapgolly.antvG2.libInterfaceMod.FacetCtor
import typingsJapgolly.antvG2.libInterfaceMod.FacetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFacetMod {
  
  @JSImport("@antv/g2/lib/facet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@antv/g2/lib/facet", "Facet")
  @js.native
  open class Facet[C /* <: FacetCfg[FacetData] */, F /* <: FacetData */] protected ()
    extends typingsJapgolly.antvG2.libFacetFacetMod.Facet[C, F] {
    def this(view: View, cfg: C) = this()
  }
  
  inline def getFacet(`type`: String): FacetCtor = ^.asInstanceOf[js.Dynamic].applyDynamic("getFacet")(`type`.asInstanceOf[js.Any]).asInstanceOf[FacetCtor]
  
  inline def registerFacet(`type`: String, ctor: FacetCtor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFacet")(`type`.asInstanceOf[js.Any], ctor.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
