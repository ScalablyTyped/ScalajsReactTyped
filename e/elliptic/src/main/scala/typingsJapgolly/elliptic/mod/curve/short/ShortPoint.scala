package typingsJapgolly.elliptic.mod.curve.short

import typingsJapgolly.elliptic.mod.BNInput
import typingsJapgolly.elliptic.mod.curve.base.BasePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve.short.ShortPoint")
@js.native
class ShortPoint () extends BasePoint {
  var inf: Boolean = js.native
  var x: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
  var y: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
  def toJSON(): js.Array[BNInput] = js.native
}

