package typingsJapgolly.hostedGitInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.github
  - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bitbucket
  - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gitlab
  - typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gist
*/
trait Hosts extends js.Object

object Hosts {
  @scala.inline
  def bitbucket: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.bitbucket = this.cast("bitbucket")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gist: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gist = this.cast("gist")
  @scala.inline
  def github: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.github = this.cast("github")
  @scala.inline
  def gitlab: typingsJapgolly.hostedGitInfo.hostedGitInfoStrings.gitlab = this.cast("gitlab")
}

