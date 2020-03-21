package typingsJapgolly.reactIntl.typesMod

import typingsJapgolly.formatjsIntlListformat.mod.default
import typingsJapgolly.std.Intl.DateTimeFormat
import typingsJapgolly.std.Intl.NumberFormat
import typingsJapgolly.std.Intl.PluralRules
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlCache extends js.Object {
  var dateTime: Record[String, DateTimeFormat]
  var displayNames: Record[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
  ]
  var list: Record[String, default]
  var message: Record[String, typingsJapgolly.intlMessageformat.mod.default]
  var number: Record[String, NumberFormat]
  var pluralRules: Record[String, PluralRules]
  var relativeTime: Record[String, typingsJapgolly.formatjsIntlRelativetimeformat.mod.default]
}

object IntlCache {
  @scala.inline
  def apply(
    dateTime: Record[String, DateTimeFormat],
    displayNames: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
    ],
    list: Record[String, default],
    message: Record[String, typingsJapgolly.intlMessageformat.mod.default],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules],
    relativeTime: Record[String, typingsJapgolly.formatjsIntlRelativetimeformat.mod.default]
  ): IntlCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], displayNames = displayNames.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntlCache]
  }
}

