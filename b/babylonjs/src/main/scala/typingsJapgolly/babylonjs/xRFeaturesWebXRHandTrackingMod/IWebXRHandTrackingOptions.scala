package typingsJapgolly.babylonjs.xRFeaturesWebXRHandTrackingMod

import typingsJapgolly.babylonjs.anon.CustomColors
import typingsJapgolly.babylonjs.anon.EnablePhysics
import typingsJapgolly.babylonjs.xRWebXRInputMod.WebXRInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRHandTrackingOptions extends StObject {
  
  /**
    * Configuration object for the hand meshes.
    */
  var handMeshes: js.UndefOr[CustomColors] = js.undefined
  
  /**
    * Configuration object for the joint meshes.
    */
  var jointMeshes: js.UndefOr[EnablePhysics] = js.undefined
  
  /**
    * The xrInput that will be used as source for new hands
    */
  var xrInput: WebXRInput
}
object IWebXRHandTrackingOptions {
  
  inline def apply(xrInput: WebXRInput): IWebXRHandTrackingOptions = {
    val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHandTrackingOptions]
  }
  
  extension [Self <: IWebXRHandTrackingOptions](x: Self) {
    
    inline def setHandMeshes(value: CustomColors): Self = StObject.set(x, "handMeshes", value.asInstanceOf[js.Any])
    
    inline def setHandMeshesUndefined: Self = StObject.set(x, "handMeshes", js.undefined)
    
    inline def setJointMeshes(value: EnablePhysics): Self = StObject.set(x, "jointMeshes", value.asInstanceOf[js.Any])
    
    inline def setJointMeshesUndefined: Self = StObject.set(x, "jointMeshes", js.undefined)
    
    inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
  }
}
