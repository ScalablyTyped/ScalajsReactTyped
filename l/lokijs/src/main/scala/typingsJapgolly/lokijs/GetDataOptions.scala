package typingsJapgolly.lokijs

import typingsJapgolly.lokijs.lokijsStrings.`jquery-extend-deep`
import typingsJapgolly.lokijs.lokijsStrings.`parse-stringify`
import typingsJapgolly.lokijs.lokijsStrings.`shallow-assign`
import typingsJapgolly.lokijs.lokijsStrings.`shallow-recurse-objects`
import typingsJapgolly.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataOptions extends js.Object {
  var forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null
  var forceClones: Boolean
  var removeMeta: Boolean
}

object GetDataOptions {
  @scala.inline
  def apply(
    forceClones: Boolean,
    removeMeta: Boolean,
    forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` = null
  ): GetDataOptions = {
    val __obj = js.Dynamic.literal(forceClones = forceClones.asInstanceOf[js.Any], removeMeta = removeMeta.asInstanceOf[js.Any])
    if (forceCloneMethod != null) __obj.updateDynamic("forceCloneMethod")(forceCloneMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataOptions]
  }
}

