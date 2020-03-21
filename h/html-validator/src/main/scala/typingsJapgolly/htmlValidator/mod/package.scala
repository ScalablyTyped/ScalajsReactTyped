package typingsJapgolly.htmlValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ValidationMessageLocationObject = typingsJapgolly.htmlValidator.mod.ValidationMessageSimpleObject with typingsJapgolly.htmlValidator.mod.ValidationMessageBasicLocationObject
  type ValidationMessageObject = typingsJapgolly.htmlValidator.mod.ValidationMessageSimpleObject | typingsJapgolly.htmlValidator.mod.ValidationMessageLocationObject
  type ValidationMessageSimpleObject = (typingsJapgolly.htmlValidator.mod.ValidationMessageBasicErrorObject | typingsJapgolly.htmlValidator.mod.ValidationMessageBasicInfoObject | typingsJapgolly.htmlValidator.mod.ValidationMessageBasicNonDocumentErrorObject) with typingsJapgolly.htmlValidator.mod.ValidationMessageBasicObject
}
