package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.graphqlMod.Field
  - typingsJapgolly.typedGraphql.graphqlMod.FragmentSpread
  - typingsJapgolly.typedGraphql.graphqlMod.InlineFragment
*/
trait Selection extends StObject
object Selection {
  
  inline def Field(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.Field]
  }
  
  inline def FragmentSpread(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.FragmentSpread]
  }
  
  inline def InlineFragment(kind: String, selectionSet: SelectionSet): typingsJapgolly.typedGraphql.graphqlMod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.InlineFragment]
  }
}
