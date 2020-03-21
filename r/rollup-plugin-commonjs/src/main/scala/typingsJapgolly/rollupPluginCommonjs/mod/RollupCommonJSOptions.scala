package typingsJapgolly.rollupPluginCommonjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollupCommonJSOptions extends js.Object {
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  /**
  	 * search for files other than .js files (must already
  	 * be transpiled by a previous plugin!)
  	 * @default [ '.js' ]
  	 */
  var extensions: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  /**
  	 * sometimes you have to leave require statements
  	 * unconverted. Pass an array containing the IDs
  	 * or a `id => boolean` function. Only use this
  	 * option if you know what you're doing!
  	 */
  var ignore: js.UndefOr[js.Array[String | (js.Function1[/* id */ String, Boolean])]] = js.undefined
  /**
  	 * if true then uses of `global` won't be dealt with by this plugin
  	 * @default false
  	 */
  var ignoreGlobal: js.UndefOr[Boolean] = js.undefined
  /**
  	 * non-CommonJS modules will be ignored, but you can also
  	 * specifically include/exclude files
  	 * @default undefined
  	 */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  /**
  	 * explicitly specify unresolvable named exports
  	 * ([see below for more details](https://github.com/rollup/rollup-plugin-commonjs#custom-named-exports))
  	 * @default undefined
  	 */
  var namedExports: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  /**
  	 * if false then skip sourceMap generation for CommonJS modules
  	 * @default true
  	 */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
}

object RollupCommonJSOptions {
  @scala.inline
  def apply(
    exclude: String | js.RegExp | (js.Array[String | js.RegExp]) = null,
    extensions: js.Array[String | js.RegExp] = null,
    ignore: js.Array[String | (js.Function1[/* id */ String, Boolean])] = null,
    ignoreGlobal: js.UndefOr[Boolean] = js.undefined,
    include: String | js.RegExp | (js.Array[String | js.RegExp]) = null,
    namedExports: StringDictionary[js.Array[String]] = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined
  ): RollupCommonJSOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreGlobal)) __obj.updateDynamic("ignoreGlobal")(ignoreGlobal.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (namedExports != null) __obj.updateDynamic("namedExports")(namedExports.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupCommonJSOptions]
  }
}

