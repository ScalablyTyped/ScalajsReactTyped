package typingsJapgolly.setCookieParser

import typingsJapgolly.setCookieParser.setCookieParserBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined set-cookie-parser.set-cookie-parser.Options & {  map  :true} */
trait Optionsmaptrue extends js.Object {
  var decodeValues: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[Boolean with `true`] = js.undefined
}

object Optionsmaptrue {
  @scala.inline
  def apply(
    decodeValues: js.UndefOr[Boolean] = js.undefined,
    map: js.UndefOr[Boolean with `true`] = js.undefined
  ): Optionsmaptrue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeValues)) __obj.updateDynamic("decodeValues")(decodeValues.asInstanceOf[js.Any])
    if (!js.isUndefined(map)) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsmaptrue]
  }
}

