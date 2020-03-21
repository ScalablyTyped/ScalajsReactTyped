package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps
import typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyleProps
import typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressIndicator {
  def apply(
    ariaValueText: String = null,
    barHeight: Int | Double = null,
    className: String = null,
    description: VdomNode = null,
    label: VdomNode = null,
    onRenderProgress: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IProgressIndicatorProps], Element | Null]]) => CallbackTo[Element | Null] = null,
    percentComplete: Int | Double = null,
    progressHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles] = null,
    theme: ITheme = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IProgressIndicatorProps, 
    LegacyRef[
      typingsJapgolly.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
    ], 
    Unit, 
    IProgressIndicatorProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(ariaValueText.asInstanceOf[js.Any])
    if (barHeight != null) __obj.updateDynamic("barHeight")(barHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
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
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[
    typingsJapgolly.officeUiFabricReact.progressIndicatorBaseMod.ProgressIndicatorBase
  ]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.progressIndicatorTypesMod.IProgressIndicatorProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ProgressIndicator")
  @js.native
  object componentImport extends js.Object
  
}

