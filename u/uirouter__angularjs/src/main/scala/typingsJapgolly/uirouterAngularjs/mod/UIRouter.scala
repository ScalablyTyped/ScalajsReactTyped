package typingsJapgolly.uirouterAngularjs.mod

import typingsJapgolly.uirouterCore.coreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.coreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internalapi
  */
class UIRouter ()
  extends typingsJapgolly.uirouterCore.mod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}

