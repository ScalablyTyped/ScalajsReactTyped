package typingsJapgolly.yandexMaps.mod

import typingsJapgolly.yandexMaps.mod.event.Manager
import typingsJapgolly.yandexMaps.mod.geoObject.Hint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "GeoObject")
@js.native
open class GeoObject_[T, TargetGeometry /* <: js.Object */] ()
  extends StObject
     with IGeoObject[T] {
  def this(feature: IGeoObjectFeature) = this()
  def this(feature: Unit, options: IGeoObjectOptions) = this()
  def this(feature: IGeoObjectFeature, options: IGeoObjectOptions) = this()
  
  var balloon: typingsJapgolly.yandexMaps.mod.geoObject.Balloon = js.native
  
  var editor: IGeometryEditor = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  @JSName("events")
  var events_GeoObject_ : Manager[TargetGeometry] = js.native
  
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  
  var hint: Hint = js.native
  
  @JSName("options")
  var options_GeoObject_ : typingsJapgolly.yandexMaps.mod.option.Manager = js.native
  
  @JSName("properties")
  var properties_GeoObject_ : typingsJapgolly.yandexMaps.mod.data.Manager = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  @JSName("state")
  var state_GeoObject_ : typingsJapgolly.yandexMaps.mod.data.Manager = js.native
}
