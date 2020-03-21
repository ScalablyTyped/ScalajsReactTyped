package typingsJapgolly.expressMinify.ExpressMinifyInterfaces

import typingsJapgolly.node.NodeRequire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressMinifyOptions extends js.Object {
  /**
    * The directory for cache storage (must be writeable). Pass false to cache in the memory (not recommended).
    */
  var cache: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Matches CoffeeScript content-type.
    */
  var coffee_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Matches CSS content-type.
    */
  var css_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Customize cssmin instance (require('cssmin')).
    */
  var cssmin: js.UndefOr[NodeRequire] = js.undefined
  /**
    * Matches JavaScript content-type.
    */
  var js_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Matches JSON content-type.
    */
  var json_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Matches LESS content-type.
    */
  var less_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Handle compiling errors or minifying errors. You can determine what to respond when facing such errors.
    */
  var onerror: js.UndefOr[js.Function] = js.undefined
  /**
    * Matches SASS content-type.
    */
  var sass_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Matches Stylus content-type.
    */
  var stylus_match: js.UndefOr[js.RegExp] = js.undefined
  /**
    * Customize UglifyJS instance (require('uglify-js')).
    */
  var uglifyJS: js.UndefOr[NodeRequire] = js.undefined
}

object ExpressMinifyOptions {
  @scala.inline
  def apply(
    cache: String | Boolean = null,
    coffee_match: js.RegExp = null,
    css_match: js.RegExp = null,
    cssmin: NodeRequire = null,
    js_match: js.RegExp = null,
    json_match: js.RegExp = null,
    less_match: js.RegExp = null,
    onerror: js.Function = null,
    sass_match: js.RegExp = null,
    stylus_match: js.RegExp = null,
    uglifyJS: NodeRequire = null
  ): ExpressMinifyOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (coffee_match != null) __obj.updateDynamic("coffee_match")(coffee_match.asInstanceOf[js.Any])
    if (css_match != null) __obj.updateDynamic("css_match")(css_match.asInstanceOf[js.Any])
    if (cssmin != null) __obj.updateDynamic("cssmin")(cssmin.asInstanceOf[js.Any])
    if (js_match != null) __obj.updateDynamic("js_match")(js_match.asInstanceOf[js.Any])
    if (json_match != null) __obj.updateDynamic("json_match")(json_match.asInstanceOf[js.Any])
    if (less_match != null) __obj.updateDynamic("less_match")(less_match.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(onerror.asInstanceOf[js.Any])
    if (sass_match != null) __obj.updateDynamic("sass_match")(sass_match.asInstanceOf[js.Any])
    if (stylus_match != null) __obj.updateDynamic("stylus_match")(stylus_match.asInstanceOf[js.Any])
    if (uglifyJS != null) __obj.updateDynamic("uglifyJS")(uglifyJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressMinifyOptions]
  }
}

