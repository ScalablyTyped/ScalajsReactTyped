package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.detailsListTypesMod.IDetailsListStyles
import typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typingsJapgolly.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListProps
import typingsJapgolly.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyles
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShimmeredDetailsListBase {
  def apply(
    ariaLabelForShimmer: String = null,
    detailsListStyles: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles] = null,
    enableShimmer: js.UndefOr[Boolean] = js.undefined,
    onRenderCustomPlaceholder: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, Node]]) => CallbackTo[Node] = null,
    removeFadingOverlay: js.UndefOr[Boolean] = js.undefined,
    shimmerLines: Int | Double = null,
    shimmerOverlayStyles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    styles: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IShimmeredDetailsListProps, 
    typingsJapgolly.officeUiFabricReact.mod.ShimmeredDetailsListBase, 
    Unit, 
    IShimmeredDetailsListProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaLabelForShimmer != null) __obj.updateDynamic("ariaLabelForShimmer")(ariaLabelForShimmer.asInstanceOf[js.Any])
    if (detailsListStyles != null) __obj.updateDynamic("detailsListStyles")(detailsListStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(enableShimmer)) __obj.updateDynamic("enableShimmer")(enableShimmer.asInstanceOf[js.Any])
    if (onRenderCustomPlaceholder != null) __obj.updateDynamic("onRenderCustomPlaceholder")(js.Any.fromFunction3((t0: /* rowProps */ typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps, t1: /* index */ js.UndefOr[scala.Double], t2: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ typingsJapgolly.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps, 
    japgolly.scalajs.react.raw.React.Node
  ]]) => onRenderCustomPlaceholder(t0, t1, t2).runNow()))
    if (!js.isUndefined(removeFadingOverlay)) __obj.updateDynamic("removeFadingOverlay")(removeFadingOverlay.asInstanceOf[js.Any])
    if (shimmerLines != null) __obj.updateDynamic("shimmerLines")(shimmerLines.asInstanceOf[js.Any])
    if (shimmerOverlayStyles != null) __obj.updateDynamic("shimmerOverlayStyles")(shimmerOverlayStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.ShimmeredDetailsListBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "ShimmeredDetailsListBase")
  @js.native
  object componentImport extends js.Object
  
}

