package typingsJapgolly.webicon.imageIconOptionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webicon.storeableMod.Storeable
import typingsJapgolly.webicon.urlConfigMod.UrlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageIconOptions extends Storeable

object ImageIconOptions {
  @scala.inline
  def apply(
    iconIdParser: (/* id */ String, /* params */ js.Array[String]) => CallbackTo[String] = null,
    iconIdResolver: /* id */ String => CallbackTo[String] = null,
    preloadable: js.UndefOr[Boolean] = js.undefined,
    uri: /* import warning: importer.ImportType#apply Failed type conversion: this['url'] */ js.Any = null,
    url: UrlConfig[scala.Nothing] = null
  ): ImageIconOptions = {
    val __obj = js.Dynamic.literal()
    if (iconIdParser != null) __obj.updateDynamic("iconIdParser")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* params */ js.Array[java.lang.String]) => iconIdParser(t0, t1).runNow()))
    if (iconIdResolver != null) __obj.updateDynamic("iconIdResolver")(js.Any.fromFunction1((t0: /* id */ java.lang.String) => iconIdResolver(t0).runNow()))
    if (!js.isUndefined(preloadable)) __obj.updateDynamic("preloadable")(preloadable.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageIconOptions]
  }
}

