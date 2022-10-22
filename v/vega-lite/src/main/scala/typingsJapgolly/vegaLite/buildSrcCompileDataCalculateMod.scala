package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChannelMod.SingleDefChannel
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.FieldRefOption
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.ModelWithField
import typingsJapgolly.vegaLite.buildSrcTransformMod.CalculateTransform
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecTransformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataCalculateMod {
  
  @JSImport("vega-lite/build/src/compile/data/calculate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
  @js.native
  open class CalculateNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: CalculateTransform) = this()
    
    /* private */ var _dependentFields: Any = js.native
    
    def assemble(): FormulaTransform = js.native
    
    /* private */ val transform: Any = js.native
  }
  /* static members */
  object CalculateNode {
    
    @JSImport("vega-lite/build/src/compile/data/calculate", "CalculateNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAllForSortIndex(parent: DataFlowNode, model: ModelWithField): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllForSortIndex")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
  
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel,
    opt: FieldRefOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
