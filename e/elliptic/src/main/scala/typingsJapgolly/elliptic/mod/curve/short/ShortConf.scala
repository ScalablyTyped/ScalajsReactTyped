package typingsJapgolly.elliptic.mod.curve.short

import typingsJapgolly.elliptic.mod.BNInput
import typingsJapgolly.elliptic.mod.curve.base.BaseCurveOptions
import typingsJapgolly.elliptic.mod.curve.base.BasePoint
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortConf extends BaseCurveOptions {
  var a: BNInput
  var b: BNInput
  var beta: js.UndefOr[BNInput] = js.undefined
  var lambda: js.UndefOr[BNInput] = js.undefined
}

object ShortConf {
  @scala.inline
  def apply(
    a: BNInput,
    b: BNInput,
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any),
    beta: BNInput = null,
    g: BasePoint = null,
    gRed: js.Any = null,
    lambda: BNInput = null,
    n: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer = null,
    prime: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String = null
  ): ShortConf = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (gRed != null) __obj.updateDynamic("gRed")(gRed.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (prime != null) __obj.updateDynamic("prime")(prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortConf]
  }
}

