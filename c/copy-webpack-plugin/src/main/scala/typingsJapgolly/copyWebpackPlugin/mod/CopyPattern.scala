package typingsJapgolly.copyWebpackPlugin.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.copyWebpackPlugin.AnonKey
import typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.dir
import typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.file
import typingsJapgolly.copyWebpackPlugin.copyWebpackPluginStrings.template
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPattern extends js.Object {
  /** 
  	 * Enable transform caching.  (default: `false`)
  	 * 
  	 * You can use `{ key: 'my-cache-key' }` to invalidate the cache.  
  	 * */
  var cache: js.UndefOr[Boolean | AnonKey] = js.undefined
  /** A path that determines how to interpret the `from` path. 
  	 * 
  	 * (default: `options.context | compiler.options.context`) 
  	 * */
  var context: js.UndefOr[String] = js.undefined
  /**
  	 * Removes all directory references and only copies file names. (default: `false`)
  	 *
  	 * If files have the same name, the result is non-deterministic. 
  	 */
  var flatten: js.UndefOr[Boolean] = js.undefined
  /** Overwrites files already in `compilation.assets` (usually added by other plugins; default: `false`) */
  var force: js.UndefOr[Boolean] = js.undefined
  /** File source path or glob */
  var from: String | MiniMatchGlob
  /** Additional globs to ignore for this pattern. (default: `[]`) */
  var ignore: js.UndefOr[js.Array[String | MiniMatchGlob]] = js.undefined
  /** 
  	 * Pattern for extracting elements to be used in `to` templates. 
  	 * 
  	 * Defines a `RegExp` to match some parts of the file path. These capture groups can be reused in the name property using [N] 
  	 * placeholder. Note that [0] will be replaced by the entire path of the file, whereas [1] will contain the first capturing 
  	 * parenthesis of your RegExp and so on...
  	 * 
  	 * */
  var test: js.UndefOr[js.RegExp] = js.undefined
  /**
  	 * Path or webpack file-loader patterns. defaults:
  	 * output root if `from` is file or dir.
  	 * resolved glob path if `from` is glob.
  	 */
  var to: js.UndefOr[String] = js.undefined
  /**
  	 * How to interpret `to`. default: undefined
  	 * 
  	 * `file` - if 'to' has extension or 'from' is file.
  	 * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
  	 * `template` - if 'to' contains a template pattern.
  	 */
  var toType: js.UndefOr[file | dir | template] = js.undefined
  /** Function that modifies file contents before writing to webpack. (default: `(content, path) => content`) */
  var transform: js.UndefOr[
    js.Function2[
      /* content */ Buffer, 
      /* path */ String, 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.undefined
  /** 
  	 * Allows to modify the writing path.
  	 * 
  	 *  Returns the new path or a promise that resolves into the new path
  	 */
  var transformPath: js.UndefOr[
    js.Function2[/* targetPath */ String, /* absolutePath */ String, String | js.Promise[String]]
  ] = js.undefined
}

object CopyPattern {
  @scala.inline
  def apply(
    from: String | MiniMatchGlob,
    cache: Boolean | AnonKey = null,
    context: String = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String | MiniMatchGlob] = null,
    test: js.RegExp = null,
    to: String = null,
    toType: file | dir | template = null,
    transform: (/* content */ Buffer, /* path */ String) => CallbackTo[String | Buffer | (js.Promise[String | Buffer])] = null,
    transformPath: (/* targetPath */ String, /* absolutePath */ String) => CallbackTo[String | js.Promise[String]] = null
  ): CopyPattern = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (toType != null) __obj.updateDynamic("toType")(toType.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2((t0: /* content */ typingsJapgolly.node.Buffer, t1: /* path */ java.lang.String) => transform(t0, t1).runNow()))
    if (transformPath != null) __obj.updateDynamic("transformPath")(js.Any.fromFunction2((t0: /* targetPath */ java.lang.String, t1: /* absolutePath */ java.lang.String) => transformPath(t0, t1).runNow()))
    __obj.asInstanceOf[CopyPattern]
  }
}

