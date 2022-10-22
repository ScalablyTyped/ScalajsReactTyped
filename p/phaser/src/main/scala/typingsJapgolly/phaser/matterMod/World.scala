package typingsJapgolly.phaser.matterMod

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.CompositeType
import typingsJapgolly.phaser.MatterJS.ConstraintType
import typingsJapgolly.phaser.MatterJS.Gravity
import typingsJapgolly.phaser.MatterJS.IWorldDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.World` module contains methods for creating and manipulating the world composite.
  * A `Matter.World` is a `Matter.Composite` body, which is a collection of `Matter.Body`, `Matter.Constraint` and other `Matter.Composite`.
  * A `Matter.World` has a few additional properties including `gravity` and `bounds`.
  * It is important to use the functions in the `Matter.Composite` module to modify the world composite, rather than directly modifying its properties.
  * There are also a few methods here that alias those in `Matter.Composite` for easier readability.
  *
  * See the included usage [examples](https://github.com/liabru/matter-js/tree/master/examples).
  *
  * @class World
  * @extends Composite
  */
@JSImport("matter", "World")
@js.native
open class World ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.World {
  
  /* CompleteClass */
  var bounds: typingsJapgolly.phaser.MatterJS.Bounds = js.native
  
  /* CompleteClass */
  var gravity: Gravity = js.native
}
object World {
  
  @JSImport("matter", "World")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(
    world: typingsJapgolly.phaser.MatterJS.World,
    body: js.Array[BodyType | CompositeType | ConstraintType]
  ): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  /**
    * Add objects or arrays of objects of types: Body, Constraint, Composite
    * @param world
    * @param body
    * @returns world
    */
  /* static member */
  inline def add(world: typingsJapgolly.phaser.MatterJS.World, body: BodyType): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  inline def add(world: typingsJapgolly.phaser.MatterJS.World, body: CompositeType): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  inline def add(world: typingsJapgolly.phaser.MatterJS.World, body: ConstraintType): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  inline def add(
    world: typingsJapgolly.phaser.MatterJS.World,
    body: typingsJapgolly.phaser.MatterJS.MouseConstraint
  ): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  
  /**
    * An alias for Composite.addBody since World is also a Composite
    * @method addBody
    * @param {world} world
    * @param {body} body
    * @return {world} The original world with the body added
    */
  /* static member */
  inline def addBody(world: typingsJapgolly.phaser.MatterJS.World, body: BodyType): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("addBody")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  
  /**
    * An alias for Composite.add since World is also a Composite
    * @method addComposite
    * @param {world} world
    * @param {composite} composite
    * @return {world} The original world with the objects from composite added
    */
  /* static member */
  inline def addComposite(world: typingsJapgolly.phaser.MatterJS.World, composite: CompositeType): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("addComposite")(world.asInstanceOf[js.Any], composite.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  
  /**
    * An alias for Composite.addConstraint since World is also a Composite
    * @method addConstraint
    * @param {world} world
    * @param {constraint} constraint
    * @return {world} The original world with the constraint added
    */
  /* static member */
  inline def addConstraint(world: typingsJapgolly.phaser.MatterJS.World, constraint: ConstraintType): typingsJapgolly.phaser.MatterJS.World = (^.asInstanceOf[js.Dynamic].applyDynamic("addConstraint")(world.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
  
  /**
    * An alias for Composite.clear since World is also a Composite
    * @method clear
    * @param {world} world
    * @param {boolean} keepStatic
    */
  /* static member */
  inline def clear(world: typingsJapgolly.phaser.MatterJS.World, keepStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(world.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new world composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @constructor
    * @param {} options
    * @return {world} A new world
    */
  /* static member */
  inline def create(options: IWorldDefinition): typingsJapgolly.phaser.MatterJS.World = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.World]
}
