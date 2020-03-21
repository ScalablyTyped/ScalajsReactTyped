package typingsJapgolly.officeUiFabricReact.shimmerElementsGroupTypesMod

import typingsJapgolly.officeUiFabricReact.shimmerTypesMod.IShimmerElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmerElementsGroupProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * Defines the background color of the space in between and around shimmer elements.
    * @defaultvalue theme.palette.white
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IShimmerElementsGroup interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IShimmerElementsGroup]] = js.undefined
  /**
    * Optional boolean for enabling flexWrap of the container containing the shimmerElements.
    * @defaultvalue false
    */
  var flexWrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional maximum row height of the shimmerElements container.
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * Elements to render in one group of the Shimmer.
    */
  var shimmerElements: js.UndefOr[js.Array[IShimmerElement]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles]
  ] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Optional width for ShimmerElements container.
    */
  @JSName("width")
  var width_IShimmerElementsGroupProps: js.UndefOr[String] = js.undefined
}

object IShimmerElementsGroupProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    backgroundColor: String = null,
    componentRef: IRefObject[IShimmerElementsGroup] = null,
    flexWrap: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    shimmerElements: js.Array[IShimmerElement] = null,
    styles: IStyleFunctionOrObject[IShimmerElementsGroupStyleProps, IShimmerElementsGroupStyles] = null,
    theme: ITheme = null,
    width: String = null
  ): IShimmerElementsGroupProps = {
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
    __obj.asInstanceOf[IShimmerElementsGroupProps]
  }
}

