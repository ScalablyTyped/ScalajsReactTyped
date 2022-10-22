package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.anon.BackUVsFrontUVs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiscBuilder {
  
  @JSGlobal("BABYLON.DiscBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.DiscBuilder.CreateDisc")
  @js.native
  def CreateDisc: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[BackUVsFrontUVs], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateDisc(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(name: String, options: BackUVsFrontUVs): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(name: String, options: BackUVsFrontUVs, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[BackUVsFrontUVs], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisc")(x.asInstanceOf[js.Any])
}
