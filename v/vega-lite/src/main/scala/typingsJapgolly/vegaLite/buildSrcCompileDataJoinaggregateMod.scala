package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcTransformMod.JoinAggregateTransform
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgJoinAggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataJoinaggregateMod {
  
  @JSImport("vega-lite/build/src/compile/data/joinaggregate", "JoinAggregateTransformNode")
  @js.native
  open class JoinAggregateTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: JoinAggregateTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): VgJoinAggregateTransform = js.native
    
    /* private */ var getDefaultName: Any = js.native
    
    /* private */ val transform: Any = js.native
  }
}
