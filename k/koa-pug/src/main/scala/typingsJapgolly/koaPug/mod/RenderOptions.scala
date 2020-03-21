package typingsJapgolly.koaPug.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends PugOptions {
  /**
    * Render template string instead template file
    */
  var fromString: js.UndefOr[Boolean] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    app: ^[DefaultState, DefaultContext] = null,
    basedir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    filename: String = null,
    filters: js.Any = null,
    fromString: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    helperPath: js.Array[_] = null,
    inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined,
    locals: StringDictionary[js.Any] = null,
    name: String = null,
    pretty: Boolean | String = null,
    self: js.UndefOr[Boolean] = js.undefined,
    viewPath: String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (doctype != null) __obj.updateDynamic("doctype")(doctype.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(fromString)) __obj.updateDynamic("fromString")(fromString.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (helperPath != null) __obj.updateDynamic("helperPath")(helperPath.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (viewPath != null) __obj.updateDynamic("viewPath")(viewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

