package typingsJapgolly.saslDigestMd5.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var genNonce: js.UndefOr[js.Function0[Double]] = js.undefined
}

object Options {
  @scala.inline
  def apply(genNonce: js.UndefOr[CallbackTo[Double]] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    genNonce.foreach(p => __obj.updateDynamic("genNonce")(p.toJsFn))
    __obj.asInstanceOf[Options]
  }
}

