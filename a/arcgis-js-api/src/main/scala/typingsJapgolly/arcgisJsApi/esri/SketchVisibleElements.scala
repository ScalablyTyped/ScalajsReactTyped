package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchVisibleElements
  extends StObject
     with Object {
  
  /**
    * The available sketch tools within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var createTools: js.UndefOr[VisibleElementsCreateTools] = js.undefined
  
  /**
    * The available selection tools within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var selectionTools: js.UndefOr[VisibleElementsSelectionTools] = js.undefined
  
  /**
    * Indicates whether to display the settings menu.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var settingsMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the `SnappingControls` widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var snappingControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The available [SnappingControls](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-SnappingControls.html) elements within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var snappingControlsElements: js.UndefOr[VisibleElementsSnappingControlsElements] = js.undefined
  
  /**
    * Indicates whether to display the undo/redo menu within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#VisibleElements)
    */
  var undoRedoMenu: js.UndefOr[Boolean] = js.undefined
}
object SketchVisibleElements {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchVisibleElements]
  }
  
  extension [Self <: SketchVisibleElements](x: Self) {
    
    inline def setCreateTools(value: VisibleElementsCreateTools): Self = StObject.set(x, "createTools", value.asInstanceOf[js.Any])
    
    inline def setCreateToolsUndefined: Self = StObject.set(x, "createTools", js.undefined)
    
    inline def setSelectionTools(value: VisibleElementsSelectionTools): Self = StObject.set(x, "selectionTools", value.asInstanceOf[js.Any])
    
    inline def setSelectionToolsUndefined: Self = StObject.set(x, "selectionTools", js.undefined)
    
    inline def setSettingsMenu(value: Boolean): Self = StObject.set(x, "settingsMenu", value.asInstanceOf[js.Any])
    
    inline def setSettingsMenuUndefined: Self = StObject.set(x, "settingsMenu", js.undefined)
    
    inline def setSnappingControls(value: Boolean): Self = StObject.set(x, "snappingControls", value.asInstanceOf[js.Any])
    
    inline def setSnappingControlsElements(value: VisibleElementsSnappingControlsElements): Self = StObject.set(x, "snappingControlsElements", value.asInstanceOf[js.Any])
    
    inline def setSnappingControlsElementsUndefined: Self = StObject.set(x, "snappingControlsElements", js.undefined)
    
    inline def setSnappingControlsUndefined: Self = StObject.set(x, "snappingControls", js.undefined)
    
    inline def setUndoRedoMenu(value: Boolean): Self = StObject.set(x, "undoRedoMenu", value.asInstanceOf[js.Any])
    
    inline def setUndoRedoMenuUndefined: Self = StObject.set(x, "undoRedoMenu", js.undefined)
  }
}
