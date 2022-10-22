package typingsJapgolly.box2d.global.Box2D.Dynamics

import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2ContactImpulse")
@js.native
open class b2ContactImpulse ()
  extends StObject
     with typingsJapgolly.box2d.Box2D.Dynamics.b2ContactImpulse {
  
  /**
    * Normal impulses.
    **/
  /* CompleteClass */
  var normalImpulses: b2Vec2 = js.native
  
  /**
    * Tangent impulses.
    **/
  /* CompleteClass */
  var tangentImpulses: b2Vec2 = js.native
}
