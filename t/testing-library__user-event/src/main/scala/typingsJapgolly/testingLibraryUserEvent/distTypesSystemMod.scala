package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.std.EventModifierInit
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemKeyboardMod.KeyboardHost
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemPointerMod.PointerHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemMod {
  
  @JSImport("@testing-library/user-event/dist/types/system", "System")
  @js.native
  open class System () extends StObject {
    
    def getUIEventModifiers(): EventModifierInit = js.native
    
    val keyboard: KeyboardHost = js.native
    
    val pointer: PointerHost = js.native
  }
}
