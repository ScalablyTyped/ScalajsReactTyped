package typingsJapgolly.box2d.Box2D.Dynamics

import japgolly.scalajs.react.Callback
import typingsJapgolly.box2d.Box2D.Collision.b2Manifold
import typingsJapgolly.box2d.Box2D.Dynamics.Contacts.b2Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2ContactListener extends StObject {
  
  /**
    * Called when two fixtures begin to touch.
    * @param contact Contact point.
    **/
  def BeginContact(contact: b2Contact): Unit
  
  /**
    * Called when two fixtures cease to touch.
    * @param contact Contact point.
    **/
  def EndContact(contact: b2Contact): Unit
  
  /**
    * This lets you inspect a contact after the solver is finished. This is useful for inspecting impulses. Note: the contact manifold does not include time of impact impulses, which can be arbitrarily large if the sub-step is small. Hence the impulse is provided explicitly in a separate data structure. Note: this is only called for contacts that are touching, solid, and awake.
    * @param contact Contact point.
    * @param impulse Contact impulse.
    **/
  def PostSolve(contact: b2Contact, impulse: b2ContactImpulse): Unit
  
  /**
    * This is called after a contact is updated. This allows you to inspect a contact before it goes to the solver. If you are careful, you can modify the contact manifold (e.g. disable contact). A copy of the old manifold is provided so that you can detect changes. Note: this is called only for awake bodies. Note: this is called even when the number of contact points is zero. Note: this is not called for sensors. Note: if you set the number of contact points to zero, you will not get an EndContact callback. However, you may get a BeginContact callback the next step.
    * @param contact Contact point.
    * @param oldManifold Old manifold.
    **/
  def PreSolve(contact: b2Contact, oldManifold: b2Manifold): Unit
}
object b2ContactListener {
  
  inline def apply(
    BeginContact: b2Contact => Callback,
    EndContact: b2Contact => Callback,
    PostSolve: (b2Contact, b2ContactImpulse) => Callback,
    PreSolve: (b2Contact, b2Manifold) => Callback
  ): b2ContactListener = {
    val __obj = js.Dynamic.literal(BeginContact = js.Any.fromFunction1((t0: b2Contact) => BeginContact(t0).runNow()), EndContact = js.Any.fromFunction1((t0: b2Contact) => EndContact(t0).runNow()), PostSolve = js.Any.fromFunction2((t0: b2Contact, t1: b2ContactImpulse) => (PostSolve(t0, t1)).runNow()), PreSolve = js.Any.fromFunction2((t0: b2Contact, t1: b2Manifold) => (PreSolve(t0, t1)).runNow()))
    __obj.asInstanceOf[b2ContactListener]
  }
  
  extension [Self <: b2ContactListener](x: Self) {
    
    inline def setBeginContact(value: b2Contact => Callback): Self = StObject.set(x, "BeginContact", js.Any.fromFunction1((t0: b2Contact) => value(t0).runNow()))
    
    inline def setEndContact(value: b2Contact => Callback): Self = StObject.set(x, "EndContact", js.Any.fromFunction1((t0: b2Contact) => value(t0).runNow()))
    
    inline def setPostSolve(value: (b2Contact, b2ContactImpulse) => Callback): Self = StObject.set(x, "PostSolve", js.Any.fromFunction2((t0: b2Contact, t1: b2ContactImpulse) => (value(t0, t1)).runNow()))
    
    inline def setPreSolve(value: (b2Contact, b2Manifold) => Callback): Self = StObject.set(x, "PreSolve", js.Any.fromFunction2((t0: b2Contact, t1: b2Manifold) => (value(t0, t1)).runNow()))
  }
}
