package typingsJapgolly.hapi

import typingsJapgolly.hapi.hapiBooleans.`false`
import typingsJapgolly.hapi.hapiStrings.Lax
import typingsJapgolly.hapi.hapiStrings.Strict
import typingsJapgolly.hapi.hapiStrings.base64
import typingsJapgolly.hapi.hapiStrings.base64json
import typingsJapgolly.hapi.hapiStrings.form
import typingsJapgolly.hapi.hapiStrings.iron
import typingsJapgolly.hapi.hapiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncoding extends js.Object {
  var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.undefined
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  var isSameSite: js.UndefOr[`false` | Strict | Lax] = js.undefined
  var isSecure: js.UndefOr[Boolean] = js.undefined
  var strictHeader: js.UndefOr[Boolean] = js.undefined
}

object AnonEncoding {
  @scala.inline
  def apply(
    encoding: none | base64 | base64json | form | iron = null,
    ignoreErrors: js.UndefOr[Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSameSite: `false` | Strict | Lax = null,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    strictHeader: js.UndefOr[Boolean] = js.undefined
  ): AnonEncoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.asInstanceOf[js.Any])
    if (isSameSite != null) __obj.updateDynamic("isSameSite")(isSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.asInstanceOf[js.Any])
    if (!js.isUndefined(strictHeader)) __obj.updateDynamic("strictHeader")(strictHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncoding]
  }
}

