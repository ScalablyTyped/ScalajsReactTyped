package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.TSNumberKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNumberKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSNumberKeyword__ : TSNumberKeyword
}
object TSNumberKeyword__ {
  
  inline def apply(): TSNumberKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[TSNumberKeyword__]
  }
  
  extension [Self <: TSNumberKeyword__](x: Self) {
    
    inline def setType(value: TSNumberKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
