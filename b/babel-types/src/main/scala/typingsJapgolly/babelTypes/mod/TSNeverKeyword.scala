package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNeverKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSNeverKeyword: typingsJapgolly.babelTypes.babelTypesStrings.TSNeverKeyword
}
object TSNeverKeyword {
  
  @JSImport("babel-types", "TSNeverKeyword")
  @js.native
  def apply(): TSNeverKeyword = js.native
  
  extension [Self <: TSNeverKeyword](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSNeverKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
