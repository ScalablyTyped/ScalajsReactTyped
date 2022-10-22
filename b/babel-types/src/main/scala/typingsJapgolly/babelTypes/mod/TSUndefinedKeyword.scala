package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSUndefinedKeyword
  extends StObject
     with Node
     with TSType {
  
  @JSName("type")
  var type_TSUndefinedKeyword: typingsJapgolly.babelTypes.babelTypesStrings.TSUndefinedKeyword
}
object TSUndefinedKeyword {
  
  @JSImport("babel-types", "TSUndefinedKeyword")
  @js.native
  def apply(): TSUndefinedKeyword = js.native
  
  extension [Self <: TSUndefinedKeyword](x: Self) {
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSUndefinedKeyword): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
