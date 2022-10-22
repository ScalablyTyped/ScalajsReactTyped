package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.testingLibraryUserEvent.distTypesSetupSetupMod.Instance
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemMod.System
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemPointerSharedMod.PointerPosition
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import typingsJapgolly.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemPointerMod {
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer", "PointerHost")
  @js.native
  open class PointerHost protected () extends StObject {
    def this(system: System) = this()
    
    /* private */ val buttons: Any = js.native
    
    /* private */ val devices: Any = js.native
    
    def getMouseTarget(instance: Instance): Element = js.native
    
    def getPointerName(keyDef: pointerKey): String = js.native
    
    def getPreviousPosition(pointerName: String): js.UndefOr[PointerPosition] = js.native
    
    def isKeyPressed(keyDef: pointerKey): Boolean = js.native
    
    /* private */ val mouse: Any = js.native
    
    def move(instance: Instance, pointerName: String, position: PointerPosition): js.Promise[Unit] = js.native
    
    /* private */ val pointers: Any = js.native
    
    def press(instance: Instance, keyDef: pointerKey, position: PointerPosition): js.Promise[Unit] = js.native
    
    def release(instance: Instance, keyDef: pointerKey, position: PointerPosition): js.Promise[Unit] = js.native
    
    def resetClickCount(): Unit = js.native
    
    def setMousePosition(position: PointerPosition): Unit = js.native
    
    val system: System = js.native
  }
}
