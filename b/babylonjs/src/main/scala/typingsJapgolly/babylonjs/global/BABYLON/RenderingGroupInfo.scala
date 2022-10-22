package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RenderingGroupInfo")
@js.native
open class RenderingGroupInfo ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.RenderingGroupInfo {
  
  /**
    * The camera currently used for the rendering pass
    */
  /* CompleteClass */
  var camera: Nullable[typingsJapgolly.babylonjs.BABYLON.Camera] = js.native
  
  /**
    * The ID of the renderingGroup being processed
    */
  /* CompleteClass */
  var renderingGroupId: Double = js.native
  
  /**
    * The Scene that being rendered
    */
  /* CompleteClass */
  var scene: typingsJapgolly.babylonjs.BABYLON.Scene = js.native
}
