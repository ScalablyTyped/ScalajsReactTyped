package typingsJapgolly.ink

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.processMod.global.NodeJS.WriteStream
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsStderrContextMod extends Shortcut {
  
  /**
    * `StderrContext` is a React context, which exposes stderr stream.
    */
  @JSImport("ink/build/components/StderrContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Stderr stream passed to `render()` in `options.stderr` or `process.stderr` by default.
      */
    val stderr: js.UndefOr[WriteStream] = js.undefined
    
    /**
      * Write any string to stderr, while preserving Ink's output.
      * It's useful when you want to display some external information outside of Ink's rendering and ensure there's no conflict between the two.
      * It's similar to `<Static>`, except it can't accept components, it only works with strings.
      */
    def write(data: String): Unit
  }
  object Props {
    
    inline def apply(write: String => Callback): Props = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsStderrContextMod.foo` */
  override def _to: Context[Props] = default
}
