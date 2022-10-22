package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.anon.P
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorusKnotBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "TorusKnotBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "TorusKnotBuilder.CreateTorusKnot")
  @js.native
  def CreateTorusKnot: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[P], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[P], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
}
