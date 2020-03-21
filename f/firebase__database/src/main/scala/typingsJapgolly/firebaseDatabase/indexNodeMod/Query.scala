package typingsJapgolly.firebaseDatabase.indexNodeMod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.firebaseDatabase.pathMod.Path
import typingsJapgolly.firebaseDatabase.queryParamsMod.QueryParams
import typingsJapgolly.firebaseDatabase.repoMod.Repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/index.node", "Query")
@js.native
class Query protected ()
  extends typingsJapgolly.firebaseDatabase.queryMod.Query {
  def this(repo: Repo, path: Path, queryParams_ : QueryParams, orderByCalled_ : Boolean) = this()
}

/* static members */
@JSImport("@firebase/database/dist/index.node", "Query")
@js.native
object Query extends js.Object {
  /**
    * Helper used by .on and .once to extract the context and or cancel arguments.
    * @param {!string} fnName The function name (on or once)
    * @param {(function(Error)|Object)=} cancelOrContext
    * @param {Object=} context
    * @return {{cancel: ?function(Error), context: ?Object}}
    * @private
    */
  var getCancelAndContextArgs_ : js.Any = js.native
  /**
    * Validates that limit* has been called with the correct combination of parameters
    * @param {!QueryParams} params
    * @private
    */
  var validateLimit_ : js.Any = js.native
  /**
    * Validates start/end values for queries.
    * @param {!QueryParams} params
    * @private
    */
  var validateQueryEndpoints_ : js.Any = js.native
  def __referenceConstructor(): Instantiable2[/* repo */ Repo, /* path */ Path, typingsJapgolly.firebaseDatabase.queryMod.Query] = js.native
  def __referenceConstructor(
    `val`: Instantiable2[/* repo */ Repo, /* path */ Path, typingsJapgolly.firebaseDatabase.queryMod.Query]
  ): js.Any = js.native
}

