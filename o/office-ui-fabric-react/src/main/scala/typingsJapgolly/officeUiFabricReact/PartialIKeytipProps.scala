package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipStyleProps
import typingsJapgolly.officeUiFabricReact.keytipTypesMod.IKeytipStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.ipointMod.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/Keytip.IKeytipProps> */
trait PartialIKeytipProps extends js.Object {
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hasDynamicChildren: js.UndefOr[Boolean] = js.undefined
  var hasMenu: js.UndefOr[Boolean] = js.undefined
  var keySequences: js.UndefOr[js.Array[String]] = js.undefined
  var offset: js.UndefOr[IPoint] = js.undefined
  var onExecute: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.undefined
  var onReturn: js.UndefOr[
    js.Function2[/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null, Unit]
  ] = js.undefined
  var overflowSetSequence: js.UndefOr[js.Array[String]] = js.undefined
  var styles: js.UndefOr[IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PartialIKeytipProps {
  @scala.inline
  def apply(
    calloutProps: ICalloutProps = null,
    content: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hasDynamicChildren: js.UndefOr[Boolean] = js.undefined,
    hasMenu: js.UndefOr[Boolean] = js.undefined,
    keySequences: js.Array[String] = null,
    offset: IPoint = null,
    onExecute: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback = null,
    onReturn: (/* executeTarget */ HTMLElement | Null, /* target */ HTMLElement | Null) => Callback = null,
    overflowSetSequence: js.Array[String] = null,
    styles: IStyleFunctionOrObject[IKeytipStyleProps, IKeytipStyles] = null,
    theme: ITheme = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PartialIKeytipProps = {
    val __obj = js.Dynamic.literal()
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hasDynamicChildren)) __obj.updateDynamic("hasDynamicChildren")(hasDynamicChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMenu)) __obj.updateDynamic("hasMenu")(hasMenu.asInstanceOf[js.Any])
    if (keySequences != null) __obj.updateDynamic("keySequences")(keySequences.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onExecute != null) __obj.updateDynamic("onExecute")(js.Any.fromFunction2((t0: /* executeTarget */ org.scalajs.dom.raw.HTMLElement | scala.Null, t1: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null) => onExecute(t0, t1).runNow()))
    if (onReturn != null) __obj.updateDynamic("onReturn")(js.Any.fromFunction2((t0: /* executeTarget */ org.scalajs.dom.raw.HTMLElement | scala.Null, t1: /* target */ org.scalajs.dom.raw.HTMLElement | scala.Null) => onReturn(t0, t1).runNow()))
    if (overflowSetSequence != null) __obj.updateDynamic("overflowSetSequence")(overflowSetSequence.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIKeytipProps]
  }
}

