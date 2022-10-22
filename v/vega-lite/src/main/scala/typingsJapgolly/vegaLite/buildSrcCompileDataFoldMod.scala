package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcTransformMod.FoldTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataFoldMod {
  
  @JSImport("vega-lite/build/src/compile/data/fold", "FoldTransformNode")
  @js.native
  open class FoldTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FoldTransform) = this()
    
    def assemble(): typingsJapgolly.vegaTypings.typesSpecTransformMod.FoldTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
