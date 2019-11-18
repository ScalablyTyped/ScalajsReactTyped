package typingsJapgolly.electron.electronMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "WebContents")
@js.native
class WebContents ()
  extends typingsJapgolly.electron.Electron.WebContents

/* static members */
@JSImport("electron", "WebContents")
@js.native
object WebContents extends js.Object {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typingsJapgolly.electron.Electron.WebContents = js.native
  def getAllWebContents(): js.Array[typingsJapgolly.electron.Electron.WebContents] = js.native
  def getFocusedWebContents(): typingsJapgolly.electron.Electron.WebContents = js.native
}

@JSImport("electron", "webContents")
@js.native
object webContents
  extends Instantiable0[typingsJapgolly.electron.Electron.WebContents] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): typingsJapgolly.electron.Electron.WebContents = js.native
  def getAllWebContents(): js.Array[typingsJapgolly.electron.Electron.WebContents] = js.native
  def getFocusedWebContents(): typingsJapgolly.electron.Electron.WebContents = js.native
}

