package typingsJapgolly.express.mod

import typingsJapgolly.express.Typeofm
import typingsJapgolly.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
  */
@JSImport("express", "static")
@js.native
object static extends js.Object {
  var mime: Typeofm = js.native
  def apply(root: String): typingsJapgolly.expressServeStaticCore.mod.Handler = js.native
  def apply(root: String, options: ServeStaticOptions): typingsJapgolly.expressServeStaticCore.mod.Handler = js.native
  def serveStatic(root: String): typingsJapgolly.expressServeStaticCore.mod.Handler = js.native
  def serveStatic(root: String, options: ServeStaticOptions): typingsJapgolly.expressServeStaticCore.mod.Handler = js.native
}

