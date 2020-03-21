package typingsJapgolly.googleAppsScript.GoogleAppsScript.URLFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.get
  - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.delete
  - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.patch
  - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.post
  - typingsJapgolly.googleAppsScript.googleAppsScriptStrings.put
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.delete = this.cast("delete")
  @scala.inline
  def get: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.get = this.cast("get")
  @scala.inline
  def patch: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.patch = this.cast("patch")
  @scala.inline
  def post: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.post = this.cast("post")
  @scala.inline
  def put: typingsJapgolly.googleAppsScript.googleAppsScriptStrings.put = this.cast("put")
}

