package typingsJapgolly.emberData.mod.default

import typingsJapgolly.emberObject.promiseProxyMixinMod.PromiseProxyMixin
import typingsJapgolly.emberObject.proxyMod.ObjectProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "PromiseObject")
@js.native
class PromiseObject[T] ()
  extends PromiseProxyMixin[T with typingsJapgolly.emberObject.proxyMod.default[js.Object]]
     with ObjectProxy[T]

