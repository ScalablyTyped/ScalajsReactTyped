package typingsJapgolly.fluentBundle.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  def cloneForTermReference(args: js.Object): Scope
  def memoizeIntlObject[OptsType, ObjectType](
    ctor: Instantiable2[/* locales */ js.Array[String], /* opts */ OptsType, ObjectType],
    opts: OptsType
  ): ObjectType
  def reportError(error: String): Unit
}

object Scope {
  @scala.inline
  def apply(
    cloneForTermReference: js.Object => CallbackTo[Scope],
    memoizeIntlObject: (Instantiable2[/* locales */ js.Array[String], js.Any, js.Any], js.Any) => CallbackTo[js.Any],
    reportError: String => Callback
  ): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloneForTermReference")(js.Any.fromFunction1((t0: js.Object) => cloneForTermReference(t0).runNow()))
    __obj.updateDynamic("memoizeIntlObject")(js.Any.fromFunction2((t0: org.scalablytyped.runtime.Instantiable2[/* locales */ js.Array[java.lang.String], js.Any, js.Any], t1: js.Any) => memoizeIntlObject(t0, t1).runNow()))
    __obj.updateDynamic("reportError")(js.Any.fromFunction1((t0: java.lang.String) => reportError(t0).runNow()))
    __obj.asInstanceOf[Scope]
  }
}

