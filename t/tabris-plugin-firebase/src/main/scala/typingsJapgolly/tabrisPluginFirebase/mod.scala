package typingsJapgolly.tabrisPluginFirebase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tabris.mod.EventObject
import typingsJapgolly.tabris.mod.NativeObject
import typingsJapgolly.tabris.mod.PropertyChangedEvent
import typingsJapgolly.tabrisPluginFirebase.anon.ClearAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    object firebase {
      
      @js.native
      trait Analytics
        extends NativeObject
           with typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics {
        
        def logEvent(eventName: String): Unit = js.native
        def logEvent(eventName: String, parameters: StringDictionary[String]): Unit = js.native
        
        def set(properties: AnalyticsProperties): this.type = js.native
        def set(property: String, value: Any): this.type = js.native
        
        def setUserProperty(propertyName: String, value: String): Unit = js.native
      }
      @JSGlobal("firebase.Analytics")
      @js.native
      val Analytics: typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Analytics = js.native
      
      @js.native
      trait MessageEvent
        extends EventObject[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging] {
        
        var data: Any = js.native
      }
      @JSGlobal("firebase.MessageEvent")
      @js.native
      val MessageEvent: typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.MessageEvent = js.native
      
      @js.native
      trait Messaging extends NativeObject {
        
        val instanceId: String = js.native
        
        val launchData: js.Object = js.native
        
        def off(listeners: MessagingEvents): this.type = js.native
        
        def on(listeners: MessagingEvents): this.type = js.native
        
        def once(listeners: MessagingEvents): this.type = js.native
        
        val pendingMessages: ClearAll = js.native
        
        def requestPermissions(): Unit = js.native
        
        def resetInstanceId(): Unit = js.native
        
        val token: String = js.native
      }
      @JSGlobal("firebase.Messaging")
      @js.native
      val Messaging: typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging = js.native
      
      trait MessagingEvents extends StObject {
        
        var instanceIdChanged: js.UndefOr[
                js.Function1[
                  /* event */ PropertyChangedEvent[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging, String], 
                  Unit
                ]
              ] = js.undefined
        
        var message: js.UndefOr[
                js.Function1[
                  /* event */ typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.MessageEvent, 
                  Unit
                ]
              ] = js.undefined
        
        var tokenChanged: js.UndefOr[
                js.Function1[
                  /* event */ PropertyChangedEvent[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging, String], 
                  Unit
                ]
              ] = js.undefined
      }
      object MessagingEvents {
        
        @JSGlobal("firebase.MessagingEvents")
        @js.native
        val ^ : MessagingEvents = js.native
        
        extension [Self <: MessagingEvents](x: Self) {
          
          inline def setInstanceIdChanged(
            value: /* event */ PropertyChangedEvent[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging, String] => Callback
          ): Self = StObject.set(x, "instanceIdChanged", js.Any.fromFunction1((t0: /* event */ PropertyChangedEvent[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging, String]) => value(t0).runNow()))
          
          inline def setInstanceIdChangedUndefined: Self = StObject.set(x, "instanceIdChanged", js.undefined)
          
          inline def setMessage(
            value: /* event */ typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.MessageEvent => Callback
          ): Self = StObject.set(x, "message", js.Any.fromFunction1((t0: /* event */ typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.MessageEvent) => value(t0).runNow()))
          
          inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
          
          inline def setTokenChanged(
            value: /* event */ PropertyChangedEvent[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging, String] => Callback
          ): Self = StObject.set(x, "tokenChanged", js.Any.fromFunction1((t0: /* event */ PropertyChangedEvent[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.Messaging, String]) => value(t0).runNow()))
          
          inline def setTokenChangedUndefined: Self = StObject.set(x, "tokenChanged", js.undefined)
        }
      }
      
      /* Inlined std.Partial<tabris-plugin-firebase.tabris-plugin-firebase.<global>.firebase.PropertyMixins.Analytics> */
      trait AnalyticsProperties extends StObject {
        
        var analyticsCollectionEnabled: js.UndefOr[Boolean] = js.undefined
        
        var screenName: js.UndefOr[String] = js.undefined
        
        var userId: js.UndefOr[String] = js.undefined
      }
      object AnalyticsProperties {
        
        inline def apply(): AnalyticsProperties = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AnalyticsProperties]
        }
        
        extension [Self <: AnalyticsProperties](x: Self) {
          
          inline def setAnalyticsCollectionEnabled(value: Boolean): Self = StObject.set(x, "analyticsCollectionEnabled", value.asInstanceOf[js.Any])
          
          inline def setAnalyticsCollectionEnabledUndefined: Self = StObject.set(x, "analyticsCollectionEnabled", js.undefined)
          
          inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
          
          inline def setScreenNameUndefined: Self = StObject.set(x, "screenName", js.undefined)
          
          inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          
          inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
        }
      }
      
      object PropertyMixins {
        
        trait Analytics extends StObject {
          
          var analyticsCollectionEnabled: Boolean
          
          var screenName: String
          
          var userId: String
        }
        object Analytics {
          
          inline def apply(analyticsCollectionEnabled: Boolean, screenName: String, userId: String): typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics = {
            val __obj = js.Dynamic.literal(analyticsCollectionEnabled = analyticsCollectionEnabled.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
            __obj.asInstanceOf[typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics]
          }
          
          extension [Self <: typingsJapgolly.tabrisPluginFirebase.mod.global.firebase.PropertyMixins.Analytics](x: Self) {
            
            inline def setAnalyticsCollectionEnabled(value: Boolean): Self = StObject.set(x, "analyticsCollectionEnabled", value.asInstanceOf[js.Any])
            
            inline def setScreenName(value: String): Self = StObject.set(x, "screenName", value.asInstanceOf[js.Any])
            
            inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
