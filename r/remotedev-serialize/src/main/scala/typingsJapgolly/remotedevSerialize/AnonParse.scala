package typingsJapgolly.remotedevSerialize

import typingsJapgolly.remotedevSerialize.mod.Refs
import typingsJapgolly.remotedevSerialize.mod.Replacer
import typingsJapgolly.remotedevSerialize.mod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParse extends js.Object {
  def parse(input: String): js.Any = js.native
  def serialize(immutable: TypeofImmutable): AnonOptions = js.native
  def serialize(immutable: TypeofImmutable, refs: Refs): AnonOptions = js.native
  def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer): AnonOptions = js.native
  def serialize(immutable: TypeofImmutable, refs: Refs, customReplacer: Replacer, customReviver: Reviver): AnonOptions = js.native
  def stringify(input: js.Any): String = js.native
}

