package typingsJapgolly.tableau.global.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object TableauEventName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.tableau.tableau.TableauEventName & String] = js.native
  
  /* "customviewload" */ val CUSTOM_VIEW_LOAD: typingsJapgolly.tableau.tableau.TableauEventName.CUSTOM_VIEW_LOAD & String = js.native
  
  /* "customviewremove" */ val CUSTOM_VIEW_REMOVE: typingsJapgolly.tableau.tableau.TableauEventName.CUSTOM_VIEW_REMOVE & String = js.native
  
  /* "customviewsave" */ val CUSTOM_VIEW_SAVE: typingsJapgolly.tableau.tableau.TableauEventName.CUSTOM_VIEW_SAVE & String = js.native
  
  /* "customviewsetdefault" */ val CUSTOM_VIEW_SET_DEFAULT: typingsJapgolly.tableau.tableau.TableauEventName.CUSTOM_VIEW_SET_DEFAULT & String = js.native
  
  /* "filterchange" */ val FILTER_CHANGE: typingsJapgolly.tableau.tableau.TableauEventName.FILTER_CHANGE & String = js.native
  
  /* "marksselection" */ val MARKS_SELECTION: typingsJapgolly.tableau.tableau.TableauEventName.MARKS_SELECTION & String = js.native
  
  /* "parametervaluechange" */ val PARAMETER_VALUE_CHANGE: typingsJapgolly.tableau.tableau.TableauEventName.PARAMETER_VALUE_CHANGE & String = js.native
  
  /* "storypointswitch" */ val STORY_POINT_SWITCH: typingsJapgolly.tableau.tableau.TableauEventName.STORY_POINT_SWITCH & String = js.native
  
  /* "tabswitch" */ val TAB_SWITCH: typingsJapgolly.tableau.tableau.TableauEventName.TAB_SWITCH & String = js.native
  
  /* "toolbarstatechange" */ val TOOLBAR_STATE_CHANGE: typingsJapgolly.tableau.tableau.TableauEventName.TOOLBAR_STATE_CHANGE & String = js.native
  
  /* "vizresize" */ val VIZ_RESIZE: typingsJapgolly.tableau.tableau.TableauEventName.VIZ_RESIZE & String = js.native
}
