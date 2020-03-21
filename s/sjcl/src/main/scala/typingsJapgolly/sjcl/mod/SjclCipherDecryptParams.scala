package typingsJapgolly.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherDecryptParams extends SjclCipherParams {
  var iv: js.UndefOr[BitArray_] = js.undefined
  var salt: js.UndefOr[BitArray_] = js.undefined
}

object SjclCipherDecryptParams {
  @scala.inline
  def apply(
    adata: String = null,
    cipher: String = null,
    iter: Int | Double = null,
    iv: BitArray_ = null,
    ks: Int | Double = null,
    mode: String = null,
    salt: BitArray_ = null,
    ts: Int | Double = null,
    v: Int | Double = null
  ): SjclCipherDecryptParams = {
    val __obj = js.Dynamic.literal()
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (iter != null) __obj.updateDynamic("iter")(iter.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (ks != null) __obj.updateDynamic("ks")(ks.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (ts != null) __obj.updateDynamic("ts")(ts.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherDecryptParams]
  }
}

