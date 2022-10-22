package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcTransformMod.LoessTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataLoessMod {
  
  @JSImport("vega-lite/build/src/compile/data/loess", "LoessTransformNode")
  @js.native
  open class LoessTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: LoessTransform) = this()
    
    def assemble(): typingsJapgolly.vegaTypings.typesSpecTransformMod.LoessTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
