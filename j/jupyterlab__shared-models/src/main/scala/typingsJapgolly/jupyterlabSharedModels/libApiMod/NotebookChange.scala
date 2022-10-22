package typingsJapgolly.jupyterlabSharedModels.libApiMod

import typingsJapgolly.jupyterlabSharedModels.anon.Delete
import typingsJapgolly.jupyterlabSharedModels.anon.Name
import typingsJapgolly.jupyterlabSharedModels.anon.NewValueOldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookChange extends StObject {
  
  var cellsChange: js.UndefOr[Delta[js.Array[ISharedCell]]] = js.undefined
  
  var contextChange: js.UndefOr[MapChange] = js.undefined
  
  var metadataChange: js.UndefOr[NewValueOldValue] = js.undefined
  
  var stateChange: js.UndefOr[js.Array[Name]] = js.undefined
}
object NotebookChange {
  
  inline def apply(): NotebookChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookChange]
  }
  
  extension [Self <: NotebookChange](x: Self) {
    
    inline def setCellsChange(value: Delta[js.Array[ISharedCell]]): Self = StObject.set(x, "cellsChange", value.asInstanceOf[js.Any])
    
    inline def setCellsChangeUndefined: Self = StObject.set(x, "cellsChange", js.undefined)
    
    inline def setCellsChangeVarargs(value: Delete[js.Array[ISharedCell]]*): Self = StObject.set(x, "cellsChange", js.Array(value*))
    
    inline def setContextChange(value: MapChange): Self = StObject.set(x, "contextChange", value.asInstanceOf[js.Any])
    
    inline def setContextChangeUndefined: Self = StObject.set(x, "contextChange", js.undefined)
    
    inline def setMetadataChange(value: NewValueOldValue): Self = StObject.set(x, "metadataChange", value.asInstanceOf[js.Any])
    
    inline def setMetadataChangeUndefined: Self = StObject.set(x, "metadataChange", js.undefined)
    
    inline def setStateChange(value: js.Array[Name]): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    inline def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
    
    inline def setStateChangeVarargs(value: Name*): Self = StObject.set(x, "stateChange", js.Array(value*))
  }
}
