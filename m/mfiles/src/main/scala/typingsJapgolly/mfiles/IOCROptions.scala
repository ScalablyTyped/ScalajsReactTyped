package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFOCRLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOCROptions extends js.Object {
  var PrimaryLanguage: MFOCRLanguage
  var SecondaryLanguage: MFOCRLanguage
  def Clone(): IOCROptions
}

object IOCROptions {
  @scala.inline
  def apply(Clone: CallbackTo[IOCROptions], PrimaryLanguage: MFOCRLanguage, SecondaryLanguage: MFOCRLanguage): IOCROptions = {
    val __obj = js.Dynamic.literal(PrimaryLanguage = PrimaryLanguage.asInstanceOf[js.Any], SecondaryLanguage = SecondaryLanguage.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IOCROptions]
  }
}

