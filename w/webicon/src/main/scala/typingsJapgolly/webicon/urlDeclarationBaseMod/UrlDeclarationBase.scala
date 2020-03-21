package typingsJapgolly.webicon.urlDeclarationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlDeclarationBase extends js.Object {
  /**
    * The `GET`-variables of the url.
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * The actual url.
    */
  var url: js.UndefOr[js.Any] = js.undefined
}

object UrlDeclarationBase {
  @scala.inline
  def apply(params: js.Any = null, url: js.Any = null): UrlDeclarationBase = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlDeclarationBase]
  }
}

