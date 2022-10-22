package typingsJapgolly.useGestureCore

import org.scalajs.dom.PointerEvent
import typingsJapgolly.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.useGestureCore.distDeclarationsSrcEnginesCoordinatesEngineMod.CoordinatesEngine
import typingsJapgolly.useGestureCore.useGestureCoreStrings.move
import typingsJapgolly.useGestureCore.useGestureCoreStrings.moving
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesMoveEngineMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/engines/MoveEngine", "MoveEngine")
  @js.native
  open class MoveEngine protected () extends CoordinatesEngine[move] {
    def this(ctrl: Controller, args: js.Array[Any], key: move) = this()
    
    def bind(bindFunction: Any): Unit = js.native
    
    @JSName("ingKey")
    var ingKey_MoveEngine: moving = js.native
    
    def move(event: PointerEvent): Unit = js.native
    
    def moveChange(event: PointerEvent): Unit = js.native
    
    def moveEnd(): Unit = js.native
    def moveEnd(event: PointerEvent): Unit = js.native
    
    def moveStart(event: PointerEvent): Unit = js.native
  }
}
