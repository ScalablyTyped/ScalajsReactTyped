package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.CustomizeFieldListActions event.
  */
trait ASPxClientReportDesignerCustomizeFieldListActionsEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to the current item's available actions.
    */
  var Actions: js.Array[Any]
  
  /**
    * Specifies the Field List's item that is currently being processed.
    */
  var Item: Any
}
object ASPxClientReportDesignerCustomizeFieldListActionsEventArgs {
  
  inline def apply(Actions: js.Array[Any], Item: Any): ASPxClientReportDesignerCustomizeFieldListActionsEventArgs = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerCustomizeFieldListActionsEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerCustomizeFieldListActionsEventArgs](x: Self) {
    
    inline def setActions(value: js.Array[Any]): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Any*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setItem(value: Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
