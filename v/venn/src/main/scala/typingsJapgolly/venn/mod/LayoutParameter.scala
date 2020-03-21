package typingsJapgolly.venn.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutParameter extends js.Object {
  var lossFunction: js.UndefOr[
    js.Function2[/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap], Double]
  ] = js.undefined
  var restarts: js.UndefOr[Double] = js.undefined
}

object LayoutParameter {
  @scala.inline
  def apply(
    lossFunction: (/* sets */ StringDictionary[Circle], /* overlaps */ js.Array[Overlap]) => CallbackTo[Double] = null,
    restarts: Int | Double = null
  ): LayoutParameter = {
    val __obj = js.Dynamic.literal()
    if (lossFunction != null) __obj.updateDynamic("lossFunction")(js.Any.fromFunction2((t0: /* sets */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.venn.mod.Circle], t1: /* overlaps */ js.Array[typingsJapgolly.venn.mod.Overlap]) => lossFunction(t0, t1).runNow()))
    if (restarts != null) __obj.updateDynamic("restarts")(restarts.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParameter]
  }
}

