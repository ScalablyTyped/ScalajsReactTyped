package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileUnitMod.UnitModel
import typingsJapgolly.vegaLite.buildSrcUtilMod.Dict
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecTransformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataFilterinvalidMod {
  
  @JSImport("vega-lite/build/src/compile/data/filterinvalid", "FilterInvalidNode")
  @js.native
  open class FilterInvalidNode protected () extends DataFlowNode {
    def this(
      parent: DataFlowNode,
      filter: Dict[TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]]
    ) = this()
    
    /**
      * Create the VgTransforms for each of the filtered fields.
      */
    def assemble(): FilterTransform = js.native
    
    val filter: Dict[TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]] = js.native
  }
  /* static members */
  object FilterInvalidNode {
    
    @JSImport("vega-lite/build/src/compile/data/filterinvalid", "FilterInvalidNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def make(parent: DataFlowNode, model: UnitModel): FilterInvalidNode = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[FilterInvalidNode]
  }
}
