package typingsJapgolly.webpackBugsnagPlugins

import typingsJapgolly.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`bitbucket-server`
import typingsJapgolly.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`github-enterprise`
import typingsJapgolly.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`gitlab-onpremise`
import typingsJapgolly.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.bitbucket
import typingsJapgolly.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.github
import typingsJapgolly.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.gitlab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  /**
    *  The source control provider.
    */
  var provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`
  /**
    * A URL (git/ssh/https) pointing to the repository, or webpage representing
    * the repository
    */
  var repository: String
  /**
    * The unique identifier for the commit (e.g. git SHA)
    */
  var revision: String
}

object AnonProvider {
  @scala.inline
  def apply(
    provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`,
    repository: String,
    revision: String
  ): AnonProvider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProvider]
  }
}

