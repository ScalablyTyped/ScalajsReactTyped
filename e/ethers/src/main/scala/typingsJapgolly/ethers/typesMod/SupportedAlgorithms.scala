package typingsJapgolly.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ethers.ethersStrings.sha256
  - typingsJapgolly.ethers.ethersStrings.sha512
*/
trait SupportedAlgorithms extends js.Object

object SupportedAlgorithms {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def sha256: typingsJapgolly.ethers.ethersStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha512: typingsJapgolly.ethers.ethersStrings.sha512 = this.cast("sha512")
}

