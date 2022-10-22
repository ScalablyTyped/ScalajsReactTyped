package typingsJapgolly.phaser.MatterJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.MouseConstraint` module contains methods for creating mouse constraints.
  * Mouse constraints are used for allowing user interaction, providing the ability to move bodies via the mouse or touch.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class MouseConstraint
  */
trait MouseConstraint extends StObject {
  
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: BodyType
  
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: ICollisionFilter
  
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: ConstraintType
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: String
}
object MouseConstraint {
  
  inline def apply(body: BodyType, collisionFilter: ICollisionFilter, constraint: ConstraintType, `type`: String): MouseConstraint = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], collisionFilter = collisionFilter.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseConstraint]
  }
  
  extension [Self <: MouseConstraint](x: Self) {
    
    inline def setBody(value: BodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCollisionFilter(value: ICollisionFilter): Self = StObject.set(x, "collisionFilter", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: ConstraintType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
