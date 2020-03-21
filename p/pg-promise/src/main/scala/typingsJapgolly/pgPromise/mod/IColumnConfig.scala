package typingsJapgolly.pgPromise.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnConfig extends js.Object {
  var cast: js.UndefOr[String] = js.undefined
  var cnd: js.UndefOr[Boolean] = js.undefined
  var `def`: js.UndefOr[js.Any] = js.undefined
  var init: js.UndefOr[js.Function1[/* col */ IColumnDescriptor, _]] = js.undefined
  var mod: js.UndefOr[FormattingFilter] = js.undefined
  var name: String
  var prop: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[js.Function1[/* col */ IColumnDescriptor, Boolean]] = js.undefined
}

object IColumnConfig {
  @scala.inline
  def apply(
    name: String,
    cast: String = null,
    cnd: js.UndefOr[Boolean] = js.undefined,
    `def`: js.Any = null,
    init: /* col */ IColumnDescriptor => CallbackTo[js.Any] = null,
    mod: FormattingFilter = null,
    prop: String = null,
    skip: /* col */ IColumnDescriptor => CallbackTo[Boolean] = null
  ): IColumnConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (cast != null) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (!js.isUndefined(cnd)) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (`def` != null) __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* col */ typingsJapgolly.pgPromise.mod.IColumnDescriptor) => init(t0).runNow()))
    if (mod != null) __obj.updateDynamic("mod")(mod.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: /* col */ typingsJapgolly.pgPromise.mod.IColumnDescriptor) => skip(t0).runNow()))
    __obj.asInstanceOf[IColumnConfig]
  }
}

