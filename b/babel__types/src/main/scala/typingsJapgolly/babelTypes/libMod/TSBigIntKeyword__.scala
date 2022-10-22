package typingsJapgolly.babelTypes.libMod

import typingsJapgolly.babelTypes.babelTypesStrings.TSBigIntKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSBigIntKeyword__
  extends StObject
     with BaseNode
     with Node
     with TSBaseType
     with TSType
     with TypeScript {
  
  @JSName("type")
  var type_TSBigIntKeyword__ : TSBigIntKeyword
}
object TSBigIntKeyword__ {
  
  inline def apply(): TSBigIntKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[TSBigIntKeyword__]
  }
  
  extension [Self <: TSBigIntKeyword__](x: Self) {
    
    inline def setType(value: TSBigIntKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
