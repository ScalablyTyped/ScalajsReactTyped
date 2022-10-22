package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "UniformBuffer")
@js.native
open class UniformBuffer protected ()
  extends typingsJapgolly.babylonjs.indexMod.UniformBuffer {
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
  def this(engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine) = this()
  def this(engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine, data: js.Array[Double]) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Boolean
  ) = this()
  def this(engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine, data: Unit, dynamic: Boolean) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Boolean,
    name: String
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Unit,
    name: String
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: Unit,
    dynamic: Boolean,
    name: String
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: Unit,
    dynamic: Unit,
    name: String
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Boolean,
    name: String,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Boolean,
    name: Unit,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Unit,
    name: String,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: js.Array[Double],
    dynamic: Unit,
    name: Unit,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: Unit,
    dynamic: Boolean,
    name: String,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: Unit,
    dynamic: Boolean,
    name: Unit,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: Unit,
    dynamic: Unit,
    name: String,
    forceNoUniformBuffer: Boolean
  ) = this()
  def this(
    engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine,
    data: Unit,
    dynamic: Unit,
    name: Unit,
    forceNoUniformBuffer: Boolean
  ) = this()
}
/* static members */
object UniformBuffer {
  
  @JSImport("babylonjs/Legacy/legacy", "UniformBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "UniformBuffer._MAX_UNIFORM_SIZE")
  @js.native
  def _MAX_UNIFORM_SIZE: Any = js.native
  inline def _MAX_UNIFORM_SIZE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAX_UNIFORM_SIZE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "UniformBuffer._TempBuffer")
  @js.native
  def _TempBuffer: Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "UniformBuffer._TempBufferInt32View")
  @js.native
  def _TempBufferInt32View: Any = js.native
  inline def _TempBufferInt32View_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TempBufferInt32View")(x.asInstanceOf[js.Any])
  
  inline def _TempBuffer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TempBuffer")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/Legacy/legacy", "UniformBuffer._UpdatedUbosInFrame")
  @js.native
  def _UpdatedUbosInFrame: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  inline def _UpdatedUbosInFrame_=(x: org.scalablytyped.runtime.StringDictionary[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UpdatedUbosInFrame")(x.asInstanceOf[js.Any])
}
