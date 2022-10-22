package typingsJapgolly.useGestureCore

import org.scalajs.dom.WheelEvent
import typingsJapgolly.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.useGestureCore.distDeclarationsSrcEnginesCoordinatesEngineMod.CoordinatesEngine
import typingsJapgolly.useGestureCore.useGestureCoreStrings.wheel
import typingsJapgolly.useGestureCore.useGestureCoreStrings.wheeling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesWheelEngineMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/engines/WheelEngine", "WheelEngine")
  @js.native
  open class WheelEngine protected () extends CoordinatesEngine[wheel] {
    def this(ctrl: Controller, args: js.Array[Any], key: wheel) = this()
    
    def bind(bindFunction: Any): Unit = js.native
    
    @JSName("ingKey")
    var ingKey_WheelEngine: wheeling = js.native
    
    def wheel(event: WheelEvent): Unit = js.native
    
    def wheelChange(event: WheelEvent): Unit = js.native
    
    def wheelEnd(): Unit = js.native
  }
}
