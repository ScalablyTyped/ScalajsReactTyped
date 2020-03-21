package typingsJapgolly.uirouterAngularjs.mod

import typingsJapgolly.uirouterCore.AnonConfiguration
import typingsJapgolly.uirouterCore.AnonInstantiable
import typingsJapgolly.uirouterCore.AnonInstantiableLocationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "locationPluginFactory")
@js.native
object locationPluginFactory extends js.Object {
  def apply(
    name: String,
    isHtml5: Boolean,
    serviceClass: AnonInstantiable,
    configurationClass: AnonInstantiableLocationConfig
  ): js.Function1[/* uiRouter */ typingsJapgolly.uirouterCore.routerMod.UIRouter, AnonConfiguration] = js.native
}

