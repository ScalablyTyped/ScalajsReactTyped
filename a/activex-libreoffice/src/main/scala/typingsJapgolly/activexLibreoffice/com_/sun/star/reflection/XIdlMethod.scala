package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an IDL interface method. */
trait XIdlMethod
  extends StObject
     with XIdlMember {
  
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  val ExceptionTypes: SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the method mode in which calls are run, i.e. either oneway or twoway. Method mode oneway denotes that a call may be run asynchronously (thus
    * having no out parameters or return value)
    * @returns method mode of reflected method
    */
  val Mode: MethodMode
  
  /**
    * Returns formal parameter information of the reflected method in order of IDL declaration. Parameter information reflects the parameter's access mode
    * (in, out, inout), the parameter's name and formal type.
    * @returns parameter information of reflected method
    */
  val ParameterInfos: SafeArray[ParamInfo]
  
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  val ParameterTypes: SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  val ReturnType: XIdlClass[Any]
  
  /**
    * Returns the declared exceptions types of the reflected method.
    * @returns declared exception types of reflected method
    */
  def getExceptionTypes(): SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the method mode in which calls are run, i.e. either oneway or twoway. Method mode oneway denotes that a call may be run asynchronously (thus
    * having no out parameters or return value)
    * @returns method mode of reflected method
    */
  def getMode(): MethodMode
  
  /**
    * Returns formal parameter information of the reflected method in order of IDL declaration. Parameter information reflects the parameter's access mode
    * (in, out, inout), the parameter's name and formal type.
    * @returns parameter information of reflected method
    */
  def getParameterInfos(): SafeArray[ParamInfo]
  
  /**
    * Returns the formal parameter types of the reflected method in order of IDL declaration.
    * @returns formal parameter types of reflected method
    */
  def getParameterTypes(): SafeArray[XIdlClass[Any]]
  
  /**
    * Returns the return type of the reflected method.
    * @returns return type of reflected method
    */
  def getReturnType(): XIdlClass[Any]
  
  /**
    * Invokes the reflected method on a given object with the given parameters. The parameters may be widening converted to fit their exact IDL type,
    * meaning no loss of information.
    * @param obj object to call on
    * @param args arguments passed to the method
    * @returns return value of the method call (may be empty for methods returning void)
    * @throws IllegalArgumentException if the given object is a nuull reference or does not support the reflected method's interface
    * @throws IllegalArgumentException if the given number of arguments differ from the expected number or the given arguments' types differ from the expected
    * @throws InvocationTargetException if the reflected method that has been invoked has thrown an exception. The original exception will be wrapped up and si
    */
  def invoke(obj: Any, args: js.Array[SeqEquiv[Any]]): Any
}
object XIdlMethod {
  
  inline def apply(
    DeclaringClass: XIdlClass[Any],
    ExceptionTypes: SafeArray[XIdlClass[Any]],
    Mode: MethodMode,
    Name: String,
    ParameterInfos: SafeArray[ParamInfo],
    ParameterTypes: SafeArray[XIdlClass[Any]],
    ReturnType: XIdlClass[Any],
    acquire: Callback,
    getDeclaringClass: CallbackTo[XIdlClass[Any]],
    getExceptionTypes: CallbackTo[SafeArray[XIdlClass[Any]]],
    getMode: CallbackTo[MethodMode],
    getName: CallbackTo[String],
    getParameterInfos: CallbackTo[SafeArray[ParamInfo]],
    getParameterTypes: CallbackTo[SafeArray[XIdlClass[Any]]],
    getReturnType: CallbackTo[XIdlClass[Any]],
    invoke: (Any, js.Array[SeqEquiv[Any]]) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XIdlMethod = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass.asInstanceOf[js.Any], ExceptionTypes = ExceptionTypes.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParameterInfos = ParameterInfos.asInstanceOf[js.Any], ParameterTypes = ParameterTypes.asInstanceOf[js.Any], ReturnType = ReturnType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDeclaringClass = getDeclaringClass.toJsFn, getExceptionTypes = getExceptionTypes.toJsFn, getMode = getMode.toJsFn, getName = getName.toJsFn, getParameterInfos = getParameterInfos.toJsFn, getParameterTypes = getParameterTypes.toJsFn, getReturnType = getReturnType.toJsFn, invoke = js.Any.fromFunction2(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIdlMethod]
  }
  
  extension [Self <: XIdlMethod](x: Self) {
    
    inline def setExceptionTypes(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "ExceptionTypes", value.asInstanceOf[js.Any])
    
    inline def setGetExceptionTypes(value: CallbackTo[SafeArray[XIdlClass[Any]]]): Self = StObject.set(x, "getExceptionTypes", value.toJsFn)
    
    inline def setGetMode(value: CallbackTo[MethodMode]): Self = StObject.set(x, "getMode", value.toJsFn)
    
    inline def setGetParameterInfos(value: CallbackTo[SafeArray[ParamInfo]]): Self = StObject.set(x, "getParameterInfos", value.toJsFn)
    
    inline def setGetParameterTypes(value: CallbackTo[SafeArray[XIdlClass[Any]]]): Self = StObject.set(x, "getParameterTypes", value.toJsFn)
    
    inline def setGetReturnType(value: CallbackTo[XIdlClass[Any]]): Self = StObject.set(x, "getReturnType", value.toJsFn)
    
    inline def setInvoke(value: (Any, js.Array[SeqEquiv[Any]]) => Any): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
    
    inline def setMode(value: MethodMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setParameterInfos(value: SafeArray[ParamInfo]): Self = StObject.set(x, "ParameterInfos", value.asInstanceOf[js.Any])
    
    inline def setParameterTypes(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "ParameterTypes", value.asInstanceOf[js.Any])
    
    inline def setReturnType(value: XIdlClass[Any]): Self = StObject.set(x, "ReturnType", value.asInstanceOf[js.Any])
  }
}
