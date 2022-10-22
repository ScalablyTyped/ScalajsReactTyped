package typingsJapgolly.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylonjs.buffersDataBufferMod.DataBuffer
import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import typingsJapgolly.babylonjs.materialsEffectMod.Effect
import typingsJapgolly.babylonjs.materialsTexturesThinTextureMod.ThinTexture
import typingsJapgolly.babylonjs.mathsMathDotlikeMod.IColor3Like
import typingsJapgolly.babylonjs.mathsMathDotlikeMod.IColor4Like
import typingsJapgolly.babylonjs.mathsMathDotlikeMod.IMatrixLike
import typingsJapgolly.babylonjs.mathsMathDotlikeMod.IVector3Like
import typingsJapgolly.babylonjs.mathsMathDotlikeMod.IVector4Like
import typingsJapgolly.babylonjs.typesMod.FloatArray
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsUniformBufferMod {
  
  @JSImport("babylonjs/Materials/uniformBuffer", "UniformBuffer")
  @js.native
  open class UniformBuffer protected () extends StObject {
    /**
      * Instantiates a new Uniform buffer objects.
      *
      * Handles blocks of uniform on the GPU.
      *
      * If WebGL 2 is not available, this class falls back on traditional setUniformXXX calls.
      *
      * For more information, please refer to :
      * @see https://www.khronos.org/opengl/wiki/Uniform_Buffer_Object
      * @param engine Define the engine the buffer is associated with
      * @param data Define the data contained in the buffer
      * @param dynamic Define if the buffer is updatable
      * @param name to assign to the buffer (debugging purpose)
      * @param forceNoUniformBuffer define that this object must not rely on UBO objects
      */
    def this(engine: ThinEngine) = this()
    def this(engine: ThinEngine, data: js.Array[Double]) = this()
    def this(engine: ThinEngine, data: js.Array[Double], dynamic: Boolean) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Boolean) = this()
    def this(engine: ThinEngine, data: js.Array[Double], dynamic: Boolean, name: String) = this()
    def this(engine: ThinEngine, data: js.Array[Double], dynamic: Unit, name: String) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Boolean, name: String) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Unit, name: String) = this()
    def this(
      engine: ThinEngine,
      data: js.Array[Double],
      dynamic: Boolean,
      name: String,
      forceNoUniformBuffer: Boolean
    ) = this()
    def this(
      engine: ThinEngine,
      data: js.Array[Double],
      dynamic: Boolean,
      name: Unit,
      forceNoUniformBuffer: Boolean
    ) = this()
    def this(
      engine: ThinEngine,
      data: js.Array[Double],
      dynamic: Unit,
      name: String,
      forceNoUniformBuffer: Boolean
    ) = this()
    def this(
      engine: ThinEngine,
      data: js.Array[Double],
      dynamic: Unit,
      name: Unit,
      forceNoUniformBuffer: Boolean
    ) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Boolean, name: String, forceNoUniformBuffer: Boolean) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Boolean, name: Unit, forceNoUniformBuffer: Boolean) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Unit, name: String, forceNoUniformBuffer: Boolean) = this()
    def this(engine: ThinEngine, data: Unit, dynamic: Unit, name: Unit, forceNoUniformBuffer: Boolean) = this()
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _bufferData: Any = js.native
    
    /* private */ var _bufferIndex: Any = js.native
    
    /* private */ var _buffers: Any = js.native
    
    /* private */ var _buffersEqual: Any = js.native
    
    /* private */ var _cacheMatrix: Any = js.native
    
    /* private */ var _checkNewFrame: Any = js.native
    
    /* private */ var _copyBuffer: Any = js.native
    
    /* private */ var _createBufferOnWrite: Any = js.native
    
    /* private */ var _createNewBuffer: Any = js.native
    
    /* private */ var _currentEffect: Any = js.native
    
    /* private */ var _currentEffectName: Any = js.native
    
    /* private */ var _currentFrameId: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _dynamic: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /**
      * std140 layout specifies how to align data within an UBO structure.
      * See https://khronos.org/registry/OpenGL/specs/gl/glspec45.core.pdf#page=159
      * for specs.
      * @param size
      */
    /* private */ var _fillAlignment: Any = js.native
    
    /** @internal */
    def _indexBuffer: Double = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _needSync: Any = js.native
    
    /* private */ var _noUBO: Any = js.native
    
    /** @internal */
    def _numBuffers: Double = js.native
    
    /** @internal */
    def _rebuild(): Unit = js.native
    
    /* private */ var _uniformArraySizes: Any = js.native
    
    /* private */ var _uniformLocationPointer: Any = js.native
    
    /* private */ var _uniformLocations: Any = js.native
    
    /* private */ var _uniformSizes: Any = js.native
    
    /* private */ var _updateArrayForEffect: Any = js.native
    
    /* private */ var _updateArrayForUniform: Any = js.native
    
    /* private */ var _updateColor3ForEffect: Any = js.native
    
    /* private */ var _updateColor3ForUniform: Any = js.native
    
    /* private */ var _updateColor4ForEffect: Any = js.native
    
    /* private */ var _updateColor4ForUniform: Any = js.native
    
    /* private */ var _updateDirectColor4ForEffect: Any = js.native
    
    /* private */ var _updateDirectColor4ForUniform: Any = js.native
    
    /* private */ var _updateFloat2ForEffect: Any = js.native
    
    /* private */ var _updateFloat2ForUniform: Any = js.native
    
    /* private */ var _updateFloat3ForEffect: Any = js.native
    
    /* private */ var _updateFloat3ForUniform: Any = js.native
    
    /* private */ var _updateFloat4ForEffect: Any = js.native
    
    /* private */ var _updateFloat4ForUniform: Any = js.native
    
    /* private */ var _updateFloatArrayForEffect: Any = js.native
    
    /* private */ var _updateFloatArrayForUniform: Any = js.native
    
    /* private */ var _updateFloatForEffect: Any = js.native
    
    /* private */ var _updateFloatForUniform: Any = js.native
    
    /* private */ var _updateInt2ForEffect: Any = js.native
    
    /* private */ var _updateInt2ForUniform: Any = js.native
    
    /* private */ var _updateInt3ForEffect: Any = js.native
    
    /* private */ var _updateInt3ForUniform: Any = js.native
    
    /* private */ var _updateInt4ForEffect: Any = js.native
    
    /* private */ var _updateInt4ForUniform: Any = js.native
    
    /* private */ var _updateIntArrayForEffect: Any = js.native
    
    /* private */ var _updateIntArrayForUniform: Any = js.native
    
    /* private */ var _updateIntForEffect: Any = js.native
    
    /* private */ var _updateIntForUniform: Any = js.native
    
    /* private */ var _updateMatricesForEffect: Any = js.native
    
    /* private */ var _updateMatricesForUniform: Any = js.native
    
    /* private */ var _updateMatrix2x2ForEffect: Any = js.native
    
    /* private */ var _updateMatrix2x2ForUniform: Any = js.native
    
    /* private */ var _updateMatrix3x3ForEffect: Any = js.native
    
    /* private */ var _updateMatrix3x3ForUniform: Any = js.native
    
    /* private */ var _updateMatrixForEffect: Any = js.native
    
    /* private */ var _updateMatrixForUniform: Any = js.native
    
    /* private */ var _updateVector3ForEffect: Any = js.native
    
    /* private */ var _updateVector3ForUniform: Any = js.native
    
    /* private */ var _updateVector4ForEffect: Any = js.native
    
    /* private */ var _updateVector4ForUniform: Any = js.native
    
    /* private */ var _valueCache: Any = js.native
    
    /**
      * Adds a vec3 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param color Define the vec3 from a Color
      */
    def addColor3(name: String, color: IColor3Like): Unit = js.native
    
    /**
      * Adds a vec4 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param color Define the rgb components from a Color
      * @param alpha Define the a component of the vec4
      */
    def addColor4(name: String, color: IColor3Like, alpha: Double): Unit = js.native
    
    /**
      * Adds a vec2 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param x Define the x component value of the vec2
      * @param y Define the y component value of the vec2
      */
    def addFloat2(name: String, x: Double, y: Double): Unit = js.native
    
    /**
      * Adds a vec3 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param x Define the x component value of the vec3
      * @param y Define the y component value of the vec3
      * @param z Define the z component value of the vec3
      */
    def addFloat3(name: String, x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * Adds a Matrix 4x4 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param mat A 4x4 matrix.
      */
    def addMatrix(name: String, mat: IMatrixLike): Unit = js.native
    
    /**
      * Adds a Matrix 2x2 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      */
    def addMatrix2x2(name: String): Unit = js.native
    
    /**
      * Adds a Matrix 3x3 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      */
    def addMatrix3x3(name: String): Unit = js.native
    
    def addUniform(name: String, size: js.Array[Double]): Unit = js.native
    def addUniform(name: String, size: js.Array[Double], arraySize: Double): Unit = js.native
    /**
      * Adds an uniform in the buffer.
      * Warning : the subsequents calls of this function must be in the same order as declared in the shader
      * for the layout to be correct ! The addUniform function only handles types like float, vec2, vec3, vec4, mat4,
      * meaning size=1,2,3,4 or 16. It does not handle struct types.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param size Data size, or data directly.
      * @param arraySize The number of elements in the array, 0 if not an array.
      */
    def addUniform(name: String, size: Double): Unit = js.native
    def addUniform(name: String, size: Double, arraySize: Double): Unit = js.native
    
    /**
      * Adds a vec3 to the uniform buffer.
      * @param name Name of the uniform, as used in the uniform block in the shader.
      * @param vector Define the vec3 components from a Vector
      */
    def addVector3(name: String, vector: IVector3Like): Unit = js.native
    
    /**
      * Associates an effect to this uniform buffer
      * @param effect Define the effect to associate the buffer to
      * @param name Name of the uniform block in the shader.
      */
    def bindToEffect(effect: Effect, name: String): Unit = js.native
    
    /**
      * Binds the current (GPU) buffer to the effect
      */
    def bindUniformBuffer(): Unit = js.native
    
    /**
      * Effectively creates the WebGL Uniform Buffer, once layout is completed with `addUniform`.
      */
    def create(): Unit = js.native
    
    /**
      * Disposes the uniform buffer.
      */
    def dispose(): Unit = js.native
    
    /**
      * The underlying WebGL Uniform buffer.
      * @returns the webgl buffer
      */
    def getBuffer(): Nullable[DataBuffer] = js.native
    
    /**
      * The data cache on JS side.
      * @returns the underlying data as a float array
      */
    def getData(): js.typedarray.Float32Array = js.native
    
    /**
      * Indicates if the WebGL underlying uniform buffer is dynamic.
      * Also, a dynamic UniformBuffer will disable cache verification and always
      * update the underlying WebGL uniform buffer to the GPU.
      * @returns if Dynamic, otherwise false
      */
    def isDynamic(): Boolean = js.native
    
    /**
      * Indicates if the WebGL underlying uniform buffer is in sync
      * with the javascript cache data.
      */
    def isSync: Boolean = js.native
    
    /** Gets the name of this buffer */
    def name: String = js.native
    
    /**
      * Sets the current state of the class (_bufferIndex, _buffer) to point to the data buffer passed in parameter if this buffer is one of the buffers handled by the class (meaning if it can be found in the _buffers array)
      * This method is meant to be able to update a buffer at any time: just call setDataBuffer to set the class in the right state, call some updateXXX methods and then call udpate() => that will update the GPU buffer on the graphic card
      * @param dataBuffer buffer to look for
      * @returns true if the buffer has been found and the class internal state points to it, else false
      */
    def setDataBuffer(dataBuffer: DataBuffer): Boolean = js.native
    
    /**
      * Sets a sampler uniform on the effect.
      * @param name Define the name of the sampler.
      * @param texture Define the texture to set in the sampler
      */
    def setTexture(name: String, texture: Nullable[ThinTexture]): Unit = js.native
    
    /**
      * Dissociates the current effect from this uniform buffer
      */
    def unbindEffect(): Unit = js.native
    
    /**
      * Updates the WebGL Uniform Buffer on the GPU.
      * If the `dynamic` flag is set to true, no cache comparison is done.
      * Otherwise, the buffer will be updated only if the cache differs.
      */
    def update(): Unit = js.native
    
    /**
      * Lambda to Update an array of number in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateArray(name: String, array: js.Array[Double]): Unit = js.native
    
    /**
      * Lambda to Update vec3 of float from a Color in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateColor3(name: String, color: IColor3Like): Unit = js.native
    def updateColor3(name: String, color: IColor3Like, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update vec4 of float from a Color in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateColor4(name: String, color: IColor3Like, alpha: Double): Unit = js.native
    def updateColor4(name: String, color: IColor3Like, alpha: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update vec4 of float from a Color in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateDirectColor4(name: String, color: IColor4Like): Unit = js.native
    def updateDirectColor4(name: String, color: IColor4Like, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update a single float in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateFloat(name: String, x: Double): Unit = js.native
    
    /**
      * Lambda to Update a vec2 of float in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateFloat2(name: String, x: Double, y: Double): Unit = js.native
    def updateFloat2(name: String, x: Double, y: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update a vec3 of float in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateFloat3(name: String, x: Double, y: Double, z: Double): Unit = js.native
    def updateFloat3(name: String, x: Double, y: Double, z: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update a vec4 of float in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateFloat4(name: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
    def updateFloat4(name: String, x: Double, y: Double, z: Double, w: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update an array of float in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateFloatArray(name: String, array: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Lambda to Update a int a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateInt(name: String, x: Double): Unit = js.native
    def updateInt(name: String, x: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update a vec2 of int in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateInt2(name: String, x: Double, y: Double): Unit = js.native
    def updateInt2(name: String, x: Double, y: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update a vec3 of int in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateInt3(name: String, x: Double, y: Double, z: Double): Unit = js.native
    def updateInt3(name: String, x: Double, y: Double, z: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update a vec4 of int in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateInt4(name: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
    def updateInt4(name: String, x: Double, y: Double, z: Double, w: Double, suffix: String): Unit = js.native
    
    /**
      * Lambda to Update an array of number in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateIntArray(name: String, array: js.typedarray.Int32Array): Unit = js.native
    
    /**
      * Lambda to Update an array of 4x4 Matrix in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateMatrices(name: String, mat: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Lambda to Update a 4x4 Matrix in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateMatrix(name: String, mat: IMatrixLike): Unit = js.native
    
    /**
      * Lambda to Update a 2x2 Matrix in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateMatrix2x2(name: String, matrix: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Lambda to Update a 3x3 Matrix in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateMatrix3x3(name: String, matrix: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Updates the value of an uniform. The `update` method must be called afterwards to make it effective in the GPU.
      * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
      * @param data Define the flattened data
      * @param size Define the size of the data.
      */
    def updateUniform(uniformName: String, data: FloatArray, size: Double): Unit = js.native
    
    /**
      * Updates the value of an uniform. The `update` method must be called afterwards to make it effective in the GPU.
      * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
      * @param data Define the flattened data
      * @param size Define the size of the data.
      */
    def updateUniformArray(uniformName: String, data: FloatArray, size: Double): Unit = js.native
    
    /**
      * Directly updates the value of the uniform in the cache AND on the GPU.
      * @param uniformName Define the name of the uniform, as used in the uniform block in the shader.
      * @param data Define the flattened data
      */
    def updateUniformDirectly(uniformName: String, data: FloatArray): Unit = js.native
    
    /**
      * Lambda to Update vec3 of float from a Vector in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateVector3(name: String, vector: IVector3Like): Unit = js.native
    
    /**
      * Lambda to Update vec4 of float from a Vector in a uniform buffer.
      * This is dynamic to allow compat with webgl 1 and 2.
      * You will need to pass the name of the uniform as well as the value.
      */
    def updateVector4(name: String, vector: IVector4Like): Unit = js.native
    
    /**
      * Indicates if the buffer is using the WebGL2 UBO implementation,
      * or just falling back on setUniformXXX calls.
      */
    def useUbo: Boolean = js.native
  }
  /* static members */
  object UniformBuffer {
    
    @JSImport("babylonjs/Materials/uniformBuffer", "UniformBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Materials/uniformBuffer", "UniformBuffer._MAX_UNIFORM_SIZE")
    @js.native
    def _MAX_UNIFORM_SIZE: Any = js.native
    inline def _MAX_UNIFORM_SIZE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_UNIFORM_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/uniformBuffer", "UniformBuffer._TempBuffer")
    @js.native
    def _TempBuffer: Any = js.native
    
    @JSImport("babylonjs/Materials/uniformBuffer", "UniformBuffer._TempBufferInt32View")
    @js.native
    def _TempBufferInt32View: Any = js.native
    inline def _TempBufferInt32View_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TempBufferInt32View")(x.asInstanceOf[js.Any])
    
    inline def _TempBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TempBuffer")(x.asInstanceOf[js.Any])
    
    /** @internal */
    @JSImport("babylonjs/Materials/uniformBuffer", "UniformBuffer._UpdatedUbosInFrame")
    @js.native
    def _UpdatedUbosInFrame: StringDictionary[Double] = js.native
    inline def _UpdatedUbosInFrame_=(x: StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdatedUbosInFrame")(x.asInstanceOf[js.Any])
  }
}
