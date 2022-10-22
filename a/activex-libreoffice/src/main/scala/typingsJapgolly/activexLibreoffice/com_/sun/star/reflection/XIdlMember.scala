package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base interface for XIdlField2s and XIdlMethods. */
trait XIdlMember
  extends StObject
     with XInterface {
  
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  val DeclaringClass: XIdlClass[Any]
  
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  val Name: String
  
  /**
    * Returns the declaring type of this field, i.e. the type having the member declared (interface, enum, struct, exception).
    * @returns declaring type
    */
  def getDeclaringClass(): XIdlClass[Any]
  
  /**
    * Returns the fully-qualified name of the member.
    * @returns fully-qualified name of the member
    */
  def getName(): String
}
object XIdlMember {
  
  inline def apply(
    DeclaringClass: XIdlClass[Any],
    Name: String,
    acquire: Callback,
    getDeclaringClass: CallbackTo[XIdlClass[Any]],
    getName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XIdlMember = {
    val __obj = js.Dynamic.literal(DeclaringClass = DeclaringClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDeclaringClass = getDeclaringClass.toJsFn, getName = getName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIdlMember]
  }
  
  extension [Self <: XIdlMember](x: Self) {
    
    inline def setDeclaringClass(value: XIdlClass[Any]): Self = StObject.set(x, "DeclaringClass", value.asInstanceOf[js.Any])
    
    inline def setGetDeclaringClass(value: CallbackTo[XIdlClass[Any]]): Self = StObject.set(x, "getDeclaringClass", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
