package typingsJapgolly.jsrsasign.anon

import typingsJapgolly.jsrsasign.jsrsasign.ExtNameConstraints
import typingsJapgolly.jsrsasign.jsrsasign.GeneralSubtree
import typingsJapgolly.jsrsasign.jsrsasignStrings.nameConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude
  extends StObject
     with ExtNameConstraints {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.Array[GeneralSubtree]
  
  var extname: nameConstraints
}
object Exclude {
  
  inline def apply(exclude: js.Array[GeneralSubtree]): Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], extname = "nameConstraints")
    __obj.asInstanceOf[Exclude]
  }
  
  extension [Self <: Exclude](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExclude(value: js.Array[GeneralSubtree]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeVarargs(value: GeneralSubtree*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setExtname(value: nameConstraints): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
