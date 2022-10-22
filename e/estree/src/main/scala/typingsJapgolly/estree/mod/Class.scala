package typingsJapgolly.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.estree.mod.ClassDeclaration
  - typingsJapgolly.estree.mod.ClassExpression
*/
trait Class extends StObject
object Class {
  
  inline def ClassDeclaration(body: ClassBody): typingsJapgolly.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ClassDeclaration]
  }
  
  inline def ClassExpression(body: ClassBody): typingsJapgolly.estree.mod.ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typingsJapgolly.estree.mod.ClassExpression]
  }
}
