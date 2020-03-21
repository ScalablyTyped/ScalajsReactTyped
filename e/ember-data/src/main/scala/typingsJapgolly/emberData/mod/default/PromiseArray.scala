package typingsJapgolly.emberData.mod.default

import typingsJapgolly.ember.mod.default.ArrayProxy
import typingsJapgolly.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseArray")
@js.native
class PromiseArray[T] ()
  extends PromiseProxyMixin[ArrayProxy[T]]
     with typingsJapgolly.emberArray.proxyMod.ArrayProxy[T]

