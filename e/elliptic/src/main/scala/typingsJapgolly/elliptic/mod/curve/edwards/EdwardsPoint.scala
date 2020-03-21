package typingsJapgolly.elliptic.mod.curve.edwards

import typingsJapgolly.elliptic.mod.curve.base.BasePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve.edwards.EdwardsPoint")
@js.native
class EdwardsPoint () extends BasePoint {
  var t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var z: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  def eqXToP(
    x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  ): Boolean = js.native
  def normalize(): EdwardsPoint = js.native
}

