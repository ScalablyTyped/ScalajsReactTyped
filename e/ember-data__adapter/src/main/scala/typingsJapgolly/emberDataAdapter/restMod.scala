package typingsJapgolly.emberDataAdapter

import typingsJapgolly.emberData.mod.DS.RESTAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember-data/adapter/rest", JSImport.Namespace)
@js.native
object restMod extends js.Object {
  /**
    * The REST adapter allows your store to communicate with an HTTP server by
    * transmitting JSON via XHR. Most Ember.js apps that consume a JSON API
    * should use the REST adapter.
    */
  @js.native
  class default () extends RESTAdapter
  
}

