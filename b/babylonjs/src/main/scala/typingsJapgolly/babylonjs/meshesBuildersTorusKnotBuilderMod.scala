package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.P
import typingsJapgolly.babylonjs.anon.Q
import typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersTorusKnotBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/torusKnotBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTorusKnotVertexData(options: Q): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnotVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  object TorusKnotBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/torusKnotBuilder", "TorusKnotBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/torusKnotBuilder", "TorusKnotBuilder.CreateTorusKnot")
    @js.native
    def CreateTorusKnot: js.Function3[/* name */ String, /* options */ js.UndefOr[P], /* scene */ js.UndefOr[Scene], Mesh] = js.native
    inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateTorusKnot(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorusKnot(name: String, options: P, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorusKnot_=(
      x: js.Function3[/* name */ String, /* options */ js.UndefOr[P], /* scene */ js.UndefOr[Scene], Mesh]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
  }
}
