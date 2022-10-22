package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.anon.Tessellation
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorusBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "TorusBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "TorusBuilder.CreateTorus")
  @js.native
  def CreateTorus: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Tessellation], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateTorus(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Unit, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Tessellation], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorus")(x.asInstanceOf[js.Any])
}
