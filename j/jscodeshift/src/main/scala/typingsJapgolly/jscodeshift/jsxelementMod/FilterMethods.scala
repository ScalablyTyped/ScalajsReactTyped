package typingsJapgolly.jscodeshift.jsxelementMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMethods extends js.Object {
  /**
    * Filter method for attributes.
    */
  def hasAttributes(attributeFilter: StringDictionary[js.Any]): Filter
  /**
    * Filter elements which contain a specific child type
    */
  def hasChildren(name: String): Filter
}

object FilterMethods {
  @scala.inline
  def apply(
    hasAttributes: StringDictionary[js.Any] => CallbackTo[Filter],
    hasChildren: String => CallbackTo[Filter]
  ): FilterMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasAttributes")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => hasAttributes(t0).runNow()))
    __obj.updateDynamic("hasChildren")(js.Any.fromFunction1((t0: java.lang.String) => hasChildren(t0).runNow()))
    __obj.asInstanceOf[FilterMethods]
  }
}

