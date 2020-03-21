package typingsJapgolly.uirouterCore.mod

import typingsJapgolly.uirouterCore.coreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.coreservicesMod.LocationServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internalapi
  */
class UIRouter ()
  extends typingsJapgolly.uirouterCore.routerMod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}

