package typingsJapgolly.compression.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * compression() accepts these properties in the options object.
  * In addition to those listed below, `zlib` options may be passed in to the options object.
  */
trait CompressionOptions
  extends /**
  * In addition , `zlib` options may be passed in to the options object.
  */
/* property */ StringDictionary[js.Any] {
  /**
    * @default zlib.constants.Z_DEFAULT_CHUNK or 16384
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning| Node.js documentation}
    * @see {@link https://github.com/expressjs/compression#chunksize|chunkSize documentation}
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /**
    * A function to decide if the response should be considered for compression. This function is called as
    * `filter(req, res)` and is expected to return `true` to consider the response for compression, or `false` to
    * not compress the response.
    *
    * The default filter function uses the `compressible` module to determine if `res.getHeader('Content-Type')`
    * is compressible.
    *
    * @see {@link https://github.com/expressjs/compression#filter|`filter` documentation}
    * @see {@link https://www.npmjs.com/package/compressible|compressible module}
    */
  var filter: js.UndefOr[CompressionFilter] = js.undefined
  /**
    * The level of zlib compression to apply to responses. A higher level will result in better compression, but
    * will take longer to complete. A lower level will result in less compression, but will be much faster.
    *
    * This is an integer in the range of `0` (no compression) to `9` (maximum compression). The special value `-1`
    * can be used to mean the "default compression level", which is a default compromise between speed and
    * compression (currently equivalent to level 6).
    *
    * - `-1` Default compression level (also `zlib.constants.Z_DEFAULT_COMPRESSION`).
    * - `0` No compression (also `zlib.constants.Z_NO_COMPRESSION`).
    * - `1` Fastest compression (also `zlib.constants.Z_BEST_SPEED`).
    * - `2`
    * - `3`
    * - `4`
    * - `5`
    * - `6` (currently what `zlib.constants.Z_DEFAULT_COMPRESSION` points to).
    * - `7`
    * - `8`
    * - `9` Best compression (also `zlib.constants.Z_BEST_COMPRESSION`).
    *
    * **Note** in the list above, `zlib` is from `zlib = require('zlib')`.
    *
    * @default zlib.constants.DEFAULT_COMPRESSION or -1
    * @see {@link https://github.com/expressjs/compression#level|`level` documentation}
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    * This specifies how much memory should be allocated for the internal compression state and is an integer in
    * the range of `1` (minimum level) and `9` (maximum level).
    *
    * @default zlib.constants.DEFAULT_MEMLEVEL or 8
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
    * @see {@link https://github.com/expressjs/compression#memlevel|`memLevel` documentation}
    */
  var memLevel: js.UndefOr[Double] = js.undefined
  /**
    * This is used to tune the compression algorithm. This value only affects the compression ratio, not the
    * correctness of the compressed output, even if it is not set appropriately.
    *
    * - `zlib.constants.Z_DEFAULT_STRATEGY` Use for normal data.
    * - `zlib.constants.Z_FILTERED` Use for data produced by a filter (or predictor). Filtered data consists mostly of small
    *   values with a somewhat random distribution. In this case, the compression algorithm is tuned to compress
    *   them better. The effect is to force more Huffman coding and less string matching; it is somewhat intermediate
    *   between `zlib.constants.Z_DEFAULT_STRATEGY` and `zlib.constants.Z_HUFFMAN_ONLY`.
    * - `zlib.constants.Z_FIXED` Use to prevent the use of dynamic Huffman codes, allowing for a simpler decoder for special applications.
    * - `zlib.constants.Z_HUFFMAN_ONLY` Use to force Huffman encoding only (no string match).
    * - `zlib.constants.Z_RLE` Use to limit match distances to one (run-length encoding). This is designed to be almost as
    *    fast as `zlib.constants.Z_HUFFMAN_ONLY`, but give better compression for PNG image data.
    *
    * **Note** in the list above, `zlib` is from `zlib = require('zlib')`.
    */
  var strategy: js.UndefOr[Double] = js.undefined
  /**
    * The byte threshold for the response body size before compression is considered for the response, defaults to
    * 1kb. This is a number of bytes or any string accepted by the bytes module.
    *
    * **Note** this is only an advisory setting; if the response size cannot be determined at the time the response
    * headers are written, then it is assumed the response is *over* the threshold. To guarantee the response size
    * can be determined, be sure set a `Content-Length` response header.
    *
    * @see {@link https://www.npmjs.com/package/bytes|`bytes` module}
    * @see {@link https://github.com/expressjs/compression#threshold|`threshold` documentation}
    */
  var threshold: js.UndefOr[Double | String] = js.undefined
  /**
    * @default zlib.constants.Z_DEFAULT_WINDOWBITS or 15.
    * @see {@link http://nodejs.org/api/zlib.html#zlib_memory_usage_tuning|Node.js documentation}
    */
  var windowBits: js.UndefOr[Double] = js.undefined
}

object CompressionOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
    * In addition , `zlib` options may be passed in to the options object.
    */
  /* property */ StringDictionary[js.Any] = null,
    chunkSize: Int | Double = null,
    filter: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    level: Int | Double = null,
    memLevel: Int | Double = null,
    strategy: Int | Double = null,
    threshold: Double | String = null,
    windowBits: Int | Double = null
  ): CompressionOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => filter(t0, t1).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressionOptions]
  }
}

