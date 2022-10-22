package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionNamedTypeRef
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionListTypeRef
  - typingsJapgolly.typedGraphql.graphqlMod.IntrospectionNonNullTypeRef
*/
trait IntrospectionTypeRef extends StObject
object IntrospectionTypeRef {
  
  inline def IntrospectionListTypeRef(): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = "LIST")
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionListTypeRef]
  }
  
  inline def IntrospectionNamedTypeRef(kind: String, name: String): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionNamedTypeRef]
  }
  
  inline def IntrospectionNonNullTypeRef(): typingsJapgolly.typedGraphql.graphqlMod.IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = "NON_NULL")
    __obj.asInstanceOf[typingsJapgolly.typedGraphql.graphqlMod.IntrospectionNonNullTypeRef]
  }
}
