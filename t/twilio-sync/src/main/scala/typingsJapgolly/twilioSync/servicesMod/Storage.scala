package typingsJapgolly.twilioSync.servicesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  def read(`type`: String, id: String): js.Object
  def remove(`type`: String, sid: String, uniqueName: String): js.Any
  def store(`type`: String, id: String, value: js.Object): js.Any
  def update(`type`: String, id: String, uniqueName: String, patch: js.Object): js.Any
  def updateStorageId(storageId: String): js.Any
}

object Storage {
  @scala.inline
  def apply(
    read: (String, String) => CallbackTo[js.Object],
    remove: (String, String, String) => CallbackTo[js.Any],
    store: (String, String, js.Object) => CallbackTo[js.Any],
    update: (String, String, String, js.Object) => CallbackTo[js.Any],
    updateStorageId: String => CallbackTo[js.Any]
  ): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => read(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => remove(t0, t1, t2).runNow()))
    __obj.updateDynamic("store")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Object) => store(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: js.Object) => update(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("updateStorageId")(js.Any.fromFunction1((t0: java.lang.String) => updateStorageId(t0).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

