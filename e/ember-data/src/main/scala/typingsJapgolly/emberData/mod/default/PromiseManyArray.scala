package typingsJapgolly.emberData.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PromiseManyArray is a PromiseArray that also proxies certain method calls
  * to the underlying manyArray.
  * Right now we proxy:
  */
@JSImport("ember-data", "PromiseManyArray")
@js.native
class PromiseManyArray[T /* <: typingsJapgolly.emberData.mod.DS.Model */] ()
  extends typingsJapgolly.emberData.mod.DS.PromiseManyArray[T]

