package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.yarn_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.ionicStrings.yarn_
  - typingsJapgolly.ionic.ionicStrings.npm
*/
trait NpmClient extends js.Object

object NpmClient {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def npm: typingsJapgolly.ionic.ionicStrings.npm = this.cast("npm")
  @scala.inline
  def yarn: yarn_ = this.cast("yarn")
}

