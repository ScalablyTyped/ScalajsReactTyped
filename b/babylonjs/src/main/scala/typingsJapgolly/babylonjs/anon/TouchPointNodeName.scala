package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.BABYLON.MotionControllerComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchPointNodeName extends StObject {
  
  /**
    * The indices of this component in the gamepad object
    */
  var gamepadIndices: Button
  
  /**
    * The mesh's root node name
    */
  var rootNodeName: String
  
  /**
    * If touch enabled, what is the name of node to display user feedback
    */
  var touchPointNodeName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of input the component outputs
    */
  var `type`: MotionControllerComponentType
  
  /**
    * Animation definitions for this model
    */
  var visualResponses: StringDictionary[MinNodeName]
}
object TouchPointNodeName {
  
  inline def apply(
    gamepadIndices: Button,
    rootNodeName: String,
    `type`: MotionControllerComponentType,
    visualResponses: StringDictionary[MinNodeName]
  ): TouchPointNodeName = {
    val __obj = js.Dynamic.literal(gamepadIndices = gamepadIndices.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], visualResponses = visualResponses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchPointNodeName]
  }
  
  extension [Self <: TouchPointNodeName](x: Self) {
    
    inline def setGamepadIndices(value: Button): Self = StObject.set(x, "gamepadIndices", value.asInstanceOf[js.Any])
    
    inline def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    inline def setTouchPointNodeName(value: String): Self = StObject.set(x, "touchPointNodeName", value.asInstanceOf[js.Any])
    
    inline def setTouchPointNodeNameUndefined: Self = StObject.set(x, "touchPointNodeName", js.undefined)
    
    inline def setType(value: MotionControllerComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisualResponses(value: StringDictionary[MinNodeName]): Self = StObject.set(x, "visualResponses", value.asInstanceOf[js.Any])
  }
}
