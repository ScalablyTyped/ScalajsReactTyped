package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LineEdgesRenderer")
@js.native
open class LineEdgesRenderer protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.LineEdgesRenderer {
  /**
    * This constructor turns off auto generating edges line in Edges Renderer to make it here.
    * @param  source LineMesh used to generate edges
    * @param  epsilon not important (specified angle for edge detection)
    * @param  checkVerticesInsteadOfIndices not important for LineMesh
    */
  def this(source: typingsJapgolly.babylonjs.BABYLON.AbstractMesh) = this()
  def this(source: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, epsilon: Double) = this()
  def this(
    source: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    epsilon: Double,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  def this(
    source: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    epsilon: Unit,
    checkVerticesInsteadOfIndices: Boolean
  ) = this()
  
  /**
    * List of instances to render in case the source mesh has instances
    */
  /* CompleteClass */
  var customInstances: typingsJapgolly.babylonjs.BABYLON.SmartArray[typingsJapgolly.babylonjs.BABYLON.Matrix] = js.native
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  /* CompleteClass */
  var isEnabled: Boolean = js.native
  
  /**
    * Checks whether or not the edges renderer is ready to render.
    * @returns true if ready, otherwise false.
    */
  /* CompleteClass */
  override def isReady(): Boolean = js.native
  
  /**
    * Renders the edges of the attached mesh,
    */
  /* CompleteClass */
  override def render(): Unit = js.native
}
