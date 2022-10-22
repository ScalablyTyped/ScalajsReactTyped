package typingsJapgolly.useGestureCore

import org.scalajs.dom.UIEvent
import typingsJapgolly.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.useGestureCore.distDeclarationsSrcEnginesEngineMod.Engine
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.CoordinatesKey
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesUtilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcEnginesCoordinatesEngineMod {
  
  /* note: abstract class */ @JSImport("@use-gesture/core/dist/declarations/src/engines/CoordinatesEngine", "CoordinatesEngine")
  @js.native
  open class CoordinatesEngine[Key /* <: CoordinatesKey */] protected () extends Engine[Key] {
    def this(ctrl: Controller, args: js.Array[Any], key: Key) = this()
    
    @JSName("axisIntent")
    def axisIntent_MCoordinatesEngine(): Unit = js.native
    @JSName("axisIntent")
    def axisIntent_MCoordinatesEngine(event: UIEvent): Unit = js.native
    
    @JSName("init")
    def init_MCoordinatesEngine(): Unit = js.native
    
    @JSName("restrictToAxis")
    def restrictToAxis_MCoordinatesEngine(v: Vector2): Unit = js.native
  }
}
