package typingsJapgolly.linqsharp.mod.LinqSharp

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEqualityComparer[T] extends js.Object {
  def Equals(x: T, y: T): Boolean
  def GetHashCode(obj: T): Double
}

object IEqualityComparer {
  @scala.inline
  def apply[T](Equals: (T, T) => CallbackTo[Boolean], GetHashCode: T => CallbackTo[Double]): IEqualityComparer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Equals")(js.Any.fromFunction2((t0: T, t1: T) => Equals(t0, t1).runNow()))
    __obj.updateDynamic("GetHashCode")(js.Any.fromFunction1((t0: T) => GetHashCode(t0).runNow()))
    __obj.asInstanceOf[IEqualityComparer[T]]
  }
}

