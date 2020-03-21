package typingsJapgolly.oracleOraclejet.ojcompositeMod

import typingsJapgolly.oracleOraclejet.AnonPath
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.external
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedContext extends js.Object {
  var previousValue: js.Any
  var property: String
  var subproperty: js.UndefOr[AnonPath] = js.undefined
  var updatedFrom: external | internal
  var value: js.Any
}

object PropertyChangedContext {
  @scala.inline
  def apply(
    previousValue: js.Any,
    property: String,
    updatedFrom: external | internal,
    value: js.Any,
    subproperty: AnonPath = null
  ): PropertyChangedContext = {
    val __obj = js.Dynamic.literal(previousValue = previousValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (subproperty != null) __obj.updateDynamic("subproperty")(subproperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedContext]
  }
}

