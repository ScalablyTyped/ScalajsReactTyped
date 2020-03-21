package typingsJapgolly.reactInstantsearch

import typingsJapgolly.reactInstantsearchDom.AnonFindResultsState
import typingsJapgolly.reactInstantsearchDom.AnonUseRequestCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch/server", JSImport.Namespace)
@js.native
object serverMod extends js.Object {
  def createInstantSearch(): AnonFindResultsState = js.native
  def createInstantSearch(
    defaultAlgoliaClient: js.Function3[/* appId */ String, /* apiKey */ String, /* options */ AnonUseRequestCache, js.Object]
  ): AnonFindResultsState = js.native
}

