package typingsJapgolly.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAppendFunctionMod {
  
  @JSImport("@uifabric/utilities/lib/appendFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendFunction(parent: Any, functions: Any*): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("appendFunction")(scala.List(parent.asInstanceOf[js.Any]).`++`(functions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[Unit]]
}
