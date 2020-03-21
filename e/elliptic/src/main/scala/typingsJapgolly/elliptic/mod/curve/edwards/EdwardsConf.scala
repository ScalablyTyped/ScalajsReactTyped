package typingsJapgolly.elliptic.mod.curve.edwards

import typingsJapgolly.elliptic.mod.BNInput
import typingsJapgolly.elliptic.mod.curve.base.BaseCurveOptions
import typingsJapgolly.elliptic.mod.curve.base.BasePoint
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdwardsConf extends BaseCurveOptions {
  var a: BNInput
  var c: BNInput
  var d: BNInput
}

object EdwardsConf {
  @scala.inline
  def apply(
    a: BNInput,
    c: BNInput,
    d: BNInput,
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any),
    g: BasePoint = null,
    gRed: js.Any = null,
    n: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer = null,
    prime: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String = null
  ): EdwardsConf = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (gRed != null) __obj.updateDynamic("gRed")(gRed.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (prime != null) __obj.updateDynamic("prime")(prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdwardsConf]
  }
}

