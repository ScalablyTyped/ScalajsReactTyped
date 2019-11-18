package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.yandexDashMaps.Anon_TrafficImageZIndex
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.Container
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.Converter
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.Copyrights
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.GeoObjects
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.Hint
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.ZoomRange
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.action.Manager
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.margin.Accessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "Map")
@js.native
class Map protected () extends IEventEmitter {
  def this(parentElement: String, state: IMapState) = this()
  def this(parentElement: HTMLElement, state: IMapState) = this()
  def this(parentElement: String, state: IMapState, options: IMapOptions) = this()
  def this(parentElement: HTMLElement, state: IMapState, options: IMapOptions) = this()
  var action: Manager = js.native
  var balloon: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.Balloon = js.native
  var behaviors: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.behavior.Manager = js.native
  var container: Container = js.native
  var controls: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.control.Manager = js.native
  var converter: Converter = js.native
  var copyrights: Copyrights = js.native
  var cursors: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.util.cursor.Manager = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_Map: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.event.Manager = js.native
  var geoObjects: GeoObjects = js.native
  var hint: Hint = js.native
  var layers: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.layer.Manager = js.native
  var margin: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.margin.Manager = js.native
  var options: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.option.Manager = js.native
  var panes: typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.pane.Manager = js.native
  var zoomRange: ZoomRange = js.native
  def destroy(): Unit = js.native
  def getBounds(): js.Array[js.Array[Double]] = js.native
  def getBounds(options: IMapMarginOptions): js.Array[js.Array[Double]] = js.native
  def getCenter(): js.Array[Double] = js.native
  def getCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getGlobalPixelCenter(): js.Array[Double] = js.native
  def getGlobalPixelCenter(options: IMapMarginOptions): js.Array[Double] = js.native
  def getPanoramaManager(): js.Promise[typingsJapgolly.yandexDashMaps.yandexDashMapsMod.panorama.Manager] = js.native
  def getType(): String | MapType = js.native
  def getZoom(): Double = js.native
  def panTo(center: js.Array[Double | js.Object]): js.Promise[Unit] = js.native
  def panTo(center: js.Array[Double | js.Object], options: IMapPanOptions): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]]): js.Promise[Unit] = js.native
  def setBounds(bounds: js.Array[js.Array[Double]], options: IMapBoundsOptions): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double]): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setCenter(center: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double]): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
  def setGlobalPixelCenter(globalPixelCenter: js.Array[Double], zoom: Double, options: IMapPositionOptions): js.Promise[Unit] = js.native
  def setType(`type`: String): js.Promise[Unit] = js.native
  def setType(`type`: String, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setType(`type`: MapType): js.Promise[Unit] = js.native
  def setType(`type`: MapType, options: IMapCheckZoomRangeOptions): js.Promise[Unit] = js.native
  def setZoom(zoom: Double): js.Promise[Unit] = js.native
  def setZoom(zoom: Double, options: IMapZoomOptions): js.Promise[Unit] = js.native
}

