package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DrawWrapper")
@js.native
open class DrawWrapper protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DrawWrapper {
  def this(engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine) = this()
  def this(engine: typingsJapgolly.babylonjs.BABYLON.ThinEngine, createMaterialContext: Boolean) = this()
}
/* static members */
object DrawWrapper {
  
  @JSGlobal("BABYLON.DrawWrapper")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GetEffect(effect: typingsJapgolly.babylonjs.BABYLON.DrawWrapper): Nullable[typingsJapgolly.babylonjs.BABYLON.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Effect]]
  inline def GetEffect(effect: typingsJapgolly.babylonjs.BABYLON.Effect): Nullable[typingsJapgolly.babylonjs.BABYLON.Effect] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.BABYLON.Effect]]
  
  inline def IsWrapper(effect: typingsJapgolly.babylonjs.BABYLON.DrawWrapper): /* is babylonjs.BABYLON.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.DrawWrapper */ Boolean]
  inline def IsWrapper(effect: typingsJapgolly.babylonjs.BABYLON.Effect): /* is babylonjs.BABYLON.DrawWrapper */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("IsWrapper")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is babylonjs.BABYLON.DrawWrapper */ Boolean]
}
