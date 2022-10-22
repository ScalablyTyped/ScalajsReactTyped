package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typingsJapgolly.vegaLite.buildSrcTransformMod.RegressionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataRegressionMod {
  
  @JSImport("vega-lite/build/src/compile/data/regression", "RegressionTransformNode")
  @js.native
  open class RegressionTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: RegressionTransform) = this()
    
    def assemble(): typingsJapgolly.vegaTypings.typesSpecTransformMod.RegressionTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
