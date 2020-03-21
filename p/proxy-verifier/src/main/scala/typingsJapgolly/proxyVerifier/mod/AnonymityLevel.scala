package typingsJapgolly.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.transparent
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.anonymous
  - typingsJapgolly.proxyVerifier.proxyVerifierStrings.elite
*/
trait AnonymityLevel extends js.Object

object AnonymityLevel {
  @scala.inline
  def anonymous: typingsJapgolly.proxyVerifier.proxyVerifierStrings.anonymous = this.cast("anonymous")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def elite: typingsJapgolly.proxyVerifier.proxyVerifierStrings.elite = this.cast("elite")
  @scala.inline
  def transparent: typingsJapgolly.proxyVerifier.proxyVerifierStrings.transparent = this.cast("transparent")
}

