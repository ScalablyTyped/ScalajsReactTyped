package typingsJapgolly.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformRootFieldsMod {
  type RootTransformer = js.Function3[
    /* operation */ typingsJapgolly.graphqlTools.graphqlToolsStrings.Query | typingsJapgolly.graphqlTools.graphqlToolsStrings.Mutation | typingsJapgolly.graphqlTools.graphqlToolsStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* field */ typingsJapgolly.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (typingsJapgolly.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typingsJapgolly.graphqlTools.AnonFieldName | scala.Null
    ]
  ]
}
