package typingsJapgolly.estree.ESTree

import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericTypeAnnotation extends Node {
  var id: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Identifier */ js.Any) | QualifiedTypeIdentifier = js.native
  var typeParameters: js.UndefOr[TypeParameterInstantiation | Null] = js.native
}

