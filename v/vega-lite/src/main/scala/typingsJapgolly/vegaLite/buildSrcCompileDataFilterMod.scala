package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalComposition
import typingsJapgolly.vegaLite.buildSrcPredicateMod.Predicate
import typingsJapgolly.vegaTypings.typesSpecTransformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataFilterMod {
  
  @JSImport("vega-lite/build/src/compile/data/filter", "FilterNode")
  @js.native
  open class FilterNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, model: Model, filter: LogicalComposition[Predicate]) = this()
    
    /* private */ var _dependentFields: Any = js.native
    
    def assemble(): FilterTransform = js.native
    
    /* private */ var expr: Any = js.native
    
    /* private */ val filter: Any = js.native
    
    /* private */ val model: Any = js.native
  }
}
