package typingsJapgolly.server

import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.bodyParser.mod.OptionsText
import typingsJapgolly.bodyParser.mod.OptionsUrlencoded
import typingsJapgolly.express.mod.CookieOptions
import typingsJapgolly.server.optionsMod.DataParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.UndefOr[OptionsUrlencoded] = js.undefined
  var cookie: js.UndefOr[CookieOptions] = js.undefined
  var data: js.UndefOr[DataParserOptions] = js.undefined
  var json: js.UndefOr[OptionsJson] = js.undefined
  var text: js.UndefOr[OptionsText] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: OptionsUrlencoded = null,
    cookie: CookieOptions = null,
    data: DataParserOptions = null,
    json: OptionsJson = null,
    text: OptionsText = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

