package typingsJapgolly.antd.breadcrumbBreadcrumbMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breadcrumb
  extends Component[BreadcrumbProps, js.Any, js.Any] {
  def addChildPath(paths: js.Array[String], childPath: js.UndefOr[scala.Nothing], params: js.Any): js.Array[String] = js.native
  def addChildPath(paths: js.Array[String], childPath: String, params: js.Any): js.Array[String] = js.native
  def genForRoutes(hasRoutesParamsSeparatorItemRender: BreadcrumbProps): js.Array[Element] = js.native
  def getPath(path: String, params: js.Any): String = js.native
  def renderBreadcrumb(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

