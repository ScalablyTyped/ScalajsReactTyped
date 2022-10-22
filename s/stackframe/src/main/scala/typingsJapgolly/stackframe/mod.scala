package typingsJapgolly.stackframe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stackframe", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with StackFrame {
    def this(obj: StackFrameOptions) = this()
    
    /* CompleteClass */
    override def getArgs(): js.UndefOr[js.Array[Any]] = js.native
    
    /* CompleteClass */
    override def getColumnNumber(): js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def getEvalOrigin(): js.UndefOr[StackFrame] = js.native
    
    /* CompleteClass */
    override def getFileName(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def getFunctionName(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def getIsConstructor(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getIsEval(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getIsNative(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getIsToplevel(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    override def getLineNumber(): js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def getSource(): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def setArgs(args: js.Array[Any]): Unit = js.native
    
    /* CompleteClass */
    override def setColumnNumber(columnNumber: Double): Unit = js.native
    
    /* CompleteClass */
    override def setEvalOrigin(stackframe: StackFrame): Unit = js.native
    
    /* CompleteClass */
    override def setFileName(fileName: String): Unit = js.native
    
    /* CompleteClass */
    override def setFunctionName(functionName: String): Unit = js.native
    
    /* CompleteClass */
    override def setIsConstructor(isConstructor: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setIsEval(isEval: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setIsNative(isNative: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setIsToplevel(isToplevel: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setLineNumber(lineNumber: Double): Unit = js.native
    
    /* CompleteClass */
    override def setSource(source: String): Unit = js.native
  }
  
  trait StackFrame extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    def getArgs(): js.UndefOr[js.Array[Any]]
    
    def getColumnNumber(): js.UndefOr[Double]
    
    def getEvalOrigin(): js.UndefOr[StackFrame]
    
    def getFileName(): js.UndefOr[String]
    
    def getFunctionName(): js.UndefOr[String]
    
    def getIsConstructor(): js.UndefOr[Boolean]
    
    def getIsEval(): js.UndefOr[Boolean]
    
    def getIsNative(): js.UndefOr[Boolean]
    
    def getIsToplevel(): js.UndefOr[Boolean]
    
    def getLineNumber(): js.UndefOr[Double]
    
    def getSource(): js.UndefOr[String]
    
    var isConstructor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isToplevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    def setArgs(args: js.Array[Any]): Unit
    
    def setColumnNumber(columnNumber: Double): Unit
    
    def setEvalOrigin(stackframe: StackFrame): Unit
    
    def setFileName(fileName: String): Unit
    
    def setFunctionName(functionName: String): Unit
    
    def setIsConstructor(isConstructor: Boolean): Unit
    
    def setIsEval(isEval: Boolean): Unit
    
    def setIsNative(isNative: Boolean): Unit
    
    def setIsToplevel(isToplevel: Boolean): Unit
    
    def setLineNumber(lineNumber: Double): Unit
    
    def setSource(source: String): Unit
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrame {
    
    inline def apply(
      getArgs: CallbackTo[js.UndefOr[js.Array[Any]]],
      getColumnNumber: CallbackTo[js.UndefOr[Double]],
      getEvalOrigin: CallbackTo[js.UndefOr[StackFrame]],
      getFileName: CallbackTo[js.UndefOr[String]],
      getFunctionName: CallbackTo[js.UndefOr[String]],
      getIsConstructor: CallbackTo[js.UndefOr[Boolean]],
      getIsEval: CallbackTo[js.UndefOr[Boolean]],
      getIsNative: CallbackTo[js.UndefOr[Boolean]],
      getIsToplevel: CallbackTo[js.UndefOr[Boolean]],
      getLineNumber: CallbackTo[js.UndefOr[Double]],
      getSource: CallbackTo[js.UndefOr[String]],
      setArgs: js.Array[Any] => Callback,
      setColumnNumber: Double => Callback,
      setEvalOrigin: StackFrame => Callback,
      setFileName: String => Callback,
      setFunctionName: String => Callback,
      setIsConstructor: Boolean => Callback,
      setIsEval: Boolean => Callback,
      setIsNative: Boolean => Callback,
      setIsToplevel: Boolean => Callback,
      setLineNumber: Double => Callback,
      setSource: String => Callback
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getArgs = getArgs.toJsFn, getColumnNumber = getColumnNumber.toJsFn, getEvalOrigin = getEvalOrigin.toJsFn, getFileName = getFileName.toJsFn, getFunctionName = getFunctionName.toJsFn, getIsConstructor = getIsConstructor.toJsFn, getIsEval = getIsEval.toJsFn, getIsNative = getIsNative.toJsFn, getIsToplevel = getIsToplevel.toJsFn, getLineNumber = getLineNumber.toJsFn, getSource = getSource.toJsFn, setArgs = js.Any.fromFunction1((t0: js.Array[Any]) => setArgs(t0).runNow()), setColumnNumber = js.Any.fromFunction1((t0: Double) => setColumnNumber(t0).runNow()), setEvalOrigin = js.Any.fromFunction1((t0: StackFrame) => setEvalOrigin(t0).runNow()), setFileName = js.Any.fromFunction1((t0: String) => setFileName(t0).runNow()), setFunctionName = js.Any.fromFunction1((t0: String) => setFunctionName(t0).runNow()), setIsConstructor = js.Any.fromFunction1((t0: Boolean) => setIsConstructor(t0).runNow()), setIsEval = js.Any.fromFunction1((t0: Boolean) => setIsEval(t0).runNow()), setIsNative = js.Any.fromFunction1((t0: Boolean) => setIsNative(t0).runNow()), setIsToplevel = js.Any.fromFunction1((t0: Boolean) => setIsToplevel(t0).runNow()), setLineNumber = js.Any.fromFunction1((t0: Double) => setLineNumber(t0).runNow()), setSource = js.Any.fromFunction1((t0: String) => setSource(t0).runNow()))
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
      
      inline def setGetArgs(value: CallbackTo[js.UndefOr[js.Array[Any]]]): Self = StObject.set(x, "getArgs", value.toJsFn)
      
      inline def setGetColumnNumber(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "getColumnNumber", value.toJsFn)
      
      inline def setGetEvalOrigin(value: CallbackTo[js.UndefOr[StackFrame]]): Self = StObject.set(x, "getEvalOrigin", value.toJsFn)
      
      inline def setGetFileName(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getFileName", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetIsConstructor(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "getIsConstructor", value.toJsFn)
      
      inline def setGetIsEval(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "getIsEval", value.toJsFn)
      
      inline def setGetIsNative(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "getIsNative", value.toJsFn)
      
      inline def setGetIsToplevel(value: CallbackTo[js.UndefOr[Boolean]]): Self = StObject.set(x, "getIsToplevel", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetSource(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getSource", value.toJsFn)
      
      inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      inline def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsToplevel(value: Boolean): Self = StObject.set(x, "isToplevel", value.asInstanceOf[js.Any])
      
      inline def setIsToplevelUndefined: Self = StObject.set(x, "isToplevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSetArgs(value: js.Array[Any] => Callback): Self = StObject.set(x, "setArgs", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
      
      inline def setSetColumnNumber(value: Double => Callback): Self = StObject.set(x, "setColumnNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetEvalOrigin(value: StackFrame => Callback): Self = StObject.set(x, "setEvalOrigin", js.Any.fromFunction1((t0: StackFrame) => value(t0).runNow()))
      
      inline def setSetFileName(value: String => Callback): Self = StObject.set(x, "setFileName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetFunctionName(value: String => Callback): Self = StObject.set(x, "setFunctionName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetIsConstructor(value: Boolean => Callback): Self = StObject.set(x, "setIsConstructor", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetIsEval(value: Boolean => Callback): Self = StObject.set(x, "setIsEval", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetIsNative(value: Boolean => Callback): Self = StObject.set(x, "setIsNative", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetIsToplevel(value: Boolean => Callback): Self = StObject.set(x, "setIsToplevel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetLineNumber(value: Double => Callback): Self = StObject.set(x, "setLineNumber", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSetSource(value: String => Callback): Self = StObject.set(x, "setSource", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait StackFrameOptions extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var columnNumber: js.UndefOr[Double] = js.undefined
    
    var evalOrigin: js.UndefOr[StackFrame] = js.undefined
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var functionName: js.UndefOr[String] = js.undefined
    
    var isConstructor: js.UndefOr[Boolean] = js.undefined
    
    var isEval: js.UndefOr[Boolean] = js.undefined
    
    var isNative: js.UndefOr[Boolean] = js.undefined
    
    var isToplevel: js.UndefOr[Boolean] = js.undefined
    
    var lineNumber: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String] = js.undefined
  }
  object StackFrameOptions {
    
    inline def apply(): StackFrameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackFrameOptions]
    }
    
    extension [Self <: StackFrameOptions](x: Self) {
      
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
      
      inline def setIsConstructor(value: Boolean): Self = StObject.set(x, "isConstructor", value.asInstanceOf[js.Any])
      
      inline def setIsConstructorUndefined: Self = StObject.set(x, "isConstructor", js.undefined)
      
      inline def setIsEval(value: Boolean): Self = StObject.set(x, "isEval", value.asInstanceOf[js.Any])
      
      inline def setIsEvalUndefined: Self = StObject.set(x, "isEval", js.undefined)
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsNativeUndefined: Self = StObject.set(x, "isNative", js.undefined)
      
      inline def setIsToplevel(value: Boolean): Self = StObject.set(x, "isToplevel", value.asInstanceOf[js.Any])
      
      inline def setIsToplevelUndefined: Self = StObject.set(x, "isToplevel", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
