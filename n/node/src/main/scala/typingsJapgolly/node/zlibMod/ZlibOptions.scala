package typingsJapgolly.node.zlibMod

import typingsJapgolly.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
   // compression only
  var dictionary: js.UndefOr[ArrayBufferView | scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /**
    * @default constants.Z_FINISH
    */
  var finishFlush: js.UndefOr[Double] = js.undefined
  /**
    * @default constants.Z_NO_FLUSH
    */
  var flush: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
   // compression only
  var memLevel: js.UndefOr[Double] = js.undefined
   // compression only
  var strategy: js.UndefOr[Double] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: ArrayBufferView | scala.scalajs.js.typedarray.ArrayBuffer = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    level: Int | Double = null,
    memLevel: Int | Double = null,
    strategy: Int | Double = null,
    windowBits: Int | Double = null
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

