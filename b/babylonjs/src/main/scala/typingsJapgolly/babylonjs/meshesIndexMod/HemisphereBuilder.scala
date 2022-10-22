package typingsJapgolly.babylonjs.meshesIndexMod

import typingsJapgolly.babylonjs.anon.Diameter
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HemisphereBuilder {
  
  @JSImport("babylonjs/Meshes/index", "HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "HemisphereBuilder.CreateHemisphere")
  @js.native
  def CreateHemisphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Diameter], 
    /* scene */ js.UndefOr[Scene], 
    Mesh
  ] = js.native
  inline def CreateHemisphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Diameter): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Diameter, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Diameter], 
      /* scene */ js.UndefOr[Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateHemisphere")(x.asInstanceOf[js.Any])
}
