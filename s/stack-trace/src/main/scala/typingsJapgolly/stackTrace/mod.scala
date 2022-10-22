package typingsJapgolly.stackTrace

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stack-trace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Array[StackFrame]]
  inline def get(belowFn: js.Function0[Unit]): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(belowFn.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  inline def parse(err: js.Error): js.Array[StackFrame] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(err.asInstanceOf[js.Any]).asInstanceOf[js.Array[StackFrame]]
  
  trait StackFrame extends StObject {
    
    def getColumnNumber(): Double
    
    def getFileName(): String
    
    def getFunctionName(): String
    
    def getLineNumber(): Double
    
    def getMethodName(): String
    
    def getTypeName(): String
    
    def isConstructor(): Boolean
    
    def isNative(): Boolean
  }
  object StackFrame {
    
    inline def apply(
      getColumnNumber: CallbackTo[Double],
      getFileName: CallbackTo[String],
      getFunctionName: CallbackTo[String],
      getLineNumber: CallbackTo[Double],
      getMethodName: CallbackTo[String],
      getTypeName: CallbackTo[String],
      isConstructor: CallbackTo[Boolean],
      isNative: CallbackTo[Boolean]
    ): StackFrame = {
      val __obj = js.Dynamic.literal(getColumnNumber = getColumnNumber.toJsFn, getFileName = getFileName.toJsFn, getFunctionName = getFunctionName.toJsFn, getLineNumber = getLineNumber.toJsFn, getMethodName = getMethodName.toJsFn, getTypeName = getTypeName.toJsFn, isConstructor = isConstructor.toJsFn, isNative = isNative.toJsFn)
      __obj.asInstanceOf[StackFrame]
    }
    
    extension [Self <: StackFrame](x: Self) {
      
      inline def setGetColumnNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getColumnNumber", value.toJsFn)
      
      inline def setGetFileName(value: CallbackTo[String]): Self = StObject.set(x, "getFileName", value.toJsFn)
      
      inline def setGetFunctionName(value: CallbackTo[String]): Self = StObject.set(x, "getFunctionName", value.toJsFn)
      
      inline def setGetLineNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getLineNumber", value.toJsFn)
      
      inline def setGetMethodName(value: CallbackTo[String]): Self = StObject.set(x, "getMethodName", value.toJsFn)
      
      inline def setGetTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getTypeName", value.toJsFn)
      
      inline def setIsConstructor(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConstructor", value.toJsFn)
      
      inline def setIsNative(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNative", value.toJsFn)
    }
  }
}
