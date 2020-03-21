package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProperties extends js.Object {
  def getEncodedQuery(): String
  def getListControl(): js.Any
  def getParameterValue(value: String): String
  def getParameters(): js.Array[String]
  def getReferringURL(): String
  def getViewName(): String
  def getWindowProperties(): js.Any
  def isInDevStudio(): Boolean
  def isInteractive(): Boolean
  def isManyToMany(): Boolean
  def isRelatedList(): Boolean
}

object RenderProperties {
  @scala.inline
  def apply(
    getEncodedQuery: CallbackTo[String],
    getListControl: CallbackTo[js.Any],
    getParameterValue: String => CallbackTo[String],
    getParameters: CallbackTo[js.Array[String]],
    getReferringURL: CallbackTo[String],
    getViewName: CallbackTo[String],
    getWindowProperties: CallbackTo[js.Any],
    isInDevStudio: CallbackTo[Boolean],
    isInteractive: CallbackTo[Boolean],
    isManyToMany: CallbackTo[Boolean],
    isRelatedList: CallbackTo[Boolean]
  ): RenderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEncodedQuery")(getEncodedQuery.toJsFn)
    __obj.updateDynamic("getListControl")(getListControl.toJsFn)
    __obj.updateDynamic("getParameterValue")(js.Any.fromFunction1((t0: java.lang.String) => getParameterValue(t0).runNow()))
    __obj.updateDynamic("getParameters")(getParameters.toJsFn)
    __obj.updateDynamic("getReferringURL")(getReferringURL.toJsFn)
    __obj.updateDynamic("getViewName")(getViewName.toJsFn)
    __obj.updateDynamic("getWindowProperties")(getWindowProperties.toJsFn)
    __obj.updateDynamic("isInDevStudio")(isInDevStudio.toJsFn)
    __obj.updateDynamic("isInteractive")(isInteractive.toJsFn)
    __obj.updateDynamic("isManyToMany")(isManyToMany.toJsFn)
    __obj.updateDynamic("isRelatedList")(isRelatedList.toJsFn)
    __obj.asInstanceOf[RenderProperties]
  }
}

