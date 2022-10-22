package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MeshLODLevel")
@js.native
open class MeshLODLevel protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MeshLODLevel {
  /**
    * Creates a new LOD level
    * @param distanceOrScreenCoverage defines either the distance or the screen coverage where this level should start being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Either distance from the center of the object to show this level or the screen coverage if `useLODScreenCoverage` is set to `true` on the mesh*/
  distanceOrScreenCoverage: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh]
  ) = this()
  
  /** Either distance from the center of the object to show this level or the screen coverage if `useLODScreenCoverage` is set to `true` on the mesh*/
  /* CompleteClass */
  var distanceOrScreenCoverage: Double = js.native
  
  /** Defines the mesh to use to render this level */
  /* CompleteClass */
  var mesh: Nullable[typingsJapgolly.babylonjs.BABYLON.Mesh] = js.native
}
