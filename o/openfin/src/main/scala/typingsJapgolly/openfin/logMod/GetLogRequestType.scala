package typingsJapgolly.openfin.logMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogRequestType extends js.Object {
  var endFile: js.UndefOr[String] = js.undefined
  var name: String
  var sizeLimit: js.UndefOr[Double] = js.undefined
}

object GetLogRequestType {
  @scala.inline
  def apply(name: String, endFile: String = null, sizeLimit: Int | Double = null): GetLogRequestType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (endFile != null) __obj.updateDynamic("endFile")(endFile.asInstanceOf[js.Any])
    if (sizeLimit != null) __obj.updateDynamic("sizeLimit")(sizeLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogRequestType]
  }
}

