package typingsJapgolly.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableauEventName extends js.Object

//#endregion
//#region Viz Event Classes
/**
  * Defines strings passed to the Viz.addEventListener and Viz.removeEventListener methods.
  * The values of the enums are all lowercase strings with no underscores.
  * For example, CUSTOM_VIEW_LOAD is customviewload.
  * Either the fully-qualified enum (tableau.TableauEventName.FILTER_CHANGE) or the raw string (filterchange) is acceptable.
  */
@JSGlobal("tableau.TableauEventName")
@js.native
object TableauEventName extends js.Object {
  /**
    * Raised when a custom view has finished loading.
    * This event is raised after the callback function for onFirstInteractive (if any) has been called.
    */
  @js.native
  sealed trait CUSTOM_VIEW_LOAD extends TableauEventName
  
  /** Raised when the user removes a custom view. */
  @js.native
  sealed trait CUSTOM_VIEW_REMOVE extends TableauEventName
  
  /** Raised when the user saves a new or existing custom view. */
  @js.native
  sealed trait CUSTOM_VIEW_SAVE extends TableauEventName
  
  /** Raised when a custom view has been made the default view for this visualization. */
  @js.native
  sealed trait CUSTOM_VIEW_SET_DEFAULT extends TableauEventName
  
  /** Raised when any filter has changed state. The Viz object may not be interactive yet. */
  @js.native
  sealed trait FILTER_CHANGE extends TableauEventName
  
  /** Raised when marks are selected or deselected. */
  @js.native
  sealed trait MARKS_SELECTION extends TableauEventName
  
  /** Raised when any parameter has changed state. */
  @js.native
  sealed trait PARAMETER_VALUE_CHANGE extends TableauEventName
  
  /** Raised after a story point becomes active. */
  @js.native
  sealed trait STORY_POINT_SWITCH extends TableauEventName
  
  /** Raised after the tab switched, but the Viz object may not yet be interactive. */
  @js.native
  sealed trait TAB_SWITCH extends TableauEventName
  
  /** Raised when the state of the specified toolbar button changes. See API Reference. */
  @js.native
  sealed trait TOOLBAR_STATE_CHANGE extends TableauEventName
  
  /** Raised every time the frame size is calculated from the available size and the Viz object's published size. */
  @js.native
  sealed trait VIZ_RESIZE extends TableauEventName
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableauEventName with String] = js.native
  /* "customviewload" */ @js.native
  object CUSTOM_VIEW_LOAD extends TopLevel[CUSTOM_VIEW_LOAD with String]
  
  /* "customviewremove" */ @js.native
  object CUSTOM_VIEW_REMOVE extends TopLevel[CUSTOM_VIEW_REMOVE with String]
  
  /* "customviewsave" */ @js.native
  object CUSTOM_VIEW_SAVE extends TopLevel[CUSTOM_VIEW_SAVE with String]
  
  /* "customviewsetdefault" */ @js.native
  object CUSTOM_VIEW_SET_DEFAULT extends TopLevel[CUSTOM_VIEW_SET_DEFAULT with String]
  
  /* "filterchange" */ @js.native
  object FILTER_CHANGE extends TopLevel[FILTER_CHANGE with String]
  
  /* "marksselection" */ @js.native
  object MARKS_SELECTION extends TopLevel[MARKS_SELECTION with String]
  
  /* "parametervaluechange" */ @js.native
  object PARAMETER_VALUE_CHANGE extends TopLevel[PARAMETER_VALUE_CHANGE with String]
  
  /* "storypointswitch" */ @js.native
  object STORY_POINT_SWITCH extends TopLevel[STORY_POINT_SWITCH with String]
  
  /* "tabswitch" */ @js.native
  object TAB_SWITCH extends TopLevel[TAB_SWITCH with String]
  
  /* "toolbarstatechange" */ @js.native
  object TOOLBAR_STATE_CHANGE extends TopLevel[TOOLBAR_STATE_CHANGE with String]
  
  /* "vizresize" */ @js.native
  object VIZ_RESIZE extends TopLevel[VIZ_RESIZE with String]
  
}

