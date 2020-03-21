package typingsJapgolly.apolloEngineReporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object agentMod {
  type GenerateClientInfo[TContext] = js.Function1[
    /* requestContext */ typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
    typingsJapgolly.apolloEngineReporting.agentMod.ClientInfo
  ]
}
