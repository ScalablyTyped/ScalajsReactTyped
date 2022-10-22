package typingsJapgolly.fluentuiUtilities

import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.fluentuiUtilities.anon.FnCall
import typingsJapgolly.std.Parameters
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestMod {
  
  @JSImport("@fluentui/utilities/lib/test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<typeof defaultCreate> is not an array type */ args: Parameters[FnCall]
  ): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectWrapperMethod")(wrapper.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
