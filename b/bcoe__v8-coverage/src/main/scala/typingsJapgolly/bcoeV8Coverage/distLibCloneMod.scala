package typingsJapgolly.bcoeV8Coverage

import typingsJapgolly.bcoeV8Coverage.anon.ReadonlyFunctionCov
import typingsJapgolly.bcoeV8Coverage.anon.ReadonlyProcessCov
import typingsJapgolly.bcoeV8Coverage.anon.ReadonlyRangeCov
import typingsJapgolly.bcoeV8Coverage.anon.ReadonlyScriptCov
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.FunctionCov
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.ProcessCov
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.RangeCov
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCloneMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneFunctionCov(functionCov: ReadonlyFunctionCov): FunctionCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneFunctionCov")(functionCov.asInstanceOf[js.Any]).asInstanceOf[FunctionCov]
  
  inline def cloneProcessCov(processCov: ReadonlyProcessCov): ProcessCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneProcessCov")(processCov.asInstanceOf[js.Any]).asInstanceOf[ProcessCov]
  
  inline def cloneRangeCov(rangeCov: ReadonlyRangeCov): RangeCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneRangeCov")(rangeCov.asInstanceOf[js.Any]).asInstanceOf[RangeCov]
  
  inline def cloneScriptCov(scriptCov: ReadonlyScriptCov): ScriptCov = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneScriptCov")(scriptCov.asInstanceOf[js.Any]).asInstanceOf[ScriptCov]
}
