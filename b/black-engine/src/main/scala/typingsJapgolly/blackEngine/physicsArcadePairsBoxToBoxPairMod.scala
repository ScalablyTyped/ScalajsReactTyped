package typingsJapgolly.blackEngine

import typingsJapgolly.blackEngine.collidersBoxColliderMod.BoxCollider
import typingsJapgolly.blackEngine.physicsArcadePairsPairMod.Pair
import typingsJapgolly.blackEngine.physicsRigidBodyMod.RigidBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsArcadePairsBoxToBoxPairMod {
  
  @JSImport("black-engine/physics/arcade/pairs/BoxToBoxPair", "BoxToBoxPair")
  @js.native
  open class BoxToBoxPair () extends Pair {
    
    /* private */ var __refreshProjectionsRanges: Any = js.native
    
    /* private */ var mProjections: Any = js.native
    
    def set(a: BoxCollider, b: BoxCollider, bodyA: RigidBody, bodyB: RigidBody): Pair = js.native
  }
}
