package typingsJapgolly.tableauJsApi

import typingsJapgolly.tableauJsApi.enumsMod.TableauEventName
import typingsJapgolly.tableauJsApi.filteringMod.Filter
import typingsJapgolly.tableauJsApi.marksMod.Mark
import typingsJapgolly.tableauJsApi.otherMod.Size
import typingsJapgolly.tableauJsApi.parameterMod.Parameter
import typingsJapgolly.tableauJsApi.sheetMod.StoryPoint
import typingsJapgolly.tableauJsApi.sheetMod.StoryPointInfo
import typingsJapgolly.tableauJsApi.sheetMod.Worksheet
import typingsJapgolly.tableauJsApi.vizMod.ToolbarState
import typingsJapgolly.tableauJsApi.vizMod.Viz
import typingsJapgolly.tableauJsApi.workbookMod.CustomView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vizDoteventMod {
  
  @JSImport("tableau-js-api/viz.event", "CustomViewEvent")
  @js.native
  open class CustomViewEvent () extends TableauEvent {
    
    // methods
    def getCustomViewAsync(): js.Promise[CustomView] = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "FilterEvent")
  @js.native
  open class FilterEvent () extends TableauEvent {
    
    def getFieldName(): String = js.native
    
    // methods
    def getFilterAsync(): js.Promise[Filter] = js.native
    
    // properties
    def getWorksheet(): Worksheet = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "MarksEvent")
  @js.native
  open class MarksEvent () extends TableauEvent {
    
    // methods
    def getMarksAsync(): js.Promise[js.Array[Mark]] = js.native
    
    // properties
    def getWorksheet(): Worksheet = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "ParameterEvent")
  @js.native
  open class ParameterEvent () extends TableauEvent {
    
    // methods
    def getParameterAsync(): js.Promise[Parameter] = js.native
    
    // properties
    def getParameterName(): String = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "StoryPointSwitchEvent")
  @js.native
  open class StoryPointSwitchEvent () extends TableauEvent {
    
    def getNewStoryPoint(): StoryPoint = js.native
    
    // properties
    def getOldStoryPointInfo(): StoryPointInfo = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "TabSwitchEvent")
  @js.native
  open class TabSwitchEvent () extends TableauEvent {
    
    def getNewSheetName(): String = js.native
    
    // properties
    def getOldSheetName(): String = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "TableauEvent")
  @js.native
  open class TableauEvent () extends StObject {
    
    def getEventName(): TableauEventName = js.native
    
    def getViz(): Viz = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "ToolbarStateEvent")
  @js.native
  open class ToolbarStateEvent () extends StObject {
    
    def getToolbarState(): ToolbarState = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "UrlActionEvent")
  @js.native
  open class UrlActionEvent () extends StObject {
    
    def getTarget(): String = js.native
    
    def getURL(): String = js.native
  }
  
  @JSImport("tableau-js-api/viz.event", "VizResizeEvent")
  @js.native
  open class VizResizeEvent () extends TableauEvent {
    
    def getVizSize(): Size = js.native
  }
}
