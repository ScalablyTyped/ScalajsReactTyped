package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "DrawWrapper")
@js.native
open class DrawWrapper protected ()
  extends typingsJapgolly.babylonjs.materialsIndexMod.DrawWrapper {
  def this(engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine) = this()
  def this(engine: typingsJapgolly.babylonjs.enginesThinEngineMod.ThinEngine, createMaterialContext: Boolean) = this()
}
/* static members */
object DrawWrapper {
  
  @JSImport("babylonjs/index", "DrawWrapper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetEffect(effect: typingsJapgolly.babylonjs.materialsDrawWrapperMod.DrawWrapper): Nullable[typingsJapgolly.babylonjs.materialsEffectMod.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsEffectMod.Effect]]
  inline def GetEffect(effect: typingsJapgolly.babylonjs.materialsEffectMod.Effect): Nullable[typingsJapgolly.babylonjs.materialsEffectMod.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsEffectMod.Effect]]
  
  inline def IsWrapper(effect: typingsJapgolly.babylonjs.materialsDrawWrapperMod.DrawWrapper): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
  inline def IsWrapper(effect: typingsJapgolly.babylonjs.materialsEffectMod.Effect): /* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.babylonjs/Materials/drawWrapper.DrawWrapper */ Boolean]
}
