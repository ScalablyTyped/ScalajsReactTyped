package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Basic cryptography features available in the current context. It allows access to a cryptographically strong random number generator and to cryptographic primitives. */
trait Crypto extends StObject {
  
  /* standard dom */
  def getRandomValues[T /* <: js.typedarray.ArrayBufferView | Null */](array: T): T
  
  /** Available only in secure contexts. */
  /* standard dom */
  def randomUUID(): java.lang.String
  
  /** Available only in secure contexts. */
  /* standard dom */
  val subtle: org.scalajs.dom.SubtleCrypto
}
object Crypto {
  
  inline def apply(
    getRandomValues: Any => Any,
    randomUUID: CallbackTo[java.lang.String],
    subtle: org.scalajs.dom.SubtleCrypto
  ): Crypto = {
    val __obj = js.Dynamic.literal(getRandomValues = js.Any.fromFunction1(getRandomValues), randomUUID = randomUUID.toJsFn, subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crypto]
  }
  
  extension [Self <: Crypto](x: Self) {
    
    inline def setGetRandomValues(value: Any => Any): Self = StObject.set(x, "getRandomValues", js.Any.fromFunction1(value))
    
    inline def setRandomUUID(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "randomUUID", value.toJsFn)
    
    inline def setSubtle(value: org.scalajs.dom.SubtleCrypto): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
