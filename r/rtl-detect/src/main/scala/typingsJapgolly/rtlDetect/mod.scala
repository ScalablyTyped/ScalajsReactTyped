package typingsJapgolly.rtlDetect

import typingsJapgolly.rtlDetect.rtlDetectStrings.ltr
import typingsJapgolly.rtlDetect.rtlDetectStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rtl-detect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getLangDir(strLocale: String): ltr | rtl = js.native
  def isRtlLang(strLocale: String): js.UndefOr[Boolean] = js.native
}

