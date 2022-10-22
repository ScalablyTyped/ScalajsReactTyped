package typingsJapgolly.reactEmailEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactEmailEditor.mod.SimpleMergeTag
  - typingsJapgolly.reactEmailEditor.mod.ConditionalMergeTag
  - typingsJapgolly.reactEmailEditor.mod.GroupedMergeTag
*/
trait MergeTag extends StObject
object MergeTag {
  
  inline def ConditionalMergeTag(name: String, rules: js.Array[ConditionalMergeTagRule]): typingsJapgolly.reactEmailEditor.mod.ConditionalMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactEmailEditor.mod.ConditionalMergeTag]
  }
  
  inline def GroupedMergeTag(
    mergeTags: js.Array[SimpleMergeTag | typingsJapgolly.reactEmailEditor.mod.GroupedMergeTag],
    name: String
  ): typingsJapgolly.reactEmailEditor.mod.GroupedMergeTag = {
    val __obj = js.Dynamic.literal(mergeTags = mergeTags.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactEmailEditor.mod.GroupedMergeTag]
  }
  
  inline def SimpleMergeTag(name: String, value: String): typingsJapgolly.reactEmailEditor.mod.SimpleMergeTag = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactEmailEditor.mod.SimpleMergeTag]
  }
}
