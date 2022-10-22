package typingsJapgolly.activexLibreoffice.com_.sun.star.inspection

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.script.XTypeConverter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringRepresentation
  extends StObject
     with XStringRepresentation {
  
  def create(TypeConverter: XTypeConverter): Unit
  
  def createConstant(TypeConverter: XTypeConverter, Constant: String, Values: SeqEquiv[String]): Unit
}
object StringRepresentation {
  
  inline def apply(
    convertToControlValue: Any => String,
    convertToPropertyValue: (String, `type`) => Any,
    create: XTypeConverter => Callback,
    createConstant: (XTypeConverter, String, SeqEquiv[String]) => Callback
  ): StringRepresentation = {
    val __obj = js.Dynamic.literal(convertToControlValue = js.Any.fromFunction1(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue), create = js.Any.fromFunction1((t0: XTypeConverter) => create(t0).runNow()), createConstant = js.Any.fromFunction3((t0: XTypeConverter, t1: String, t2: SeqEquiv[String]) => (createConstant(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[StringRepresentation]
  }
  
  extension [Self <: StringRepresentation](x: Self) {
    
    inline def setCreate(value: XTypeConverter => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: XTypeConverter) => value(t0).runNow()))
    
    inline def setCreateConstant(value: (XTypeConverter, String, SeqEquiv[String]) => Callback): Self = StObject.set(x, "createConstant", js.Any.fromFunction3((t0: XTypeConverter, t1: String, t2: SeqEquiv[String]) => (value(t0, t1, t2)).runNow()))
  }
}
