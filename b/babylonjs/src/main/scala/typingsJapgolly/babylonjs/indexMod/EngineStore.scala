package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "EngineStore")
@js.native
open class EngineStore ()
  extends typingsJapgolly.babylonjs.enginesIndexMod.EngineStore
/* static members */
object EngineStore {
  
  @JSImport("babylonjs/index", "EngineStore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Texture content used if a texture cannot loaded
    * @ignorenaming
    */
  @JSImport("babylonjs/index", "EngineStore.FallbackTexture")
  @js.native
  def FallbackTexture: String = js.native
  inline def FallbackTexture_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FallbackTexture")(x.asInstanceOf[js.Any])
  
  /** Gets the list of created engines */
  @JSImport("babylonjs/index", "EngineStore.Instances")
  @js.native
  def Instances: js.Array[typingsJapgolly.babylonjs.enginesEngineMod.Engine] = js.native
  inline def Instances_=(x: js.Array[typingsJapgolly.babylonjs.enginesEngineMod.Engine]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instances")(x.asInstanceOf[js.Any])
  
  /**
    * Gets or sets a global variable indicating if fallback texture must be used when a texture cannot be loaded
    * @ignorenaming
    */
  @JSImport("babylonjs/index", "EngineStore.UseFallbackTexture")
  @js.native
  def UseFallbackTexture: Boolean = js.native
  inline def UseFallbackTexture_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseFallbackTexture")(x.asInstanceOf[js.Any])
  
  /** @internal */
  @JSImport("babylonjs/index", "EngineStore._LastCreatedScene")
  @js.native
  def _LastCreatedScene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene] = js.native
  inline def _LastCreatedScene_=(x: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LastCreatedScene")(x.asInstanceOf[js.Any])
}
