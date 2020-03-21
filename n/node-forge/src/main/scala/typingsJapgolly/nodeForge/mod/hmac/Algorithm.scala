package typingsJapgolly.nodeForge.mod.hmac

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nodeForge.nodeForgeStrings.sha1
  - typingsJapgolly.nodeForge.nodeForgeStrings.md5
  - typingsJapgolly.nodeForge.nodeForgeStrings.sha256
*/
trait Algorithm extends js.Object

object Algorithm {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typingsJapgolly.nodeForge.nodeForgeStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typingsJapgolly.nodeForge.nodeForgeStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typingsJapgolly.nodeForge.nodeForgeStrings.sha256 = this.cast("sha256")
}

