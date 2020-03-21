package typingsJapgolly.reactSelect.stylesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-select.react-select/src/styles.Styles> */
trait StylesConfig extends js.Object {
  var clearIndicator: js.UndefOr[styleFn] = js.undefined
  var container: js.UndefOr[styleFn] = js.undefined
  var control: js.UndefOr[styleFn] = js.undefined
  var dropdownIndicator: js.UndefOr[styleFn] = js.undefined
  var group: js.UndefOr[styleFn] = js.undefined
  var groupHeading: js.UndefOr[styleFn] = js.undefined
  var indicatorSeparator: js.UndefOr[styleFn] = js.undefined
  var indicatorsContainer: js.UndefOr[styleFn] = js.undefined
  var input: js.UndefOr[styleFn] = js.undefined
  var loadingIndicator: js.UndefOr[styleFn] = js.undefined
  var loadingMessage: js.UndefOr[styleFn] = js.undefined
  var menu: js.UndefOr[styleFn] = js.undefined
  var menuList: js.UndefOr[styleFn] = js.undefined
  var menuPortal: js.UndefOr[styleFn] = js.undefined
  var multiValue: js.UndefOr[styleFn] = js.undefined
  var multiValueLabel: js.UndefOr[styleFn] = js.undefined
  var multiValueRemove: js.UndefOr[styleFn] = js.undefined
  var noOptionsMessage: js.UndefOr[styleFn] = js.undefined
  var option: js.UndefOr[styleFn] = js.undefined
  var placeholder: js.UndefOr[styleFn] = js.undefined
  var singleValue: js.UndefOr[styleFn] = js.undefined
  var valueContainer: js.UndefOr[styleFn] = js.undefined
}

object StylesConfig {
  @scala.inline
  def apply(
    clearIndicator: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    container: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    control: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    dropdownIndicator: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    group: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    groupHeading: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    indicatorSeparator: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    indicatorsContainer: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    input: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    loadingIndicator: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    loadingMessage: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    menu: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    menuList: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    menuPortal: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    multiValue: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    multiValueLabel: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    multiValueRemove: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    noOptionsMessage: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    option: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    placeholder: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    singleValue: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null,
    valueContainer: (/* base */ CSSProperties, /* state */ js.Any) => CallbackTo[CSSProperties] = null
  ): StylesConfig = {
    val __obj = js.Dynamic.literal()
    if (clearIndicator != null) __obj.updateDynamic("clearIndicator")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => clearIndicator(t0, t1).runNow()))
    if (container != null) __obj.updateDynamic("container")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => container(t0, t1).runNow()))
    if (control != null) __obj.updateDynamic("control")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => control(t0, t1).runNow()))
    if (dropdownIndicator != null) __obj.updateDynamic("dropdownIndicator")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => dropdownIndicator(t0, t1).runNow()))
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => group(t0, t1).runNow()))
    if (groupHeading != null) __obj.updateDynamic("groupHeading")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => groupHeading(t0, t1).runNow()))
    if (indicatorSeparator != null) __obj.updateDynamic("indicatorSeparator")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => indicatorSeparator(t0, t1).runNow()))
    if (indicatorsContainer != null) __obj.updateDynamic("indicatorsContainer")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => indicatorsContainer(t0, t1).runNow()))
    if (input != null) __obj.updateDynamic("input")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => input(t0, t1).runNow()))
    if (loadingIndicator != null) __obj.updateDynamic("loadingIndicator")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => loadingIndicator(t0, t1).runNow()))
    if (loadingMessage != null) __obj.updateDynamic("loadingMessage")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => loadingMessage(t0, t1).runNow()))
    if (menu != null) __obj.updateDynamic("menu")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => menu(t0, t1).runNow()))
    if (menuList != null) __obj.updateDynamic("menuList")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => menuList(t0, t1).runNow()))
    if (menuPortal != null) __obj.updateDynamic("menuPortal")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => menuPortal(t0, t1).runNow()))
    if (multiValue != null) __obj.updateDynamic("multiValue")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => multiValue(t0, t1).runNow()))
    if (multiValueLabel != null) __obj.updateDynamic("multiValueLabel")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => multiValueLabel(t0, t1).runNow()))
    if (multiValueRemove != null) __obj.updateDynamic("multiValueRemove")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => multiValueRemove(t0, t1).runNow()))
    if (noOptionsMessage != null) __obj.updateDynamic("noOptionsMessage")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => noOptionsMessage(t0, t1).runNow()))
    if (option != null) __obj.updateDynamic("option")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => option(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => placeholder(t0, t1).runNow()))
    if (singleValue != null) __obj.updateDynamic("singleValue")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => singleValue(t0, t1).runNow()))
    if (valueContainer != null) __obj.updateDynamic("valueContainer")(js.Any.fromFunction2((t0: /* base */ typingsJapgolly.react.mod.CSSProperties, t1: /* state */ js.Any) => valueContainer(t0, t1).runNow()))
    __obj.asInstanceOf[StylesConfig]
  }
}

