package typingsJapgolly.athenajs.mod

import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "Scene")
@js.native
class Scene () extends js.Object {
  def this(options: SceneOptions) = this()
  var hudScene: Scene | Null = js.native
  var map: Map = js.native
  var opacity: Double = js.native
  var running: Boolean = js.native
  def addObject(`object`: js.Array[Drawable]): Scene = js.native
  def addObject(`object`: js.Array[Drawable], layer: Double): Scene = js.native
  def addObject(`object`: Drawable): Scene = js.native
  def addObject(`object`: Drawable, layer: Double): Scene = js.native
  def animate(fxName: String, options: EffectOptions): Promise = js.native
  def bindEvents(eventList: String): Unit = js.native
  def debug(): Unit = js.native
  def debug(bool: Boolean): Unit = js.native
  def fadeIn(duration: Double): Promise = js.native
  def fadeInAndOut(inDuration: Double, delay: Double, outDuration: Double): Promise = js.native
  def fadeOut(duration: Double): Promise = js.native
  def getOpacity(): Double = js.native
  def getPlayTime(): Double = js.native
  def load(`type`: String, src: String): Unit = js.native
  def load(`type`: String, src: String, id: String): Unit = js.native
  def loadAudio(src: String): Unit = js.native
  def loadAudio(src: String, id: String): Unit = js.native
  def loadImage(src: String): Unit = js.native
  def loadImage(src: String, id: String): Unit = js.native
  def loadMap(src: String): Unit = js.native
  def loadMap(src: String, id: String): Unit = js.native
  def notify(name: String): Unit = js.native
  def notify(name: String, data: JSObject): Unit = js.native
  def removeObject(obj: Drawable): Unit = js.native
  def setBackgroundImage(image: String): Unit = js.native
  def setBackgroundImage(image: HTMLImageElement): Unit = js.native
  def setLayerPriority(layer: Double, background: Boolean): Unit = js.native
  def setMap(map: JSObject): Unit = js.native
  def setMap(map: JSObject, x: Double): Unit = js.native
  def setMap(map: JSObject, x: Double, y: Double): Unit = js.native
  def setMap(map: Map): Unit = js.native
  def setMap(map: Map, x: Double): Unit = js.native
  def setMap(map: Map, x: Double, y: Double): Unit = js.native
  def setOpacity(opacity: Double): Unit = js.native
  def setup(): Unit = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

