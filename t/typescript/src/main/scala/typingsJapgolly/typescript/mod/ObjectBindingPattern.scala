package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectBindingPattern
  extends BindingPattern
     with Node
     with ObjectBindingOrAssignmentPattern {
  var elements: NodeArray[BindingElement] = js.native
  @JSName("kind")
  var kind_ObjectBindingPattern: typingsJapgolly.typescript.mod.SyntaxKind.ObjectBindingPattern = js.native
  @JSName("parent")
  var parent_ObjectBindingPattern: VariableDeclaration | ParameterDeclaration | BindingElement = js.native
}

