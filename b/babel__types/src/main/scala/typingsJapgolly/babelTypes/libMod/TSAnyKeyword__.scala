package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.TSAnyKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSAnyKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSAnyKeyword__ : TSAnyKeyword
}
object TSAnyKeyword__ {
  
  inline def apply(): TSAnyKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[TSAnyKeyword__]
  }
  
  extension [Self <: TSAnyKeyword__](x: Self) {
    
    inline def setType(value: TSAnyKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
