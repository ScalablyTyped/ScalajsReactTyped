package typingsJapgolly.atAngularCompiler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsEquivalent[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */] extends js.Object {
  def isEquivalent(other: T): Boolean
}

object Anon_IsEquivalent {
  @scala.inline
  def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: {isEquivalent (other : T): boolean} */ js.Any */](isEquivalent: T => CallbackTo[Boolean]): Anon_IsEquivalent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isEquivalent")(js.Any.fromFunction1((t0: T) => isEquivalent(t0).runNow()))
    __obj.asInstanceOf[Anon_IsEquivalent[T]]
  }
}

