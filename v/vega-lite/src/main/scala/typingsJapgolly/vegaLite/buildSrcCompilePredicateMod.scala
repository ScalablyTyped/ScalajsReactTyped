package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalComposition
import typingsJapgolly.vegaLite.buildSrcPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompilePredicateMod {
  
  @JSImport("vega-lite/build/src/compile/predicate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expression(model: Model, filterOp: LogicalComposition[Predicate]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(model.asInstanceOf[js.Any], filterOp.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def expression(model: Model, filterOp: LogicalComposition[Predicate], node: DataFlowNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(model.asInstanceOf[js.Any], filterOp.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
}
