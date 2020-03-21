package typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProgressIndicatorProps extends ClassAttributes[ProgressIndicatorBase] {
  /**
    * Text alternative of the progress status, used by screen readers for reading the value of the progress.
    */
  var ariaValueText: js.UndefOr[String] = js.undefined
  /**
    * Height of the ProgressIndicator
    * @defaultvalue 2
    */
  var barHeight: js.UndefOr[Double] = js.undefined
  /**
    * Additional css class to apply to the ProgressIndicator
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Text describing or supplementing the operation. May be a string or React virtual elements.
    */
  var description: js.UndefOr[Node] = js.undefined
  /**
    * Label to display above the control. May be a string or React virtual elements.
    */
  var label: js.UndefOr[Node] = js.undefined
  /**
    * A render override for the progress track.
    */
  var onRenderProgress: js.UndefOr[IRenderFunction[IProgressIndicatorProps]] = js.undefined
  /**
    * Percentage of the operation's completeness, numerically between 0 and 1. If this is not set,
    * the indeterminate progress animation will be shown instead.
    */
  var percentComplete: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to hide the progress state.
    */
  var progressHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Deprecated at v0.43.0, to be removed at \>= v0.53.0. Use `label` instead.
    * @deprecated Use `label` instead.
    */
  var title: js.UndefOr[String] = js.undefined
}

object IProgressIndicatorProps {
  @scala.inline
  def apply(
    ariaValueText: String = null,
    barHeight: Int | Double = null,
    className: String = null,
    description: VdomNode = null,
    key: Key = null,
    label: VdomNode = null,
    onRenderProgress: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    percentComplete: Int | Double = null,
    progressHidden: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[ProgressIndicatorBase] = null,
    styles: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles] = null,
    theme: ITheme = null,
    title: String = null
  ): IProgressIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText.asInstanceOf[js.Any])
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (onRenderProgress != null) __obj.updateDynamic("onRenderProgress")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[
  typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[
      typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
    ], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderProgress(t0, t1).runNow()))
    if (percentComplete != null) __obj.updateDynamic("percentComplete")(percentComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(progressHidden)) __obj.updateDynamic("progressHidden")(progressHidden.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProgressIndicatorProps]
  }
}

