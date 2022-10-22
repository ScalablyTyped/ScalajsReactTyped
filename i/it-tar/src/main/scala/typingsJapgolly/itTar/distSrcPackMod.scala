package typingsJapgolly.itTar

import typingsJapgolly.itStreamTypes.mod.Transform
import typingsJapgolly.itTar.mod.TarImportCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPackMod {
  
  @JSImport("it-tar/dist/src/pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pack(): Transform[TarImportCandidate, js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")().asInstanceOf[Transform[TarImportCandidate, js.typedarray.Uint8Array]]
}
