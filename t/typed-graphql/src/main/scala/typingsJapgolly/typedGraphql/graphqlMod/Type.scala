package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.graphqlMod.NamedType
  - typingsJapgolly.typedGraphql.graphqlMod.ListType
  - typingsJapgolly.typedGraphql.graphqlMod.NonNullType
*/
trait Type extends StObject
object Type {
  
  inline def ListType(kind: String, `type`: Type): typingsJapgolly.typedGraphql.graphqlMod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.ListType]
  }
  
  inline def NamedType(kind: String, name: Name): typingsJapgolly.typedGraphql.graphqlMod.NamedType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.NamedType]
  }
  
  inline def NonNullType(kind: String, `type`: NamedType | ListType): typingsJapgolly.typedGraphql.graphqlMod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.NonNullType]
  }
}
