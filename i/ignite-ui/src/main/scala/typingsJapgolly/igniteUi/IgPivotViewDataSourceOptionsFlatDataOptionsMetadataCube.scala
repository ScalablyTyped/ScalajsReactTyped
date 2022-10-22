package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * A caption for the cube.
    */
  var caption: js.UndefOr[String] = js.undefined
  
  /**
    * An array of dimension metadata objects.
    */
  var dimensions: js.UndefOr[js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension]] = js.undefined
  
  /**
    * An object providing information about the measures' root node.
    */
  var measuresDimension: js.UndefOr[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension] = js.undefined
  
  /**
    * Optional="false" A unique name for the cube.
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube {
  
  inline def apply(): IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube]
  }
  
  extension [Self <: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCube](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDimensions(value: js.Array[IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMeasuresDimension(value: IgPivotViewDataSourceOptionsFlatDataOptionsMetadataCubeMeasuresDimension): Self = StObject.set(x, "measuresDimension", value.asInstanceOf[js.Any])
    
    inline def setMeasuresDimensionUndefined: Self = StObject.set(x, "measuresDimension", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
