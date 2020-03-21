package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayBindingPattern
  extends BindingPattern
     with Node
     with ArrayBindingOrAssignmentPattern {
  var elements: NodeArray[ArrayBindingElement] = js.native
  @JSName("kind")
  var kind_ArrayBindingPattern: typingsJapgolly.typescript.mod.SyntaxKind.ArrayBindingPattern = js.native
  @JSName("parent")
  var parent_ArrayBindingPattern: VariableDeclaration | ParameterDeclaration | BindingElement = js.native
}

