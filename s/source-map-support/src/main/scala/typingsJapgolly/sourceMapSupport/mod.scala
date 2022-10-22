package typingsJapgolly.sourceMapSupport

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("source-map-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getErrorSource(error: js.Error): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorSource")(error.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  inline def install(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mapSourcePosition(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSourcePosition")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  inline def resetRetrieveHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetRetrieveHandlers")().asInstanceOf[Unit]
  
  inline def retrieveSourceMap(source: String): UrlAndMap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSourceMap")(source.asInstanceOf[js.Any]).asInstanceOf[UrlAndMap | Null]
  
  inline def wrapCallSite(frame: CallSite): CallSite = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCallSite")(frame.asInstanceOf[js.Any]).asInstanceOf[CallSite]
  inline def wrapCallSite(frame: CallSite, state: State): CallSite = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCallSite")(frame.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[CallSite]
  
  trait CallSite extends StObject {
    
    /**
      * Current column number [if this function was defined in a script]
      */
    def getColumnNumber(): Double | Null
    
    /**
      * A call site object representing the location where eval was called
      * [if this function was created using a call to eval]
      */
    def getEvalOrigin(): js.UndefOr[String]
    
    /**
      * Name of the script [if this function was defined in a script]
      */
    def getFileName(): String | Null
    
    /**
      * Current function
      */
    def getFunction(): js.UndefOr[js.Function1[/* repeated */ Any, Any]]
    
    /**
      * Name of the current function, typically its name property.
      * If a name property is not available an attempt will be made to try
      * to infer a name from the function's context.
      */
    def getFunctionName(): String | Null
    
    /**
      * Current line number [if this function was defined in a script]
      */
    def getLineNumber(): Double | Null
    
    /**
      * Name of the property [of "this" or one of its prototypes] that holds
      * the current function
      */
    def getMethodName(): String | Null
    
    var getScriptNameOrSourceURL: js.UndefOr[js.Function0[String]] = js.undefined
    
    /**
      * Value of "this"
      */
    def getThis(): Any
    
    /**
      * Type of "this" as a string.
      * This is the name of the function stored in the constructor field of
      * "this", if available.  Otherwise the object's [[Class]] internal
      * property.
      */
    def getTypeName(): String | Null
    
    /**
      * Is this a constructor call?
      */
    def isConstructor(): Boolean
    
    /**
      * Does this call take place in code defined by a call to eval?
      */
    def isEval(): Boolean
    
    /**
      * Is this call in native V8 code?
      */
    def isNative(): Boolean
    
    /**
      * Is this a toplevel invocation, that is, is "this" the global object?
      */
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: CallbackTo[Double | Null],
      getEvalOrigin: CallbackTo[js.UndefOr[String]],
      getFileName: CallbackTo[String | Null],
      getFunction: CallbackTo[js.UndefOr[js.Function1[/* repeated */ Any, Any]]],
      getFunctionName: CallbackTo[String | Null],
      getLineNumber: CallbackTo[Double | Null],
      getMethodName: CallbackTo[String | Null],
      getThis: CallbackTo[Any],
      getTypeName: CallbackTo[String | Null],
      isConstructor: CallbackTo[Boolean],
      isEval: CallbackTo[Boolean],
      isNative: CallbackTo[Boolean],
      isToplevel: CallbackTo[Boolean]
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = getColumnNumber.toJsFn, getEvalOrigin = getEvalOrigin.toJsFn, getFileName = getFileName.toJsFn, getFunction = getFunction.toJsFn, getFunctionName = getFunctionName.toJsFn, getLineNumber = getLineNumber.toJsFn, getMethodName = getMethodName.toJsFn, getThis = getThis.toJsFn, getTypeName = getTypeName.toJsFn, isConstructor = isConstructor.toJsFn, isEval = isEval.toJsFn, isNative = isNative.toJsFn, isToplevel = isToplevel.toJsFn)
      __obj.asInstanceOf[CallSite]
    }
    
    extension [Self <: CallSite](x: Self) {
      
      inline def setGetColumnNumber(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getColumnNumber", value.toJsFn)
      
      inline def setGetEvalOrigin(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getEvalOrigin", value.toJsFn)
      
      inline def setGetFileName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFileName", value.toJsFn)
      
      inline def setGetFunction(value: CallbackTo[js.UndefOr[js.Function1[/* repeated */ Any, Any]]]): Self = StObject.set(x, "getFunction", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetMethodName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getMethodName", value.toJsFn)
      
      inline def setGetScriptNameOrSourceURL(value: CallbackTo[String]): Self = StObject.set(x, "getScriptNameOrSourceURL", value.toJsFn)
      
      inline def setGetScriptNameOrSourceURLUndefined: Self = StObject.set(x, "getScriptNameOrSourceURL", js.undefined)
      
      inline def setGetThis(value: CallbackTo[Any]): Self = StObject.set(x, "getThis", value.toJsFn)
      
      inline def setGetTypeName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getTypeName", value.toJsFn)
      
      inline def setIsConstructor(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstructor", value.toJsFn)
      
      inline def setIsEval(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEval", value.toJsFn)
      
      inline def setIsNative(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNative", value.toJsFn)
      
      inline def setIsToplevel(value: CallbackTo[Boolean]): Self = StObject.set(x, "isToplevel", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.auto
    - typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.browser
    - typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.node
  */
  trait Environment extends StObject
  object Environment {
    
    inline def auto: typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.auto = "auto".asInstanceOf[typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.auto]
    
    inline def browser: typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.browser = "browser".asInstanceOf[typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.browser]
    
    inline def node: typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.node = "node".asInstanceOf[typingsJapgolly.sourceMapSupport.sourceMapSupportStrings.node]
  }
  
  trait Options extends StObject {
    
    /**
      * If `true`, the caches are reset before a stack trace formatting operation.
      */
    var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The module will by default assume a browser environment if `XMLHttpRequest` and `window`
      * are defined. If either of these do not exist it will instead assume a node environment.
      * In some rare cases, e.g. when running a browser emulation and where both variables are
      * also set, you can explicitly specify the environment to be either `'browser'` or `'node'`.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   environment: 'node'
      * });
      */
    var environment: js.UndefOr[Environment] = js.undefined
    
    /**
      * This module installs two things: a change to the `stack` property on `Error`
      * objects and a handler for uncaught exceptions that mimics node's default exception
      * handler (the handler can be seen in the demos below). You may want to disable the
      * handler if you have your own uncaught exception handler. This can be done by passing
      * an argument to the installer.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   handleUncaughtExceptions: false
      * });
      */
    var handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To support files with inline source maps, the `hookRequire` options can be specified,
      * which will monitor all source files for inline source maps.
      *
      * This monkey patches the `require` module loading chain, so is not enabled by default
      * and is not recommended for any sort of production usage.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   hookRequire: true
      * });
      * ```
      */
    var hookRequire: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable all other means of retrieving file contents and use only the provided
      * `retrieveFile` handler.
      */
    var overrideRetrieveFile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable all other means of retrieving source maps and use only the provided
      * `retrieveSourceMap` handler.
      */
    var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow sources to be found by methods other than reading the files
      * directly from disk.
      */
    var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String | Null]] = js.undefined
    
    /**
      * This module loads source maps from the filesystem by default. You can provide alternate
      * loading behavior through a callback as shown below. For example, [Meteor](https://github.com/meteor)
      * keeps all source maps cached in memory to avoid disk access.
      *
      * @example
      * import { install } from 'source-map-support';
      *
      * install({
      *   retrieveSourceMap(source) {
      *     if (source === 'compiled.js') {
      *       return {
      *         url: 'original.js',
      *         map: fs.readFileSync('compiled.js.map', 'utf8')
      *       };
      *     }
      *     return null;
      *   }
      * });
      */
    var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEmptyCacheBetweenOperations(value: Boolean): Self = StObject.set(x, "emptyCacheBetweenOperations", value.asInstanceOf[js.Any])
      
      inline def setEmptyCacheBetweenOperationsUndefined: Self = StObject.set(x, "emptyCacheBetweenOperations", js.undefined)
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setHandleUncaughtExceptions(value: Boolean): Self = StObject.set(x, "handleUncaughtExceptions", value.asInstanceOf[js.Any])
      
      inline def setHandleUncaughtExceptionsUndefined: Self = StObject.set(x, "handleUncaughtExceptions", js.undefined)
      
      inline def setHookRequire(value: Boolean): Self = StObject.set(x, "hookRequire", value.asInstanceOf[js.Any])
      
      inline def setHookRequireUndefined: Self = StObject.set(x, "hookRequire", js.undefined)
      
      inline def setOverrideRetrieveFile(value: Boolean): Self = StObject.set(x, "overrideRetrieveFile", value.asInstanceOf[js.Any])
      
      inline def setOverrideRetrieveFileUndefined: Self = StObject.set(x, "overrideRetrieveFile", js.undefined)
      
      inline def setOverrideRetrieveSourceMap(value: Boolean): Self = StObject.set(x, "overrideRetrieveSourceMap", value.asInstanceOf[js.Any])
      
      inline def setOverrideRetrieveSourceMapUndefined: Self = StObject.set(x, "overrideRetrieveSourceMap", js.undefined)
      
      inline def setRetrieveFile(value: /* path */ String => String | Null): Self = StObject.set(x, "retrieveFile", js.Any.fromFunction1(value))
      
      inline def setRetrieveFileUndefined: Self = StObject.set(x, "retrieveFile", js.undefined)
      
      inline def setRetrieveSourceMap(value: /* source */ String => UrlAndMap | Null): Self = StObject.set(x, "retrieveSourceMap", js.Any.fromFunction1(value))
      
      inline def setRetrieveSourceMapUndefined: Self = StObject.set(x, "retrieveSourceMap", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var source: String
  }
  object Position {
    
    inline def apply(column: Double, line: Double, source: String): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var curPosition: Position | Null
    
    var nextPosition: Position | Null
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal(curPosition = null, nextPosition = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCurPosition(value: Position): Self = StObject.set(x, "curPosition", value.asInstanceOf[js.Any])
      
      inline def setCurPositionNull: Self = StObject.set(x, "curPosition", null)
      
      inline def setNextPosition(value: Position): Self = StObject.set(x, "nextPosition", value.asInstanceOf[js.Any])
      
      inline def setNextPositionNull: Self = StObject.set(x, "nextPosition", null)
    }
  }
  
  trait UrlAndMap extends StObject {
    
    var map: String | RawSourceMap
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UrlAndMap {
    
    inline def apply(map: String | RawSourceMap): UrlAndMap = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlAndMap]
    }
    
    extension [Self <: UrlAndMap](x: Self) {
      
      inline def setMap(value: String | RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
