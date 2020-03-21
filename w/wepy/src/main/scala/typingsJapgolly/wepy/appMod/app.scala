package typingsJapgolly.wepy.appMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wepy.AnonPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait app extends js.Object {
  var config: AnonPages = js.native
  @JSName("$init")
  def $init(wepy: js.Any, config: AppConfig): Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: js.Array[String]): Unit = js.native
  @JSName("$initAPI")
  def $initAPI(wepy: js.Any, noPromiseAPI: StringDictionary[Boolean]): Unit = js.native
  def use(addonName: AddOn, args: js.Any*): Unit = js.native
}

