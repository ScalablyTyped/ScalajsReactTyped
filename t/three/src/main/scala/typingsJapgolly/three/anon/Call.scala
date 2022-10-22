package typingsJapgolly.three.anon

import typingsJapgolly.three.examplesJsmNodesCoreFunctionNodeMod.FunctionNodeArguments
import typingsJapgolly.three.examplesJsmNodesNodesMod.Node
import typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Fn_
import typingsJapgolly.three.examplesJsmNodesShadernodeShaderNodeMod.Swizzable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Call[P /* <: FunctionNodeArguments */] extends StObject {
  
  def call(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<P> is not an array type */ params: Fn_[P]
  ): Swizzable[Node]
}
object Call {
  
  inline def apply[P /* <: FunctionNodeArguments */](call: Fn_[P] => Swizzable[Node]): Call[P] = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
    __obj.asInstanceOf[Call[P]]
  }
  
  extension [Self <: Call[?], P /* <: FunctionNodeArguments */](x: Self & Call[P]) {
    
    inline def setCall(value: Fn_[P] => Swizzable[Node]): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
  }
}
