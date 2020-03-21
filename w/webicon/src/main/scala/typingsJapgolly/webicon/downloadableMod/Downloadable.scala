package typingsJapgolly.webicon.downloadableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.iconMod.Icon
import typingsJapgolly.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadable[TUriParam] extends Icon {
  /**
    * An alias of the `url`-property.
    */
  var uri: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any
  ] = js.undefined
  /**
    * The url to load the source from.
    */
  var url: js.UndefOr[UrlConfig[TUriParam]] = js.undefined
}

object Downloadable {
  @scala.inline
  def apply[TUriParam](
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[TUriParam] = null
  ): Downloadable[TUriParam] = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadable[TUriParam]]
  }
}

