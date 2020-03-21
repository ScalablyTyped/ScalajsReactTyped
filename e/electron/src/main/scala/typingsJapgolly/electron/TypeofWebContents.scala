package typingsJapgolly.electron

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.electron.Electron.WebContents_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWebContents extends Instantiable0[WebContents_] {
  // Docs: http://electronjs.org/docs/api/web-contents
  def fromId(id: Double): WebContents_ = js.native
  def getAllWebContents(): js.Array[WebContents_] = js.native
  def getFocusedWebContents(): WebContents_ = js.native
}

