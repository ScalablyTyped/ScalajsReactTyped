package typingsJapgolly.wordpressRichText

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedSelectors extends js.Object {
  def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration]
  def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any
  ): js.UndefOr[NamedFormatConfiguration]
  def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration]
  def getFormatTypes(): js.Array[NamedFormatConfiguration]
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(
    getFormatType: String => CallbackTo[js.UndefOr[NamedFormatConfiguration]],
    getFormatTypeForBareElement: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any => CallbackTo[js.UndefOr[NamedFormatConfiguration]],
    getFormatTypeForClassName: String => CallbackTo[js.UndefOr[NamedFormatConfiguration]],
    getFormatTypes: CallbackTo[js.Array[NamedFormatConfiguration]]
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFormatType")(js.Any.fromFunction1((t0: java.lang.String) => getFormatType(t0).runNow()))
    __obj.updateDynamic("getFormatTypeForBareElement")(js.Any.fromFunction1((t0: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) => getFormatTypeForBareElement(t0).runNow()))
    __obj.updateDynamic("getFormatTypeForClassName")(js.Any.fromFunction1((t0: java.lang.String) => getFormatTypeForClassName(t0).runNow()))
    __obj.updateDynamic("getFormatTypes")(getFormatTypes.toJsFn)
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
}

