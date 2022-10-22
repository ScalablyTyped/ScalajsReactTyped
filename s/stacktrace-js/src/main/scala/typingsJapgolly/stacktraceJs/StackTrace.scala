package typingsJapgolly.stacktraceJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackTrace {
  
  type SourceCache = StringDictionary[String | js.Promise[String]]
  
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    def getArgs(): js.Array[Any]
    
    def getColumnNumber(): Double
    
    def getEvalOrigin(): StackFrame
    
    def getFileName(): String
    
    def getFunctionName(): String
    
    def getIsConstructor(): Boolean
    
    def getIsEval(): Boolean
    
    def getIsNative(): Boolean
    
    def getIsTopLevel(): Boolean
    
    def getLineNumber(): Double
    
    def getSource(): String
    
    var isConstructor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isTopLevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    def setArgs(): Unit
    
    def setColumnNumber(): Unit
    
    def setEvalOrigin(): Unit
    
    def setFileName(): Unit
    
    def setFunctionName(): Unit
    
    def setIsConstructor(): Unit
    
    def setIsEval(): Unit
    
    def setIsNative(): Unit
    
    def setIsTopLevel(): Unit
    
    def setLineNumber(): Unit
    
    def setSource(): Unit
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrame {
    
    inline def apply(
      getArgs: CallbackTo[js.Array[Any]],
      getColumnNumber: CallbackTo[Double],
      getEvalOrigin: CallbackTo[StackFrame],
      getFileName: CallbackTo[String],
      getFunctionName: CallbackTo[String],
      getIsConstructor: CallbackTo[Boolean],
      getIsEval: CallbackTo[Boolean],
      getIsNative: CallbackTo[Boolean],
      getIsTopLevel: CallbackTo[Boolean],
      getLineNumber: CallbackTo[Double],
      getSource: CallbackTo[String],
      setArgs: Callback,
      setColumnNumber: Callback,
      setEvalOrigin: Callback,
      setFileName: Callback,
      setFunctionName: Callback,
      setIsConstructor: Callback,
      setIsEval: Callback,
      setIsNative: Callback,
      setIsTopLevel: Callback,
      setLineNumber: Callback,
      setSource: Callback
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getArgs = getArgs.toJsFn, getColumnNumber = getColumnNumber.toJsFn, getEvalOrigin = getEvalOrigin.toJsFn, getFileName = getFileName.toJsFn, getFunctionName = getFunctionName.toJsFn, getIsConstructor = getIsConstructor.toJsFn, getIsEval = getIsEval.toJsFn, getIsNative = getIsNative.toJsFn, getIsTopLevel = getIsTopLevel.toJsFn, getLineNumber = getLineNumber.toJsFn, getSource = getSource.toJsFn, setArgs = setArgs.toJsFn, setColumnNumber = setColumnNumber.toJsFn, setEvalOrigin = setEvalOrigin.toJsFn, setFileName = setFileName.toJsFn, setFunctionName = setFunctionName.toJsFn, setIsConstructor = setIsConstructor.toJsFn, setIsEval = setIsEval.toJsFn, setIsNative = setIsNative.toJsFn, setIsTopLevel = setIsTopLevel.toJsFn, setLineNumber = setLineNumber.toJsFn, setSource = setSource.toJsFn)
      __obj.asInstanceOf[StackFrame]
    }
    
    extension [Self <: StackFrame](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
      
      inline def setEvalOrigin(value: StackFrame): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      inline def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
      
      inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
      
      inline def setGetArgs(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getArgs", value.toJsFn)
      
      inline def setGetColumnNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnNumber", value.toJsFn)
      
      inline def setGetEvalOrigin(value: CallbackTo[StackFrame]): Self = StObject.set(x, "getEvalOrigin", value.toJsFn)
      
      inline def setGetFileName(value: CallbackTo[String]): Self = StObject.set(x, "getFileName", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[String]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetIsConstructor(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsConstructor", value.toJsFn)
      
      inline def setGetIsEval(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsEval", value.toJsFn)
      
      inline def setGetIsNative(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsNative", value.toJsFn)
      
      inline def setGetIsTopLevel(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsTopLevel", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetSource(value: CallbackTo[String]): Self = StObject.set(x, "getSource", value.toJsFn)
      
      inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      inline def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsTopLevel(value: Boolean): Self = StObject.set(x, "isTopLevel", value.asInstanceOf[js.Any])
      
      inline def setIsTopLevelUndefined: Self = StObject.set(x, "isTopLevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSetArgs(value: Callback): Self = StObject.set(x, "setArgs", value.toJsFn)
      
      inline def setSetColumnNumber(value: Callback): Self = StObject.set(x, "setColumnNumber", value.toJsFn)
      
      inline def setSetEvalOrigin(value: Callback): Self = StObject.set(x, "setEvalOrigin", value.toJsFn)
      
      inline def setSetFileName(value: Callback): Self = StObject.set(x, "setFileName", value.toJsFn)
      
      inline def setSetFunctionName(value: Callback): Self = StObject.set(x, "setFunctionName", value.toJsFn)
      
      inline def setSetIsConstructor(value: Callback): Self = StObject.set(x, "setIsConstructor", value.toJsFn)
      
      inline def setSetIsEval(value: Callback): Self = StObject.set(x, "setIsEval", value.toJsFn)
      
      inline def setSetIsNative(value: Callback): Self = StObject.set(x, "setIsNative", value.toJsFn)
      
      inline def setSetIsTopLevel(value: Callback): Self = StObject.set(x, "setIsTopLevel", value.toJsFn)
      
      inline def setSetLineNumber(value: Callback): Self = StObject.set(x, "setLineNumber", value.toJsFn)
      
      inline def setSetSource(value: Callback): Self = StObject.set(x, "setSource", value.toJsFn)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait StackTraceOptions extends StObject {
    
    var filter: js.UndefOr[js.Function1[/* stackFrame */ StackFrame, Boolean]] = js.undefined
    
    var offline: js.UndefOr[Boolean] = js.undefined
    
    var sourceCache: js.UndefOr[SourceCache] = js.undefined
  }
  object StackTraceOptions {
    
    inline def apply(): StackTraceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackTraceOptions]
    }
    
    extension [Self <: StackTraceOptions](x: Self) {
      
      inline def setFilter(value: /* stackFrame */ StackFrame => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      inline def setSourceCache(value: SourceCache): Self = StObject.set(x, "sourceCache", value.asInstanceOf[js.Any])
      
      inline def setSourceCacheUndefined: Self = StObject.set(x, "sourceCache", js.undefined)
    }
  }
}
