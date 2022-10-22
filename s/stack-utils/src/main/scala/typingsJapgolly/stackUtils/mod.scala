package typingsJapgolly.stackUtils

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stack-utils", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with StackUtils {
    def this(options: Options) = this()
  }
  @JSImport("stack-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def nodeInternals(): js.Array[js.RegExp] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeInternals")().asInstanceOf[js.Array[js.RegExp]]
  
  trait CallSite extends StObject {
    
    def getColumnNumber(): Double
    
    def getEvalOrigin(): CallSite | String
    
    def getFileName(): js.UndefOr[String]
    
    def getFunction(): js.UndefOr[js.Function]
    
    def getFunctionName(): String
    
    def getLineNumber(): Double
    
    def getMethodName(): String | Null
    
    def getThis(): js.UndefOr[js.Object]
    
    def getTypeName(): String
    
    def isConstructor(): Boolean
    
    def isEval(): Boolean
    
    def isNative(): Boolean
    
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: CallbackTo[Double],
      getEvalOrigin: CallbackTo[CallSite | String],
      getFileName: CallbackTo[js.UndefOr[String]],
      getFunction: CallbackTo[js.UndefOr[js.Function]],
      getFunctionName: CallbackTo[String],
      getLineNumber: CallbackTo[Double],
      getMethodName: CallbackTo[String | Null],
      getThis: CallbackTo[js.UndefOr[js.Object]],
      getTypeName: CallbackTo[String],
      isConstructor: CallbackTo[Boolean],
      isEval: CallbackTo[Boolean],
      isNative: CallbackTo[Boolean],
      isToplevel: CallbackTo[Boolean]
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = getColumnNumber.toJsFn, getEvalOrigin = getEvalOrigin.toJsFn, getFileName = getFileName.toJsFn, getFunction = getFunction.toJsFn, getFunctionName = getFunctionName.toJsFn, getLineNumber = getLineNumber.toJsFn, getMethodName = getMethodName.toJsFn, getThis = getThis.toJsFn, getTypeName = getTypeName.toJsFn, isConstructor = isConstructor.toJsFn, isEval = isEval.toJsFn, isNative = isNative.toJsFn, isToplevel = isToplevel.toJsFn)
      __obj.asInstanceOf[CallSite]
    }
    
    extension [Self <: CallSite](x: Self) {
      
      inline def setGetColumnNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnNumber", value.toJsFn)
      
      inline def setGetEvalOrigin(value: CallbackTo[CallSite | String]): Self = StObject.set(x, "getEvalOrigin", value.toJsFn)
      
      inline def setGetFileName(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getFileName", value.toJsFn)
      
      inline def setGetFunction(value: CallbackTo[js.UndefOr[js.Function]]): Self = StObject.set(x, "getFunction", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[String]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetMethodName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getMethodName", value.toJsFn)
      
      inline def setGetThis(value: CallbackTo[js.UndefOr[js.Object]]): Self = StObject.set(x, "getThis", value.toJsFn)
      
      inline def setGetTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getTypeName", value.toJsFn)
      
      inline def setIsConstructor(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstructor", value.toJsFn)
      
      inline def setIsEval(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEval", value.toJsFn)
      
      inline def setIsNative(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNative", value.toJsFn)
      
      inline def setIsToplevel(value: CallbackTo[Boolean]): Self = StObject.set(x, "isToplevel", value.toJsFn)
    }
  }
  
  trait CallSiteLike
    extends StObject
       with StackData {
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CallSiteLike {
    
    inline def apply(): CallSiteLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSiteLike]
    }
    
    extension [Self <: CallSiteLike](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var ignoredPackages: js.UndefOr[js.Array[String]] = js.undefined
    
    var internals: js.UndefOr[js.Array[js.RegExp]] = js.undefined
    
    var wrapCallSite: js.UndefOr[js.Function1[/* callSite */ CallSite, CallSite]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setIgnoredPackages(value: js.Array[String]): Self = StObject.set(x, "ignoredPackages", value.asInstanceOf[js.Any])
      
      inline def setIgnoredPackagesUndefined: Self = StObject.set(x, "ignoredPackages", js.undefined)
      
      inline def setIgnoredPackagesVarargs(value: String*): Self = StObject.set(x, "ignoredPackages", js.Array(value*))
      
      inline def setInternals(value: js.Array[js.RegExp]): Self = StObject.set(x, "internals", value.asInstanceOf[js.Any])
      
      inline def setInternalsUndefined: Self = StObject.set(x, "internals", js.undefined)
      
      inline def setInternalsVarargs(value: js.RegExp*): Self = StObject.set(x, "internals", js.Array(value*))
      
      inline def setWrapCallSite(value: /* callSite */ CallSite => CallSite): Self = StObject.set(x, "wrapCallSite", js.Any.fromFunction1(value))
      
      inline def setWrapCallSiteUndefined: Self = StObject.set(x, "wrapCallSite", js.undefined)
    }
  }
  
  trait StackData extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var constructor: js.UndefOr[Boolean] = js.undefined
    
    var evalOrigin: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var function: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
  }
  object StackData {
    
    inline def apply(): StackData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackData]
    }
    
    extension [Self <: StackData](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setConstructor(value: Boolean): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setEvalOrigin(value: String): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      inline def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    }
  }
  
  trait StackLineData
    extends StObject
       with StackData {
    
    var evalColumn: js.UndefOr[Double] = js.undefined
    
    var evalFile: js.UndefOr[String] = js.undefined
    
    var evalLine: js.UndefOr[Double] = js.undefined
  }
  object StackLineData {
    
    inline def apply(): StackLineData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackLineData]
    }
    
    extension [Self <: StackLineData](x: Self) {
      
      inline def setEvalColumn(value: Double): Self = StObject.set(x, "evalColumn", value.asInstanceOf[js.Any])
      
      inline def setEvalColumnUndefined: Self = StObject.set(x, "evalColumn", js.undefined)
      
      inline def setEvalFile(value: String): Self = StObject.set(x, "evalFile", value.asInstanceOf[js.Any])
      
      inline def setEvalFileUndefined: Self = StObject.set(x, "evalFile", js.undefined)
      
      inline def setEvalLine(value: Double): Self = StObject.set(x, "evalLine", value.asInstanceOf[js.Any])
      
      inline def setEvalLineUndefined: Self = StObject.set(x, "evalLine", js.undefined)
    }
  }
  
  @js.native
  trait StackUtils extends StObject {
    
    def at(): CallSiteLike = js.native
    def at(startStackFunction: js.Function): CallSiteLike = js.native
    
    def capture(): js.Array[CallSite] = js.native
    def capture(limit: Double): js.Array[CallSite] = js.native
    def capture(limit: Double, startStackFunction: js.Function): js.Array[CallSite] = js.native
    def capture(limit: Unit, startStackFunction: js.Function): js.Array[CallSite] = js.native
    def capture(startStackFunction: js.Function): js.Array[CallSite] = js.native
    
    def captureString(): String = js.native
    def captureString(limit: Double): String = js.native
    def captureString(limit: Double, startStackFunction: js.Function): String = js.native
    def captureString(limit: Unit, startStackFunction: js.Function): String = js.native
    def captureString(startStackFunction: js.Function): String = js.native
    
    def clean(stack: String): String = js.native
    def clean(stack: js.Array[String]): String = js.native
    
    def parseLine(line: String): StackLineData | Null = js.native
  }
}
