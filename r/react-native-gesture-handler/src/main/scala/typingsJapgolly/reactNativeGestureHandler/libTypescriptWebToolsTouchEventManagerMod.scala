package typingsJapgolly.reactNativeGestureHandler

import org.scalajs.dom.TouchEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.EventTypes
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.TouchEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsTouchEventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/TouchEventManager", JSImport.Default)
  @js.native
  open class default () extends TouchEventManager
  
  @js.native
  trait TouchEventManager
    extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebToolsEventManagerMod.default {
    
    /* protected */ def mapEvent(event: TouchEvent, eventType: EventTypes, index: Double, touchEventType: TouchEventType): AdaptedEvent = js.native
  }
}
