package typingsJapgolly.reactNativeGestureHandler

import org.scalajs.dom.PointerEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.AdaptedEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod.EventTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptWebToolsPointerEventManagerMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/web/tools/PointerEventManager", JSImport.Default)
  @js.native
  open class default () extends PointerEventManager
  
  @js.native
  trait PointerEventManager
    extends typingsJapgolly.reactNativeGestureHandler.libTypescriptWebToolsEventManagerMod.default {
    
    /* protected */ def mapEvent(event: PointerEvent, eventType: EventTypes): AdaptedEvent = js.native
  }
}
