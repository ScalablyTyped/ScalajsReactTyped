package typingsJapgolly.callsite

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Array[CallSite] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[CallSite]]
  
  @JSImport("callsite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CallSite extends StObject {
    
    def getColumnNumber(): Double
    
    def getEvalOrigin(): String
    
    def getFileName(): String
    
    def getFunction(): js.Function
    
    def getFunctionName(): String
    
    def getLineNumber(): Double
    
    def getMethodName(): String
    
    def getThis(): Any
    
    def getTypeName(): String
    
    def isConstructor(): Boolean
    
    def isEval(): Boolean
    
    def isNative(): Boolean
    
    def isToplevel(): Boolean
  }
  object CallSite {
    
    inline def apply(
      getColumnNumber: CallbackTo[Double],
      getEvalOrigin: CallbackTo[String],
      getFileName: CallbackTo[String],
      getFunction: CallbackTo[js.Function],
      getFunctionName: CallbackTo[String],
      getLineNumber: CallbackTo[Double],
      getMethodName: CallbackTo[String],
      getThis: CallbackTo[Any],
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
      
      inline def setGetEvalOrigin(value: CallbackTo[String]): Self = StObject.set(x, "getEvalOrigin", value.toJsFn)
      
      inline def setGetFileName(value: CallbackTo[String]): Self = StObject.set(x, "getFileName", value.toJsFn)
      
      inline def setGetFunction(value: CallbackTo[js.Function]): Self = StObject.set(x, "getFunction", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[String]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetMethodName(value: CallbackTo[String]): Self = StObject.set(x, "getMethodName", value.toJsFn)
      
      inline def setGetThis(value: CallbackTo[Any]): Self = StObject.set(x, "getThis", value.toJsFn)
      
      inline def setGetTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getTypeName", value.toJsFn)
      
      inline def setIsConstructor(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstructor", value.toJsFn)
      
      inline def setIsEval(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEval", value.toJsFn)
      
      inline def setIsNative(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNative", value.toJsFn)
      
      inline def setIsToplevel(value: CallbackTo[Boolean]): Self = StObject.set(x, "isToplevel", value.toJsFn)
    }
  }
}
