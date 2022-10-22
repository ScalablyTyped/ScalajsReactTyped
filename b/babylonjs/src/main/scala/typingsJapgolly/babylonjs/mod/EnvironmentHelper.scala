package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.anon.PartialIEnvironmentHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "EnvironmentHelper")
@js.native
open class EnvironmentHelper protected ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.EnvironmentHelper {
  /**
    * constructor
    * @param options Defines the options we want to customize the helper
    * @param scene The scene to add the material to
    */
  def this(options: PartialIEnvironmentHelper, scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object EnvironmentHelper {
  
  @JSImport("babylonjs", "EnvironmentHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default environment texture URL.
    */
  @JSImport("babylonjs", "EnvironmentHelper._EnvironmentTextureCDNUrl")
  @js.native
  def _EnvironmentTextureCDNUrl: Any = js.native
  inline def _EnvironmentTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EnvironmentTextureCDNUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Creates the default options for the helper.
    */
  @JSImport("babylonjs", "EnvironmentHelper._GetDefaultOptions")
  @js.native
  def _GetDefaultOptions: Any = js.native
  inline def _GetDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDefaultOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Default ground texture URL.
    */
  @JSImport("babylonjs", "EnvironmentHelper._GroundTextureCDNUrl")
  @js.native
  def _GroundTextureCDNUrl: Any = js.native
  inline def _GroundTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GroundTextureCDNUrl")(x.asInstanceOf[js.Any])
  
  /**
    * Default skybox texture URL.
    */
  @JSImport("babylonjs", "EnvironmentHelper._SkyboxTextureCDNUrl")
  @js.native
  def _SkyboxTextureCDNUrl: Any = js.native
  inline def _SkyboxTextureCDNUrl_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_SkyboxTextureCDNUrl")(x.asInstanceOf[js.Any])
}
