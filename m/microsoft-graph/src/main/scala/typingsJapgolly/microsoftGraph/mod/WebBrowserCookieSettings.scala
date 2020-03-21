package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.browserDefault
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blockAlways
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowCurrentWebSite
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowFromWebsitesVisited
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowAlways
*/
trait WebBrowserCookieSettings extends js.Object

object WebBrowserCookieSettings {
  @scala.inline
  def allowAlways: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowAlways = this.cast("allowAlways")
  @scala.inline
  def allowCurrentWebSite: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowCurrentWebSite = this.cast("allowCurrentWebSite")
  @scala.inline
  def allowFromWebsitesVisited: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowFromWebsitesVisited = this.cast("allowFromWebsitesVisited")
  @scala.inline
  def blockAlways: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blockAlways = this.cast("blockAlways")
  @scala.inline
  def browserDefault: typingsJapgolly.microsoftGraph.microsoftGraphStrings.browserDefault = this.cast("browserDefault")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

