package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmer
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerColors
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerElement
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerProps
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerStyleProps
import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerStyles
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Shimmer {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    ariaLabel: String = null,
    componentRef: IRefObject[IShimmer] = null,
    customElementsGroup: VdomNode = null,
    isDataLoaded: js.UndefOr[Boolean] = js.undefined,
    shimmerColors: IShimmerColors = null,
    shimmerElements: js.Array[IShimmerElement] = null,
    styles: IStyleFunctionOrObject[IShimmerStyleProps, IShimmerStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IShimmerProps, 
    MountedWithRawType[IShimmerProps, js.Object, RawMounted[IShimmerProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (customElementsGroup != null) __obj.updateDynamic("customElementsGroup")(customElementsGroup.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataLoaded)) __obj.updateDynamic("isDataLoaded")(isDataLoaded.asInstanceOf[js.Any])
    if (shimmerColors != null) __obj.updateDynamic("shimmerColors")(shimmerColors.asInstanceOf[js.Any])
    if (shimmerElements != null) __obj.updateDynamic("shimmerElements")(shimmerElements.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "Shimmer")
  @js.native
  object componentImport extends js.Object
  
}

