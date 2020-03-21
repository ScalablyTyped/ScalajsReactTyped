package typingsJapgolly.officeUiFabricReact.keytipTypesMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.ipointMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipProps extends js.Object {
  /**
    * ICalloutProps to pass to the callout element
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Content to put inside the keytip
    */
  var content: String
  /**
    * T/F if the corresponding control for this keytip is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not this keytip will have children keytips that are dynamically created (DOM is generated on keytip activation)
    * Common cases are a Pivot or Modal
    */
  var hasDynamicChildren: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not this keytip belongs to a component that has a menu
    * Keytip mode will stay on when a menu is opened, even if the items in that menu have no keytips
    */
  var hasMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of KeySequences which is the full key sequence to trigger this keytip
    * Should not include initial 'start' key sequence
    */
  var keySequences: js.Array[String]
  /**
    * Offset x and y for the keytip, added from the top-left corner
    * By default the keytip will be anchored to the bottom-center of the element
    */
  var offset: js.UndefOr[IPoint] = js.undefined
  /**
    * Function to call when this keytip is activated.
    * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
    * 'target' is the DOM element marked with 'data-ktp-target'.
    */
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.undefined
  /**
    * Function to call when the keytip is the currentKeytip and a return sequence is pressed.
    * 'executeTarget' is the DOM element marked with 'data-ktp-execute-target'.
    * 'target' is the DOM element marked with 'data-ktp-target'.
    */
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.undefined
  /**
    * Full KeySequence of the overflow set button, will be set automatically if this keytip is inside an overflow
    */
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.undefined
  /**
    * Theme for the component
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * T/F if the keytip is visible
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object IKeytipProps {
  @scala.inline
  def apply(
    content: String,
    keySequences: js.Array[String],
    calloutProps: ICalloutProps = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasDynamicChildren: js.UndefOr[Boolean] = js.undefined,
    hasMenu: js.UndefOr[Boolean] = js.undefined,
    offset: IPoint = null,
    onExecute: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback = null,
    onReturn: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback = null,
    overflowSetSequence: js.Array[String] = null,
    styles: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles] = null,
    theme: ITheme = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IKeytipProps = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], keySequences = keySequences.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicChildren)) __obj.updateDynamic("hasDynamicChildren")(hasDynamicChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMenu)) __obj.updateDynamic("hasMenu")(hasMenu.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction2((t0: /* executeTarget */ org.scalajs.dom.raw.HTMLElement | scala.Null, t1: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null) => onExecute(t0, t1).runNow()))
    if (onReturn != null) __obj.updateDynamic("onReturn")(js.Any.fromFunction2((t0: /* executeTarget */ org.scalajs.dom.raw.HTMLElement | scala.Null, t1: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null) => onReturn(t0, t1).runNow()))
    if (overflowSetSequence != null) __obj.updateDynamic("overflowSetSequence")(overflowSetSequence.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipProps]
  }
}

