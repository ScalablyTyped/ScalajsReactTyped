package typingsJapgolly.nrwlJest

import typingsJapgolly.jestTypes.mod.Argv
import typingsJapgolly.nrwlJest.anon.Success
import typingsJapgolly.nrwlJest.anon.SuccessBoolean
import typingsJapgolly.nrwlJest.srcExecutorsJestSchemaMod.JestExecutorOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExecutorsJestJestDotimplMod {
  
  @JSImport("@nrwl/jest/src/executors/jest/jest.impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    options: JestExecutorOptions,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any
  ): js.Promise[SuccessBoolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SuccessBoolean]]
  
  inline def batchJest(
    taskGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskGraph */ Any,
    inputs: Record[String, JestExecutorOptions],
    overrides: JestExecutorOptions,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any
  ): js.Promise[Record[String, Success]] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchJest")(taskGraph.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Success]]]
  
  inline def jestConfigParser(
    options: JestExecutorOptions,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any
  ): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("jestConfigParser")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  inline def jestConfigParser(
    options: JestExecutorOptions,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any,
    multiProjects: Boolean
  ): js.Promise[Argv] = (^.asInstanceOf[js.Dynamic].applyDynamic("jestConfigParser")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], multiProjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Argv]]
  
  inline def jestExecutor(
    options: JestExecutorOptions,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any
  ): js.Promise[SuccessBoolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("jestExecutor")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SuccessBoolean]]
}
