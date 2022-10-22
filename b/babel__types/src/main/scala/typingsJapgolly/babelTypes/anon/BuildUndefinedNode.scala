package typingsJapgolly.babelTypes.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildUndefinedNode extends StObject {
  
  def buildUndefinedNode(): Node
  
  def push(value: Id): Unit
}
object BuildUndefinedNode {
  
  inline def apply(buildUndefinedNode: CallbackTo[Node], push: Id => Callback): BuildUndefinedNode = {
    val __obj = js.Dynamic.literal(buildUndefinedNode = buildUndefinedNode.toJsFn, push = js.Any.fromFunction1((t0: Id) => push(t0).runNow()))
    __obj.asInstanceOf[BuildUndefinedNode]
  }
  
  extension [Self <: BuildUndefinedNode](x: Self) {
    
    inline def setBuildUndefinedNode(value: CallbackTo[Node]): Self = StObject.set(x, "buildUndefinedNode", value.toJsFn)
    
    inline def setPush(value: Id => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Id) => value(t0).runNow()))
  }
}
