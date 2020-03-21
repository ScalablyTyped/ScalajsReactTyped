package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRating
import typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRatingProps
import typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRatingStyleProps
import typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRatingStyles
import typingsJapgolly.officeUiFabricReact.ratingTypesMod.RatingSize
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rating {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    allowZeroStars: js.UndefOr[Boolean] = js.undefined,
    ariaLabelFormat: String = null,
    ariaLabelId: String = null,
    componentRef: IRefObject[IRating] = null,
    getAriaLabel: (/* rating */ Double, /* max */ Double) => CallbackTo[String] = null,
    icon: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: (/* event */ ReactFocusEventFrom[HTMLElement], /* rating */ js.UndefOr[Double]) => Callback = null,
    onChanged: /* rating */ Double => Callback = null,
    rating: Int | Double = null,
    size: RatingSize = null,
    styles: IStyleFunctionOrObject[IRatingStyleProps, IRatingStyles] = null,
    theme: ITheme = null,
    unselectedIcon: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IRatingProps, 
    MountedWithRawType[IRatingProps, js.Object, RawMounted[IRatingProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (!js.isUndefined(allowZeroStars)) __obj.updateDynamic("allowZeroStars")(allowZeroStars.asInstanceOf[js.Any])
    if (ariaLabelFormat != null) __obj.updateDynamic("ariaLabelFormat")(ariaLabelFormat.asInstanceOf[js.Any])
    if (ariaLabelId != null) __obj.updateDynamic("ariaLabelId")(ariaLabelId.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getAriaLabel != null) __obj.updateDynamic("getAriaLabel")(js.Any.fromFunction2((t0: /* rating */ scala.Double, t1: /* max */ scala.Double) => getAriaLabel(t0, t1).runNow()))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* rating */ js.UndefOr[scala.Double]) => onChange(t0, t1).runNow()))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1((t0: /* rating */ scala.Double) => onChanged(t0).runNow()))
    if (rating != null) __obj.updateDynamic("rating")(rating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (unselectedIcon != null) __obj.updateDynamic("unselectedIcon")(unselectedIcon.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRatingProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.ratingTypesMod.IRatingProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "Rating")
  @js.native
  object componentImport extends js.Object
  
}

