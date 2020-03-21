package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonNext
import typingsJapgolly.fundamentalReact.paginationMod.PaginationProps
import typingsJapgolly.fundamentalReact.paginationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  def apply(
    itemsTotal: Double,
    onClick: Double => Callback,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    displayTotal: js.UndefOr[Boolean] = js.undefined,
    displayTotalProps: StringDictionary[js.Any] = null,
    initialPage: Int | Double = null,
    itemsPerPage: Int | Double = null,
    linkProps: StringDictionary[js.Any] = null,
    localizedText: AnonNext = null,
    nextProps: StringDictionary[js.Any] = null,
    prevProps: StringDictionary[js.Any] = null,
    totalText: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PaginationProps, default, Unit, PaginationProps] = {
    val __obj = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: scala.Double) => onClick(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(displayTotal)) __obj.updateDynamic("displayTotal")(displayTotal.asInstanceOf[js.Any])
    if (displayTotalProps != null) __obj.updateDynamic("displayTotalProps")(displayTotalProps.asInstanceOf[js.Any])
    if (initialPage != null) __obj.updateDynamic("initialPage")(initialPage.asInstanceOf[js.Any])
    if (itemsPerPage != null) __obj.updateDynamic("itemsPerPage")(itemsPerPage.asInstanceOf[js.Any])
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (nextProps != null) __obj.updateDynamic("nextProps")(nextProps.asInstanceOf[js.Any])
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps.asInstanceOf[js.Any])
    if (totalText != null) __obj.updateDynamic("totalText")(totalText.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.paginationMod.PaginationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.paginationMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.paginationMod.PaginationProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Pagination/Pagination", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

