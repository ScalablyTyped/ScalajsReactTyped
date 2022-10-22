package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.coreComponentMod.Component
import typingsJapgolly.blackEngine.geomMatrixMod.Matrix
import typingsJapgolly.blackEngine.geomVectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collidersColliderMod {
  
  @JSImport("black-engine/colliders/Collider", "Collider")
  @js.native
  open class Collider () extends Component {
    
    def containsPoint(point: Vector): Boolean = js.native
    
    /* private */ var mCenter: Any = js.native
    
    /* private */ var mChanged: Any = js.native
    
    /* private */ var mMax: Any = js.native
    
    /* private */ var mMin: Any = js.native
    
    def refresh(transform: Matrix, position: Vector): Unit = js.native
  }
}
