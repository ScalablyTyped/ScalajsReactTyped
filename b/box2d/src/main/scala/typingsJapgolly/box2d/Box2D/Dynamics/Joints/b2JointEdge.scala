package typingsJapgolly.box2d.Box2D.Dynamics.Joints

import typingsJapgolly.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Joints.b2JointEdge")
@js.native
class b2JointEdge () extends js.Object {
  /**
  		* The joint.
  		**/
  var joint: b2Joint = js.native
  /**
  		* The next joint edge in the body's joint list.
  		**/
  var next: b2JointEdge = js.native
  /**
  		* Provides quick access to the other body attached.
  		**/
  var other: b2Body = js.native
  /**
  		* The previous joint edge in the body's joint list.
  		**/
  var prev: b2JointEdge = js.native
}

