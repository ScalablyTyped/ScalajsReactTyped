package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGap
import typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps
import typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapStyleProps
import typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapStyles
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istyleMod.IRawStyle
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IShimmerGapProps15919642 () {
  val componentImport: js.Any
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    borderStyle: IRawStyle = null,
    componentRef: IRefObject[IShimmerGap] = null,
    height: Int | Double = null,
    styles: IStyleFunctionOrObject[IShimmerGapStyleProps, IShimmerGapStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IShimmerGapProps, 
    MountedWithRawType[IShimmerGapProps, js.Object, RawMounted[IShimmerGapProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.shimmerGapTypesMod.IShimmerGapProps])(children: _*)
  }
}

