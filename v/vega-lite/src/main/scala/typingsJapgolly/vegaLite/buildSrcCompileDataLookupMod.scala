package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcTransformMod.LookupTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataLookupMod {
  
  @JSImport("vega-lite/build/src/compile/data/lookup", "LookupNode")
  @js.native
  open class LookupNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: LookupTransform, secondary: String) = this()
    
    def assemble(): typingsJapgolly.vegaTypings.typesSpecTransformMod.LookupTransform = js.native
    
    val secondary: String = js.native
    
    val transform: LookupTransform = js.native
  }
  /* static members */
  object LookupNode {
    
    @JSImport("vega-lite/build/src/compile/data/lookup", "LookupNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def make(parent: DataFlowNode, model: Model, transform: LookupTransform, counter: Double): LookupNode = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[LookupNode]
  }
}
