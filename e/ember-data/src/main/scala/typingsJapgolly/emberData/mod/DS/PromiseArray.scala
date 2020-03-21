package typingsJapgolly.emberData.mod.DS

import typingsJapgolly.ember.mod.default.ArrayProxy
import typingsJapgolly.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `PromiseArray` is an object that acts like both an `Ember.Array`
  * and a promise. When the promise is resolved the resulting value
  * will be set to the `PromiseArray`'s `content` property. This makes
  * it easy to create data bindings with the `PromiseArray` that will be
  * updated when the promise resolves.
  */
@JSImport("ember-data", "DS.PromiseArray")
@js.native
class PromiseArray[T] ()
  extends PromiseProxyMixin[ArrayProxy[T]]
     with typingsJapgolly.emberArray.proxyMod.ArrayProxy[T]

