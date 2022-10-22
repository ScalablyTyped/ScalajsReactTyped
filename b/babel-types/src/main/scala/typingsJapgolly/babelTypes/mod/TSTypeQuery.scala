package typingsJapgolly.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeQuery
  extends StObject
     with Node
     with TSType {
  
  var exprName: TSEntityName
  
  @JSName("type")
  var type_TSTypeQuery: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeQuery
}
object TSTypeQuery {
  
  @JSImport("babel-types", "TSTypeQuery")
  @js.native
  def apply(exprName: TSEntityName): TSTypeQuery = js.native
  
  extension [Self <: TSTypeQuery](x: Self) {
    
    inline def setExprName(value: TSEntityName): Self = StObject.set(x, "exprName", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.babelTypes.babelTypesStrings.TSTypeQuery): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
