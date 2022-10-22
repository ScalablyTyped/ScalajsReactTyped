package typingsJapgolly.cssWhat.libEsTypesMod

import typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Attribute
import typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Pseudo
import typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Tag
import typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.Universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssWhat.libEsTypesMod.PseudoSelector
  - typingsJapgolly.cssWhat.libEsTypesMod.PseudoElement
  - typingsJapgolly.cssWhat.libEsTypesMod.AttributeSelector
  - typingsJapgolly.cssWhat.libEsTypesMod.TagSelector
  - typingsJapgolly.cssWhat.libEsTypesMod.UniversalSelector
  - typingsJapgolly.cssWhat.libEsTypesMod.Traversal
*/
trait Selector extends StObject
object Selector {
  
  inline def AttributeSelector(action: AttributeAction, name: String, `type`: Attribute, value: String): typingsJapgolly.cssWhat.libEsTypesMod.AttributeSelector = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], ignoreCase = null, namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cssWhat.libEsTypesMod.AttributeSelector]
  }
  
  inline def PseudoElement(name: String, `type`: typingsJapgolly.cssWhat.libEsTypesMod.SelectorType.PseudoElement): typingsJapgolly.cssWhat.libEsTypesMod.PseudoElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cssWhat.libEsTypesMod.PseudoElement]
  }
  
  inline def PseudoSelector(name: String, `type`: Pseudo): typingsJapgolly.cssWhat.libEsTypesMod.PseudoSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cssWhat.libEsTypesMod.PseudoSelector]
  }
  
  inline def TagSelector(name: String, `type`: Tag): typingsJapgolly.cssWhat.libEsTypesMod.TagSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cssWhat.libEsTypesMod.TagSelector]
  }
  
  inline def Traversal(`type`: TraversalType): typingsJapgolly.cssWhat.libEsTypesMod.Traversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cssWhat.libEsTypesMod.Traversal]
  }
  
  inline def UniversalSelector(`type`: Universal): typingsJapgolly.cssWhat.libEsTypesMod.UniversalSelector = {
    val __obj = js.Dynamic.literal(namespace = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cssWhat.libEsTypesMod.UniversalSelector]
  }
}
