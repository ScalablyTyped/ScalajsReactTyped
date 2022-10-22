package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.DedupTopBottomIndices
import typingsJapgolly.babylonjs.anon.DiameterX
import typingsJapgolly.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersSphereBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/sphereBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: DiameterX): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: DiameterX, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateSphereVertexData(options: DedupTopBottomIndices): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  object SphereBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/sphereBuilder", "SphereBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/sphereBuilder", "SphereBuilder.CreateSphere")
    @js.native
    def CreateSphere: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[DiameterX], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateSphere(name: String, options: DiameterX): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateSphere(name: String, options: DiameterX, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateSphere_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[DiameterX], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateSphere")(x.asInstanceOf[js.Any])
  }
}
