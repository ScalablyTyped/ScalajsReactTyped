package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputedPropertyName
  extends Node
     with DeclarationName
     with PropertyName {
  var expression: Expression = js.native
  @JSName("kind")
  var kind_ComputedPropertyName: typingsJapgolly.typescript.mod.SyntaxKind.ComputedPropertyName = js.native
  @JSName("parent")
  var parent_ComputedPropertyName: Declaration = js.native
}

