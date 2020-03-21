package typingsJapgolly.reactSimpleMaps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGGElement
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactSimpleMaps.mod.GeographiesChildrenArgument
import typingsJapgolly.reactSimpleMaps.mod.GeographiesProps
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Geographies {
  def apply(
    SVGAttributes: SVGAttributes[SVGGElement] = null,
    geography: String | (Record[String, _]) | js.Array[String] = null,
    parseGeographies: /* features */ js.Array[Feature[js.Any, js.Any]] => CallbackTo[js.Array[Feature[js.Any, js.Any]]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* data */ GeographiesChildrenArgument => Callback = null
  ): UnmountedSimple[
    GeographiesProps, 
    MountedWithRawType[GeographiesProps, js.Object, RawMounted[GeographiesProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSimpleMaps.mod.GeographiesChildrenArgument) => children(t0).runNow()))
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (parseGeographies != null) __obj.updateDynamic("parseGeographies")(js.Any.fromFunction1((t0: /* features */ js.Array[typingsJapgolly.geojson.mod.Feature[js.Any, js.Any]]) => parseGeographies(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSimpleMaps.mod.GeographiesProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSimpleMaps.mod.GeographiesProps])
  }
  @JSImport("react-simple-maps", "Geographies")
  @js.native
  object componentImport extends js.Object
  
}

