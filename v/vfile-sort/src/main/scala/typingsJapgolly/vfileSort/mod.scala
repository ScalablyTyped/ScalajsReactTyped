package typingsJapgolly.vfileSort

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sort[F /* <: typingsJapgolly.vfile.mod.VFile */](file: F): F = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(file.asInstanceOf[js.Any]).asInstanceOf[F]
  
  type VFile = typingsJapgolly.vfile.mod.VFile
  
  type VFileMessage = typingsJapgolly.vfileMessage.mod.VFileMessage
}
