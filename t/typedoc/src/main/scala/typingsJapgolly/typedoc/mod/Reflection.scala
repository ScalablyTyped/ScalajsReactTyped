package typingsJapgolly.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "Reflection")
@js.native
abstract class Reflection protected ()
  extends typingsJapgolly.typedoc.reflectionsMod.Reflection {
  def this(name: String, kind: typingsJapgolly.typedoc.abstractMod.ReflectionKind) = this()
  def this(
    name: String,
    kind: typingsJapgolly.typedoc.abstractMod.ReflectionKind,
    parent: typingsJapgolly.typedoc.abstractMod.Reflection
  ) = this()
}

