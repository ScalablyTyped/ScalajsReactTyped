package typingsJapgolly.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElement
  extends StObject
     with TypeDerived {
  
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.undefined
  
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.undefined
  
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.undefined
  
  /**
    * Is the primary Id of the element
    */
  var id: String
}
object BaseElement {
  
  inline def apply($parent: TypeDerived, $type: ElementType, id: String): BaseElement = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElement]
  }
  
  extension [Self <: BaseElement](x: Self) {
    
    inline def set$attrs(value: StringDictionary[Any]): Self = StObject.set(x, "$attrs", value.asInstanceOf[js.Any])
    
    inline def set$attrsUndefined: Self = StObject.set(x, "$attrs", js.undefined)
    
    inline def setDocumentation(value: js.Array[Documentation]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setDocumentationVarargs(value: Documentation*): Self = StObject.set(x, "documentation", js.Array(value*))
    
    inline def setExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = StObject.set(x, "extensionDefinitions", value.asInstanceOf[js.Any])
    
    inline def setExtensionDefinitionsUndefined: Self = StObject.set(x, "extensionDefinitions", js.undefined)
    
    inline def setExtensionDefinitionsVarargs(value: ExtensionDefinition*): Self = StObject.set(x, "extensionDefinitions", js.Array(value*))
    
    inline def setExtensionElements(value: ExtensionElements): Self = StObject.set(x, "extensionElements", value.asInstanceOf[js.Any])
    
    inline def setExtensionElementsUndefined: Self = StObject.set(x, "extensionElements", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
