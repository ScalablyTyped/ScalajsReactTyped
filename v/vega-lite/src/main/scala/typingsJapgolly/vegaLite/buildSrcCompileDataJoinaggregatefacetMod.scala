package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileDataJoinaggregateMod.JoinAggregateTransformNode
import typingsJapgolly.vegaLite.buildSrcExprMod.ExprRef
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.FacetFieldDef
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.FacetMapping
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataJoinaggregatefacetMod {
  
  @JSImport("vega-lite/build/src/compile/data/joinaggregatefacet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeJoinAggregateFromFacet(parent: DataFlowNode, facet: FacetMapping[String, FacetFieldDef[String, ExprRef | SignalRef]]): JoinAggregateTransformNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeJoinAggregateFromFacet")(parent.asInstanceOf[js.Any], facet.asInstanceOf[js.Any])).asInstanceOf[JoinAggregateTransformNode]
}
