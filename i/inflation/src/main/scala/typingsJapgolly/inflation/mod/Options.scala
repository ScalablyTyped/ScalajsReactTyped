package typingsJapgolly.inflation.mod

import typingsJapgolly.inflation.inflationStrings.deflate
import typingsJapgolly.inflation.inflationStrings.gzip
import typingsJapgolly.inflation.inflationStrings.identity
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ZlibOptions {
  /**
    * The encoding of the stream. If not given, will look in `stream.headers['content-encoding']`.
    */
  var gzip: js.UndefOr[deflate | typingsJapgolly.inflation.inflationStrings.gzip | identity] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: ArrayBufferView | scala.scalajs.js.typedarray.ArrayBuffer = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    gzip: deflate | gzip | identity = null,
    level: Int | Double = null,
    memLevel: Int | Double = null,
    strategy: Int | Double = null,
    windowBits: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

