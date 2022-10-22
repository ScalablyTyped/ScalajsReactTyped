package typingsJapgolly.three

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.three.examplesJsmNodesCoreCodeNodeMod.CodeNodeInclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreFunctionNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/FunctionNode", JSImport.Default)
  @js.native
  open class default[P /* <: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] */] () extends FunctionNode[P] {
    def this(code: String) = this()
    def this(code: String, includes: js.Array[CodeNodeInclude]) = this()
    def this(code: Unit, includes: js.Array[CodeNodeInclude]) = this()
  }
  
  @js.native
  trait FunctionNode[P /* <: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] */]
    extends typingsJapgolly.three.examplesJsmNodesCoreCodeNodeMod.default {
    
    def call(parameters: P): typingsJapgolly.three.examplesJsmNodesCoreFunctionCallNodeMod.default[P] = js.native
    
    def getInputs(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeFunctionInputMod.default] = js.native
    
    def getNodeFunction(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default): typingsJapgolly.three.examplesJsmNodesCoreNodeFunctionMod.default = js.native
    
    var keywords: StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
  }
  
  type FunctionNodeArguments = js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] | StringDictionary[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
}
