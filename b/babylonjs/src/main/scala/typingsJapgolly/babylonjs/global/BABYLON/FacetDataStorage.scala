package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IndicesArray
import typingsJapgolly.babylonjs.anon.Ind
import typingsJapgolly.babylonjs.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
@JSGlobal("BABYLON._FacetDataStorage")
@js.native
open class FacetDataStorage ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.FacetDataStorage {
  
  /* CompleteClass */
  var bbSize: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  var depthSortedFacets: js.Array[Ind] = js.native
  
  /* CompleteClass */
  var depthSortedIndices: IndicesArray = js.native
  
  /* CompleteClass */
  var facetDataEnabled: Boolean = js.native
  
  /* CompleteClass */
  var facetDepthSort: Boolean = js.native
  
  /* CompleteClass */
  var facetDepthSortEnabled: Boolean = js.native
  
  /* CompleteClass */
  var facetDepthSortFrom: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  override def facetDepthSortFunction(f1: Ind, f2: Ind): Double = js.native
  
  /* CompleteClass */
  var facetDepthSortOrigin: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  var facetNb: Double = js.native
  
  /* CompleteClass */
  var facetNormals: js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3] = js.native
  
  /* CompleteClass */
  var facetParameters: Any = js.native
  
  /* CompleteClass */
  var facetPartitioning: js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var facetPositions: js.Array[typingsJapgolly.babylonjs.BABYLON.Vector3] = js.native
  
  /* CompleteClass */
  var invertedMatrix: typingsJapgolly.babylonjs.BABYLON.Matrix = js.native
  
  /* CompleteClass */
  var partitioningBBoxRatio: Double = js.native
  
  /* CompleteClass */
  var partitioningSubdivisions: Double = js.native
  
  /* CompleteClass */
  var subDiv: Max = js.native
}
