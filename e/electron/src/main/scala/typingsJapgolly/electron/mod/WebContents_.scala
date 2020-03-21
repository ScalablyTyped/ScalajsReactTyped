package typingsJapgolly.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "WebContents")
@js.native
class WebContents_ ()
  extends typingsJapgolly.electron.Electron.WebContents_

/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents_ extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typingsJapgolly.electron.Electron.WebContents_ = js.native
  def getAllWebContents(): js.Array[typingsJapgolly.electron.Electron.WebContents_] = js.native
  def getFocusedWebContents(): typingsJapgolly.electron.Electron.WebContents_ = js.native
}

