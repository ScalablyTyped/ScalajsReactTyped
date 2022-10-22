package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEventMod.event.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsHookMod {
  
  object hook {
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/hook.hook.HookData, 'Tag', 'EventType' | 'Url'> */
    trait CreateHook extends StObject {
      
      var EventType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsEventMod.event.EventType
      
      var Tag: js.UndefOr[String] = js.undefined
      
      var Url: String
    }
    object CreateHook {
      
      inline def apply(EventType: EventType, Url: String): CreateHook = {
        val __obj = js.Dynamic.literal(EventType = EventType.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
        __obj.asInstanceOf[CreateHook]
      }
      
      extension [Self <: CreateHook](x: Self) {
        
        inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      }
    }
    
    trait HookData
      extends StObject
         with EntityBaseData {
      
      /**
        * The event type
        */
      var EventType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsEventMod.event.EventType
      
      /**
        * Whether the hook is enabled or not
        */
      var Status: HookStatus
      
      /**
        * This is the URL where your receive notification for each EventType
        */
      var Url: String
      
      /**
        * Whether the hook is valid or not
        */
      var Validity: HookValidity
    }
    object HookData {
      
      inline def apply(
        CreationDate: Double,
        EventType: EventType,
        Id: String,
        Status: HookStatus,
        Tag: String,
        Url: String,
        Validity: HookValidity
      ): HookData = {
        val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], EventType = EventType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
        __obj.asInstanceOf[HookData]
      }
      
      extension [Self <: HookData](x: Self) {
        
        inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: HookStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
        
        inline def setValidity(value: HookValidity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISABLED
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ENABLED
    */
    trait HookStatus extends StObject
    object HookStatus {
      
      inline def DISABLED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISABLED = "DISABLED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DISABLED]
      
      inline def ENABLED: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ENABLED = "ENABLED".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ENABLED]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID
    */
    trait HookValidity extends StObject
    object HookValidity {
      
      inline def INVALID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID = "INVALID".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.INVALID]
      
      inline def UNKNOWN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.UNKNOWN]
      
      inline def VALID: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID = "VALID".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALID]
    }
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/hook.hook.HookData, 'EventType' | 'Url' | 'Tag' | 'Status', 'Id'> */
    trait UpdateHook extends StObject {
      
      var EventType: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsEventMod.event.EventType] = js.undefined
      
      var Id: String
      
      var Status: js.UndefOr[HookStatus] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
      
      var Url: js.UndefOr[String] = js.undefined
    }
    object UpdateHook {
      
      inline def apply(Id: String): UpdateHook = {
        val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
        __obj.asInstanceOf[UpdateHook]
      }
      
      extension [Self <: UpdateHook](x: Self) {
        
        inline def setEventType(value: EventType): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
        
        inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: HookStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
      }
    }
  }
}
