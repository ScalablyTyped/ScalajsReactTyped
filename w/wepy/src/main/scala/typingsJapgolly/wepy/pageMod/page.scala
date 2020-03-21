package typingsJapgolly.wepy.pageMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wepy.AnonDelta
import typingsJapgolly.wepy.componentMod.component
import typingsJapgolly.wepy.wepyStrings.navigateTo
import typingsJapgolly.wepy.wepyStrings.redirectTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait page extends component {
  @JSName("$preloadData")
  var $preloadData: js.UndefOr[StringDictionary[js.Any]] = js.native
  var config: js.UndefOr[PageConfig] = js.native
  @JSName("$back")
  def $back(delta: Double): js.Any = js.native
  @JSName("$back")
  def $back(delta: AnonDelta): js.Any = js.native
  @JSName("$init")
  def $init(wxpage: js.Any, $parent: js.Any): js.Any = js.native
  @JSName("$preload")
  def $preload(key: String, data: js.Any): js.Any = js.native
  @JSName("$preload")
  def $preload(key: StringDictionary[js.Any], data: js.Any): js.Any = js.native
  @JSName("$redirect")
  def $redirect(url: String): js.Any = js.native
  @JSName("$redirect")
  def $redirect(url: String, params: js.Object): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: String): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: String, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: UrlParam): js.Any = js.native
  @JSName("$route")
  def $route_navigateTo(`type`: navigateTo, url: UrlParam, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: String): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: String, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: UrlParam): js.Any = js.native
  @JSName("$route")
  def $route_redirectTo(`type`: redirectTo, url: UrlParam, params: StringDictionary[js.Any]): js.Any = js.native
  @JSName("$switch")
  def $switch(url: String): js.Any = js.native
  @JSName("$switch")
  def $switch(url: UrlParam): js.Any = js.native
}

