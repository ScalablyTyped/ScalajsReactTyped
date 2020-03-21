package typingsJapgolly.libsodiumWrappers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.libsodiumWrappers.libsodiumWrappersStrings.curve25519
  - typingsJapgolly.libsodiumWrappers.libsodiumWrappersStrings.ed25519
  - typingsJapgolly.libsodiumWrappers.libsodiumWrappersStrings.x25519
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def curve25519: typingsJapgolly.libsodiumWrappers.libsodiumWrappersStrings.curve25519 = this.cast("curve25519")
  @scala.inline
  def ed25519: typingsJapgolly.libsodiumWrappers.libsodiumWrappersStrings.ed25519 = this.cast("ed25519")
  @scala.inline
  def x25519: typingsJapgolly.libsodiumWrappers.libsodiumWrappersStrings.x25519 = this.cast("x25519")
}

