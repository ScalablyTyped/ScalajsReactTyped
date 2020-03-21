package typingsJapgolly.koaSend.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.koaSend.koaSendBooleans.`false`
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  /** Try to serve the brotli version of a file automatically when brotli is supported by a client and if the requested file with .br extension exists. (defaults to true). */
  var brotli: js.UndefOr[Boolean] = js.undefined
  /** Try to match extensions from passed array to search for file when no extension is sufficed in URL. First found is served. (defaults to false) */
  var extensions: js.UndefOr[js.Array[String] | `false`] = js.undefined
  /** If not false (defaults to true), format the path to serve static file servers and not require a trailing slash for directories, so that you can do both /directory and /directory/. */
  var format: js.UndefOr[Boolean] = js.undefined
  /** Try to serve the gzipped version of a file automatically when gzip is supported by a client and if the requested file with .gz extension exists. (defaults to true). */
  var gzip: js.UndefOr[Boolean] = js.undefined
  /** Allow transfer of hidden files. (defaults to false) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Tell the browser the resource is immutable and can be cached indefinitely. (defaults to false) */
  var immutable: js.UndefOr[Boolean] = js.undefined
  /** Name of the index file to serve automatically when visiting the root location. (defaults to none) */
  var index: js.UndefOr[String | `false`] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  /** Browser cache max-age in milliseconds. (defaults to 0) */
  var maxage: js.UndefOr[Double] = js.undefined
  /** Root directory to restrict file access. (defaults to '') */
  var root: js.UndefOr[String] = js.undefined
  /** Function to set custom headers on response. */
  var setHeaders: js.UndefOr[SetHeaders] = js.undefined
}

object SendOptions {
  @scala.inline
  def apply(
    brotli: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] | `false` = null,
    format: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    immutable: js.UndefOr[Boolean] = js.undefined,
    index: String | `false` = null,
    maxAge: Int | Double = null,
    maxage: Int | Double = null,
    root: String = null,
    setHeaders: (/* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, /* path */ String, /* stats */ Stats) => CallbackTo[js.Any] = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brotli)) __obj.updateDynamic("brotli")(brotli.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3((t0: /* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, t1: /* path */ java.lang.String, t2: /* stats */ typingsJapgolly.node.fsMod.Stats) => setHeaders(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SendOptions]
  }
}

