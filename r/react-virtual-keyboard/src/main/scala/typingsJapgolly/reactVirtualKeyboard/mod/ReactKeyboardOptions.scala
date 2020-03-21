package typingsJapgolly.reactVirtualKeyboard.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.Event_
import typingsJapgolly.virtualKeyboard.mod.CustomLayout
import typingsJapgolly.virtualKeyboard.mod.KeyboardOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactKeyboardOptions extends KeyboardOptions {
  @JSName("accepted")
  var accepted_ReactKeyboardOptions: js.UndefOr[scala.Nothing] = js.undefined
}

object ReactKeyboardOptions {
  @scala.inline
  def apply(
    `type`: String,
    acceptValid: js.UndefOr[Boolean] = js.undefined,
    accepted: js.UndefOr[scala.Nothing] = js.undefined,
    alwaysOpen: js.UndefOr[Boolean] = js.undefined,
    appendLocally: js.UndefOr[Boolean] = js.undefined,
    appendTo: String | js.Object = null,
    autoAccept: js.UndefOr[Boolean] = js.undefined,
    autoAcceptOnEsc: js.UndefOr[Boolean] = js.undefined,
    autoAcceptOnValid: js.UndefOr[Boolean] = js.undefined,
    beforeClose: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    beforeInsert: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    beforeVisible: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    buildKey: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    cancelClose: js.UndefOr[Boolean] = js.undefined,
    canceled: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    caretToEnd: js.UndefOr[Boolean] = js.undefined,
    change: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    `class`: String = null,
    closeByClickEvent: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    comboRegex: js.RegExp = null,
    combos: js.Object = null,
    css: js.Object = null,
    customLayout: CustomLayout = null,
    display: js.Object = null,
    enterMod: String = null,
    enterNavigation: js.UndefOr[Boolean] = js.undefined,
    hidden: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    ignoreEsc: js.UndefOr[Boolean] = js.undefined,
    initialFocus: js.UndefOr[Boolean] = js.undefined,
    initialized: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    keyBinding: String = null,
    language: String | js.Array[String] = null,
    layout: String = null,
    lockInput: js.UndefOr[Boolean] = js.undefined,
    maxInsert: js.UndefOr[Boolean] = js.undefined,
    maxLength: Boolean | Double = null,
    noFocus: js.UndefOr[Boolean] = js.undefined,
    openOn: String = null,
    position: Boolean | js.Object = null,
    preventPaste: String = null,
    repeatDelay: Int | Double = null,
    repeatRate: Int | Double = null,
    reposition: js.UndefOr[Boolean] = js.undefined,
    resetDefault: js.UndefOr[Boolean] = js.undefined,
    restrictInclude: String = null,
    restrictInput: js.UndefOr[Boolean] = js.undefined,
    restricted: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    scrollAdjustment: Double | String = null,
    stayOpen: js.UndefOr[Boolean] = js.undefined,
    stickyShift: js.UndefOr[Boolean] = js.undefined,
    stopAtEnd: js.UndefOr[Boolean] = js.undefined,
    switchInput: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    tabNavigation: js.UndefOr[Boolean] = js.undefined,
    updateOnChange: js.UndefOr[Boolean] = js.undefined,
    useCombos: js.UndefOr[Boolean] = js.undefined,
    usePreview: js.UndefOr[Boolean] = js.undefined,
    useWheel: js.UndefOr[Boolean] = js.undefined,
    userClosed: js.UndefOr[Boolean] = js.undefined,
    validate: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    visible: (/* event */ js.UndefOr[Event_ | String], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Callback = null,
    wheelMessage: String = null
  ): ReactKeyboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptValid)) __obj.updateDynamic("acceptValid")(acceptValid.asInstanceOf[js.Any])
    if (!js.isUndefined(accepted)) __obj.updateDynamic("accepted")(accepted.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysOpen)) __obj.updateDynamic("alwaysOpen")(alwaysOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(appendLocally)) __obj.updateDynamic("appendLocally")(appendLocally.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAccept)) __obj.updateDynamic("autoAccept")(autoAccept.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAcceptOnEsc)) __obj.updateDynamic("autoAcceptOnEsc")(autoAcceptOnEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAcceptOnValid)) __obj.updateDynamic("autoAcceptOnValid")(autoAcceptOnValid.asInstanceOf[js.Any])
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => beforeClose(t0, t1, t2).runNow()))
    if (beforeInsert != null) __obj.updateDynamic("beforeInsert")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => beforeInsert(t0, t1, t2).runNow()))
    if (beforeVisible != null) __obj.updateDynamic("beforeVisible")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => beforeVisible(t0, t1, t2).runNow()))
    if (buildKey != null) __obj.updateDynamic("buildKey")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => buildKey(t0, t1, t2).runNow()))
    if (!js.isUndefined(cancelClose)) __obj.updateDynamic("cancelClose")(cancelClose.asInstanceOf[js.Any])
    if (canceled != null) __obj.updateDynamic("canceled")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => canceled(t0, t1, t2).runNow()))
    if (!js.isUndefined(caretToEnd)) __obj.updateDynamic("caretToEnd")(caretToEnd.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => change(t0, t1, t2).runNow()))
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByClickEvent)) __obj.updateDynamic("closeByClickEvent")(closeByClickEvent.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (comboRegex != null) __obj.updateDynamic("comboRegex")(comboRegex.asInstanceOf[js.Any])
    if (combos != null) __obj.updateDynamic("combos")(combos.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (customLayout != null) __obj.updateDynamic("customLayout")(customLayout.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (enterMod != null) __obj.updateDynamic("enterMod")(enterMod.asInstanceOf[js.Any])
    if (!js.isUndefined(enterNavigation)) __obj.updateDynamic("enterNavigation")(enterNavigation.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => hidden(t0, t1, t2).runNow()))
    if (!js.isUndefined(ignoreEsc)) __obj.updateDynamic("ignoreEsc")(ignoreEsc.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFocus)) __obj.updateDynamic("initialFocus")(initialFocus.asInstanceOf[js.Any])
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => initialized(t0, t1, t2).runNow()))
    if (keyBinding != null) __obj.updateDynamic("keyBinding")(keyBinding.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(lockInput)) __obj.updateDynamic("lockInput")(lockInput.asInstanceOf[js.Any])
    if (!js.isUndefined(maxInsert)) __obj.updateDynamic("maxInsert")(maxInsert.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(noFocus)) __obj.updateDynamic("noFocus")(noFocus.asInstanceOf[js.Any])
    if (openOn != null) __obj.updateDynamic("openOn")(openOn.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (preventPaste != null) __obj.updateDynamic("preventPaste")(preventPaste.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (repeatRate != null) __obj.updateDynamic("repeatRate")(repeatRate.asInstanceOf[js.Any])
    if (!js.isUndefined(reposition)) __obj.updateDynamic("reposition")(reposition.asInstanceOf[js.Any])
    if (!js.isUndefined(resetDefault)) __obj.updateDynamic("resetDefault")(resetDefault.asInstanceOf[js.Any])
    if (restrictInclude != null) __obj.updateDynamic("restrictInclude")(restrictInclude.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictInput)) __obj.updateDynamic("restrictInput")(restrictInput.asInstanceOf[js.Any])
    if (restricted != null) __obj.updateDynamic("restricted")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => restricted(t0, t1, t2).runNow()))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (scrollAdjustment != null) __obj.updateDynamic("scrollAdjustment")(scrollAdjustment.asInstanceOf[js.Any])
    if (!js.isUndefined(stayOpen)) __obj.updateDynamic("stayOpen")(stayOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyShift)) __obj.updateDynamic("stickyShift")(stickyShift.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAtEnd)) __obj.updateDynamic("stopAtEnd")(stopAtEnd.asInstanceOf[js.Any])
    if (switchInput != null) __obj.updateDynamic("switchInput")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => switchInput(t0, t1, t2).runNow()))
    if (!js.isUndefined(tabNavigation)) __obj.updateDynamic("tabNavigation")(tabNavigation.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnChange)) __obj.updateDynamic("updateOnChange")(updateOnChange.asInstanceOf[js.Any])
    if (!js.isUndefined(useCombos)) __obj.updateDynamic("useCombos")(useCombos.asInstanceOf[js.Any])
    if (!js.isUndefined(usePreview)) __obj.updateDynamic("usePreview")(usePreview.asInstanceOf[js.Any])
    if (!js.isUndefined(useWheel)) __obj.updateDynamic("useWheel")(useWheel.asInstanceOf[js.Any])
    if (!js.isUndefined(userClosed)) __obj.updateDynamic("userClosed")(userClosed.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => validate(t0, t1, t2).runNow()))
    if (visible != null) __obj.updateDynamic("visible")(js.Any.fromFunction3((t0: /* event */ js.UndefOr[typingsJapgolly.std.Event_ | java.lang.String], t1: /* keyboard */ js.UndefOr[org.scalajs.dom.raw.Element], t2: /* el */ js.UndefOr[org.scalajs.dom.raw.Element]) => visible(t0, t1, t2).runNow()))
    if (wheelMessage != null) __obj.updateDynamic("wheelMessage")(wheelMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactKeyboardOptions]
  }
}

