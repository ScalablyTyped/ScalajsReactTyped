package typingsJapgolly.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: String
  
  var description: String
  
  var footer: String
  
  var icon: String
  
  var iconExpanded: String
  
  var number: String
  
  var requiredText: String
  
  var title: String
  
  var titleCollapsed: String
  
  var titleExpandable: String
  
  var titleExpanded: String
  
  var titleOnError: String
}
object Container {
  
  inline def apply(
    container: String,
    description: String,
    footer: String,
    icon: String,
    iconExpanded: String,
    number: String,
    requiredText: String,
    title: String,
    titleCollapsed: String,
    titleExpandable: String,
    titleExpanded: String,
    titleOnError: String
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconExpanded = iconExpanded.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], requiredText = requiredText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleCollapsed = titleCollapsed.asInstanceOf[js.Any], titleExpandable = titleExpandable.asInstanceOf[js.Any], titleExpanded = titleExpanded.asInstanceOf[js.Any], titleOnError = titleOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconExpanded(value: String): Self = StObject.set(x, "iconExpanded", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRequiredText(value: String): Self = StObject.set(x, "requiredText", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleCollapsed(value: String): Self = StObject.set(x, "titleCollapsed", value.asInstanceOf[js.Any])
    
    inline def setTitleExpandable(value: String): Self = StObject.set(x, "titleExpandable", value.asInstanceOf[js.Any])
    
    inline def setTitleExpanded(value: String): Self = StObject.set(x, "titleExpanded", value.asInstanceOf[js.Any])
    
    inline def setTitleOnError(value: String): Self = StObject.set(x, "titleOnError", value.asInstanceOf[js.Any])
  }
}
