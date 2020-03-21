package typingsJapgolly.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observableToPromiseMod {
  type ResultCallback = js.Function1[
    /* result */ typingsJapgolly.apolloClient.typesMod.ApolloQueryResult[js.Any], 
    js.Any
  ]
}
