package typingsJapgolly.uifabricUtilities

import typingsJapgolly.std.Partial
import typingsJapgolly.uifabricUtilities.uifabricUtilitiesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMergeMod {
  
  @JSImport("@uifabric/utilities/lib/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge_false[T](target: Partial[T], args: (js.UndefOr[Partial[T] | Null | `false`])*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(scala.List(target.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
}
