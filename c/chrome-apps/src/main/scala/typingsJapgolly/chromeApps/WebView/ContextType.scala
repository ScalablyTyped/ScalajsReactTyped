package typingsJapgolly.chromeApps.WebView

import typingsJapgolly.chromeApps.chromeAppsStrings.all_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts.
  **/
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.all_
  - typingsJapgolly.chromeApps.chromeAppsStrings.page
  - typingsJapgolly.chromeApps.chromeAppsStrings.frame
  - typingsJapgolly.chromeApps.chromeAppsStrings.selection
  - typingsJapgolly.chromeApps.chromeAppsStrings.link
  - typingsJapgolly.chromeApps.chromeAppsStrings.editable
  - typingsJapgolly.chromeApps.chromeAppsStrings.image
  - typingsJapgolly.chromeApps.chromeAppsStrings.video
  - typingsJapgolly.chromeApps.chromeAppsStrings.audio
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: all_ = this.cast("all")
  @scala.inline
  def audio: typingsJapgolly.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typingsJapgolly.chromeApps.chromeAppsStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typingsJapgolly.chromeApps.chromeAppsStrings.frame = this.cast("frame")
  @scala.inline
  def image: typingsJapgolly.chromeApps.chromeAppsStrings.image = this.cast("image")
  @scala.inline
  def link: typingsJapgolly.chromeApps.chromeAppsStrings.link = this.cast("link")
  @scala.inline
  def page: typingsJapgolly.chromeApps.chromeAppsStrings.page = this.cast("page")
  @scala.inline
  def selection: typingsJapgolly.chromeApps.chromeAppsStrings.selection = this.cast("selection")
  @scala.inline
  def video: typingsJapgolly.chromeApps.chromeAppsStrings.video = this.cast("video")
}

