package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeLiteral
  extends StObject
     with Node
     with TSType {
  
  var members: js.Array[TSTypeElement]
  
  @JSName("type")
  var type_TSTypeLiteral: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeLiteral
}
object TSTypeLiteral {
  
  @JSImport("babel-types", "TSTypeLiteral")
  @js.native
  def apply(members: js.Array[TSTypeElement]): TSTypeLiteral = js.native
  
  extension [Self <: TSTypeLiteral](x: Self) {
    
    inline def setMembers(value: js.Array[TSTypeElement]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: TSTypeElement*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
