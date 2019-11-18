package typingsJapgolly.antd.esMod

import typingsJapgolly.antd.Anon_AllowClear
import typingsJapgolly.antd.PartialCascaderState
import typingsJapgolly.antd.esCascaderMod.CascaderProps
import typingsJapgolly.antd.esCascaderMod.CascaderState
import typingsJapgolly.antd.esCascaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Cascader")
@js.native
class Cascader protected () extends default {
  def this(props: CascaderProps) = this()
}

/* static members */
@JSImport("antd/es", "Cascader")
@js.native
object Cascader extends js.Object {
  var defaultProps: Anon_AllowClear = js.native
  def getDerivedStateFromProps(nextProps: CascaderProps, hasPrevProps: CascaderState): PartialCascaderState = js.native
}

