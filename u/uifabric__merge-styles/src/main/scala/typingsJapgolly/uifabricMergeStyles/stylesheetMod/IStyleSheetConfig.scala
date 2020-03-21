package typingsJapgolly.uifabricMergeStyles.stylesheetMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleSheetConfig extends js.Object {
  /**
    * CSP settings
    */
  var cspSettings: js.UndefOr[ICSPSettings] = js.undefined
  /**
    * Default 'displayName' to use for a className.
    * @defaultvalue 'css'
    */
  var defaultPrefix: js.UndefOr[String] = js.undefined
  /**
    * Injection mode for how rules are inserted.
    */
  var injectionMode: js.UndefOr[InjectionMode] = js.undefined
  /**
    * Default 'namespace' to attach before the className.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * Callback executed when a rule is inserted.
    */
  var onInsertRule: js.UndefOr[js.Function1[/* rule */ String, Unit]] = js.undefined
  /**
    * Defines the default direction of rules for auto-rtlifying things.
    * While typically this is represented as a DIR attribute in the markup,
    * the DIR is not enough to control whether padding goes on the left or
    * right. Use this to set the default direction when rules are registered.
    */
  var rtl: js.UndefOr[Boolean] = js.undefined
}

object IStyleSheetConfig {
  @scala.inline
  def apply(
    cspSettings: ICSPSettings = null,
    defaultPrefix: String = null,
    injectionMode: InjectionMode = null,
    namespace: String = null,
    onInsertRule: /* rule */ String => Callback = null,
    rtl: js.UndefOr[Boolean] = js.undefined
  ): IStyleSheetConfig = {
    val __obj = js.Dynamic.literal()
    if (cspSettings != null) __obj.updateDynamic("cspSettings")(cspSettings.asInstanceOf[js.Any])
    if (defaultPrefix != null) __obj.updateDynamic("defaultPrefix")(defaultPrefix.asInstanceOf[js.Any])
    if (injectionMode != null) __obj.updateDynamic("injectionMode")(injectionMode.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onInsertRule != null) __obj.updateDynamic("onInsertRule")(js.Any.fromFunction1((t0: /* rule */ java.lang.String) => onInsertRule(t0).runNow()))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleSheetConfig]
  }
}