@JSImport("yandex-maps", "map")
@js.native
object map extends js.Object {
  @js.native
  class Balloon protected ()
    extends IBalloonManager[typingsJapgolly.yandexDashMaps.yandexDashMapsMod.map.Balloon] {
    //tslint:disable-line no-shadowed-variable
    def this(map: Map) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class Container protected () extends IEventEmitter {
    def this(parentElement: String) = this()
    def this(parentElement: HTMLElement) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def enterFullscreen(): Unit = js.native
    def exitFullscreen(): Unit = js.native
    def fitToViewport(): Unit = js.native
    def fitToViewport(preservePixelPosition: Boolean): Unit = js.native
    def getElement(): HTMLElement = js.native
    def getOffset(): js.Array[Double] = js.native
    def getParentElement(): HTMLElement = js.native
    def getSize(): js.Array[Double] = js.native
    def isFullscreen(): Boolean = js.native
  }
  
  @js.native
  class Converter protected () extends js.Object {
    def this(map: Map) = this()
    def globalToPage(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
    def pageToGlobal(pagePixelPoint: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @js.native
  class Copyrights protected () extends js.Object {
    def this(map: Map) = this()
    def add(customCopyrights: String): ICopyrightsAccessor = js.native
    def add(customCopyrights: js.Array[String | typingsJapgolly.std.HTMLElement]): ICopyrightsAccessor = js.native
    def add(customCopyrights: typingsJapgolly.std.HTMLElement): ICopyrightsAccessor = js.native
    def addProvider(provider: ICopyrightsProvider): this.type = js.native
    def get(): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.Array[Double]): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
    def getPromoLink(): String = js.native
    def removeProvider(provider: ICopyrightsProvider): this.type = js.native
  }
  
  @js.native
  class GeoObjects protected () extends IGeoObjectCollection {
    def this(map: Map) = this()
    def this(map: Map, options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
  }
  
  @js.native
  class Hint protected () extends IPopupManager[Hint] {
    def this(map: Map) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class ZoomRange protected () extends IEventEmitter {
    def this(map: Map, constraints: js.Array[Double]) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def get(): js.Promise[js.Array[Double]] = js.native
    def get(coords: js.Array[Double]): js.Promise[js.Array[Double]] = js.native
    def getCurrent(): js.Array[Double] = js.native
  }
  
  @js.native
  object action extends js.Object {
    @js.native
    class Manager protected () extends IEventEmitter {
      def this(map: Map) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      def breakTick(): Unit = js.native
      def execute(action: IMapAction): Unit = js.native
      def getCurrentState(): js.Object = js.native
      def getMap(): Map = js.native
      def setCorrection(userFunction: js.Function0[Unit]): Unit = js.native
      def stop(): Unit = js.native
    }
    
  }
  
  @js.native
  object behavior extends js.Object {
    //tslint:disable-line no-shadowed-variable
    @js.native
    class Manager protected ()
      extends ICustomizable
         with IParentOnMap {
      def this(map: Map) = this()
      def this(map: Map, behaviors: js.Array[js.Array[String] | String]) = this()
      def this(map: Map, behaviors: js.Array[js.Array[String] | String], options: js.Object) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override var options: IOptionManager = js.native
      def disable(behaviors: String): this.type = js.native
      def disable(behaviors: js.Array[js.Array[String] | String]): this.type = js.native
      def enable(behaviors: String): this.type = js.native
      def enable(behaviors: js.Array[js.Array[String] | String]): this.type = js.native
      def get(behaviorName: String): IBehavior = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def isEnabled(behaviorName: String): Boolean = js.native
    }
    
  }
  
  @js.native
  object layer extends js.Object {
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
    - typings.yandexDashMaps.yandexDashMapsMod.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @js.native
    class Manager protected ()
      extends ILayer
         with IParentOnMap {
      def this(map: Map) = this()
      def this(map: Map, options: Anon_TrafficImageZIndex) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      def add(`object`: js.Object): this.type = js.native
      def each(callback: js.Function1[/* layer */ ILayer, Unit]): Unit = js.native
      def each(callback: js.Function1[/* layer */ ILayer, Unit], context: js.Object): Unit = js.native
      def getIterator(): IIterator = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def remove(`object`: js.Object): this.type = js.native
      def setParent(parent: IControlParent): this.type = js.native
    }
    
  }
  
  @js.native
  object margin extends js.Object {
    @js.native
    class Accessor protected () extends js.Object {
      def this(screenArea: js.Object) = this()
      def getArea(): js.Object = js.native
      def remove(): this.type = js.native
      def setArea(screenArea: js.Object): this.type = js.native
    }
    
    @js.native
    class Manager protected () extends js.Object {
      def this(map: Map) = this()
      def addArea(screenArea: js.Object): Accessor = js.native
      def destroy(): this.type = js.native
      def getMargin(): js.Array[Double] = js.native
      def getOffset(): js.Array[Double] = js.native
      def setDefaultMargin(margin: js.Array[js.Array[Double] | Double]): Unit = js.native
      def setDefaultMargin(margin: Double): Unit = js.native
    }
    
  }
  
  @js.native
  object pane extends js.Object {
    @js.native
    class Manager protected () extends js.Object {
      def this(map: Map) = this()
      def append(key: String, pane: IPane): Unit = js.native
      def destroy(): Unit = js.native
      def get(key: String): IPane | Null = js.native
      def getLower(): String = js.native
      def getUpper(): String = js.native
      def insertBefore(key: String, pane: IPane, referenceKey: String): Unit = js.native
      def remove(pane: IPane): Unit = js.native
    }
    
  }
  
}

