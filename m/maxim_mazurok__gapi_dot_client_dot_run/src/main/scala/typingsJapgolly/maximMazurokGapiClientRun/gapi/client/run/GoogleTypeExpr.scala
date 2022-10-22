package typingsJapgolly.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleTypeExpr extends StObject {
  
  /** Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Textual representation of an expression in Common Expression Language syntax. */
  var expression: js.UndefOr[String] = js.undefined
  
  /** Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Optional. Title for the expression, i.e. a short string describing its purpose. This can be used e.g. in UIs which allow to enter the expression. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleTypeExpr {
  
  inline def apply(): GoogleTypeExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleTypeExpr]
  }
  
  extension [Self <: GoogleTypeExpr](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
