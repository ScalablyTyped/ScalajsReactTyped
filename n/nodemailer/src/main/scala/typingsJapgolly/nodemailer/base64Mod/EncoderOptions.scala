package typingsJapgolly.nodemailer.base64Mod

import typingsJapgolly.node.AnonChunk
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformCallback
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncoderOptions extends TransformOptions {
  var lineLength: js.UndefOr[Double | `false`] = js.undefined
}

object EncoderOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Transform, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    `final`: js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ] = null,
    flush: js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, Unit] = null,
    highWaterMark: Int | Double = null,
    lineLength: Double | `false` = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Transform, /* size */ Double, Unit] = null,
    readableHighWaterMark: Int | Double = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    transform: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ TransformCallback, 
      Unit
    ] = null,
    writableCorked: Int | Double = null,
    writableHighWaterMark: Int | Double = null,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ] = null
  ): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (lineLength != null) __obj.updateDynamic("lineLength")(lineLength.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (readableHighWaterMark != null) __obj.updateDynamic("readableHighWaterMark")(readableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (writableCorked != null) __obj.updateDynamic("writableCorked")(writableCorked.asInstanceOf[js.Any])
    if (writableHighWaterMark != null) __obj.updateDynamic("writableHighWaterMark")(writableHighWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncoderOptions]
  }
}

