package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreviewerActiveXCtrl extends js.Object {
  def ClearPreview(): Double
  def ShowFilePreview(bstrFilename: String): Double
  def ShowHitHighlightedFilePreview(
    bstrFilename: String,
    lObjType: Double,
    lObjID: Double,
    lObjVersion: Double,
    lFile: Double,
    lFileVersion: Double,
    pIHitHighlightingInfo: js.Any,
    bstrSearchConditions: String
  ): Double
}

object IPreviewerActiveXCtrl {
  @scala.inline
  def apply(
    ClearPreview: CallbackTo[Double],
    ShowFilePreview: String => CallbackTo[Double],
    ShowHitHighlightedFilePreview: (String, Double, Double, Double, Double, Double, js.Any, String) => CallbackTo[Double]
  ): IPreviewerActiveXCtrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ClearPreview")(ClearPreview.toJsFn)
    __obj.updateDynamic("ShowFilePreview")(js.Any.fromFunction1((t0: java.lang.String) => ShowFilePreview(t0).runNow()))
    __obj.updateDynamic("ShowHitHighlightedFilePreview")(js.Any.fromFunction8((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: js.Any, t7: java.lang.String) => ShowHitHighlightedFilePreview(t0, t1, t2, t3, t4, t5, t6, t7).runNow()))
    __obj.asInstanceOf[IPreviewerActiveXCtrl]
  }
}

