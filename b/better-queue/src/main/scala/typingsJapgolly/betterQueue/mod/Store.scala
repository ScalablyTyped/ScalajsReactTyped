package typingsJapgolly.betterQueue.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store[T] extends js.Object {
  def connect(cb: js.Function2[/* error */ js.Any, /* length */ Double, Unit]): Unit
  def deleteTask(taskId: js.Any, cb: js.Function0[Unit]): Unit
  def getLock(lockId: String, cb: js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]): Unit
  def getTask(taskId: js.Any, cb: js.Function2[/* error */ js.Any, /* task */ T, Unit]): Unit
  def putTask(taskId: js.Any, task: T, priority: Double, cb: js.Function1[/* error */ js.Any, Unit]): Unit
  def releaseLock(lockId: String, cb: js.Function1[/* error */ js.Any, Unit]): Unit
  def takeFirstN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit
  def takeLastN(n: Double, cb: js.Function2[/* error */ js.Any, /* lockId */ String, Unit]): Unit
}

object Store {
  @scala.inline
  def apply[T](
    connect: js.Function2[/* error */ js.Any, /* length */ Double, Unit] => Callback,
    deleteTask: (js.Any, js.Function0[Unit]) => Callback,
    getLock: (String, js.Function2[/* error */ js.Any, /* tasks */ StringDictionary[T], Unit]) => Callback,
    getTask: (js.Any, js.Function2[/* error */ js.Any, /* task */ T, Unit]) => Callback,
    putTask: (js.Any, T, Double, js.Function1[/* error */ js.Any, Unit]) => Callback,
    releaseLock: (String, js.Function1[/* error */ js.Any, Unit]) => Callback,
    takeFirstN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Callback,
    takeLastN: (Double, js.Function2[/* error */ js.Any, /* lockId */ String, Unit]) => Callback
  ): Store[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(js.Any.fromFunction1((t0: js.Function2[/* error */ js.Any, /* length */ scala.Double, scala.Unit]) => connect(t0).runNow()))
    __obj.updateDynamic("deleteTask")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => deleteTask(t0, t1).runNow()))
    __obj.updateDynamic("getLock")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* error */ js.Any, 
  /* tasks */ org.scalablytyped.runtime.StringDictionary[T], 
  scala.Unit]) => getLock(t0, t1).runNow()))
    __obj.updateDynamic("getTask")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[/* error */ js.Any, /* task */ T, scala.Unit]) => getTask(t0, t1).runNow()))
    __obj.updateDynamic("putTask")(js.Any.fromFunction4((t0: js.Any, t1: T, t2: scala.Double, t3: js.Function1[/* error */ js.Any, scala.Unit]) => putTask(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("releaseLock")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* error */ js.Any, scala.Unit]) => releaseLock(t0, t1).runNow()))
    __obj.updateDynamic("takeFirstN")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]) => takeFirstN(t0, t1).runNow()))
    __obj.updateDynamic("takeLastN")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function2[/* error */ js.Any, /* lockId */ java.lang.String, scala.Unit]) => takeLastN(t0, t1).runNow()))
    __obj.asInstanceOf[Store[T]]
  }
}

