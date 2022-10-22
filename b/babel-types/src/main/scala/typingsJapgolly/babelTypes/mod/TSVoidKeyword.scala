package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSVoidKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSVoidKeyword: typingsJapgolly.babelTypes.babelTypesStrings.TSVoidKeyword
}
object TSVoidKeyword {
  
  @JSImport("babel-types", "TSVoidKeyword")
  @js.native
  def apply(): TSVoidKeyword = js.native
  
  extension [Self <: TSVoidKeyword](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSVoidKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
