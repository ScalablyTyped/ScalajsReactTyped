package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.ResourceLoader
  * @param {pc.Application} app - The application.
  * @classdesc Load resource data, potentially from remote sources. Caches resource on load to prevent
  * multiple requests. Add ResourceHandlers to handle different types of resources.
  */
@JSImport("playcanvas", "ResourceLoader")
@js.native
class ResourceLoader protected ()
  extends typingsJapgolly.playcanvas.pc.ResourceLoader {
  def this(app: typingsJapgolly.playcanvas.pc.Application) = this()
}

