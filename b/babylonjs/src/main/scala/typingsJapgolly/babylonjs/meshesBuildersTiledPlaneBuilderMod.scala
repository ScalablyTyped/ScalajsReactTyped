package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.Pattern
import typingsJapgolly.babylonjs.anon.TileHeight
import typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersTiledPlaneBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/tiledPlaneBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTiledPlaneVertexData(options: TileHeight): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  object TiledPlaneBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/tiledPlaneBuilder", "TiledPlaneBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/tiledPlaneBuilder", "TiledPlaneBuilder.CreateTiledPlane")
    @js.native
    def CreateTiledPlane: js.Function3[
        /* name */ String, 
        /* options */ Pattern, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledPlane_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ Pattern, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledPlane")(x.asInstanceOf[js.Any])
  }
}
