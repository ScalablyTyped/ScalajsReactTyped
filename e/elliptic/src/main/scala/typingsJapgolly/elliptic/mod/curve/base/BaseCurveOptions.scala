package typingsJapgolly.elliptic.mod.curve.base

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCurveOptions extends js.Object {
  var g: js.UndefOr[BasePoint] = js.undefined
  var gRed: js.UndefOr[js.Any] = js.undefined
  var n: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer
  ] = js.undefined
  var p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
  var prime: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String
  ] = js.undefined
}

object BaseCurveOptions {
  @scala.inline
  def apply(
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any),
    g: BasePoint = null,
    gRed: js.Any = null,
    n: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer = null,
    prime: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String = null
  ): BaseCurveOptions = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g.asInstanceOf[js.Any])
    if (gRed != null) __obj.updateDynamic("gRed")(gRed.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (prime != null) __obj.updateDynamic("prime")(prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCurveOptions]
  }
}

