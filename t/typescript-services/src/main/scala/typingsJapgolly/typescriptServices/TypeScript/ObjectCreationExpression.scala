package typingsJapgolly.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.typescriptServices.TypeScript.IASTSpan because Already inherited
- typingsJapgolly.typescriptServices.TypeScript.ICallExpression because var conflicts: _end, _start. Inlined expression, argumentList */ @JSGlobal("TypeScript.ObjectCreationExpression")
@js.native
class ObjectCreationExpression protected () extends AST {
  def this(expression: AST, argumentList: ArgumentList) = this()
  var argumentList: ArgumentList = js.native
  var expression: AST = js.native
  def structuralEquals(ast: ObjectCreationExpression, includingPosition: Boolean): Boolean = js.native
}

