package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUTintWASM extends StObject {
  
  /* private */ var _twgsl: Any = js.native
  
  def convertSpirV2WGSL(code: js.typedarray.Uint32Array): String = js.native
  
  def initTwgsl(): js.Promise[Unit] = js.native
  def initTwgsl(twgslOptions: TwgslOptions): js.Promise[Unit] = js.native
}
