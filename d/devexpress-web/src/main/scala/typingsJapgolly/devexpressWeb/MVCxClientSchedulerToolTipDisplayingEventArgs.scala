package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientScheduler.ToolTipDisplaying event.
  */
@JSGlobal("MVCxClientSchedulerToolTipDisplayingEventArgs")
@js.native
class MVCxClientSchedulerToolTipDisplayingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes new instance of the MVCxClientSchedulerToolTipDisplayingEventArgs class with the specified settings.
    * @param toolTip A MVCxClientSchedulerTemplateToolTip object that is a tooltip.
    * @param data An ASPxClientSchedulerToolTipData object that is the tooltip data.
    */
  def this(toolTip: MVCxClientSchedulerTemplateToolTip, data: ASPxClientSchedulerToolTipData) = this()
  /**
    * Gets information about the tooltip related to the event.
    */
  var data: ASPxClientSchedulerToolTipData = js.native
  /**
    * Gets the tooltip related to the event.
    */
  var toolTip: MVCxClientSchedulerTemplateToolTip = js.native
}

