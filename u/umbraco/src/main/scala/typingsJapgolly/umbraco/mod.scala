package typingsJapgolly.umbraco

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object resources {
    
    /**
      * Can be Ascending or Descending - Default: Ascending
      */
    @JSImport("umbraco", "resources.Direction")
    @js.native
    object Direction extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.umbraco.umbraco.resources.Direction & Double] = js.native
      
      /* 0 */ val Ascending: typingsJapgolly.umbraco.umbraco.resources.Direction.Ascending & Double = js.native
      
      /* 1 */ val Descending: typingsJapgolly.umbraco.umbraco.resources.Direction.Descending & Double = js.native
    }
    
    /**
      * LogType
      */
    @JSImport("umbraco", "resources.LogType")
    @js.native
    object LogType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.umbraco.umbraco.resources.LogType & Double] = js.native
      
      /* 0 */ val Debug: typingsJapgolly.umbraco.umbraco.resources.LogType.Debug & Double = js.native
      
      /* 1 */ val Info: typingsJapgolly.umbraco.umbraco.resources.LogType.Info & Double = js.native
    }
    
    /**
      * Property to order items by, default: `SortOrder`
      */
    @JSImport("umbraco", "resources.OrderItemsBy")
    @js.native
    object OrderItemsBy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.umbraco.umbraco.resources.OrderItemsBy & Double] = js.native
      
      /* 0 */ val SortOrder: typingsJapgolly.umbraco.umbraco.resources.OrderItemsBy.SortOrder & Double = js.native
    }
    
    trait IResourcePromise extends StObject {
      
      var data: Any
      
      var errorMsg: String
      
      var status: Double
    }
    object IResourcePromise {
      
      inline def apply(data: Any, errorMsg: String, status: Double): IResourcePromise = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errorMsg = errorMsg.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[IResourcePromise]
      }
      
      extension [Self <: IResourcePromise](x: Self) {
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setErrorMsg(value: String): Self = StObject.set(x, "errorMsg", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object services {
    
    /**
      * Notification Type
      */
    @JSImport("umbraco", "services.NotificationType")
    @js.native
    object NotificationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.umbraco.umbraco.services.NotificationType & Double] = js.native
      
      /* 1 */ val error: typingsJapgolly.umbraco.umbraco.services.NotificationType.error & Double = js.native
      
      /* 3 */ val info: typingsJapgolly.umbraco.umbraco.services.NotificationType.info & Double = js.native
      
      /* 0 */ val success: typingsJapgolly.umbraco.umbraco.services.NotificationType.success & Double = js.native
      
      /* 2 */ val warning: typingsJapgolly.umbraco.umbraco.services.NotificationType.warning & Double = js.native
    }
  }
}
