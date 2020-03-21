package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  var prefix: String
  var rootWindow: Window_
  var savedKeys: js.Array[String]
  def clearSavedKeys(): Unit
  def loadSavedKeys(): Unit
  def loadValue(key: String, defaultValue: js.Object): js.Any
  def resetAll(): Unit
  def saveSavedKeys(): Unit
  def saveValue(key: String, value: js.Any): Unit
}

object Storage {
  @scala.inline
  def apply(
    clearSavedKeys: Callback,
    loadSavedKeys: Callback,
    loadValue: (String, js.Object) => CallbackTo[js.Any],
    prefix: String,
    resetAll: Callback,
    rootWindow: Window_,
    saveSavedKeys: Callback,
    saveValue: (String, js.Any) => Callback,
    savedKeys: js.Array[String]
  ): Storage = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], rootWindow = rootWindow.asInstanceOf[js.Any], savedKeys = savedKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("clearSavedKeys")(clearSavedKeys.toJsFn)
    __obj.updateDynamic("loadSavedKeys")(loadSavedKeys.toJsFn)
    __obj.updateDynamic("loadValue")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => loadValue(t0, t1).runNow()))
    __obj.updateDynamic("resetAll")(resetAll.toJsFn)
    __obj.updateDynamic("saveSavedKeys")(saveSavedKeys.toJsFn)
    __obj.updateDynamic("saveValue")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => saveValue(t0, t1).runNow()))
    __obj.asInstanceOf[Storage]
  }
}

