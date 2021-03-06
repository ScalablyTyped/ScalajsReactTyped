package typingsJapgolly.athenajs.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ResourceManager extends js.Object {
  def addResources(resource: Res): Promise = js.native
  def addResources(resource: Res, group: String): Promise = js.native
  def getCanvasFromImage(image: HTMLImageElement): HTMLCanvasElement = js.native
  def getResourceById(id: String): js.Any = js.native
  def getResourceById(id: String, group: String): js.Any = js.native
  def getResourceById(id: String, group: String, fullObject: Boolean): js.Any = js.native
  def loadAudio(res: Res): Promise = js.native
  def loadAudio(res: Res, group: String): Promise = js.native
  def loadImage(res: Res): Promise = js.native
  def loadImage(res: Res, group: String): Promise = js.native
  def loadResources(group: String): Unit = js.native
  def loadResources(group: String, progressCb: Callback): Unit = js.native
  def loadResources(group: String, progressCb: Callback, errorCb: Callback): Unit = js.native
  def newResourceFromPool(id: String): js.Any = js.native
  def registerScript(id: String, elt: js.Any): Unit = js.native
  def registerScript(id: String, elt: js.Any, poolSize: Double): Unit = js.native
}

