package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Color3Gradient")
@js.native
open class Color3Gradient protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Color3Gradient {
  /**
    * Creates a new color3 gradient
    * @param gradient gets or sets the gradient value (between 0 and 1)
    * @param color gets or sets associated color
    */
  def this(
    /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  gradient: Double,
    /**
    * Gets or sets the associated color
    */
  color: typingsJapgolly.babylonjs.BABYLON.Color3
  ) = this()
  
  /**
    * Gets or sets the associated color
    */
  /* CompleteClass */
  var color: typingsJapgolly.babylonjs.BABYLON.Color3 = js.native
  
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  /* CompleteClass */
  var gradient: Double = js.native
}
