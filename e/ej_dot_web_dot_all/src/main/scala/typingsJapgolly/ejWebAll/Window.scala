package typingsJapgolly.ejWebAll

import typingsJapgolly.ejWebAll.anon.Typeofej
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var ej: Typeofej
}
object Window {
  
  inline def apply(ej: Typeofej): Window = {
    val __obj = js.Dynamic.literal(ej = ej.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setEj(value: Typeofej): Self = StObject.set(x, "ej", value.asInstanceOf[js.Any])
  }
}
