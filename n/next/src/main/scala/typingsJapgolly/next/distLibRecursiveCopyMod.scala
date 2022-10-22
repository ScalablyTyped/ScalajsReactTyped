package typingsJapgolly.next

import typingsJapgolly.next.anon.Concurrency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRecursiveCopyMod {
  
  @JSImport("next/dist/lib/recursive-copy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recursiveCopy(source: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveCopy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def recursiveCopy(source: String, dest: String, hasConcurrencyOverwriteFilter: Concurrency): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("recursiveCopy")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], hasConcurrencyOverwriteFilter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
