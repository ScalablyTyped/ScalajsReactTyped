package typingsJapgolly.reactNativeDraggableFlatlist

import typingsJapgolly.reactNativeReanimated.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseCellTranslateMod {
  
  @JSImport("react-native-draggable-flatlist/lib/hooks/useCellTranslate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCellTranslate(hasCellIndexCellSizeCellOffset: Params): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("useCellTranslate")(hasCellIndexCellSizeCellOffset.asInstanceOf[js.Any]).asInstanceOf[Value]
  
  trait Params extends StObject {
    
    var cellIndex: Value
    
    var cellOffset: Value
    
    var cellSize: Value
  }
  object Params {
    
    inline def apply(cellIndex: Value, cellOffset: Value, cellSize: Value): Params = {
      val __obj = js.Dynamic.literal(cellIndex = cellIndex.asInstanceOf[js.Any], cellOffset = cellOffset.asInstanceOf[js.Any], cellSize = cellSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setCellIndex(value: Value): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellOffset(value: Value): Self = StObject.set(x, "cellOffset", value.asInstanceOf[js.Any])
      
      inline def setCellSize(value: Value): Self = StObject.set(x, "cellSize", value.asInstanceOf[js.Any])
    }
  }
}
