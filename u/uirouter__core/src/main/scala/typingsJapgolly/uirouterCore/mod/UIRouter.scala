package typingsJapgolly.uirouterCore.mod

import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationConfig
import typingsJapgolly.uirouterCore.libCommonCoreservicesMod.LocationServices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internal
  */
open class UIRouter ()
  extends typingsJapgolly.uirouterCore.libRouterMod.UIRouter {
  def this(locationService: LocationServices) = this()
  def this(locationService: Unit, locationConfig: LocationConfig) = this()
  def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
}
