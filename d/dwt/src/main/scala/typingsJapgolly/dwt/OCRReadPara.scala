package typingsJapgolly.dwt

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCRReadPara extends js.Object {
  var AjaxFunctionUrl: String
  var AryZone: js.Array[Double]
  var FileNames: String
  var FunctionName: String
  var ImageIndex: Double
  var JsonString: String
  var STWAIN: WebTwain
  var Type: String
  def OnFailure(): Unit
  def OnSuccess(): Unit
}

object OCRReadPara {
  @scala.inline
  def apply(
    AjaxFunctionUrl: String,
    AryZone: js.Array[Double],
    FileNames: String,
    FunctionName: String,
    ImageIndex: Double,
    JsonString: String,
    OnFailure: Callback,
    OnSuccess: Callback,
    STWAIN: WebTwain,
    Type: String
  ): OCRReadPara = {
    val __obj = js.Dynamic.literal(AjaxFunctionUrl = AjaxFunctionUrl.asInstanceOf[js.Any], AryZone = AryZone.asInstanceOf[js.Any], FileNames = FileNames.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], ImageIndex = ImageIndex.asInstanceOf[js.Any], JsonString = JsonString.asInstanceOf[js.Any], STWAIN = STWAIN.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("OnFailure")(OnFailure.toJsFn)
    __obj.updateDynamic("OnSuccess")(OnSuccess.toJsFn)
    __obj.asInstanceOf[OCRReadPara]
  }
}

