package typingsJapgolly.koaHbs.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.handlebars.Handlebars.HelperDeclareSpec
import typingsJapgolly.handlebars.Handlebars.HelperDelegate
import typingsJapgolly.koaHbs.FnCall
import typingsJapgolly.koaHbs.TypeofUtils
import typingsJapgolly.koaHbs.mod.Hbs.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hbs_ extends js.Object {
  var SafeString: Instantiable1[/* str */ String, typingsJapgolly.handlebars.mod.SafeString] = js.native
  var Utils: TypeofUtils = js.native
  @JSName("registerHelper")
  var registerHelper_Original: FnCall = js.native
  def middleware(opts: Middleware): js.Any = js.native
  def registerHelper(name: String, fn: HelperDelegate): Unit = js.native
  def registerHelper(name: HelperDeclareSpec): Unit = js.native
}

