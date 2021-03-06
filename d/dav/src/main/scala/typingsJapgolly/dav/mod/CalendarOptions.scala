package typingsJapgolly.dav.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Calendar> */
trait CalendarOptions extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var components: js.UndefOr[js.Array[String]] = js.undefined
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.undefined
  var ctag: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var objects: js.UndefOr[js.Array[CalendarObject]] = js.undefined
  var reports: js.UndefOr[js.Array[String]] = js.undefined
  var resourcetype: js.UndefOr[String] = js.undefined
  var syncToken: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object CalendarOptions {
  @scala.inline
  def apply(
    account: Account = null,
    components: js.Array[String] = null,
    constructor: /* options */ js.UndefOr[CalendarOptions] => CallbackTo[js.Any] = null,
    ctag: String = null,
    data: String = null,
    description: String = null,
    displayName: String = null,
    objects: js.Array[CalendarObject] = null,
    reports: js.Array[String] = null,
    resourcetype: String = null,
    syncToken: String = null,
    timezone: String = null,
    url: String = null
  ): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.dav.mod.CalendarOptions]) => constructor(t0).runNow()))
    if (ctag != null) __obj.updateDynamic("ctag")(ctag.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (objects != null) __obj.updateDynamic("objects")(objects.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    if (resourcetype != null) __obj.updateDynamic("resourcetype")(resourcetype.asInstanceOf[js.Any])
    if (syncToken != null) __obj.updateDynamic("syncToken")(syncToken.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
}

