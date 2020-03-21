package typingsJapgolly.xadesjs.signedXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsPolicyUserNotice extends js.Object {
  var explicitText: js.UndefOr[String] = js.undefined
  var noticeRef: js.UndefOr[OptionsNoticeReference] = js.undefined
}

object OptionsPolicyUserNotice {
  @scala.inline
  def apply(explicitText: String = null, noticeRef: OptionsNoticeReference = null): OptionsPolicyUserNotice = {
    val __obj = js.Dynamic.literal()
    if (explicitText != null) __obj.updateDynamic("explicitText")(explicitText.asInstanceOf[js.Any])
    if (noticeRef != null) __obj.updateDynamic("noticeRef")(noticeRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsPolicyUserNotice]
  }
}

