package typingsJapgolly.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//  --------------------------------------------------------------
//  Types
//  --------------------------------------------------------------
trait CompositeType extends js.Object {
  /**
    * An array of `Body` that are _direct_ children of this composite.
    * To add or remove bodies you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allBodies` method.
    *
    * @property bodies
    * @type body[]
    * @default []
    */
  var bodies: js.Array[BodyType]
  /**
    * An array of `Composite` that are _direct_ children of this composite.
    * To add or remove composites you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allComposites` method.
    *
    * @property composites
    * @type composite[]
    * @default []
    */
  var composites: js.Array[CompositeType]
  /**
    * An array of `Constraint` that are _direct_ children of this composite.
    * To add or remove constraints you should use `Composite.add` and `Composite.remove` methods rather than directly modifying this property.
    * If you wish to recursively find all descendants, you should use the `Composite.allConstraints` method.
    *
    * @property constraints
    * @type constraint[]
    * @default []
    */
  var constraints: js.Array[ConstraintType]
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: Double
  /**
    * A flag that specifies whether the composite has been modified during the current step.
    * Most `Matter.Composite` methods will automatically set this flag to `true` to inform the engine of changes to be handled.
    * If you need to change it manually, you should use the `Composite.setModified` method.
    *
    * @property isModified
    * @type boolean
    * @default false
    */
  var isModified: Boolean
  /**
    * An arbitrary `String` name to help the user identify and manage composites.
    *
    * @property label
    * @type string
    * @default "Composite"
    */
  var label: String
  /**
    * The `Composite` that is the parent of this composite. It is automatically managed by the `Matter.Composite` methods.
    *
    * @property parent
    * @type composite
    * @default null
    */
  var parent: js.UndefOr[CompositeType] = js.undefined
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    * @type {}
    */
  var plugin: js.Any
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "composite"
    */
  var `type`: String
}

object CompositeType {
  @scala.inline
  def apply(
    bodies: js.Array[BodyType],
    composites: js.Array[CompositeType],
    constraints: js.Array[ConstraintType],
    id: Double,
    isModified: Boolean,
    label: String,
    plugin: js.Any,
    `type`: String,
    parent: CompositeType = null
  ): CompositeType = {
    val __obj = js.Dynamic.literal(bodies = bodies.asInstanceOf[js.Any], composites = composites.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositeType]
  }
}

