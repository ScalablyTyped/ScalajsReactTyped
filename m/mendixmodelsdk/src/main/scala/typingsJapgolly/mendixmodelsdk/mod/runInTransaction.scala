package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.abstractModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "runInTransaction")
@js.native
object runInTransaction extends js.Object {
  def apply[T](model: IAbstractModel, action: js.Function0[T]): T = js.native
}

