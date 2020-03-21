package typingsJapgolly.blake2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blake2.blake2Strings.blake2b
  - typingsJapgolly.blake2.blake2Strings.blake2bp
  - typingsJapgolly.blake2.blake2Strings.blake2s
  - typingsJapgolly.blake2.blake2Strings.blake2sp
  - typingsJapgolly.blake2.blake2Strings.bypass
*/
trait Blake2Algorithm extends js.Object

object Blake2Algorithm {
  @scala.inline
  def blake2b: typingsJapgolly.blake2.blake2Strings.blake2b = this.cast("blake2b")
  @scala.inline
  def blake2bp: typingsJapgolly.blake2.blake2Strings.blake2bp = this.cast("blake2bp")
  @scala.inline
  def blake2s: typingsJapgolly.blake2.blake2Strings.blake2s = this.cast("blake2s")
  @scala.inline
  def blake2sp: typingsJapgolly.blake2.blake2Strings.blake2sp = this.cast("blake2sp")
  @scala.inline
  def bypass: typingsJapgolly.blake2.blake2Strings.bypass = this.cast("bypass")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

