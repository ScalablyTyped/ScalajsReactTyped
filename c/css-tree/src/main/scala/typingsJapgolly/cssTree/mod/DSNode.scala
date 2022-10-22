package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssTree.mod.DSNodeAtWord
  - typingsJapgolly.cssTree.mod.DSNodeComma
  - typingsJapgolly.cssTree.mod.DSNodeFunction
  - typingsJapgolly.cssTree.mod.DSNodeGroup
  - typingsJapgolly.cssTree.mod.DSNodeKeyword
  - typingsJapgolly.cssTree.mod.DSNodeMultiplier
  - typingsJapgolly.cssTree.mod.DSNodeProperty
  - typingsJapgolly.cssTree.mod.DSNodeString
  - typingsJapgolly.cssTree.mod.DSNodeToken
  - typingsJapgolly.cssTree.mod.DSNodeType
*/
trait DSNode extends StObject
object DSNode {
  
  inline def DSNodeAtWord(name: String): typingsJapgolly.cssTree.mod.DSNodeAtWord = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AtKeyword")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeAtWord]
  }
  
  inline def DSNodeComma(): typingsJapgolly.cssTree.mod.DSNodeComma = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Comma")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeComma]
  }
  
  inline def DSNodeFunction(name: String): typingsJapgolly.cssTree.mod.DSNodeFunction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Function")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeFunction]
  }
  
  inline def DSNodeGroup(combinator: DSNodeCombinator, disallowEmpty: Boolean, explicit: Boolean, terms: js.Array[DSNode]): typingsJapgolly.cssTree.mod.DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeGroup]
  }
  
  inline def DSNodeKeyword(name: String): typingsJapgolly.cssTree.mod.DSNodeKeyword = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Keyword")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeKeyword]
  }
  
  inline def DSNodeMultiplier(comma: Boolean, max: Double, min: Double, term: DSNodeMultiplied): typingsJapgolly.cssTree.mod.DSNodeMultiplier = {
    val __obj = js.Dynamic.literal(comma = comma.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Multiplier")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeMultiplier]
  }
  
  inline def DSNodeProperty(name: String): typingsJapgolly.cssTree.mod.DSNodeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeProperty]
  }
  
  inline def DSNodeString(value: String): typingsJapgolly.cssTree.mod.DSNodeString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeString]
  }
  
  inline def DSNodeToken(value: String): typingsJapgolly.cssTree.mod.DSNodeToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Token")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeToken]
  }
  
  inline def DSNodeType(name: String): typingsJapgolly.cssTree.mod.DSNodeType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], opts = null)
    __obj.updateDynamic("type")("Type")
    __obj.asInstanceOf[typingsJapgolly.cssTree.mod.DSNodeType]
  }
}
