package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.anon.Flat
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IcoSphereBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "IcoSphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "IcoSphereBuilder.CreateIcoSphere")
  @js.native
  def CreateIcoSphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Flat], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateIcoSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Flat): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Flat, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Flat], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateIcoSphere")(x.asInstanceOf[js.Any])
}
