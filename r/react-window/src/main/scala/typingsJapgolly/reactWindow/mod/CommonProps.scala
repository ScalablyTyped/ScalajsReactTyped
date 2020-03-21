package typingsJapgolly.reactWindow.mod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonProps extends js.Object {
  /**
    * Optional CSS class to attach to outermost <div> element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var innerElementType: js.UndefOr[ReactElementType] = js.undefined
  /**
    * Ref to attach to the inner container element. This is an advanced property.
    */
  var innerRef: js.UndefOr[Ref] = js.undefined
  /**
    * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var innerTagName: js.UndefOr[String] = js.undefined
  /**
    * Contextual data to be passed to the item renderer as a data prop. This is a light-weight alternative to React's built-in context API.
    *
    * Item data is useful for item renderers that are class components.
    */
  var itemData: js.UndefOr[js.Any] = js.undefined
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    */
  var outerElementType: js.UndefOr[ReactElementType] = js.undefined
  /**
    * Ref to attach to the outer container element. This is an advanced property.
    */
  var outerRef: js.UndefOr[Ref] = js.undefined
  /**
    * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
    *
    * @deprecated since 1.4.0
    */
  var outerTagName: js.UndefOr[String] = js.undefined
  /**
    * Optional inline style to attach to outermost <div> element.
    */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Adds an additional isScrolling parameter to the children render function. This parameter can be used to show a placeholder row or column while the list is being scrolled.
    *
    * Note that using this parameter will result in an additional render call after scrolling has stopped (when isScrolling changes from true to false).
    */
  var useIsScrolling: js.UndefOr[Boolean] = js.undefined
}

object CommonProps {
  @scala.inline
  def apply(
    className: String = null,
    innerElementType: ReactElementType = null,
    innerRef: Ref = null,
    innerTagName: String = null,
    itemData: js.Any = null,
    outerElementType: ReactElementType = null,
    outerRef: Ref = null,
    outerTagName: String = null,
    style: CSSProperties = null,
    useIsScrolling: js.UndefOr[Boolean] = js.undefined
  ): CommonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (innerElementType != null) __obj.updateDynamic("innerElementType")(innerElementType.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (innerTagName != null) __obj.updateDynamic("innerTagName")(innerTagName.asInstanceOf[js.Any])
    if (itemData != null) __obj.updateDynamic("itemData")(itemData.asInstanceOf[js.Any])
    if (outerElementType != null) __obj.updateDynamic("outerElementType")(outerElementType.asInstanceOf[js.Any])
    if (outerRef != null) __obj.updateDynamic("outerRef")(outerRef.asInstanceOf[js.Any])
    if (outerTagName != null) __obj.updateDynamic("outerTagName")(outerTagName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useIsScrolling)) __obj.updateDynamic("useIsScrolling")(useIsScrolling.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonProps]
  }
}

