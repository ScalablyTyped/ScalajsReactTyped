package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCRPage extends js.Object {
  var OCRZones: IOCRZones
  var PageNum: Double
  def Clone(): IOCRPage
}

object IOCRPage {
  @scala.inline
  def apply(Clone: CallbackTo[IOCRPage], OCRZones: IOCRZones, PageNum: Double): IOCRPage = {
    val __obj = js.Dynamic.literal(OCRZones = OCRZones.asInstanceOf[js.Any], PageNum = PageNum.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IOCRPage]
  }
}

