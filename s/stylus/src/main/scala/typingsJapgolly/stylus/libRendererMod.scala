package typingsJapgolly.stylus

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.stylus.mod.RenderCallback
import typingsJapgolly.stylus.mod.RenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRendererMod {
  
  @JSImport("stylus/lib/renderer", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Renderer {
    def this(str: String) = this()
    def this(str: String, options: RenderOptions) = this()
  }
  
  // TODO: rewrite this to proper import in futures
  type Node = Instantiable0[typingsJapgolly.stylus.mod.Stylus.Nodes.Node]
  
  @js.native
  trait Renderer extends EventEmitter {
    
    /**
      * Define function or global var with the given `name`. Optionally
      * the function may accept full expressions, by setting `raw`
      * to `true`.
      */
    def define(name: String, fn: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    def define(name: String, fn: js.Function1[/* repeated */ Any, Any], raw: Boolean): this.type = js.native
    def define(name: String, node: Node): this.type = js.native
    def define(name: String, node: Node, raw: Boolean): this.type = js.native
    def define(name: String, `val`: Any): this.type = js.native
    def define(name: String, `val`: Any, raw: Boolean): this.type = js.native
    
    /**
      * Get dependencies of the compiled file.
      */
    def deps(): js.Array[String] = js.native
    def deps(filename: String): js.Array[String] = js.native
    
    var events: Any = js.native
    
    /**
      * Get option `key`.
      */
    def get(key: String): Any = js.native
    
    /**
      * Import the given `file`.
      */
    def `import`(file: String): this.type = js.native
    
    /**
      * Include the given `path` to the lookup paths array.
      */
    def include(path: String): this.type = js.native
    
    var options: RenderOptions = js.native
    
    /**
      * Parse and evaluate AST and return the result.
      */
    def render(): String = js.native
    /**
      * Parse and evaluate AST, then callback `fn(err, css, js)`.
      */
    def render(callback: RenderCallback): Unit = js.native
    
    /**
      * Set option `key` to `val`.
      */
    def set(key: String, `val`: Any): this.type = js.native
    
    var str: String = js.native
    
    /**
      * Use the given `fn`.
      *
      * This allows for plugins to alter the renderer in
      * any way they wish, exposing paths etc.
      */
    def use(fn: js.Function1[/* renderer */ this.type, Any]): this.type = js.native
  }
}
