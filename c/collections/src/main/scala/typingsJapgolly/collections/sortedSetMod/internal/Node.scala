package typingsJapgolly.collections.sortedSetMod.internal

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[T] extends js.Object {
  def checkIntegrity(plus: js.Any*): Double
  def getNext(plus: js.Any*): js.UndefOr[Node[T]]
  def getPrevious(plus: js.Any*): js.UndefOr[Node[T]]
  def log(charmap: js.Any, logNode: js.Any, log: js.Any, logAbove: js.Any): js.Any
  def reduce(
    cb: js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      _
    ],
    basis: js.Any,
    index: Double,
    thisp: js.Any,
    tree: js.Any,
    depth: Double
  ): js.Any
  def summary(plus: js.Any*): String
  def touch(plus: js.Any*): Unit
}

object Node {
  @scala.inline
  def apply[T](
    checkIntegrity: /* repeated */ js.Any => CallbackTo[Double],
    getNext: /* repeated */ js.Any => CallbackTo[js.UndefOr[Node[T]]],
    getPrevious: /* repeated */ js.Any => CallbackTo[js.UndefOr[Node[T]]],
    log: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Any],
    reduce: (js.Function4[
      /* result */ js.UndefOr[js.Any], 
      /* val */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* collection */ js.UndefOr[js.Any], 
      js.Any
    ], js.Any, Double, js.Any, js.Any, Double) => CallbackTo[js.Any],
    summary: /* repeated */ js.Any => CallbackTo[String],
    touch: /* repeated */ js.Any => Callback
  ): Node[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkIntegrity")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => checkIntegrity(t0).runNow()))
    __obj.updateDynamic("getNext")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getNext(t0).runNow()))
    __obj.updateDynamic("getPrevious")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => getPrevious(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => log(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("reduce")(js.Any.fromFunction6((t0: js.Function4[
  /* result */ js.UndefOr[js.Any], 
  /* val */ js.UndefOr[js.Any], 
  /* key */ js.UndefOr[js.Any], 
  /* collection */ js.UndefOr[js.Any], 
  js.Any], t1: js.Any, t2: scala.Double, t3: js.Any, t4: js.Any, t5: scala.Double) => reduce(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.updateDynamic("summary")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => summary(t0).runNow()))
    __obj.updateDynamic("touch")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => touch(t0).runNow()))
    __obj.asInstanceOf[Node[T]]
  }
}

