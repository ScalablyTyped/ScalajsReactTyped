package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.icomputableMod.IComputable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "plus")
@js.native
object plus extends js.Object {
  def apply[Y, Ret](x: String, y: Y): Ret = js.native
  def apply[Y, Ret](x: Double, y: Y): Ret = js.native
  def apply[X /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'plus' ]: tstl.tstl/numeric/IComputable.IComputable<Y, Ret>[P]}
    */ typingsJapgolly.tstl.tstlStrings.plus with (IComputable[Y, Ret]) */, Y, Ret](x: X, y: Y): Ret = js.native
}

