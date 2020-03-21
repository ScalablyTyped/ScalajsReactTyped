package typingsJapgolly.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.semver.semverStrings.major
  - typingsJapgolly.semver.semverStrings.premajor
  - typingsJapgolly.semver.semverStrings.minor
  - typingsJapgolly.semver.semverStrings.preminor
  - typingsJapgolly.semver.semverStrings.patch
  - typingsJapgolly.semver.semverStrings.prepatch
  - typingsJapgolly.semver.semverStrings.prerelease
*/
trait ReleaseType extends js.Object

object ReleaseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def major: typingsJapgolly.semver.semverStrings.major = this.cast("major")
  @scala.inline
  def minor: typingsJapgolly.semver.semverStrings.minor = this.cast("minor")
  @scala.inline
  def patch: typingsJapgolly.semver.semverStrings.patch = this.cast("patch")
  @scala.inline
  def premajor: typingsJapgolly.semver.semverStrings.premajor = this.cast("premajor")
  @scala.inline
  def preminor: typingsJapgolly.semver.semverStrings.preminor = this.cast("preminor")
  @scala.inline
  def prepatch: typingsJapgolly.semver.semverStrings.prepatch = this.cast("prepatch")
  @scala.inline
  def prerelease: typingsJapgolly.semver.semverStrings.prerelease = this.cast("prerelease")
}

