package typingsJapgolly.semverTruncate

import typingsJapgolly.semverTruncate.semverTruncateStrings.major
import typingsJapgolly.semverTruncate.semverTruncateStrings.minor
import typingsJapgolly.semverTruncate.semverTruncateStrings.patch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver-truncate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(version: String, `type`: major): String = js.native
  def apply(version: String, `type`: minor): String = js.native
  def apply(version: String, `type`: patch): String = js.native
}

