package typingsJapgolly.box2d.Box2D.Dynamics

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Collision.Shapes.b2Shape
import typingsJapgolly.box2d.Box2D.Collision.b2ContactID
import typingsJapgolly.box2d.Box2D.Collision.b2Manifold
import typingsJapgolly.box2d.Box2D.Collision.b2WorldManifold
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Contacts {
  
  trait b2Contact extends StObject {
    
    /**
      * Flag this contact for filtering. Filtering will occur the next time step.
      **/
    def FlagForFiltering(): Unit
    
    /**
      * Get the first fixture in this contact.
      * @return First fixture in this contact.
      **/
    def GetFixtureA(): b2Fixture
    
    /**
      * Get the second fixture in this contact.
      * @return Second fixture in this contact.
      **/
    def GetFixtureB(): b2Fixture
    
    /**
      * Get the contact manifold. Do not modify the manifold unless you understand the internals of Box2D.
      * @return Contact manifold.
      **/
    def GetManifold(): b2Manifold
    
    /**
      * Get the next contact in the world's contact list.
      * @return Next contact in the world's contact list.
      **/
    def GetNext(): b2Contact
    
    /**
      * Get the world manifold.
      * @param worldManifold World manifold out.
      * @return World manifold.
      **/
    def GetWorldManifold(worldManifold: b2WorldManifold): Unit
    
    /**
      * Does this contact generate TOI events for continuous simulation.
      * @return True for continous, otherwise false.
      **/
    def IsContinuous(): Boolean
    
    /**
      * Has this contact been disabled?
      * @return True if disabled, otherwise false.
      **/
    def IsEnabled(): Boolean
    
    /**
      * Is this contact a sensor?
      * @return True if sensor, otherwise false.
      **/
    def IsSensor(): Boolean
    
    /**
      * Is this contact touching.
      * @return True if contact is touching, otherwise false.
      **/
    def IsTouching(): Boolean
    
    /**
      * Enable/disable this contact. This can be used inside the pre-solve contact listener. The contact is only disabled for the current time step (or sub-step in continuous collision).
      * @param flag True to enable, false to disable.
      **/
    def SetEnabled(flag: Boolean): Unit
    
    /**
      * Change this to be a sensor or-non-sensor contact.
      * @param sensor True to be sensor, false to not be a sensor.
      **/
    def SetSensor(sensor: Boolean): Unit
  }
  object b2Contact {
    
    inline def apply(
      FlagForFiltering: Callback,
      GetFixtureA: CallbackTo[b2Fixture],
      GetFixtureB: CallbackTo[b2Fixture],
      GetManifold: CallbackTo[b2Manifold],
      GetNext: CallbackTo[b2Contact],
      GetWorldManifold: b2WorldManifold => Callback,
      IsContinuous: CallbackTo[Boolean],
      IsEnabled: CallbackTo[Boolean],
      IsSensor: CallbackTo[Boolean],
      IsTouching: CallbackTo[Boolean],
      SetEnabled: Boolean => Callback,
      SetSensor: Boolean => Callback
    ): b2Contact = {
      val __obj = js.Dynamic.literal(FlagForFiltering = FlagForFiltering.toJsFn, GetFixtureA = GetFixtureA.toJsFn, GetFixtureB = GetFixtureB.toJsFn, GetManifold = GetManifold.toJsFn, GetNext = GetNext.toJsFn, GetWorldManifold = js.Any.fromFunction1((t0: b2WorldManifold) => GetWorldManifold(t0).runNow()), IsContinuous = IsContinuous.toJsFn, IsEnabled = IsEnabled.toJsFn, IsSensor = IsSensor.toJsFn, IsTouching = IsTouching.toJsFn, SetEnabled = js.Any.fromFunction1((t0: Boolean) => SetEnabled(t0).runNow()), SetSensor = js.Any.fromFunction1((t0: Boolean) => SetSensor(t0).runNow()))
      __obj.asInstanceOf[b2Contact]
    }
    
    extension [Self <: b2Contact](x: Self) {
      
      inline def setFlagForFiltering(value: Callback): Self = StObject.set(x, "FlagForFiltering", value.toJsFn)
      
      inline def setGetFixtureA(value: CallbackTo[b2Fixture]): Self = StObject.set(x, "GetFixtureA", value.toJsFn)
      
      inline def setGetFixtureB(value: CallbackTo[b2Fixture]): Self = StObject.set(x, "GetFixtureB", value.toJsFn)
      
      inline def setGetManifold(value: CallbackTo[b2Manifold]): Self = StObject.set(x, "GetManifold", value.toJsFn)
      
      inline def setGetNext(value: CallbackTo[b2Contact]): Self = StObject.set(x, "GetNext", value.toJsFn)
      
      inline def setGetWorldManifold(value: b2WorldManifold => Callback): Self = StObject.set(x, "GetWorldManifold", js.Any.fromFunction1((t0: b2WorldManifold) => value(t0).runNow()))
      
      inline def setIsContinuous(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsContinuous", value.toJsFn)
      
      inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsEnabled", value.toJsFn)
      
      inline def setIsSensor(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsSensor", value.toJsFn)
      
      inline def setIsTouching(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsTouching", value.toJsFn)
      
      inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "SetEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetSensor(value: Boolean => Callback): Self = StObject.set(x, "SetSensor", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  trait b2ContactEdge extends StObject {
    
    /**
      * Contact.
      **/
    var contact: b2Contact
    
    /**
      * Next contact edge.
      **/
    var next: b2ContactEdge
    
    /**
      * Contact body.
      **/
    var other: b2Body
    
    /**
      * Previous contact edge.
      **/
    var prev: b2ContactEdge
  }
  object b2ContactEdge {
    
    inline def apply(contact: b2Contact, next: b2ContactEdge, other: b2Body, prev: b2ContactEdge): b2ContactEdge = {
      val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ContactEdge]
    }
    
    extension [Self <: b2ContactEdge](x: Self) {
      
      inline def setContact(value: b2Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setNext(value: b2ContactEdge): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setOther(value: b2Body): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: b2ContactEdge): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
  
  trait b2ContactResult extends StObject {
    
    /**
      * The contact id identifies the features in contact.
      **/
    var id: b2ContactID
    
    /**
      * Points from shape1 to shape2.
      **/
    var normal: b2Vec2
    
    /**
      * The normal impulse applied to body2.
      **/
    var normalImpulse: Double
    
    /**
      * Position in world coordinates.
      **/
    var position: b2Vec2
    
    /**
      * The first shape.
      **/
    var shape1: b2Shape
    
    /**
      * The second shape.
      **/
    var shape2: b2Shape
    
    /**
      * The tangent impulse applied to body2.
      **/
    var tangentImpulse: Double
  }
  object b2ContactResult {
    
    inline def apply(
      id: b2ContactID,
      normal: b2Vec2,
      normalImpulse: Double,
      position: b2Vec2,
      shape1: b2Shape,
      shape2: b2Shape,
      tangentImpulse: Double
    ): b2ContactResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalImpulse = normalImpulse.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shape1 = shape1.asInstanceOf[js.Any], shape2 = shape2.asInstanceOf[js.Any], tangentImpulse = tangentImpulse.asInstanceOf[js.Any])
      __obj.asInstanceOf[b2ContactResult]
    }
    
    extension [Self <: b2ContactResult](x: Self) {
      
      inline def setId(value: b2ContactID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: b2Vec2): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setNormalImpulse(value: Double): Self = StObject.set(x, "normalImpulse", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: b2Vec2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setShape1(value: b2Shape): Self = StObject.set(x, "shape1", value.asInstanceOf[js.Any])
      
      inline def setShape2(value: b2Shape): Self = StObject.set(x, "shape2", value.asInstanceOf[js.Any])
      
      inline def setTangentImpulse(value: Double): Self = StObject.set(x, "tangentImpulse", value.asInstanceOf[js.Any])
    }
  }
}
