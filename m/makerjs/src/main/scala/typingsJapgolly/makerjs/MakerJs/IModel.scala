package typingsJapgolly.makerjs.MakerJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A model is a composite object which may contain a map of paths, or a map of models recursively.
  *
  * Example:
  * ```
  * var m = {
  *   paths: {
  *     "line1": { type: 'line', origin: [0, 0], end: [1, 1] },
  *     "line2": { type: 'line', origin: [0, 0], end: [-1, -1] }
  *   }
  * };
  * ```
  */
trait IModel extends StObject {
  
  /**
    * Optional Caption object.
    */
  var caption: js.UndefOr[ICaption] = js.undefined
  
  /**
    * Optional exporter options for this model.
    */
  var exporterOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Optional layer of this model.
    */
  var layer: js.UndefOr[String] = js.undefined
  
  /**
    * Optional map of models within this model.
    */
  var models: js.UndefOr[IModelMap] = js.undefined
  
  /**
    * An author may wish to add notes to this model instance.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * Optional origin location of this model.
    */
  var origin: js.UndefOr[IPoint] = js.undefined
  
  /**
    * Optional map of path objects in this model.
    */
  var paths: js.UndefOr[IPathMap] = js.undefined
  
  /**
    * A model may want to specify its type, but this value is not employed yet.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Optional unit system of this model. See UnitType for possible values.
    */
  var units: js.UndefOr[String] = js.undefined
}
object IModel {
  
  inline def apply(): IModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModel]
  }
  
  extension [Self <: IModel](x: Self) {
    
    inline def setCaption(value: ICaption): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setExporterOptions(value: StringDictionary[Any]): Self = StObject.set(x, "exporterOptions", value.asInstanceOf[js.Any])
    
    inline def setExporterOptionsUndefined: Self = StObject.set(x, "exporterOptions", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setModels(value: IModelMap): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
    
    inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setOrigin(value: IPoint): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPaths(value: IPathMap): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
  }
}
