package typingsJapgolly.babylonjs.BABYLON

import typingsJapgolly.babylonjs.babylonjsStrings.a
import typingsJapgolly.babylonjs.babylonjsStrings.b
import typingsJapgolly.babylonjs.babylonjsStrings.g
import typingsJapgolly.babylonjs.babylonjsStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorMergerBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _buildSwizzle: Any = js.native
  
  /**
    * Gets the a component (input)
    */
  def a: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the swizzle for a (meaning which component to affect to the output.a)
    */
  var aSwizzle: r | g | b | a = js.native
  
  /**
    * Gets the b component (input)
    */
  def b: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the swizzle for b (meaning which component to affect to the output.b)
    */
  var bSwizzle: r | g | b | a = js.native
  
  /**
    * Gets the g component (input)
    */
  def g: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the swizzle for g (meaning which component to affect to the output.g)
    */
  var gSwizzle: r | g | b | a = js.native
  
  /**
    * Gets the r component (input)
    */
  def r: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the swizzle for r (meaning which component to affect to the output.r)
    */
  var rSwizzle: r | g | b | a = js.native
  
  /**
    * Gets the rgb component (output)
    * @deprecated Please use rgbOut instead.
    */
  def rgb: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (input)
    */
  def rgbIn: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb component (output)
    */
  def rgbOut: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgba component (output)
    */
  def rgba: NodeMaterialConnectionPoint = js.native
}
