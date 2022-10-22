package typingsJapgolly.babylonjs.mod

import typingsJapgolly.babylonjs.anon.Colors
import typingsJapgolly.babylonjs.anon.DashNb
import typingsJapgolly.babylonjs.anon.Instance
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinesBuilder {
  
  @JSImport("babylonjs", "LinesBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "LinesBuilder.CreateDashedLines")
  @js.native
  def CreateDashedLines: js.Function3[
    /* name */ String, 
    /* options */ DashNb, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateDashedLines(name: String, options: DashNb): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateDashedLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ DashNb, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "LinesBuilder.CreateLineSystem")
  @js.native
  def CreateLineSystem: js.Function3[
    /* name */ String, 
    /* options */ Colors, 
    /* scene */ Nullable[typingsJapgolly.babylonjs.sceneMod.Scene], 
    typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLineSystem_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Colors, 
      /* scene */ Nullable[typingsJapgolly.babylonjs.sceneMod.Scene], 
      typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "LinesBuilder.CreateLines")
  @js.native
  def CreateLines: js.Function3[
    /* name */ String, 
    /* options */ Instance, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateLines(name: String, options: Instance): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLines(name: String, options: Instance, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Instance, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
}
