package typingsJapgolly.interactjsTypes.anon

import typingsJapgolly.interactjsTypes.interactjsTypesStrings.bottom
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.height
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.left
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.right
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.top
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.width
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.x
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.y
import typingsJapgolly.interactjsTypes.snappersGridMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordFields extends StObject {
  
  var coordFields: js.Array[js.Tuple2[x | left | right | width, y | top | bottom | height]]
  
  var grid: GridOptions
}
object CoordFields {
  
  inline def apply(
    coordFields: js.Array[js.Tuple2[x | left | right | width, y | top | bottom | height]],
    grid: GridOptions
  ): CoordFields = {
    val __obj = js.Dynamic.literal(coordFields = coordFields.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordFields]
  }
  
  extension [Self <: CoordFields](x: Self) {
    
    inline def setCoordFields(
      value: js.Array[
          js.Tuple2[
            typingsJapgolly.interactjsTypes.interactjsTypesStrings.x | left | right | width, 
            y | top | bottom | height
          ]
        ]
    ): Self = StObject.set(x, "coordFields", value.asInstanceOf[js.Any])
    
    inline def setCoordFieldsVarargs(
      value: (js.Tuple2[
          typingsJapgolly.interactjsTypes.interactjsTypesStrings.x | left | right | width, 
          y | top | bottom | height
        ])*
    ): Self = StObject.set(x, "coordFields", js.Array(value*))
    
    inline def setGrid(value: GridOptions): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
  }
}
