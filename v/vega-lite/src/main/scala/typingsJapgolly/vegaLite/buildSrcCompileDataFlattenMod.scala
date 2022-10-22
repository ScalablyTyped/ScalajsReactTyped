package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcTransformMod.FlattenTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataFlattenMod {
  
  @JSImport("vega-lite/build/src/compile/data/flatten", "FlattenTransformNode")
  @js.native
  open class FlattenTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FlattenTransform) = this()
    
    def assemble(): typingsJapgolly.vegaTypings.typesSpecTransformMod.FlattenTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
