package typingsJapgolly.useMediaAntdQuery

import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typingsJapgolly.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-media-antd-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(): xs | sm | md | lg | xl | xxl = js.native
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = js.native
  @js.native
  object MediaQueryEnum extends js.Object {
    var lg: AnonMaxWidth = js.native
    var md: AnonMaxWidth = js.native
    var sm: AnonMaxWidth = js.native
    var xl: AnonMaxWidth = js.native
    var xs: AnonMatchMedia = js.native
    var xxl: AnonMinWidth = js.native
  }
  
  type MediaQueryKey = String
}

