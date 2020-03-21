package typingsJapgolly.conventionalRecommendedBump.mod.Callback.Recommendation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major
  - typingsJapgolly.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor
  - typingsJapgolly.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch
*/
trait ReleaseType extends js.Object

object ReleaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typingsJapgolly.conventionalRecommendedBump.conventionalRecommendedBumpStrings.major = this.cast("major")
  @scala.inline
  def minor: typingsJapgolly.conventionalRecommendedBump.conventionalRecommendedBumpStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typingsJapgolly.conventionalRecommendedBump.conventionalRecommendedBumpStrings.patch = this.cast("patch")
}

