package typingsJapgolly.callsites

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("callsites", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[CallSite] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[CallSite]]
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  trait CallSite extends StObject {
    
    /**
    	Returns the current column number if this function was defined in a script.
    	*/
    def getColumnNumber(): Double | Null
    
    /**
    	Returns a string representing the location where `eval` was called if this function was created using a call to `eval`.
    	*/
    def getEvalOrigin(): js.UndefOr[String]
    
    /**
    	Returns the name of the script if this function was defined in a script.
    	*/
    def getFileName(): String | Null
    
    /**
    	Returns the current function.
    	*/
    def getFunction(): js.UndefOr[AnyFunction]
    
    /**
    	Returns the name of the current function, typically its `name` property. If a name property is not available an attempt will be made to try to infer a name from the function's context.
    	*/
    def getFunctionName(): String | Null
    
    /**
    	Returns the current line number if this function was defined in a script.
    	*/
    def getLineNumber(): Double | Null
    
    /**
    	Returns the name of the property of `this` or one of its prototypes that holds the current function.
    	*/
    def getMethodName(): js.UndefOr[String]
    
    /**
    	Returns the value of `this`.
    	*/
    def getThis(): js.UndefOr[Any]
    
    /**
    	Returns the type of `this` as a string. This is the name of the function stored in the constructor field of `this`, if available, otherwise the object's `[[Class]]` internal property.
    	*/
    def getTypeName(): String | Null
    
    /**
    	Returns `true` if this is a constructor call.
    	*/
    def isConstructor(): Boolean
    
    /**
    	Returns `true` if this call takes place in code defined by a call to `eval`.
    	*/
    def isEval(): Boolean
    
    /**
    	Returns `true` if this call is in native V8 code.
    	*/
    def isNative(): Boolean
    
    /**
    	Returns `true` if this is a top-level invocation, that is, if it's a global object.
    	*/
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: CallbackTo[Double | Null],
      getEvalOrigin: CallbackTo[js.UndefOr[String]],
      getFileName: CallbackTo[String | Null],
      getFunction: CallbackTo[js.UndefOr[AnyFunction]],
      getFunctionName: CallbackTo[String | Null],
      getLineNumber: CallbackTo[Double | Null],
      getMethodName: CallbackTo[js.UndefOr[String]],
      getThis: CallbackTo[js.UndefOr[Any]],
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
      
      inline def setGetFunction(value: CallbackTo[js.UndefOr[AnyFunction]]): Self = StObject.set(x, "getFunction", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetMethodName(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getMethodName", value.toJsFn)
      
      inline def setGetThis(value: CallbackTo[js.UndefOr[Any]]): Self = StObject.set(x, "getThis", value.toJsFn)
      
      inline def setGetTypeName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getTypeName", value.toJsFn)
      
      inline def setIsConstructor(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstructor", value.toJsFn)
      
      inline def setIsEval(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEval", value.toJsFn)
      
      inline def setIsNative(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNative", value.toJsFn)
      
      inline def setIsToplevel(value: CallbackTo[Boolean]): Self = StObject.set(x, "isToplevel", value.toJsFn)
    }
  }
}
