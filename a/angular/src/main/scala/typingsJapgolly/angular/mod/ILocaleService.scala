package typingsJapgolly.angular.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// LocaleService
// see http://docs.angularjs.org/api/ng.$locale
///////////////////////////////////////////////////////////////////////////
trait ILocaleService extends js.Object {
  var DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor
  // These are not documented
  // Check angular's i18n files for exemples
  var NUMBER_FORMATS: ILocaleNumberFormatDescriptor
  var id: String
  def pluralCat(num: js.Any): String
}

object ILocaleService {
  @scala.inline
  def apply(
    DATETIME_FORMATS: ILocaleDateTimeFormatDescriptor,
    NUMBER_FORMATS: ILocaleNumberFormatDescriptor,
    id: String,
    pluralCat: js.Any => CallbackTo[String]
  ): ILocaleService = {
    val __obj = js.Dynamic.literal(DATETIME_FORMATS = DATETIME_FORMATS.asInstanceOf[js.Any], NUMBER_FORMATS = NUMBER_FORMATS.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("pluralCat")(js.Any.fromFunction1((t0: js.Any) => pluralCat(t0).runNow()))
    __obj.asInstanceOf[ILocaleService]
  }
}

