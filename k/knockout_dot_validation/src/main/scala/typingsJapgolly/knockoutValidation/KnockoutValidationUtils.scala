package typingsJapgolly.knockoutValidation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationUtils extends js.Object {
  def contextFor(node: Element): KnockoutValidationConfiguration
  def getConfigOptions(element: Element): KnockoutValidationConfiguration
  def getDomData(node: Element): KnockoutValidationConfiguration
  def getValue(o: js.Any): js.Any
  def hasAttribute(node: Element, attr: String): Boolean
  def insertAfter(node: Element, newNode: Element): Unit
  def isArray(o: js.Any): Boolean
  def isEmptyVal(`val`: js.Any): Boolean
  def isObject(o: js.Any): Boolean
  def isValidatable(o: js.Any): Boolean
  def newId(): Double
  def setDomData(node: Element, data: KnockoutValidationConfiguration): Unit
  def values(o: js.Any): js.Array[_]
}

object KnockoutValidationUtils {
  @scala.inline
  def apply(
    contextFor: Element => CallbackTo[KnockoutValidationConfiguration],
    getConfigOptions: Element => CallbackTo[KnockoutValidationConfiguration],
    getDomData: Element => CallbackTo[KnockoutValidationConfiguration],
    getValue: js.Any => CallbackTo[js.Any],
    hasAttribute: (Element, String) => CallbackTo[Boolean],
    insertAfter: (Element, Element) => Callback,
    isArray: js.Any => CallbackTo[Boolean],
    isEmptyVal: js.Any => CallbackTo[Boolean],
    isObject: js.Any => CallbackTo[Boolean],
    isValidatable: js.Any => CallbackTo[Boolean],
    newId: CallbackTo[Double],
    setDomData: (Element, KnockoutValidationConfiguration) => Callback,
    values: js.Any => CallbackTo[js.Array[js.Any]]
  ): KnockoutValidationUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contextFor")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => contextFor(t0).runNow()))
    __obj.updateDynamic("getConfigOptions")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => getConfigOptions(t0).runNow()))
    __obj.updateDynamic("getDomData")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => getDomData(t0).runNow()))
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: js.Any) => getValue(t0).runNow()))
    __obj.updateDynamic("hasAttribute")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: java.lang.String) => hasAttribute(t0, t1).runNow()))
    __obj.updateDynamic("insertAfter")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: org.scalajs.dom.raw.Element) => insertAfter(t0, t1).runNow()))
    __obj.updateDynamic("isArray")(js.Any.fromFunction1((t0: js.Any) => isArray(t0).runNow()))
    __obj.updateDynamic("isEmptyVal")(js.Any.fromFunction1((t0: js.Any) => isEmptyVal(t0).runNow()))
    __obj.updateDynamic("isObject")(js.Any.fromFunction1((t0: js.Any) => isObject(t0).runNow()))
    __obj.updateDynamic("isValidatable")(js.Any.fromFunction1((t0: js.Any) => isValidatable(t0).runNow()))
    __obj.updateDynamic("newId")(newId.toJsFn)
    __obj.updateDynamic("setDomData")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: typingsJapgolly.knockoutValidation.KnockoutValidationConfiguration) => setDomData(t0, t1).runNow()))
    __obj.updateDynamic("values")(js.Any.fromFunction1((t0: js.Any) => values(t0).runNow()))
    __obj.asInstanceOf[KnockoutValidationUtils]
  }
}

