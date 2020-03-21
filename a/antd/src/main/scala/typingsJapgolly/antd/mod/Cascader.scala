package typingsJapgolly.antd.mod

import typingsJapgolly.antd.AnonAllowClear
import typingsJapgolly.antd.PartialCascaderState
import typingsJapgolly.antd.cascaderMod.CascaderProps
import typingsJapgolly.antd.cascaderMod.CascaderState
import typingsJapgolly.antd.cascaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Cascader")
@js.native
class Cascader protected () extends default {
  def this(props: CascaderProps) = this()
}

/* static members */
@JSImport("antd", "Cascader")
@js.native
object Cascader extends js.Object {
  var defaultProps: AnonAllowClear = js.native
  def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = js.native
}

