package typingsJapgolly.antDesignPro

import typingsJapgolly.antDesignPro.pageHeaderMod.PageHeaderProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ant-design-pro/lib/PageHeader/breadcrumb", JSImport.Namespace)
@js.native
object breadcrumbMod extends js.Object {
  @js.native
  class default ()
    extends Component[PageHeaderProps, js.Any, js.Any]
  
  def getBreadcrumb(breadcrumbNameMap: js.Object, url: String): js.Object = js.native
  type BreadcrumbView = japgolly.scalajs.react.raw.React.Component[PageHeaderProps with js.Object, js.Object]
}

