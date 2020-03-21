package typingsJapgolly.reactSimpleMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.std.Record
import typingsJapgolly.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeographiesProps extends SVGAttributes[SVGGElement] {
  @JSName("children")
  var children_GeographiesProps: js.UndefOr[js.Function1[/* data */ GeographiesChildrenArgument, Unit]] = js.undefined
  var geography: js.UndefOr[String | (Record[String, _]) | js.Array[String]] = js.undefined
  var parseGeographies: js.UndefOr[js.Function1[/* features */ js.Array[Feature[_, _]], js.Array[Feature[_, _]]]] = js.undefined
}

object GeographiesProps {
  @scala.inline
  def apply(
    SVGAttributes: SVGAttributes[org.scalajs.dom.raw.SVGGElement] = null,
    children: /* data */ GeographiesChildrenArgument => Callback = null,
    geography: String | (Record[String, _]) | js.Array[String] = null,
    parseGeographies: /* features */ js.Array[Feature[js.Any, js.Any]] => CallbackTo[js.Array[Feature[js.Any, js.Any]]] = null
  ): GeographiesProps = {
    val __obj = js.Dynamic.literal()
    if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactSimpleMaps.mod.GeographiesChildrenArgument) => children(t0).runNow()))
    if (geography != null) __obj.updateDynamic("geography")(geography.asInstanceOf[js.Any])
    if (parseGeographies != null) __obj.updateDynamic("parseGeographies")(js.Any.fromFunction1((t0: /* features */ js.Array[typingsJapgolly.geojson.mod.Feature[js.Any, js.Any]]) => parseGeographies(t0).runNow()))
    __obj.asInstanceOf[GeographiesProps]
  }
}

