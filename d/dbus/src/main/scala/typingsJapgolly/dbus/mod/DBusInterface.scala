package typingsJapgolly.dbus.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBusInterface
  extends /**
  * ...args
  * options: {timeout: number}
  * callback: (err: DBusError|undefined, res: any)=>void
  */
/* methodName */ StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] {
  def getProperties(callback: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[_]], Unit]): Unit
  def getProperty(name: String, callback: js.Function2[/* err */ DBusError, /* name */ String, Unit]): Unit
  def setProperty(name: String, value: js.Any, callback: js.Function1[/* err */ DBusError, Unit]): Unit
}

object DBusInterface {
  @scala.inline
  def apply(
    getProperties: js.Function2[/* err */ DBusError, /* properties */ js.Array[StringDictionary[js.Any]], Unit] => Callback,
    getProperty: (String, js.Function2[/* err */ DBusError, /* name */ String, Unit]) => Callback,
    setProperty: (String, js.Any, js.Function1[/* err */ DBusError, Unit]) => Callback,
    StringDictionary: /**
    * ...args
    * options: {timeout: number}
    * callback: (err: DBusError|undefined, res: any)=>void
    */
  /* methodName */ StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null
  ): DBusInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getProperties")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ typingsJapgolly.dbus.mod.DBusError, 
  /* properties */ js.Array[org.scalablytyped.runtime.StringDictionary[js.Any]], 
  scala.Unit]) => getProperties(t0).runNow()))
    __obj.updateDynamic("getProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ typingsJapgolly.dbus.mod.DBusError, 
  /* name */ java.lang.String, 
  scala.Unit]) => getProperty(t0, t1).runNow()))
    __obj.updateDynamic("setProperty")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function1[/* err */ typingsJapgolly.dbus.mod.DBusError, scala.Unit]) => setProperty(t0, t1, t2).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DBusInterface]
  }
}

