package typingsJapgolly.stompit.clientMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.AnonChunk
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends WritableOptions {
  def onError(err: js.Error): Unit
  def onReceipt(): Unit
}

object SendOptions {
  @scala.inline
  def apply(
    onError: js.Error => Callback,
    onReceipt: Callback,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Writable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    `final`: js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ] = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Writable, 
      /* chunks */ js.Array[AnonChunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ] = null
  ): SendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()))
    __obj.updateDynamic("onReceipt")(onReceipt.toJsFn)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.asInstanceOf[js.Any])
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose.asInstanceOf[js.Any])
    if (`final` != null) __obj.updateDynamic("final")(`final`.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    if (writev != null) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

