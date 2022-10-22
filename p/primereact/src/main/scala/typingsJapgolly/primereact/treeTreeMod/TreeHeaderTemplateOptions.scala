package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeHeaderTemplateOptions extends StObject {
  
  var element: Element
  
  var filterContainerClassName: String
  
  var filterElement: Element
  
  var filterIconClasssName: String
  
  var filterInput: TreeFilterInputOptions
  
  var props: TreeProps
}
object TreeHeaderTemplateOptions {
  
  inline def apply(
    element: VdomElement,
    filterContainerClassName: String,
    filterElement: VdomElement,
    filterIconClasssName: String,
    filterInput: TreeFilterInputOptions,
    props: TreeProps
  ): TreeHeaderTemplateOptions = {
    val __obj = js.Dynamic.literal(element = element.rawElement.asInstanceOf[js.Any], filterContainerClassName = filterContainerClassName.asInstanceOf[js.Any], filterElement = filterElement.rawElement.asInstanceOf[js.Any], filterIconClasssName = filterIconClasssName.asInstanceOf[js.Any], filterInput = filterInput.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeHeaderTemplateOptions]
  }
  
  extension [Self <: TreeHeaderTemplateOptions](x: Self) {
    
    inline def setElement(value: VdomElement): Self = StObject.set(x, "element", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterContainerClassName(value: String): Self = StObject.set(x, "filterContainerClassName", value.asInstanceOf[js.Any])
    
    inline def setFilterElement(value: VdomElement): Self = StObject.set(x, "filterElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFilterIconClasssName(value: String): Self = StObject.set(x, "filterIconClasssName", value.asInstanceOf[js.Any])
    
    inline def setFilterInput(value: TreeFilterInputOptions): Self = StObject.set(x, "filterInput", value.asInstanceOf[js.Any])
    
    inline def setProps(value: TreeProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
