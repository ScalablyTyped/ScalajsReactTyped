package typingsJapgolly.webpackConfigUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.production
  - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.prod
  - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.test
  - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.development
  - typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.dev
*/
trait EnvVars extends js.Object

object EnvVars {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dev: typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.dev = this.cast("dev")
  @scala.inline
  def development: typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.development = this.cast("development")
  @scala.inline
  def prod: typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.prod = this.cast("prod")
  @scala.inline
  def production: typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.production = this.cast("production")
  @scala.inline
  def test: typingsJapgolly.webpackConfigUtils.webpackConfigUtilsStrings.test = this.cast("test")
}

