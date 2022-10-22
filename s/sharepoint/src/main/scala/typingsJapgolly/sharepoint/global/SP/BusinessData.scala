package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BusinessData {
  
  @JSGlobal("SP.BusinessData.AppBdcCatalog")
  @js.native
  open class AppBdcCatalog ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.AppBdcCatalog
  
  @JSGlobal("SP.BusinessData.Entity")
  @js.native
  open class Entity ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.Entity
  
  @JSGlobal("SP.BusinessData.EntityField")
  @js.native
  open class EntityField ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.EntityField
  
  @JSGlobal("SP.BusinessData.EntityIdentifier")
  @js.native
  open class EntityIdentifier ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.EntityIdentifier
  
  @JSGlobal("SP.BusinessData.EntityView")
  @js.native
  open class EntityView ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.EntityView
  
  @JSGlobal("SP.BusinessData.Filter")
  @js.native
  open class Filter ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.Filter
  
  object Infrastructure {
    
    @JSGlobal("SP.BusinessData.Infrastructure.ExternalSubscriptionStore")
    @js.native
    open class ExternalSubscriptionStore protected ()
      extends StObject
         with typingsJapgolly.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore {
      def this(
        context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
        web: typingsJapgolly.sharepoint.SP.Web
      ) = this()
    }
    object ExternalSubscriptionStore {
      
      @JSGlobal("SP.BusinessData.Infrastructure.ExternalSubscriptionStore")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def newObject(
        context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
        web: typingsJapgolly.sharepoint.SP.Web
      ): typingsJapgolly.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore = (^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BusinessData.Infrastructure.ExternalSubscriptionStore]
    }
  }
  
  @JSGlobal("SP.BusinessData.LobSystem")
  @js.native
  open class LobSystem ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.LobSystem
  
  @JSGlobal("SP.BusinessData.LobSystemInstance")
  @js.native
  open class LobSystemInstance ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.LobSystemInstance
  
  @JSGlobal("SP.BusinessData.MethodExecutionResult")
  @js.native
  open class MethodExecutionResult ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.MethodExecutionResult
  
  object Runtime {
    
    @JSGlobal("SP.BusinessData.Runtime.EntityEventType")
    @js.native
    object EntityEventType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityEventType & Double] = js.native
      
      /* 1 */ val itemAdded: typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemAdded & Double = js.native
      
      /* 3 */ val itemDeleted: typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemDeleted & Double = js.native
      
      /* 2 */ val itemUpdated: typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityEventType.itemUpdated & Double = js.native
      
      /* 0 */ val none: typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityEventType.none & Double = js.native
    }
    
    @JSGlobal("SP.BusinessData.Runtime.EntityFieldValueDictionary")
    @js.native
    open class EntityFieldValueDictionary ()
      extends StObject
         with typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityFieldValueDictionary
    
    @JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
    @js.native
    open class EntityIdentity protected ()
      extends StObject
         with typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityIdentity {
      def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, identifierValues: js.Array[Any]) = this()
    }
    object EntityIdentity {
      
      @JSGlobal("SP.BusinessData.Runtime.EntityIdentity")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def newObject(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, identifierValues: js.Array[Any]): typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityIdentity = (^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any], identifierValues.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityIdentity]
    }
    
    @JSGlobal("SP.BusinessData.Runtime.EntityInstance")
    @js.native
    open class EntityInstance ()
      extends StObject
         with typingsJapgolly.sharepoint.SP.BusinessData.Runtime.EntityInstance
    
    @JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
    @js.native
    open class NotificationCallback protected ()
      extends StObject
         with typingsJapgolly.sharepoint.SP.BusinessData.Runtime.NotificationCallback {
      def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, notificationEndpoint: String) = this()
    }
    object NotificationCallback {
      
      @JSGlobal("SP.BusinessData.Runtime.NotificationCallback")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def newObject(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, notificationEndpoint: String): typingsJapgolly.sharepoint.SP.BusinessData.Runtime.NotificationCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any], notificationEndpoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BusinessData.Runtime.NotificationCallback]
    }
    
    @JSGlobal("SP.BusinessData.Runtime.Subscription")
    @js.native
    open class Subscription protected ()
      extends StObject
         with typingsJapgolly.sharepoint.SP.BusinessData.Runtime.Subscription {
      def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, id: Any, hash: String) = this()
    }
    object Subscription {
      
      @JSGlobal("SP.BusinessData.Runtime.Subscription")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def newObject(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, id: Any, hash: String): typingsJapgolly.sharepoint.SP.BusinessData.Runtime.Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any], id.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BusinessData.Runtime.Subscription]
    }
  }
  
  @JSGlobal("SP.BusinessData.TypeDescriptor")
  @js.native
  open class TypeDescriptor ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.BusinessData.TypeDescriptor
}
