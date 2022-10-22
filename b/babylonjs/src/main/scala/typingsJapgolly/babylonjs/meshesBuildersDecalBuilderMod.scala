package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.anon.Angle
import typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersDecalBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/decalBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateDecal(name: String, sourceMesh: AbstractMesh, options: Angle): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  object DecalBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/decalBuilder", "DecalBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/decalBuilder", "DecalBuilder.CreateDecal")
    @js.native
    def CreateDecal: js.Function3[/* name */ String, /* sourceMesh */ AbstractMesh, /* options */ Angle, Mesh] = js.native
    inline def CreateDecal(name: String, sourceMesh: AbstractMesh, options: Angle): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateDecal_=(x: js.Function3[/* name */ String, /* sourceMesh */ AbstractMesh, /* options */ Angle, Mesh]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
  }
}
