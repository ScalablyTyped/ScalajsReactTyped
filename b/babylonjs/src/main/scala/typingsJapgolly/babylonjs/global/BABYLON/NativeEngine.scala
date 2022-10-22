package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.NativeEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.NativeEngine")
@js.native
open class NativeEngine ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.NativeEngine {
  def this(options: NativeEngineOptions) = this()
}
/* static members */
object NativeEngine {
  
  @JSGlobal("BABYLON.NativeEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.NativeEngine.PROTOCOL_VERSION")
  @js.native
  val PROTOCOL_VERSION: Any = js.native
  
  /** @internal */
  inline def _createNativeDataStream(): typingsJapgolly.babylonjs.BABYLON.NativeDataStream = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNativeDataStream")().asInstanceOf[typingsJapgolly.babylonjs.BABYLON.NativeDataStream]
}
