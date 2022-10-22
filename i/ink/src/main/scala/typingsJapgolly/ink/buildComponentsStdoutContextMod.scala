package typingsJapgolly.ink

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.processMod.global.NodeJS.WriteStream
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildComponentsStdoutContextMod extends Shortcut {
  
  /**
    * `StdoutContext` is a React context, which exposes stdout stream, where Ink renders your app.
    */
  @JSImport("ink/build/components/StdoutContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    /**
      * Stdout stream passed to `render()` in `options.stdout` or `process.stdout` by default.
      */
    val stdout: js.UndefOr[WriteStream] = js.undefined
    
    /**
      * Write any string to stdout, while preserving Ink's output.
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
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `buildComponentsStdoutContextMod.foo` */
  override def _to: Context[Props] = default
}
