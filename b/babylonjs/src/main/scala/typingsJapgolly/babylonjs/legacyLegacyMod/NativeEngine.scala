package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.enginesNativeEngineMod.NativeEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "NativeEngine")
@js.native
open class NativeEngine ()
  extends typingsJapgolly.babylonjs.indexMod.NativeEngine {
  def this(options: NativeEngineOptions) = this()
}
/* static members */
object NativeEngine {
  
  @JSImport("babylonjs/Legacy/legacy", "NativeEngine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "NativeEngine.PROTOCOL_VERSION")
  @js.native
  val PROTOCOL_VERSION: Any = js.native
  
  /** @internal */
  inline def _createNativeDataStream(): typingsJapgolly.babylonjs.enginesNativeNativeDataStreamMod.NativeDataStream = ^.asInstanceOf[js.Dynamic].applyDynamic("_createNativeDataStream")().asInstanceOf[typingsJapgolly.babylonjs.enginesNativeNativeDataStreamMod.NativeDataStream]
}
