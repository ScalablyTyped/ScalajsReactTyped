package typingsJapgolly.matterJs.global.Matter

import typingsJapgolly.matterJs.mod.IWorldDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.World")
@js.native
open class World ()
  extends typingsJapgolly.matterJs.mod.World
/* static members */
object World {
  
  @JSGlobal("Matter.World")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(
    world: typingsJapgolly.matterJs.mod.World,
    body: js.Array[
      typingsJapgolly.matterJs.mod.Body | typingsJapgolly.matterJs.mod.Composite | typingsJapgolly.matterJs.mod.Constraint | typingsJapgolly.matterJs.mod.MouseConstraint
    ]
  ): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  /**
    * Add objects or arrays of objects of types: Body, Constraint, Composite
    * @param world
    * @param body
    * @returns world
    */
  inline def add(world: typingsJapgolly.matterJs.mod.World, body: typingsJapgolly.matterJs.mod.Body): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  inline def add(world: typingsJapgolly.matterJs.mod.World, body: typingsJapgolly.matterJs.mod.Composite): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  inline def add(world: typingsJapgolly.matterJs.mod.World, body: typingsJapgolly.matterJs.mod.Constraint): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  inline def add(world: typingsJapgolly.matterJs.mod.World, body: typingsJapgolly.matterJs.mod.MouseConstraint): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  
  /**
    * An alias for Composite.addBody since World is also a Composite
    * @method addBody
    * @param {world} world
    * @param {Body} body
    * @returns {world} The original world with the body added
    */
  inline def addBody(world: typingsJapgolly.matterJs.mod.World, body: typingsJapgolly.matterJs.mod.Body): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("addBody")(world.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  
  /**
    * An alias for Composite.add since World is also a Composite
    * @method addComposite
    * @param {world} world
    * @param {Composite} composite
    * @returns {world} The original world with the objects from composite added
    */
  inline def addComposite(world: typingsJapgolly.matterJs.mod.World, composite: typingsJapgolly.matterJs.mod.Composite): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("addComposite")(world.asInstanceOf[js.Any], composite.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  
  /**
    * An alias for Composite.addConstraint since World is also a Composite
    * @method addConstraint
    * @param {world} world
    * @param {constraint} constraint
    * @returns {world} The original world with the constraint added
    */
  inline def addConstraint(world: typingsJapgolly.matterJs.mod.World, constraint: typingsJapgolly.matterJs.mod.Constraint): typingsJapgolly.matterJs.mod.World = (^.asInstanceOf[js.Dynamic].applyDynamic("addConstraint")(world.asInstanceOf[js.Any], constraint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.World]
  
  /**
    * An alias for Composite.clear since World is also a Composite
    * @method clear
    * @param {world} world
    * @param {boolean} keepStatic
    */
  inline def clear(world: typingsJapgolly.matterJs.mod.World, keepStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clear")(world.asInstanceOf[js.Any], keepStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new world composite. The options parameter is an object that specifies any properties you wish to override the defaults.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @constructor
    * @param {} options
    * @returns {world} A new world
    */
  inline def create(options: IWorldDefinition): typingsJapgolly.matterJs.mod.World = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.matterJs.mod.World]
}
