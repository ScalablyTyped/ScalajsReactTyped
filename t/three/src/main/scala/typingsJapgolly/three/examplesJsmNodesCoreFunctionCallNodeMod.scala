package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreFunctionCallNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/FunctionCallNode", JSImport.Default)
  @js.native
  open class default[P /* <: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] */] () extends FunctionCallNode[P] {
    def this(functionNode: typingsJapgolly.three.examplesJsmNodesCoreFunctionNodeMod.default[P]) = this()
    def this(functionNode: Unit, parameters: P) = this()
    def this(functionNode: typingsJapgolly.three.examplesJsmNodesCoreFunctionNodeMod.default[P], parameters: P) = this()
  }
  
  @js.native
  trait FunctionCallNode[P /* <: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] */]
    extends typingsJapgolly.three.examplesJsmNodesCoreTempNodeMod.default {
    
    var functionNode: typingsJapgolly.three.examplesJsmNodesCoreFunctionNodeMod.default[P] = js.native
    
    def getParameters(): P = js.native
    
    var parameters: StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    def setParameters(parameters: P): this.type = js.native
  }
}
