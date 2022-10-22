package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramDeleteConnectorArgs extends StObject {
  
  /**
    * The processed connector.
    */
  var connector: js.UndefOr[dxDiagramConnector] = js.undefined
}
object dxDiagramDeleteConnectorArgs {
  
  inline def apply(): dxDiagramDeleteConnectorArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramDeleteConnectorArgs]
  }
  
  extension [Self <: dxDiagramDeleteConnectorArgs](x: Self) {
    
    inline def setConnector(value: dxDiagramConnector): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
    
    inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
  }
}
