package typingsJapgolly.bleno.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicOptions extends js.Object {
  var descriptors: js.UndefOr[js.Array[Descriptor] | Null] = js.undefined
  var onIndicate: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onNotify: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onReadRequest: js.UndefOr[
    (js.Function2[
      /* offset */ Double, 
      /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]) | Null
  ] = js.undefined
  var onSubscribe: js.UndefOr[
    (js.Function2[/* maxValueSize */ Double, /* updateValueCallback */ js.Any, Unit]) | Null
  ] = js.undefined
  var onUnsubscribe: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var onWriteRequest: js.UndefOr[
    (js.Function4[
      /* data */ Buffer, 
      /* offset */ Double, 
      /* withoutResponse */ Boolean, 
      /* callback */ js.Function1[/* result */ Double, Unit], 
      Unit
    ]) | Null
  ] = js.undefined
  var properties: js.UndefOr[js.Array[Property] | Null] = js.undefined
  var secure: js.UndefOr[js.Array[Property] | Null] = js.undefined
  var uuid: String
  var value: js.UndefOr[Buffer | Null] = js.undefined
}

object CharacteristicOptions {
  @scala.inline
  def apply(
    uuid: String,
    descriptors: js.Array[Descriptor] = null,
    onIndicate: js.UndefOr[Callback] = js.undefined,
    onNotify: js.UndefOr[Callback] = js.undefined,
    onReadRequest: (/* offset */ Double, /* callback */ js.Function2[/* result */ Double, /* data */ js.UndefOr[Buffer], Unit]) => Callback = null,
    onSubscribe: (/* maxValueSize */ Double, /* updateValueCallback */ js.Any) => Callback = null,
    onUnsubscribe: js.UndefOr[Callback] = js.undefined,
    onWriteRequest: (/* data */ Buffer, /* offset */ Double, /* withoutResponse */ Boolean, /* callback */ js.Function1[/* result */ Double, Unit]) => Callback = null,
    properties: js.Array[Property] = null,
    secure: js.Array[Property] = null,
    value: Buffer = null
  ): CharacteristicOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors.asInstanceOf[js.Any])
    onIndicate.foreach(p => __obj.updateDynamic("onIndicate")(p.toJsFn))
    onNotify.foreach(p => __obj.updateDynamic("onNotify")(p.toJsFn))
    if (onReadRequest != null) __obj.updateDynamic("onReadRequest")(js.Any.fromFunction2((t0: /* offset */ scala.Double, t1: /* callback */ js.Function2[
  /* result */ scala.Double, 
  /* data */ js.UndefOr[typingsJapgolly.node.Buffer], 
  scala.Unit]) => onReadRequest(t0, t1).runNow()))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction2((t0: /* maxValueSize */ scala.Double, t1: /* updateValueCallback */ js.Any) => onSubscribe(t0, t1).runNow()))
    onUnsubscribe.foreach(p => __obj.updateDynamic("onUnsubscribe")(p.toJsFn))
    if (onWriteRequest != null) __obj.updateDynamic("onWriteRequest")(js.Any.fromFunction4((t0: /* data */ typingsJapgolly.node.Buffer, t1: /* offset */ scala.Double, t2: /* withoutResponse */ scala.Boolean, t3: /* callback */ js.Function1[/* result */ scala.Double, scala.Unit]) => onWriteRequest(t0, t1, t2, t3).runNow()))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicOptions]
  }
}

