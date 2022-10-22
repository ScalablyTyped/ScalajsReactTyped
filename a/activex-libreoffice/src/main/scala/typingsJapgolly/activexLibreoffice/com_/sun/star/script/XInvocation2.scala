package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Extension of {@link XInvocation} to provide additional information about the methods and properties that are accessible via {@link XInvocation} . */
trait XInvocation2
  extends StObject
     with XInvocation {
  
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  val Info: SafeArray[InvocationInfo]
  
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  val MemberNames: SafeArray[String]
  
  /**
    * returns information items for all methods and properties accessible via {@link XInvocation} .
    * @see com.sun.star.script.Invocation
    */
  def getInfo(): SafeArray[InvocationInfo]
  
  /**
    * returns information item for the method or property defined by aName
    * @param aName specifies the name of the method or property
    * @param bExact specifies the name of the method or property
    * @see com.sun.star.script.Invocation
    * @throws IllegalArgumentException if aName is not the name of a supported method or property
    */
  def getInfoForName(aName: String, bExact: Boolean): InvocationInfo
  
  /** returns the names of all methods and properties accessible via {@link XInvocation} . */
  def getMemberNames(): SafeArray[String]
}
object XInvocation2 {
  
  inline def apply(
    Info: SafeArray[InvocationInfo],
    Introspection: XIntrospectionAccess,
    MemberNames: SafeArray[String],
    acquire: Callback,
    getInfo: CallbackTo[SafeArray[InvocationInfo]],
    getInfoForName: (String, Boolean) => InvocationInfo,
    getIntrospection: CallbackTo[XIntrospectionAccess],
    getMemberNames: CallbackTo[SafeArray[String]],
    getValue: String => Any,
    hasMethod: String => Boolean,
    hasProperty: String => Boolean,
    invoke: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
    queryInterface: `type` => Any,
    release: Callback,
    setValue: (String, Any) => Callback
  ): XInvocation2 = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], MemberNames = MemberNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInfo = getInfo.toJsFn, getInfoForName = js.Any.fromFunction2(getInfoForName), getIntrospection = getIntrospection.toJsFn, getMemberNames = getMemberNames.toJsFn, getValue = js.Any.fromFunction1(getValue), hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setValue = js.Any.fromFunction2((t0: String, t1: Any) => (setValue(t0, t1)).runNow()))
    __obj.asInstanceOf[XInvocation2]
  }
  
  extension [Self <: XInvocation2](x: Self) {
    
    inline def setGetInfo(value: CallbackTo[SafeArray[InvocationInfo]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setGetInfoForName(value: (String, Boolean) => InvocationInfo): Self = StObject.set(x, "getInfoForName", js.Any.fromFunction2(value))
    
    inline def setGetMemberNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getMemberNames", value.toJsFn)
    
    inline def setInfo(value: SafeArray[InvocationInfo]): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setMemberNames(value: SafeArray[String]): Self = StObject.set(x, "MemberNames", value.asInstanceOf[js.Any])
  }
}
