package typingsJapgolly.kakaomaps.kakao.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  def equals(size: Size): Boolean
}
object Size {
  
  inline def apply(equals_ : Size => Boolean): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setEquals_(value: Size => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
  }
}
