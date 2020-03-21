package typingsJapgolly.secp256k1.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
    *
    * By default is `null`.
    */
  var data: js.UndefOr[scala.scalajs.js.typedarray.Uint8Array] = js.undefined
  /** Nonce generator. By default it is rfc6979 */
  var noncefn: js.UndefOr[
    js.Function5[
      /* message */ scala.scalajs.js.typedarray.Uint8Array, 
      /* privateKey */ scala.scalajs.js.typedarray.Uint8Array, 
      /* algo */ scala.scalajs.js.typedarray.Uint8Array | Null, 
      /* data */ scala.scalajs.js.typedarray.Uint8Array | Null, 
      /* attempt */ Double, 
      scala.scalajs.js.typedarray.Uint8Array
    ]
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    data: scala.scalajs.js.typedarray.Uint8Array = null,
    noncefn: (/* message */ scala.scalajs.js.typedarray.Uint8Array, /* privateKey */ scala.scalajs.js.typedarray.Uint8Array, /* algo */ scala.scalajs.js.typedarray.Uint8Array | Null, /* data */ scala.scalajs.js.typedarray.Uint8Array | Null, /* attempt */ Double) => CallbackTo[scala.scalajs.js.typedarray.Uint8Array] = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (noncefn != null) __obj.updateDynamic("noncefn")(js.Any.fromFunction5((t0: /* message */ scala.scalajs.js.typedarray.Uint8Array, t1: /* privateKey */ scala.scalajs.js.typedarray.Uint8Array, t2: /* algo */ scala.scalajs.js.typedarray.Uint8Array | scala.Null, t3: /* data */ scala.scalajs.js.typedarray.Uint8Array | scala.Null, t4: /* attempt */ scala.Double) => noncefn(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[SignOptions]
  }
}

