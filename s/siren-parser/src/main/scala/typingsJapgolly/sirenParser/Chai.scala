package typingsJapgolly.sirenParser

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  trait Assertion extends StObject {
    
    def classes(classes: String*): Unit
    
    def href(href: String): Unit
    
    def method(method: String): Unit
    
    def name(name: String): Unit
    
    def rels(rels: String*): Unit
    
    def title(title: String): Unit
    
    def `type`(`type`: String): Unit
    
    def value(value: Any): Unit
  }
  object Assertion {
    
    inline def apply(
      classes: /* repeated */ String => Callback,
      href: String => Callback,
      method: String => Callback,
      name: String => Callback,
      rels: /* repeated */ String => Callback,
      title: String => Callback,
      `type`: String => Callback,
      value: Any => Callback
    ): Assertion = {
      val __obj = js.Dynamic.literal(classes = js.Any.fromFunction1((t0: /* repeated */ String) => classes(t0).runNow()), href = js.Any.fromFunction1((t0: String) => href(t0).runNow()), method = js.Any.fromFunction1((t0: String) => method(t0).runNow()), name = js.Any.fromFunction1((t0: String) => name(t0).runNow()), rels = js.Any.fromFunction1((t0: /* repeated */ String) => rels(t0).runNow()), title = js.Any.fromFunction1((t0: String) => title(t0).runNow()), value = js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      __obj.updateDynamic("type")(js.Any.fromFunction1((t0: String) => `type`(t0).runNow()))
      __obj.asInstanceOf[Assertion]
    }
    
    extension [Self <: Assertion](x: Self) {
      
      inline def setClasses(value: /* repeated */ String => Callback): Self = StObject.set(x, "classes", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
      
      inline def setHref(value: String => Callback): Self = StObject.set(x, "href", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setMethod(value: String => Callback): Self = StObject.set(x, "method", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setName(value: String => Callback): Self = StObject.set(x, "name", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRels(value: /* repeated */ String => Callback): Self = StObject.set(x, "rels", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
      
      inline def setTitle(value: String => Callback): Self = StObject.set(x, "title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setType(value: String => Callback): Self = StObject.set(x, "type", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setValue(value: Any => Callback): Self = StObject.set(x, "value", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait KeyFilter extends StObject {
    
    var `with`: Assertion
  }
  object KeyFilter {
    
    inline def apply(`with`: Assertion): KeyFilter = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyFilter]
    }
    
    extension [Self <: KeyFilter](x: Self) {
      
      inline def setWith(value: Assertion): Self = StObject.set(x, "with", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeComparison extends StObject {
    
    var sirenAction: Assertion
    
    var sirenActions: Assertion
    
    var sirenEntities: Assertion
    
    var sirenEntity: Assertion
    
    var sirenField: Assertion
    
    var sirenFields: Assertion
    
    var sirenLink: Assertion
    
    var sirenLinks: Assertion
    
    var sirenProperties: Assertion
    
    var sirenProperty: Assertion
  }
  object TypeComparison {
    
    inline def apply(
      sirenAction: Assertion,
      sirenActions: Assertion,
      sirenEntities: Assertion,
      sirenEntity: Assertion,
      sirenField: Assertion,
      sirenFields: Assertion,
      sirenLink: Assertion,
      sirenLinks: Assertion,
      sirenProperties: Assertion,
      sirenProperty: Assertion
    ): TypeComparison = {
      val __obj = js.Dynamic.literal(sirenAction = sirenAction.asInstanceOf[js.Any], sirenActions = sirenActions.asInstanceOf[js.Any], sirenEntities = sirenEntities.asInstanceOf[js.Any], sirenEntity = sirenEntity.asInstanceOf[js.Any], sirenField = sirenField.asInstanceOf[js.Any], sirenFields = sirenFields.asInstanceOf[js.Any], sirenLink = sirenLink.asInstanceOf[js.Any], sirenLinks = sirenLinks.asInstanceOf[js.Any], sirenProperties = sirenProperties.asInstanceOf[js.Any], sirenProperty = sirenProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeComparison]
    }
    
    extension [Self <: TypeComparison](x: Self) {
      
      inline def setSirenAction(value: Assertion): Self = StObject.set(x, "sirenAction", value.asInstanceOf[js.Any])
      
      inline def setSirenActions(value: Assertion): Self = StObject.set(x, "sirenActions", value.asInstanceOf[js.Any])
      
      inline def setSirenEntities(value: Assertion): Self = StObject.set(x, "sirenEntities", value.asInstanceOf[js.Any])
      
      inline def setSirenEntity(value: Assertion): Self = StObject.set(x, "sirenEntity", value.asInstanceOf[js.Any])
      
      inline def setSirenField(value: Assertion): Self = StObject.set(x, "sirenField", value.asInstanceOf[js.Any])
      
      inline def setSirenFields(value: Assertion): Self = StObject.set(x, "sirenFields", value.asInstanceOf[js.Any])
      
      inline def setSirenLink(value: Assertion): Self = StObject.set(x, "sirenLink", value.asInstanceOf[js.Any])
      
      inline def setSirenLinks(value: Assertion): Self = StObject.set(x, "sirenLinks", value.asInstanceOf[js.Any])
      
      inline def setSirenProperties(value: Assertion): Self = StObject.set(x, "sirenProperties", value.asInstanceOf[js.Any])
      
      inline def setSirenProperty(value: Assertion): Self = StObject.set(x, "sirenProperty", value.asInstanceOf[js.Any])
    }
  }
}
