package typingsJapgolly.uifabricUtilities

import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricUtilities.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestReactTestRendererMod {
  
  @JSImport("@uifabric/utilities/lib/test/reactTestRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof defaultCreate> is not an array type */ args: Parameters[FnCall]
  ): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
}
