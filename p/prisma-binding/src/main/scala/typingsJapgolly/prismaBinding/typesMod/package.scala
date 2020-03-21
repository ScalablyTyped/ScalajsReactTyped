package typingsJapgolly.prismaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Exists = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* filter */ typingsJapgolly.prismaBinding.typesMod.Filter, 
      js.Promise[scala.Boolean]
    ]
  ]
  type Filter = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryMap = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      /* info */ js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      js.Promise[js.Any]
    ]
  ]
  type SubscriptionMap = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      (typingsJapgolly.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[typingsJapgolly.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
