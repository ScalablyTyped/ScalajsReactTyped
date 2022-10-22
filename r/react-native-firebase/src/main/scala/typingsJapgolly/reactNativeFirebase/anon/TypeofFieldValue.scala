package typingsJapgolly.reactNativeFirebase.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.AnyJs
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofFieldValue extends StObject {
  
  /* static member */
  def arrayRemove(elements: AnyJs*): FieldValue
  
  /* static member */
  def arrayUnion(elements: AnyJs*): FieldValue
  
  /* static member */
  def delete(): FieldValue
  
  /* static member */
  def increment(n: Double): FieldValue
  
  /* static member */
  def serverTimestamp(): FieldValue
}
object TypeofFieldValue {
  
  inline def apply(
    arrayRemove: /* repeated */ AnyJs => FieldValue,
    arrayUnion: /* repeated */ AnyJs => FieldValue,
    delete: CallbackTo[FieldValue],
    increment: Double => FieldValue,
    serverTimestamp: CallbackTo[FieldValue]
  ): TypeofFieldValue = {
    val __obj = js.Dynamic.literal(arrayRemove = js.Any.fromFunction1(arrayRemove), arrayUnion = js.Any.fromFunction1(arrayUnion), delete = delete.toJsFn, increment = js.Any.fromFunction1(increment), serverTimestamp = serverTimestamp.toJsFn)
    __obj.asInstanceOf[TypeofFieldValue]
  }
  
  extension [Self <: TypeofFieldValue](x: Self) {
    
    inline def setArrayRemove(value: /* repeated */ AnyJs => FieldValue): Self = StObject.set(x, "arrayRemove", js.Any.fromFunction1(value))
    
    inline def setArrayUnion(value: /* repeated */ AnyJs => FieldValue): Self = StObject.set(x, "arrayUnion", js.Any.fromFunction1(value))
    
    inline def setDelete(value: CallbackTo[FieldValue]): Self = StObject.set(x, "delete", value.toJsFn)
    
    inline def setIncrement(value: Double => FieldValue): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
    
    inline def setServerTimestamp(value: CallbackTo[FieldValue]): Self = StObject.set(x, "serverTimestamp", value.toJsFn)
  }
}
