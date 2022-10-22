package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XFormField
  extends StObject
     with XInterface {
  
  var FieldType: String
  
  val Parameters: XNameContainer
  
  def getFieldType(): String
  
  def getParameters(): XNameContainer
  
  def setFieldType(fieldType: String): Unit
}
object XFormField {
  
  inline def apply(
    FieldType: String,
    Parameters: XNameContainer,
    acquire: Callback,
    getFieldType: CallbackTo[String],
    getParameters: CallbackTo[XNameContainer],
    queryInterface: `type` => Any,
    release: Callback,
    setFieldType: String => Callback
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFieldType = getFieldType.toJsFn, getParameters = getParameters.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFieldType = js.Any.fromFunction1((t0: String) => setFieldType(t0).runNow()))
    __obj.asInstanceOf[XFormField]
  }
  
  extension [Self <: XFormField](x: Self) {
    
    inline def setFieldType(value: String): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    inline def setGetFieldType(value: CallbackTo[String]): Self = StObject.set(x, "getFieldType", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setParameters(value: XNameContainer): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setSetFieldType(value: String => Callback): Self = StObject.set(x, "setFieldType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
