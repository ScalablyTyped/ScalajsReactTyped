package typingsJapgolly.electron.mod

import typingsJapgolly.electron.Electron.BrowserViewConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "BrowserView")
@js.native
// Docs: http://electronjs.org/docs/api/browser-view
class BrowserView ()
  extends typingsJapgolly.electron.Electron.BrowserView {
  def this(options: BrowserViewConstructorOptions) = this()
}

/* static members */
@JSImport("electron", "BrowserView")
@js.native
object BrowserView extends js.Object {
  def fromId(id: Double): typingsJapgolly.electron.Electron.BrowserView = js.native
  def fromWebContents(webContents: typingsJapgolly.electron.Electron.WebContents_): typingsJapgolly.electron.Electron.BrowserView | Null = js.native
  def getAllViews(): js.Array[typingsJapgolly.electron.Electron.BrowserView] = js.native
}

