package typingsJapgolly.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* menus types */
/**
  * The different contexts a menu can appear in. Specifying 'all' is equivalent to the combination of all other
  * contexts except for 'tab' and 'tools_menu'.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.all
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.password
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.image
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.video
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu
*/
trait ContextType extends js.Object

object ContextType {
  @scala.inline
  def all: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.all = this.cast("all")
  @scala.inline
  def audio: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.audio = this.cast("audio")
  @scala.inline
  def bookmark: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = this.cast("bookmark")
  @scala.inline
  def browser_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.browser_action = this.cast("browser_action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def editable: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.editable = this.cast("editable")
  @scala.inline
  def frame: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.frame = this.cast("frame")
  @scala.inline
  def image: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.image = this.cast("image")
  @scala.inline
  def launcher: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.launcher = this.cast("launcher")
  @scala.inline
  def link: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.link = this.cast("link")
  @scala.inline
  def page: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page = this.cast("page")
  @scala.inline
  def page_action: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.page_action = this.cast("page_action")
  @scala.inline
  def password: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.password = this.cast("password")
  @scala.inline
  def selection: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.selection = this.cast("selection")
  @scala.inline
  def tab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = this.cast("tab")
  @scala.inline
  def tools_menu: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.tools_menu = this.cast("tools_menu")
  @scala.inline
  def video: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.video = this.cast("video")
}

