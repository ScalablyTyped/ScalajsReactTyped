package typingsJapgolly.gulpInject.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var addPrefix: js.UndefOr[String] = js.undefined
  var addRootSlash: js.UndefOr[Boolean] = js.undefined
  var addSuffix: js.UndefOr[String] = js.undefined
  var empty: js.UndefOr[Boolean] = js.undefined
  var endtag: js.UndefOr[String | ITagFunction] = js.undefined
  var ignorePath: js.UndefOr[String | js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var removeTags: js.UndefOr[Boolean] = js.undefined
  var selfClosingTag: js.UndefOr[Boolean] = js.undefined
  var starttag: js.UndefOr[String | ITagFunction] = js.undefined
  var transform: js.UndefOr[ITransformFunction] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    addPrefix: String = null,
    addRootSlash: js.UndefOr[Boolean] = js.undefined,
    addSuffix: String = null,
    empty: js.UndefOr[Boolean] = js.undefined,
    endtag: String | ITagFunction = null,
    ignorePath: String | js.Array[String] = null,
    name: String = null,
    relative: js.UndefOr[Boolean] = js.undefined,
    removeTags: js.UndefOr[Boolean] = js.undefined,
    selfClosingTag: js.UndefOr[Boolean] = js.undefined,
    starttag: String | ITagFunction = null,
    transform: (/* filepath */ String, /* file */ js.UndefOr[File], /* index */ js.UndefOr[Double], /* length */ js.UndefOr[Double], /* targetFile */ js.UndefOr[File]) => CallbackTo[String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (addPrefix != null) __obj.updateDynamic("addPrefix")(addPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(addRootSlash)) __obj.updateDynamic("addRootSlash")(addRootSlash.asInstanceOf[js.Any])
    if (addSuffix != null) __obj.updateDynamic("addSuffix")(addSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (endtag != null) __obj.updateDynamic("endtag")(endtag.asInstanceOf[js.Any])
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (!js.isUndefined(removeTags)) __obj.updateDynamic("removeTags")(removeTags.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosingTag)) __obj.updateDynamic("selfClosingTag")(selfClosingTag.asInstanceOf[js.Any])
    if (starttag != null) __obj.updateDynamic("starttag")(starttag.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction5((t0: /* filepath */ java.lang.String, t1: /* file */ js.UndefOr[typingsJapgolly.vinyl.mod.File], t2: /* index */ js.UndefOr[scala.Double], t3: /* length */ js.UndefOr[scala.Double], t4: /* targetFile */ js.UndefOr[typingsJapgolly.vinyl.mod.File]) => transform(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IOptions]
  }
}

