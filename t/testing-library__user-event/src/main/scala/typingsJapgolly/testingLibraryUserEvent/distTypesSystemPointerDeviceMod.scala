package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.std.Set
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemPointerDeviceMod {
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer/device", "Device")
  @js.native
  open class Device () extends StObject {
    
    def addPressed(keyDef: pointerKey): Set[String] = js.native
    
    def countPressed: Double = js.native
    
    def isPressed(keyDef: pointerKey): Boolean = js.native
    
    /* private */ var pressedKeys: Any = js.native
    
    def removePressed(keyDef: pointerKey): Boolean = js.native
  }
}
