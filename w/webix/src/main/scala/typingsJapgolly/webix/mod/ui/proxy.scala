package typingsJapgolly.webix.mod.ui

import typingsJapgolly.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "ui.proxy")
@js.native
open class proxy ()
  extends StObject
     with typingsJapgolly.webix.webix.ui.baseview {
  
  @JSName("$scope")
  var $scope: Any = js.native
  
  @JSName("$skin")
  var $skin_Original_proxy: WebixCallback = js.native
  
  def bind(target: Any, rule: WebixCallback): Unit = js.native
  def bind(target: Any, rule: WebixCallback, format: String): Unit = js.native
  
  @JSName("config")
  var config_proxy: proxyConfig = js.native
}
