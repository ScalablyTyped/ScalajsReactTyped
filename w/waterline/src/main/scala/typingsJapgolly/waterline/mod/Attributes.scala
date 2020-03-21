package typingsJapgolly.waterline.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends /* index */ StringDictionary[Attribute] {
  var toJSON: js.UndefOr[js.Function0[String]] = js.undefined
  var toObject: js.UndefOr[js.Function0[_]] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    StringDictionary: /* index */ StringDictionary[Attribute] = null,
    toJSON: js.UndefOr[CallbackTo[String]] = js.undefined,
    toObject: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    toJSON.foreach(p => __obj.updateDynamic("toJSON")(p.toJsFn))
    toObject.foreach(p => __obj.updateDynamic("toObject")(p.toJsFn))
    __obj.asInstanceOf[Attributes]
  }
}

