package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroup
import typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps
import typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupStyleProps
import typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupStyles
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IShimmerElementsGroupProps1235686880 () {
  val componentImport: js.Any
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    backgroundColor: String = null,
    componentRef: IRefObject[IShimmerElementsGroup] = null,
    flexWrap: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    shimmerElements: js.Array[IShimmerElement] = null,
    styles: IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles] = null,
    theme: ITheme = null,
    width: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IShimmerElementsGroupProps, 
    MountedWithRawType[
      IShimmerElementsGroupProps, 
      js.Object, 
      RawMounted[IShimmerElementsGroupProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(flexWrap)) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (shimmerElements != null) __obj.updateDynamic("shimmerElements")(shimmerElements.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod.IShimmerElementsGroupProps])(children: _*)
  }
}

