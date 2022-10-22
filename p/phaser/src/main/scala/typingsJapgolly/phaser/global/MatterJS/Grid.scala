package typingsJapgolly.phaser.global.MatterJS

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.IGridDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Grid` module contains methods for creating and manipulating collision broadphase grid structures.
  *
  * @class Grid
  */
@JSGlobal("MatterJS.Grid")
@js.native
open class Grid ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.Grid
object Grid {
  
  @JSGlobal("MatterJS.Grid")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clears the grid.
    * @method clear
    * @param {grid} grid
    */
  /* static member */
  inline def clear(grid: typingsJapgolly.phaser.MatterJS.Grid): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a new grid.
    * @method create
    * @param {} options
    * @return {grid} A new grid
    */
  /* static member */
  inline def create(): typingsJapgolly.phaser.MatterJS.Grid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.phaser.MatterJS.Grid]
  inline def create(options: IGridDefinition): typingsJapgolly.phaser.MatterJS.Grid = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.MatterJS.Grid]
  
  /**
    * Updates the grid.
    * @method update
    * @param {grid} grid
    * @param {body[]} bodies
    * @param {engine} engine
    * @param {boolean} forceUpdate
    */
  /* static member */
  inline def update(
    grid: typingsJapgolly.phaser.MatterJS.Grid,
    bodies: js.Array[BodyType],
    engine: typingsJapgolly.phaser.MatterJS.Engine,
    forceUpdate: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(grid.asInstanceOf[js.Any], bodies.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], forceUpdate.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
