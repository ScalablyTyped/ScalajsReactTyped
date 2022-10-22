package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneInstrumentation")
@js.native
open class SceneInstrumentation protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.SceneInstrumentation {
  /**
    * Instantiates a new scene instrumentation.
    * This class can be used to get instrumentation data from a Babylon engine
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene#sceneinstrumentation
    * @param scene Defines the scene to instrument
    */
  def this(/**
    * Defines the scene to instrument
    */
  scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
