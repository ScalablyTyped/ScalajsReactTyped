package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonStrings.`class`
import typingsJapgolly.angularCommon.angularCommonStrings.ngClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Klass extends StObject {
  
  var klass: `class`
  
  var ngClass: typingsJapgolly.angularCommon.angularCommonStrings.ngClass
}
object Klass {
  
  inline def apply(): Klass = {
    val __obj = js.Dynamic.literal(klass = "class", ngClass = "ngClass")
    __obj.asInstanceOf[Klass]
  }
  
  extension [Self <: Klass](x: Self) {
    
    inline def setKlass(value: `class`): Self = StObject.set(x, "klass", value.asInstanceOf[js.Any])
    
    inline def setNgClass(value: ngClass): Self = StObject.set(x, "ngClass", value.asInstanceOf[js.Any])
  }
}
