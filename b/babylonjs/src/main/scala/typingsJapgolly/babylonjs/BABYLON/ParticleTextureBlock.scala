package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleTextureBlock
  extends StObject
     with NodeMaterialBlock {
  
  /* private */ var _gammaDefineName: Any = js.native
  
  /* private */ var _linearDefineName: Any = js.native
  
  /* private */ var _samplerName: Any = js.native
  
  /* private */ var _tempTextureRead: Any = js.native
  
  /* private */ var _writeOutput: Any = js.native
  
  /**
    * Gets the a output component
    */
  def a: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the b output component
    */
  def b: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets a boolean indicating if content needs to be converted to gamma space
    */
  var convertToGammaSpace: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if content needs to be converted to linear space
    */
  var convertToLinearSpace: Boolean = js.native
  
  /**
    * Gets the g output component
    */
  def g: NodeMaterialConnectionPoint = js.native
  
  def isReady(): Boolean = js.native
  
  /**
    * Gets the r output component
    */
  def r: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgb output component
    */
  def rgb: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets the rgba output component
    */
  def rgba: NodeMaterialConnectionPoint = js.native
  
  /**
    * Gets or sets the texture associated with the node
    */
  var texture: Nullable[BaseTexture] = js.native
  
  /**
    * Gets the uv input component
    */
  def uv: NodeMaterialConnectionPoint = js.native
}
