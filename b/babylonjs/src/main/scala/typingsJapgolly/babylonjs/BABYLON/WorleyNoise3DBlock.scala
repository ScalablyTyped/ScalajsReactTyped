package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorleyNoise3DBlock
  extends StObject
     with NodeMaterialBlock {
  
  /**
    * Gets the jitter input component
    */
  def jitter: NodeMaterialConnectionPoint = js.native
  
  /** Gets or sets a boolean indicating that normal should be inverted on X axis */
  var manhattanDistance: Boolean = js.native
  
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the seed input component
    */
  def seed: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the x component
    */
  def x: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the y component
    */
  def y: NodeMaterialConnectionPoint = js.native
}
