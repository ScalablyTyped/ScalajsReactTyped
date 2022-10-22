package typingsJapgolly.vegaLite

import typingsJapgolly.std.Set
import typingsJapgolly.vegaLite.anon.PartialRecordAggregateOpS
import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcUtilMod.Dict
import typingsJapgolly.vegaTypings.typesSpecTransformMod.AggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataAggregateMod {
  
  @JSImport("vega-lite/build/src/compile/data/aggregate", "AggregateNode")
  @js.native
  open class AggregateNode protected () extends DataFlowNode {
    /**
      * @param dimensions string set for dimensions
      * @param measures dictionary mapping field name => dict of aggregation functions and names to use
      */
    def this(parent: DataFlowNode, dimensions: Set[String], measures: Measures) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): AggregateTransform = js.native
    
    /* private */ var dimensions: Any = js.native
    
    def groupBy: Set[String] = js.native
    
    /* private */ var measures: Any = js.native
    
    def merge(other: AggregateNode): Boolean = js.native
  }
  /* static members */
  object AggregateNode {
    
    @JSImport("vega-lite/build/src/compile/data/aggregate", "AggregateNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: UnitModel): AggregateNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[AggregateNode]
    
    inline def makeFromTransform(parent: DataFlowNode, t: typingsJapgolly.vegaLite.buildSrcTransformMod.AggregateTransform): AggregateNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[AggregateNode]
  }
  
  type Measures = Dict[PartialRecordAggregateOpS]
}
