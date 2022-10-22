package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  **/
@JSGlobal("BABYLON._InstanceDataStorage")
@js.native
open class InstanceDataStorage ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.InstanceDataStorage {
  
  /* CompleteClass */
  var batchCache: typingsJapgolly.babylonjs.BABYLON.InstancesBatch = js.native
  
  /* CompleteClass */
  var batchCacheReplacementModeInFrozenMode: typingsJapgolly.babylonjs.BABYLON.InstancesBatch = js.native
  
  /* CompleteClass */
  var hardwareInstancedRendering: Boolean = js.native
  
  /* CompleteClass */
  var instancesBuffer: Nullable[typingsJapgolly.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var instancesBufferSize: Double = js.native
  
  /* CompleteClass */
  var instancesData: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var instancesPreviousBuffer: Nullable[typingsJapgolly.babylonjs.BABYLON.Buffer] = js.native
  
  /* CompleteClass */
  var instancesPreviousData: js.typedarray.Float32Array = js.native
  
  /* CompleteClass */
  var isFrozen: Boolean = js.native
  
  /* CompleteClass */
  var manualUpdate: Boolean = js.native
  
  /* CompleteClass */
  var masterMeshPreviousWorldMatrix: Nullable[typingsJapgolly.babylonjs.BABYLON.Matrix] = js.native
  
  /* CompleteClass */
  var overridenInstanceCount: Double = js.native
  
  /* CompleteClass */
  var previousBatch: Nullable[typingsJapgolly.babylonjs.BABYLON.InstancesBatch] = js.native
  
  /* CompleteClass */
  var previousManualUpdate: Boolean = js.native
  
  /* CompleteClass */
  var previousRenderId: Double = js.native
  
  /* CompleteClass */
  var sideOrientation: Double = js.native
  
  /* CompleteClass */
  var visibleInstances: Any = js.native
}
