package typingsJapgolly.reactCartographer.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactCartographer.mapMod.MapProps
import typingsJapgolly.reactCartographer.mapMod.default
import typingsJapgolly.reactCartographer.reactCartographerStrings.bing
import typingsJapgolly.reactCartographer.reactCartographerStrings.google
import typingsJapgolly.reactCartographer.reactCartographerStrings.yahoo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Map {
  def apply(
    height: Double,
    mapId: String,
    provider: yahoo | google | bing,
    providerKey: String,
    useBackgroundImageStyle: Boolean,
    width: Double,
    zoom: Double,
    addressLine1: String = null,
    city: String = null,
    country: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    state: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MapProps, default, Unit, MapProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], providerKey = providerKey.asInstanceOf[js.Any], useBackgroundImageStyle = useBackgroundImageStyle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
      if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1.asInstanceOf[js.Any])
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCartographer.mapMod.MapProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactCartographer.mapMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCartographer.mapMod.MapProps])(children: _*)
  }
  @JSImport("react-cartographer/lib/components/Map", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

