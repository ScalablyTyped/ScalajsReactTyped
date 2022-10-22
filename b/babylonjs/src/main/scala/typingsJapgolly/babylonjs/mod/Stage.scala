package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Stage")
@js.native
/**
  * Hide ctor from the rest of the world.
  * @param items The items to add.
  */
/* private */ open class Stage[T /* <: js.Function */] ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.Stage[T]
/* static members */
object Stage {
  
  @JSImport("babylonjs", "Stage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Stage.
    * @returns A new instance of a Stage
    */
  inline def Create[T /* <: js.Function */](): typingsJapgolly.babylonjs.sceneComponentMod.Stage[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("Create")().asInstanceOf[typingsJapgolly.babylonjs.sceneComponentMod.Stage[T]]
}
