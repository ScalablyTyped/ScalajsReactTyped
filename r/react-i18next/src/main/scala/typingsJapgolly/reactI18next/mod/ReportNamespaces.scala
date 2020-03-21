package typingsJapgolly.reactI18next.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportNamespaces extends js.Object {
  def addUsedNamespaces(namespaces: js.Array[Namespace]): Unit
  def getUsedNamespaces(): js.Array[String]
}

object ReportNamespaces {
  @scala.inline
  def apply(
    addUsedNamespaces: js.Array[Namespace] => Callback,
    getUsedNamespaces: CallbackTo[js.Array[String]]
  ): ReportNamespaces = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addUsedNamespaces")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.reactI18next.mod.Namespace]) => addUsedNamespaces(t0).runNow()))
    __obj.updateDynamic("getUsedNamespaces")(getUsedNamespaces.toJsFn)
    __obj.asInstanceOf[ReportNamespaces]
  }
}

