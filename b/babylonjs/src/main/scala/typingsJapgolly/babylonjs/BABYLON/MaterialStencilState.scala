package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterialStencilState
  extends StObject
     with IStencilState {
  
  /* private */ var _enabled: Any = js.native
  
  /* private */ var _func: Any = js.native
  
  /* private */ var _funcMask: Any = js.native
  
  /* private */ var _funcRef: Any = js.native
  
  /* private */ var _mask: Any = js.native
  
  /* private */ var _opDepthFail: Any = js.native
  
  /* private */ var _opStencilDepthPass: Any = js.native
  
  /* private */ var _opStencilFail: Any = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param stencilState defines stencil state where to copy the info
    */
  def copyTo(stencilState: MaterialStencilState): Unit = js.native
  
  /**
    * Enables or disables the stencil test
    */
  @JSName("enabled")
  def enabled_MMaterialStencilState: Boolean = js.native
  
  /**
    * Gets or sets the stencil function mask
    */
  @JSName("funcMask")
  def funcMask_MMaterialStencilState: Double = js.native
  
  /**
    * Gets or sets the stencil function reference
    */
  @JSName("funcRef")
  def funcRef_MMaterialStencilState: Double = js.native
  
  /**
    * Gets or sets the stencil function
    */
  @JSName("func")
  def func_MMaterialStencilState: Double = js.native
  
  /**
    * Get the current class name, useful for serialization or dynamic coding.
    * @returns "MaterialStencilState"
    */
  def getClassName(): String = js.native
  
  /**
    * Gets or sets the stencil mask
    */
  @JSName("mask")
  def mask_MMaterialStencilState: Double = js.native
  
  /**
    * Gets or sets the operation when the depth test fails
    */
  @JSName("opDepthFail")
  def opDepthFail_MMaterialStencilState: Double = js.native
  
  /**
    * Gets or sets the operation when the stencil+depth test succeeds
    */
  @JSName("opStencilDepthPass")
  def opStencilDepthPass_MMaterialStencilState: Double = js.native
  
  /**
    * Gets or sets the operation when the stencil test fails
    */
  @JSName("opStencilFail")
  def opStencilFail_MMaterialStencilState: Double = js.native
  
  /**
    * Parses a stencil state configuration from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: Any, scene: Scene, rootUrl: String): Unit = js.native
  
  /**
    * Serializes this stencil configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): Any = js.native
}
