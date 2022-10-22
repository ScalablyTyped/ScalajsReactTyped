package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  **/
@JSGlobal("BABYLON._ThinInstanceDataStorage")
@js.native
open class ThinInstanceDataStorage ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.ThinInstanceDataStorage {
  
  /* CompleteClass */
  var boundingVectors: js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3] = js.native
  
  /* CompleteClass */
  var instancesCount: Double = js.native
  
  /* CompleteClass */
  var masterMeshPreviousWorldMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix] = js.native
  
  /* CompleteClass */
  var matrixBuffer: Nullable[typingsJapgolly.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var matrixBufferSize: Double = js.native
  
  /* CompleteClass */
  var matrixData: Nullable[js.typedarray.Float32Array] = js.native
  
  /* CompleteClass */
  var previousMatrixBuffer: Nullable[typingsJapgolly.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var previousMatrixData: Nullable[js.typedarray.Float32Array] = js.native
  
  /* CompleteClass */
  var worldMatrices: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.Matrix]] = js.native
}
