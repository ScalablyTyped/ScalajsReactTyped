package typingsJapgolly.yandexMaps.mod

import typingsJapgolly.yandexMaps.mod.event.Manager
import typingsJapgolly.yandexMaps.mod.geoObject.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "GeoObject")
@js.native
class GeoObject_ () extends IGeoObject {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  var balloon: typingsJapgolly.yandexMaps.mod.geoObject.Balloon = js.native
  var editor: IGeometryEditor = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("events")
  var events_GeoObject_ : Manager = js.native
  var hint: Hint = js.native
  @JSName("options")
  var options_GeoObject_ : typingsJapgolly.yandexMaps.mod.option.Manager = js.native
  @JSName("properties")
  var properties_GeoObject_ : typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  @JSName("state")
  var state_GeoObject_ : typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

