package typingsJapgolly.htmlWebpackTagsPlugin.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeScriptTagOptions extends ScriptTagOptions {
  var `type`: js.UndefOr[TypeString] = js.undefined
}

object MaybeScriptTagOptions {
  @scala.inline
  def apply(
    path: String,
    addHash: (/* assetPath */ String, /* hash */ String) => CallbackTo[String] = null,
    addPublicPath: (/* assetPath */ String, /* publicPath */ String) => CallbackTo[String] = null,
    append: js.UndefOr[Boolean] = js.undefined,
    attributes: AttributesObject = null,
    external: ExternalObject = null,
    glob: String = null,
    globFlatten: js.UndefOr[Boolean] = js.undefined,
    globPath: String = null,
    hash: Boolean | String | AddHashFunction = null,
    publicPath: Boolean | String | AddPublicPathFunction = null,
    sourcePath: String = null,
    `type`: TypeString = null,
    useHash: js.UndefOr[Boolean] = js.undefined,
    usePublicPath: js.UndefOr[Boolean] = js.undefined
  ): MaybeScriptTagOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (addHash != null) __obj.updateDynamic("addHash")(js.Any.fromFunction2((t0: /* assetPath */ java.lang.String, t1: /* hash */ java.lang.String) => addHash(t0, t1).runNow()))
    if (addPublicPath != null) __obj.updateDynamic("addPublicPath")(js.Any.fromFunction2((t0: /* assetPath */ java.lang.String, t1: /* publicPath */ java.lang.String) => addPublicPath(t0, t1).runNow()))
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (external != null) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (!js.isUndefined(globFlatten)) __obj.updateDynamic("globFlatten")(globFlatten.asInstanceOf[js.Any])
    if (globPath != null) __obj.updateDynamic("globPath")(globPath.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (sourcePath != null) __obj.updateDynamic("sourcePath")(sourcePath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.asInstanceOf[js.Any])
    if (!js.isUndefined(usePublicPath)) __obj.updateDynamic("usePublicPath")(usePublicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeScriptTagOptions]
  }
}

