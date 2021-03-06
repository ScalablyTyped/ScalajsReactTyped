package typingsJapgolly.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.electron.Electron.BrowserView
import typingsJapgolly.electron.Electron.BrowserViewConstructorOptions
import typingsJapgolly.electron.Electron.WebContents_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBrowserView
  extends Instantiable0[BrowserView]
     with Instantiable1[/* options */ BrowserViewConstructorOptions, BrowserView] {
  def fromId(id: Double): BrowserView = js.native
  def fromWebContents(webContents: WebContents_): BrowserView | Null = js.native
  def getAllViews(): js.Array[BrowserView] = js.native
}

