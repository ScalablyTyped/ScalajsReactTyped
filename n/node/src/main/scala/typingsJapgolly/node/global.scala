package typingsJapgolly.node

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.anon.Transfer
import typingsJapgolly.node.nodeColonconsoleMod.global.Console_
import typingsJapgolly.node.nodeColonconsoleMod.global.console.ConsoleConstructorOptions
import typingsJapgolly.node.processMod.global.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AbortController")
  @js.native
  open class AbortController ()
    extends StObject
       with typingsJapgolly.node.AbortController {
    
    /**
      * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
      */
    /* CompleteClass */
    override def abort(): Unit = js.native
    
    /**
      * Returns the AbortSignal object associated with this object.
      */
    /* CompleteClass */
    override val signal: typingsJapgolly.node.AbortSignal = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("AbortSignal")
  @js.native
  open class AbortSignal ()
    extends StObject
       with typingsJapgolly.node.AbortSignal
  object AbortSignal {
    
    @JSGlobal("AbortSignal")
    @js.native
    val ^ : js.Any = js.native
    
    // TODO: Add abort() static
    inline def timeout(milliseconds: Double): typingsJapgolly.node.AbortSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.node.AbortSignal]
  }
  
  object console extends Shortcut {
    
    @JSGlobal("console")
    @js.native
    val ^ : Console_ = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("console.Console")
    @js.native
    open class Console protected ()
      extends StObject
         with Console_ {
      def this(options: ConsoleConstructorOptions) = this()
      def this(stdout: WritableStream) = this()
      def this(stdout: WritableStream, stderr: WritableStream) = this()
      def this(stdout: WritableStream, stderr: Unit, ignoreErrors: Boolean) = this()
      def this(stdout: WritableStream, stderr: WritableStream, ignoreErrors: Boolean) = this()
    }
    
    type _To = Console_
    
    /* This means you don't have to write `^`, but can instead just say `console.foo` */
    override def _to: Console_ = ^
  }
  
  @JSGlobal("__dirname")
  @js.native
  def dirname: String = js.native
  
  inline def dirname_=(x: String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])
  
  // Same as module.exports
  @JSGlobal("exports")
  @js.native
  def exports: Any = js.native
  inline def exports_=(x: Any): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])
  
  @JSGlobal("__filename")
  @js.native
  def filename: String = js.native
  
  inline def filename_=(x: String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])
  
  /**
    * Only available if `--expose-gc` is passed to the process.
    */
  @JSGlobal("gc")
  @js.native
  def gc: js.UndefOr[js.Function0[Unit]] = js.native
  inline def gc_=(x: js.UndefOr[js.Function0[Unit]]): Unit = js.Dynamic.global.updateDynamic("gc")(x.asInstanceOf[js.Any])
  
  @JSGlobal("global")
  @js.native
  def global: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any = js.native
  inline def global_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof globalThis */ Any
  ): Unit = js.Dynamic.global.updateDynamic("global")(x.asInstanceOf[js.Any])
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  inline def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  inline def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  //#endregion ArrayLike.at() end
  /**
    * @since v17.0.0
    *
    * Creates a deep clone of an object.
    */
  inline def structuredClone[T](value: T): T = js.Dynamic.global.applyDynamic("structuredClone")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def structuredClone[T](value: T, transfer: Transfer): T = (js.Dynamic.global.applyDynamic("structuredClone")(value.asInstanceOf[js.Any], transfer.asInstanceOf[js.Any])).asInstanceOf[T]
}
