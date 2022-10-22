package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.babylonjs.GPURenderPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
@JSGlobal("BABYLON.NodeState")
@js.native
open class NodeState ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NodeState {
  
  /* CompleteClass */
  override def count(): js.Tuple2[Double, Double] = js.native
  
  /* CompleteClass */
  var pipeline: GPURenderPipeline = js.native
  
  /* CompleteClass */
  var values: NumberDictionary[typingsJapgolly.babylonjs.BABYLON.NodeState] = js.native
}
