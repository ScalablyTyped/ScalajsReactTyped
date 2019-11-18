package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.yandexDashMaps.Anon_Always
import typingsJapgolly.yandexDashMaps.Anon_Direction
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.panorama.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "panorama")
@js.native
object panorama extends js.Object {
  @js.native
  class Manager () extends IEventEmitter {
    /* CompleteClass */
    override var events: IEventManager = js.native
    def closePlayer(): Unit = js.native
    def disableLookup(): Unit = js.native
    def enableLookup(): Unit = js.native
    def getPlayer(): Player = js.native
    def isLookupEnabled(): Boolean = js.native
    def openPlayer(panorama: js.Array[IPanorama]): js.Promise[Unit] = js.native
    def openPlayer(panorama: Double): js.Promise[Unit] = js.native
  }
  
  @js.native
  class Player protected () extends IEventEmitter {
    def this(element: String, panorama: IPanorama) = this()
    def this(element: HTMLElement, panorama: IPanorama) = this()
    def this(element: String, panorama: IPanorama, options: Anon_Always) = this()
    def this(element: HTMLElement, panorama: IPanorama, options: Anon_Always) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def destroy(): Unit = js.native
    def fitToViewport(): Unit = js.native
    def getDirection(): js.Array[Double] = js.native
    def getPanorama(): IPanorama = js.native
    def getSpan(): js.Array[Double] = js.native
    def lookAt(point: js.Array[Double]): this.type = js.native
    def moveTo(point: js.Array[Double]): js.Promise[Unit] = js.native
    def moveTo(point: js.Array[Double], options: Anon_Direction): js.Promise[Unit] = js.native
    def setDirection(direction: String): this.type = js.native
    def setDirection(direction: js.Array[Double]): this.type = js.native
    def setPanorama(panorama: IPanorama): this.type = js.native
    def setSpan(span: String): this.type = js.native
    def setSpan(span: js.Array[Double]): this.type = js.native
  }
  
}

