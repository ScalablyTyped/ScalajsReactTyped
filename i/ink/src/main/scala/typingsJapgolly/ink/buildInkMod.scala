package typingsJapgolly.ink

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.node.processMod.global.NodeJS.ReadStream
import typingsJapgolly.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildInkMod {
  
  @JSImport("ink/build/ink", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ink {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Ink extends StObject {
    
    def clear(): Unit = js.native
    
    /* private */ val container: Any = js.native
    
    /* private */ var exitPromise: Any = js.native
    
    /* private */ var fullStaticOutput: Any = js.native
    
    /* private */ var isUnmounted: Any = js.native
    
    /* private */ var lastOutput: Any = js.native
    
    /* private */ val log: Any = js.native
    
    def onRender(): Unit = js.native
    
    /* private */ val options: Any = js.native
    
    def patchConsole(): Unit = js.native
    
    def rejectExitPromise(): Unit = js.native
    def rejectExitPromise(reason: js.Error): Unit = js.native
    
    def render(node: Node): Unit = js.native
    
    def resolveExitPromise(): Unit = js.native
    
    /* private */ var restoreConsole: Any = js.native
    
    /* private */ val rootNode: Any = js.native
    
    /* private */ val throttledLog: Any = js.native
    
    def unmount(): Unit = js.native
    def unmount(error: js.Error): Unit = js.native
    def unmount(error: Double): Unit = js.native
    
    def unsubscribeExit(): Unit = js.native
    
    /* private */ val unsubscribeResize: Any = js.native
    
    def waitUntilExit(): js.Promise[Unit] = js.native
    
    def writeToStderr(data: String): Unit = js.native
    
    def writeToStdout(data: String): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var debug: Boolean
    
    var exitOnCtrlC: Boolean
    
    var patchConsole: Boolean
    
    var stderr: WriteStream
    
    var stdin: ReadStream
    
    var stdout: WriteStream
    
    var waitUntilExit: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  }
  object Options {
    
    inline def apply(
      debug: Boolean,
      exitOnCtrlC: Boolean,
      patchConsole: Boolean,
      stderr: WriteStream,
      stdin: ReadStream,
      stdout: WriteStream
    ): Options = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], exitOnCtrlC = exitOnCtrlC.asInstanceOf[js.Any], patchConsole = patchConsole.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdin = stdin.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setExitOnCtrlC(value: Boolean): Self = StObject.set(x, "exitOnCtrlC", value.asInstanceOf[js.Any])
      
      inline def setPatchConsole(value: Boolean): Self = StObject.set(x, "patchConsole", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setWaitUntilExit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "waitUntilExit", value.toJsFn)
      
      inline def setWaitUntilExitUndefined: Self = StObject.set(x, "waitUntilExit", js.undefined)
    }
  }
}
