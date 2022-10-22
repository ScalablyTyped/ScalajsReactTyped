package typingsJapgolly.reactCartographer.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCartographer.libComponentsMapMod.MapProps
import typingsJapgolly.reactCartographer.reactCartographerStrings.bing
import typingsJapgolly.reactCartographer.reactCartographerStrings.google
import typingsJapgolly.reactCartographer.reactCartographerStrings.yahoo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Map {
  
  inline def apply(
    height: Double,
    mapId: String,
    provider: yahoo | google | bing,
    providerKey: String,
    useBackgroundImageStyle: Boolean,
    width: Double,
    zoom: Double
  ): Builder = {
    val __props = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MapProps]))
  }
  
  @JSImport("react-cartographer", "Map")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactCartographer.mod.Map] {
    
    inline def addressLine1(value: String): this.type = set("addressLine1", value.asInstanceOf[js.Any])
    
    inline def city(value: String): this.type = set("city", value.asInstanceOf[js.Any])
    
    inline def country(value: String): this.type = set("country", value.asInstanceOf[js.Any])
    
    inline def latitude(value: Double): this.type = set("latitude", value.asInstanceOf[js.Any])
    
    inline def longitude(value: Double): this.type = set("longitude", value.asInstanceOf[js.Any])
    
    inline def state(value: String): this.type = set("state", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
