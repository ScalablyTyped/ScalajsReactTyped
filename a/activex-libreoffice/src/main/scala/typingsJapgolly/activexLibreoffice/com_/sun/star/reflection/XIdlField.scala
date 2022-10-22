package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use {@link com.sun.star.reflection.XIdlField2} instead.
  * @deprecated Deprecated
  */
trait XIdlField
  extends StObject
     with XIdlMember {
  
  val AccessMode: FieldAccessMode
  
  val Type: XIdlClass[Any]
  
  def get(obj: Any): Any
  
  def getAccessMode(): FieldAccessMode
  
  def getType(): XIdlClass[Any]
  
  def set(obj: Any, value: Any): Unit
}
object XIdlField {
  
  inline def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[Any],
    Name: String,
    Type: XIdlClass[Any],
    acquire: Callback,
    get: Any => Any,
    getAccessMode: CallbackTo[FieldAccessMode],
    getDeclaringClass: CallbackTo[XIdlClass[Any]],
    getName: CallbackTo[String],
    getType: CallbackTo[XIdlClass[Any]],
    queryInterface: `type` => Any,
    release: Callback,
    set: (Any, Any) => Callback
  ): XIdlField = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode.asInstanceOf[js.Any], DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, get = js.Any.fromFunction1(get), getAccessMode = getAccessMode.toJsFn, getDeclaringClass = getDeclaringClass.toJsFn, getName = getName.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, set = js.Any.fromFunction2((t0: Any, t1: Any) => (set(t0, t1)).runNow()))
    __obj.asInstanceOf[XIdlField]
  }
  
  extension [Self <: XIdlField](x: Self) {
    
    inline def setAccessMode(value: FieldAccessMode): Self = StObject.set(x, "AccessMode", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetAccessMode(value: CallbackTo[FieldAccessMode]): Self = StObject.set(x, "getAccessMode", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[XIdlClass[Any]]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setSet(value: (Any, Any) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setType(value: XIdlClass[Any]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
