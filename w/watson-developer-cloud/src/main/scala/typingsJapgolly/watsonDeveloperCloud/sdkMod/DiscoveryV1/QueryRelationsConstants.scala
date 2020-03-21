package typingsJapgolly.watsonDeveloperCloud.sdkMod.DiscoveryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `queryRelations` operation. */
@JSImport("watson-developer-cloud/sdk", "DiscoveryV1.QueryRelationsConstants")
@js.native
object QueryRelationsConstants extends js.Object {
  /** The sorting method for the relationships, can be `score` or `frequency`. `frequency` is the number of unique times each entity is identified. The default is `score`. This parameter cannot be used in the same query as the **bias** parameter. */
  @js.native
  object Sort extends js.Object {
    /* "frequency" */ val FREQUENCY: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort.FREQUENCY with String = js.native
    /* "score" */ val SCORE: typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort.SCORE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod.QueryRelationsConstants.Sort with String
      ] = js.native
  }
  
}

