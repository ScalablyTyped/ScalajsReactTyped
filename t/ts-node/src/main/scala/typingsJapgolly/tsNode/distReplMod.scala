package typingsJapgolly.tsNode

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.tsNode.mod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReplMod {
  
  @JSImport("ts-node/dist/repl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-node/dist/repl", "EvalState")
  @js.native
  open class EvalState protected () extends StObject {
    def this(path: String) = this()
    
    var __tsNodeEvalStateBrand: Any = js.native
    
    var path: String = js.native
  }
  
  inline def createEvalAwarePartialHost(state: EvalState): EvalAwarePartialHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvalAwarePartialHost")(state.asInstanceOf[js.Any]).asInstanceOf[EvalAwarePartialHost]
  inline def createEvalAwarePartialHost(state: EvalState, composeWith: EvalAwarePartialHost): EvalAwarePartialHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createEvalAwarePartialHost")(state.asInstanceOf[js.Any], composeWith.asInstanceOf[js.Any])).asInstanceOf[EvalAwarePartialHost]
  
  inline def createRepl(): ReplService = ^.asInstanceOf[js.Dynamic].applyDynamic("createRepl")().asInstanceOf[ReplService]
  inline def createRepl(options: CreateReplOptions): ReplService = ^.asInstanceOf[js.Dynamic].applyDynamic("createRepl")(options.asInstanceOf[js.Any]).asInstanceOf[ReplService]
  
  trait CreateReplOptions extends StObject {
    
    var service: js.UndefOr[Service] = js.undefined
    
    var state: js.UndefOr[EvalState] = js.undefined
    
    var stderr: js.UndefOr[WritableStream] = js.undefined
    
    var stdin: js.UndefOr[ReadableStream] = js.undefined
    
    var stdout: js.UndefOr[WritableStream] = js.undefined
  }
  object CreateReplOptions {
    
    inline def apply(): CreateReplOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateReplOptions]
    }
    
    extension [Self <: CreateReplOptions](x: Self) {
      
      inline def setService(value: Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setState(value: EvalState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStderr(value: WritableStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdin(value: ReadableStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: WritableStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  /* Inlined std.Pick<ts-node.ts-node.CreateOptions, 'readFile' | 'fileExists'> */
  trait EvalAwarePartialHost extends StObject {
    
    var fileExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
    
    var readFile: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.undefined
  }
  object EvalAwarePartialHost {
    
    inline def apply(): EvalAwarePartialHost = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EvalAwarePartialHost]
    }
    
    extension [Self <: EvalAwarePartialHost](x: Self) {
      
      inline def setFileExists(value: /* path */ String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
      
      inline def setFileExistsUndefined: Self = StObject.set(x, "fileExists", js.undefined)
      
      inline def setReadFile(value: /* path */ String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadFileUndefined: Self = StObject.set(x, "readFile", js.undefined)
    }
  }
  
  @js.native
  trait ReplService extends StObject {
    
    var evalAwarePartialHost: EvalAwarePartialHost = js.native
    
    /**
      * Append code to the virtual <repl> source file, compile it to JavaScript, throw semantic errors if the typechecker is enabled,
      * and execute it.
      *
      * Note: typically, you will want to call `start()` instead of using this method.
      *
      * @param code string of TypeScript.
      */
    def evalCode(code: String): Any = js.native
    
    /**
      * `eval` implementation compatible with node's REPL API
      *
      * Can be used in advanced scenarios if you want to manually create your own
      * node REPL instance and delegate eval to this `ReplService`.
      *
      * Example:
      *
      *     import {start} from 'repl';
      *     const replService: tsNode.ReplService = ...; // assuming you have already created a ts-node ReplService
      *     const nodeRepl = start({eval: replService.eval});
      */
    def nodeEval(
      code: String,
      context: Any,
      _filename: String,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Any]
    ): Unit = js.native
    
    /**
      * Bind this REPL to a ts-node compiler service.  A compiler service must be bound before `eval`-ing code or starting the REPL
      */
    def setService(service: Service): Unit = js.native
    
    /** Start a node REPL */
    def start(): Unit = js.native
    /**
      * Start a node REPL, evaling a string of TypeScript before it starts.
      * @deprecated
      */
    def start(code: String): Unit = js.native
    
    val state: EvalState = js.native
  }
}
