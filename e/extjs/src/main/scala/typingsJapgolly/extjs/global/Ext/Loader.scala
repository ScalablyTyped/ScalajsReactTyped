package typingsJapgolly.extjs.global.Ext

import typingsJapgolly.extjs.Ext.ILoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Loader")
@js.native
open class Loader ()
  extends StObject
     with typingsJapgolly.extjs.Ext.Loader
/* static members */
object Loader {
  
  @JSGlobal("Ext.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Sets a batch of path entries
    * @param paths Object a set of className: path mappings
    * @returns Ext.Loader this
    */
  inline def addClassPathMappings(): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("addClassPathMappings")().asInstanceOf[ILoader]
  inline def addClassPathMappings(paths: typingsJapgolly.extjs.Ext.Object): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("addClassPathMappings")(paths.asInstanceOf[js.Any]).asInstanceOf[ILoader]
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.disableCaching")
  @js.native
  def disableCaching: Boolean = js.native
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Loader.disableCachingParam")
  @js.native
  def disableCachingParam: java.lang.String = js.native
  inline def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
  
  inline def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.enabled")
  @js.native
  def enabled: Boolean = js.native
  inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  /** [Method] Explicitly exclude files from being loaded
    * @param excludes Array
    * @returns Object object contains require method for chaining
    */
  inline def exclude(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")().asInstanceOf[Any]
  inline def exclude(excludes: typingsJapgolly.extjs.Ext.Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(excludes.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.garbageCollect")
  @js.native
  def garbageCollect: Boolean = js.native
  inline def garbageCollect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("garbageCollect")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the config value corresponding to the specified name
    * @param name String The config property name
    * @returns Object
    */
  inline def getConfig(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[Any]
  inline def getConfig(name: java.lang.String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /** [Method] Translates a className to a file path by adding the the proper prefix and converting the  s to  s
    * @param className String
    * @returns String path
    */
  inline def getPath(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[java.lang.String]
  inline def getPath(className: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(className.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /** [Property] (Array) */
  @JSGlobal("Ext.Loader.history")
  @js.native
  def history: typingsJapgolly.extjs.Ext.Array = js.native
  inline def history_=(x: typingsJapgolly.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  
  /** [Method] Loads the specified script URL and calls the supplied callbacks
    * @param options Object/String The options object or simply the URL to load.
    */
  inline def loadScript(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")().asInstanceOf[Unit]
  inline def loadScript(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Add a new listener to be executed when all required scripts are fully loaded
    * @param fn Function The function callback to be executed
    * @param scope Object The execution scope (this) of the callback function
    * @param withDomReady Boolean Whether or not to wait for document dom ready as well
    */
  inline def onReady(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")().asInstanceOf[Unit]
  inline def onReady(fn: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onReady(fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onReady(fn: Any, scope: Any, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onReady(fn: Any, scope: Unit, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onReady(fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onReady(fn: Unit, scope: Any, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def onReady(fn: Unit, scope: Unit, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Loader.paths")
  @js.native
  def paths: Any = js.native
  inline def paths_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paths")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.preserveScripts")
  @js.native
  def preserveScripts: Boolean = js.native
  inline def preserveScripts_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preserveScripts")(x.asInstanceOf[js.Any])
  
  /** [Method] Loads all classes by the given names and all their direct dependencies optionally executes the given callback functi
    * @param expressions String/Array Can either be a string or an array of string
    * @param fn Function The callback function
    * @param scope Object The execution scope (this) of the callback function
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions
    */
  inline def require(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("require")().asInstanceOf[Unit]
  inline def require(expressions: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Any, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Any, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Unit, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Any, fn: Unit, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Any, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Any, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Unit, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def require(expressions: Unit, fn: Unit, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.scriptChainDelay")
  @js.native
  def scriptChainDelay: Boolean = js.native
  inline def scriptChainDelay_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptChainDelay")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Loader.scriptCharset")
  @js.native
  def scriptCharset: java.lang.String = js.native
  inline def scriptCharset_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptCharset")(x.asInstanceOf[js.Any])
  
  /** [Method] Set the configuration for the loader
    * @param config Object The config object to override the default values
    * @returns Ext.Loader this
    */
  inline def setConfig(): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")().asInstanceOf[ILoader]
  inline def setConfig(config: Any): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ILoader]
  
  /** [Method] Sets the path of a namespace
    * @param name String/Object See flexSetter
    * @param path String See flexSetter
    * @returns Ext.Loader this
    */
  inline def setPath(): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")().asInstanceOf[ILoader]
  inline def setPath(name: Any): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(name.asInstanceOf[js.Any]).asInstanceOf[ILoader]
  inline def setPath(name: Any, path: java.lang.String): ILoader = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ILoader]
  inline def setPath(name: Unit, path: java.lang.String): ILoader = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ILoader]
  
  /** [Method] Synchronously loads all classes by the given names and all their direct dependencies optionally executes the given c
    * @param expressions String/Array Can either be a string or an array of string
    * @param fn Function The callback function
    * @param scope Object The execution scope (this) of the callback function
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions
    */
  inline def syncRequire(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")().asInstanceOf[Unit]
  inline def syncRequire(expressions: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Any, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Any, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Unit, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Any, fn: Unit, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Any, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Any, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Any, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Unit, scope: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Unit, scope: Any, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncRequire(expressions: Unit, fn: Unit, scope: Unit, excludes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
