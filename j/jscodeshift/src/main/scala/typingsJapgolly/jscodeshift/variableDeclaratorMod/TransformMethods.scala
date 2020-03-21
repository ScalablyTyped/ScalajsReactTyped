package typingsJapgolly.jscodeshift.variableDeclaratorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformMethods[N] extends js.Object {
  /**
    * Renames a variable and all its occurrences.
    * This method only applies to VariableDeclarator typed collections.
    */
  def renameTo(newName: String): Collection[N]
}

object TransformMethods {
  @scala.inline
  def apply[N](renameTo: String => CallbackTo[Collection[N]]): TransformMethods[N] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renameTo")(js.Any.fromFunction1((t0: java.lang.String) => renameTo(t0).runNow()))
    __obj.asInstanceOf[TransformMethods[N]]
  }
}

