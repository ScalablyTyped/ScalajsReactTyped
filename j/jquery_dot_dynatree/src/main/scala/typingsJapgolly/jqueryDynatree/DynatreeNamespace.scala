package typingsJapgolly.jqueryDynatree

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynatreeNamespace extends js.Object {
  var version: Double
  def getNode(element: HTMLElement): DynaTreeNode
  def getPersistData(cookieId: String, cookieOpts: DynaTreeCookieOptions): js.Any
}

object DynatreeNamespace {
  @scala.inline
  def apply(
    getNode: HTMLElement => CallbackTo[DynaTreeNode],
    getPersistData: (String, DynaTreeCookieOptions) => CallbackTo[js.Any],
    version: Double
  ): DynatreeNamespace = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("getNode")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getNode(t0).runNow()))
    __obj.updateDynamic("getPersistData")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jqueryDynatree.DynaTreeCookieOptions) => getPersistData(t0, t1).runNow()))
    __obj.asInstanceOf[DynatreeNamespace]
  }
}

