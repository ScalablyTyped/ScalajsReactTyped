package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProceduralTexture
  extends StObject
     with Texture {
  
  /* private */ var _cachedDefines: Any = js.native
  
  /* private */ var _checkUniform: Any = js.native
  
  /* private */ var _colors3: Any = js.native
  
  /* private */ var _colors4: Any = js.native
  
  /* private */ var _contentData: Any = js.native
  
  /* private */ var _contentUpdateId: Any = js.native
  
  /* private */ var _createIndexBuffer: Any = js.native
  
  /* private */ var _createRtWrapper: Any = js.native
  
  /* private */ var _currentRefreshId: Any = js.native
  
  /* private */ var _drawWrapper: Any = js.native
  
  /** @internal */
  /* protected */ var _fallbackTexture: Nullable[Texture] = js.native
  
  /* private */ var _fallbackTextureUsed: Any = js.native
  
  /* private */ var _floats: Any = js.native
  
  /* private */ var _floatsArrays: Any = js.native
  
  /* private */ var _fragment: Any = js.native
  
  /* private */ var _frameId: Any = js.native
  
  /* private */ var _fullEngine: Any = js.native
  
  /** @internal */
  var _generateMipMaps: Boolean = js.native
  
  /* protected */ def _getDefines(): String = js.native
  
  /* private */ var _indexBuffer: Any = js.native
  
  /* private */ var _ints: Any = js.native
  
  /* private */ var _matrices: Any = js.native
  
  /* private */ var _refreshRate: Any = js.native
  
  /* private */ var _rtWrapper: Any = js.native
  
  /* private */ var _samplers: Any = js.native
  
  /**
    * @internal*
    */
  def _setEffect(effect: Effect): Unit = js.native
  
  /** @internal */
  def _shouldRender(): Boolean = js.native
  
  /* private */ var _size: Any = js.native
  
  /* private */ var _textureType: Any = js.native
  
  /** @internal */
  var _textures: org.scalablytyped.runtime.StringDictionary[Texture] = js.native
  
  /* private */ var _uniforms: Any = js.native
  
  /* private */ var _vectors2: Any = js.native
  
  /* private */ var _vectors3: Any = js.native
  
  /* private */ var _vertexBuffers: Any = js.native
  
  /**
    * Define if the texture must be cleared before rendering (default is true)
    */
  var autoClear: Boolean = js.native
  
  /**
    * Gets texture content (Use this function wisely as reading from a texture can be slow)
    * @returns an ArrayBufferView promise (Uint8Array or Float32Array)
    */
  def getContent(): Nullable[js.Promise[js.typedarray.ArrayBufferView]] = js.native
  
  /**
    * The effect that is created when initializing the post process.
    * @returns The created effect corresponding the the postprocess.
    */
  def getEffect(): Effect = js.native
  
  /**
    * Get the size the texture is rendering at.
    * @returns the size (on cube texture it is always squared)
    */
  def getRenderSize(): TextureSize = js.native
  
  /**
    * Define if the texture is enabled or not (disabled texture will not render)
    */
  var isEnabled: Boolean = js.native
  
  /**
    * Gets or sets the node material used to create this texture (null if the texture was manually created)
    */
  var nodeMaterialSource: Nullable[NodeMaterial] = js.native
  
  /**
    * Event raised before the texture is generated
    */
  var onBeforeGenerationObservable: Observable[ProceduralTexture] = js.native
  
  /**
    * Callback called when the texture is generated
    */
  def onGenerated(): Unit = js.native
  
  /**
    * Event raised when the texture is generated
    */
  var onGeneratedObservable: Observable[ProceduralTexture] = js.native
  
  /**
    * Define the refresh rate of the texture or the rendering frequency.
    * Use 0 to render just once, 1 to render on every frame, 2 to render every two frames and so on...
    */
  def refreshRate: Double = js.native
  def refreshRate_=(value: Double): Unit = js.native
  
  /**
    * Render the texture to its associated render target.
    * @param useCameraPostProcess Define if camera post process should be applied to the texture
    */
  def render(): Unit = js.native
  def render(useCameraPostProcess: Boolean): Unit = js.native
  
  /**
    * Resets the texture in order to recreate its associated resources.
    * This can be called in case of context loss
    */
  def reset(): Unit = js.native
  
  /**
    * Resets the refresh counter of the texture and start bak from scratch.
    * Could be useful to regenerate the texture if it is setup to render only once.
    */
  def resetRefreshCounter(): Unit = js.native
  
  /**
    * Resize the texture to new value.
    * @param size Define the new size the texture should have
    * @param generateMipMaps Define whether the new texture should create mip maps
    */
  def resize(size: TextureSize, generateMipMaps: Boolean): Unit = js.native
  
  /**
    * Set a vec3 in the shader from a Color3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setColor3(name: String, value: Color3): ProceduralTexture = js.native
  
  /**
    * Set a vec4 in the shader from a Color4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setColor4(name: String, value: Color4): ProceduralTexture = js.native
  
  /**
    * Set a float in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setFloat(name: String, value: Double): ProceduralTexture = js.native
  
  /**
    * Set an array of floats in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setFloats(name: String, value: js.Array[Double]): ProceduralTexture = js.native
  
  /**
    * Set the fragment shader to use in order to render the texture.
    * @param fragment This can be set to a path (into the shader store) or to a json object containing a fragmentElement property.
    */
  def setFragment(fragment: Any): Unit = js.native
  
  /**
    * Set a int in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setInt(name: String, value: Double): ProceduralTexture = js.native
  
  /**
    * Set a mat4 in the shader from a MAtrix.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setMatrix(name: String, value: Matrix): ProceduralTexture = js.native
  
  /**
    * Set a texture in the shader program used to render.
    * @param name Define the name of the uniform samplers as defined in the shader
    * @param texture Define the texture to bind to this sampler
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setTexture(name: String, texture: Texture): ProceduralTexture = js.native
  
  /**
    * Set a vec2 in the shader from a Vector2.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setVector2(name: String, value: Vector2): ProceduralTexture = js.native
  
  /**
    * Set a vec3 in the shader from a Vector3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @returns the texture itself allowing "fluent" like uniform updates
    */
  def setVector3(name: String, value: Vector3): ProceduralTexture = js.native
}
