package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.anon.CaptureUVS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DecalBuilder {
  
  @JSGlobal("BABYLON.DecalBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.DecalBuilder.CreateDecal")
  @js.native
  def CreateDecal: js.Function3[
    /* name */ String, 
    /* sourceMesh */ typingsJapgolly.babylonjs.BABYLON.AbstractMesh, 
    /* options */ CaptureUVS, 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateDecal(name: String, sourceMesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, options: CaptureUVS): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDecal_=(
    x: js.Function3[
      /* name */ String, 
      /* sourceMesh */ typingsJapgolly.babylonjs.BABYLON.AbstractMesh, 
      /* options */ CaptureUVS, 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
}
