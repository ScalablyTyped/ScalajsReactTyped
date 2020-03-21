package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFResourceManager extends js.Object {
  def GetLocaleSpecificDateFormat(): String
  def GetUICultures(): IStrings
  def LoadResourceString(LanguageID: Double, ResourceID: Double): String
}

object IMFResourceManager {
  @scala.inline
  def apply(
    GetLocaleSpecificDateFormat: CallbackTo[String],
    GetUICultures: CallbackTo[IStrings],
    LoadResourceString: (Double, Double) => CallbackTo[String]
  ): IMFResourceManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetLocaleSpecificDateFormat")(GetLocaleSpecificDateFormat.toJsFn)
    __obj.updateDynamic("GetUICultures")(GetUICultures.toJsFn)
    __obj.updateDynamic("LoadResourceString")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => LoadResourceString(t0, t1).runNow()))
    __obj.asInstanceOf[IMFResourceManager]
  }
}

