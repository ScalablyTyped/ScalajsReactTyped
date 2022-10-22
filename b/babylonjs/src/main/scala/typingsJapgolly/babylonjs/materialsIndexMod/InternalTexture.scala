package typingsJapgolly.babylonjs.materialsIndexMod

import typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "InternalTexture")
@js.native
open class InternalTexture protected ()
  extends typingsJapgolly.babylonjs.materialsTexturesIndexMod.InternalTexture {
  /**
    * Creates a new InternalTexture
    * @param engine defines the engine to use
    * @param source defines the type of data that will be used
    * @param delayAllocation if the texture allocation should be delayed (default: false)
    */
  def this(
    engine: ThinEngine,
    source: typingsJapgolly.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource
  ) = this()
  def this(
    engine: ThinEngine,
    source: typingsJapgolly.babylonjs.materialsTexturesInternalTextureMod.InternalTextureSource,
    delayAllocation: Boolean
  ) = this()
}
/* static members */
object InternalTexture {
  
  @JSImport("babylonjs/Materials/index", "InternalTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  @JSImport("babylonjs/Materials/index", "InternalTexture._Counter")
  @js.native
  def _Counter: Double = js.native
  inline def _Counter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Counter")(x.asInstanceOf[js.Any])
}
