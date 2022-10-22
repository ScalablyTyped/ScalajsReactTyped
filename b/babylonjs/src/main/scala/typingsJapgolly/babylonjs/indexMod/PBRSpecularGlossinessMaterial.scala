package typingsJapgolly.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "PBRSpecularGlossinessMaterial")
@js.native
open class PBRSpecularGlossinessMaterial protected ()
  extends typingsJapgolly.babylonjs.materialsIndexMod.PBRSpecularGlossinessMaterial {
  /**
    * Instantiates a new PBRSpecularGlossinessMaterial instance.
    *
    * @param name The material name
    * @param scene The scene the material will be use in.
    */
  def this(name: String) = this()
  def this(name: String, scene: typingsJapgolly.babylonjs.sceneMod.Scene) = this()
}
/* static members */
object PBRSpecularGlossinessMaterial {
  
  @JSImport("babylonjs/index", "PBRSpecularGlossinessMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a JSON object corresponding to the serialize function.
    * @param source
    * @param scene
    * @param rootUrl
    */
  inline def Parse(source: Any, scene: typingsJapgolly.babylonjs.sceneMod.Scene, rootUrl: String): typingsJapgolly.babylonjs.materialsPbrPbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(source.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.materialsPbrPbrSpecularGlossinessMaterialMod.PBRSpecularGlossinessMaterial]
}
