package typingsJapgolly.rcDashMentions

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rcDashMentions.libMentionsMod.MentionsProps
import typingsJapgolly.rcDashMentions.libOptionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterOptionHasValue extends js.Object {
  var filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean]
  var notFoundContent: String
  var prefix: String
  var prefixCls: String
  var rows: Double
  var split: String
  var validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean]
}

object Anon_FilterOptionHasValue {
  @scala.inline
  def apply(
    filterOption: (/* input */ String, /* hasValue */ OptionProps) => CallbackTo[Boolean],
    notFoundContent: String,
    prefix: String,
    prefixCls: String,
    rows: Double,
    split: String,
    validateSearch: (/* text */ String, /* props */ MentionsProps) => CallbackTo[Boolean]
  ): Anon_FilterOptionHasValue = {
    val __obj = js.Dynamic.literal(notFoundContent = notFoundContent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
    __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* input */ java.lang.String, t1: /* hasValue */ typingsJapgolly.rcDashMentions.libOptionMod.OptionProps) => filterOption(t0, t1).runNow()))
    __obj.updateDynamic("validateSearch")(js.Any.fromFunction2((t0: /* text */ java.lang.String, t1: /* props */ typingsJapgolly.rcDashMentions.libMentionsMod.MentionsProps) => validateSearch(t0, t1).runNow()))
    __obj.asInstanceOf[Anon_FilterOptionHasValue]
  }
}

