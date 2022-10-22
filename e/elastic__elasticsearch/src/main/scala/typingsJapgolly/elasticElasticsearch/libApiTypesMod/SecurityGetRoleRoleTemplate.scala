package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetRoleRoleTemplate extends StObject {
  
  var format: js.UndefOr[SecurityGetRoleTemplateFormat] = js.undefined
  
  var template: Script
}
object SecurityGetRoleRoleTemplate {
  
  inline def apply(template: Script): SecurityGetRoleRoleTemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetRoleRoleTemplate]
  }
  
  extension [Self <: SecurityGetRoleRoleTemplate](x: Self) {
    
    inline def setFormat(value: SecurityGetRoleTemplateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setTemplate(value: Script): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
