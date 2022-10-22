package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridTooltips
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * A list of custom column settings that specify custom tooltip settings for a specific column (whether tooltips are enabled / disabled)
    *
    */
  var columnSettings: js.UndefOr[IgGridTooltipsColumnSettings] = js.undefined
  
  /**
    * Sets the left position of the tooltip relative to the mouse cursor
    *
    */
  var cursorLeftOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the top position of the tooltip relative to the mouse cursor
    *
    */
  var cursorTopOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the time tooltip fades in and out when showing/hiding
    *
    */
  var fadeTimespan: js.UndefOr[Double] = js.undefined
  
  /**
    * Type="integer" The time in milliseconds after which tooltip hides when mouse
    * cursor gets outside of the cell.
    *
    */
  var hideDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time in milliseconds after which tooltip will show when
    * mouse cursor is hovered over a cell.
    *
    */
  var showDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the tooltip's style
    *
    *
    * Valid values:
    * "tooltip" The tooltip will be positioned according to the mouse cursor. Will render the tooltip content as plain text.
    * "popover" The tooltip will be positioned according to the target element with an arrow pointing the element. This style is more suitable for touch-supported environments. Will render the tooltip content as HTML.
    */
  var style: js.UndefOr[String] = js.undefined
  
  /**
    * Event fired after a tooltip is hidden
    */
  var tooltipHidden: js.UndefOr[TooltipHiddenEvent] = js.undefined
  
  /**
    * Event fired when the mouse has left an element and the tooltip is about to hide
    */
  var tooltipHiding: js.UndefOr[TooltipHidingEvent] = js.undefined
  
  /**
    * Event fired when the mouse has hovered on an element long enough to display a tooltip
    */
  var tooltipShowing: js.UndefOr[TooltipShowingEvent] = js.undefined
  
  /**
    * Event fired after a tooltip is shown
    */
  var tooltipShown: js.UndefOr[TooltipShownEvent] = js.undefined
  
  /**
    * Determines the tooltip visibility option
    *
    *
    * Valid values:
    * "always" tooltips always show for hovered elements
    * "never" tooltips do not show automatically
    * "overflow" tooltips show only when the underlying data overflows its container
    */
  var visibility: js.UndefOr[String] = js.undefined
}
object IgGridTooltips {
  
  inline def apply(): IgGridTooltips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridTooltips]
  }
  
  extension [Self <: IgGridTooltips](x: Self) {
    
    inline def setColumnSettings(value: IgGridTooltipsColumnSettings): Self = StObject.set(x, "columnSettings", value.asInstanceOf[js.Any])
    
    inline def setColumnSettingsUndefined: Self = StObject.set(x, "columnSettings", js.undefined)
    
    inline def setCursorLeftOffset(value: Double): Self = StObject.set(x, "cursorLeftOffset", value.asInstanceOf[js.Any])
    
    inline def setCursorLeftOffsetUndefined: Self = StObject.set(x, "cursorLeftOffset", js.undefined)
    
    inline def setCursorTopOffset(value: Double): Self = StObject.set(x, "cursorTopOffset", value.asInstanceOf[js.Any])
    
    inline def setCursorTopOffsetUndefined: Self = StObject.set(x, "cursorTopOffset", js.undefined)
    
    inline def setFadeTimespan(value: Double): Self = StObject.set(x, "fadeTimespan", value.asInstanceOf[js.Any])
    
    inline def setFadeTimespanUndefined: Self = StObject.set(x, "fadeTimespan", js.undefined)
    
    inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
    
    inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
    
    inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
    
    inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTooltipHidden(value: (/* event */ Event, /* ui */ TooltipHiddenEventUIParam) => Callback): Self = StObject.set(x, "tooltipHidden", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ TooltipHiddenEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setTooltipHiddenUndefined: Self = StObject.set(x, "tooltipHidden", js.undefined)
    
    inline def setTooltipHiding(value: (/* event */ Event, /* ui */ TooltipHidingEventUIParam) => Callback): Self = StObject.set(x, "tooltipHiding", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ TooltipHidingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setTooltipHidingUndefined: Self = StObject.set(x, "tooltipHiding", js.undefined)
    
    inline def setTooltipShowing(value: (/* event */ Event, /* ui */ TooltipShowingEventUIParam) => Callback): Self = StObject.set(x, "tooltipShowing", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ TooltipShowingEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setTooltipShowingUndefined: Self = StObject.set(x, "tooltipShowing", js.undefined)
    
    inline def setTooltipShown(value: (/* event */ Event, /* ui */ TooltipShownEventUIParam) => Callback): Self = StObject.set(x, "tooltipShown", js.Any.fromFunction2((t0: /* event */ Event, t1: /* ui */ TooltipShownEventUIParam) => (value(t0, t1)).runNow()))
    
    inline def setTooltipShownUndefined: Self = StObject.set(x, "tooltipShown", js.undefined)
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
