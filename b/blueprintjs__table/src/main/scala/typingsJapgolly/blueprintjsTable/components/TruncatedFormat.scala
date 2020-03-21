package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsTable.truncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions
import typingsJapgolly.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps
import typingsJapgolly.blueprintjsTable.truncatedFormatMod.TruncatedPopoverMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TruncatedFormat {
  def apply(
    className: String = null,
    detectTruncation: js.UndefOr[Boolean] = js.undefined,
    measureByApproxOptions: ITrucatedFormateMeasureByApproximateOptions = null,
    parentCellHeight: Int | Double = null,
    parentCellWidth: Int | Double = null,
    preformatted: js.UndefOr[Boolean] = js.undefined,
    showPopover: TruncatedPopoverMode = null,
    truncateLength: Int | Double = null,
    truncationSuffix: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String = null
  ): UnmountedWithRoot[
    ITruncatedFormatProps, 
    typingsJapgolly.blueprintjsTable.mod.TruncatedFormat, 
    Unit, 
    ITruncatedFormatProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(detectTruncation)) __obj.updateDynamic("detectTruncation")(detectTruncation.asInstanceOf[js.Any])
    if (measureByApproxOptions != null) __obj.updateDynamic("measureByApproxOptions")(measureByApproxOptions.asInstanceOf[js.Any])
    if (parentCellHeight != null) __obj.updateDynamic("parentCellHeight")(parentCellHeight.asInstanceOf[js.Any])
    if (parentCellWidth != null) __obj.updateDynamic("parentCellWidth")(parentCellWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preformatted)) __obj.updateDynamic("preformatted")(preformatted.asInstanceOf[js.Any])
    if (showPopover != null) __obj.updateDynamic("showPopover")(showPopover.asInstanceOf[js.Any])
    if (truncateLength != null) __obj.updateDynamic("truncateLength")(truncateLength.asInstanceOf[js.Any])
    if (truncationSuffix != null) __obj.updateDynamic("truncationSuffix")(truncationSuffix.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.blueprintjsTable.mod.TruncatedFormat](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.truncatedFormatMod.ITruncatedFormatProps])
  }
  @JSImport("@blueprintjs/table", "TruncatedFormat")
  @js.native
  object componentImport extends js.Object
  
}

