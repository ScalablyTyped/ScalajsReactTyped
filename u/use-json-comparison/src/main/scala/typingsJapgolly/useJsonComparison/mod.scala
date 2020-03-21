package typingsJapgolly.useJsonComparison

import typingsJapgolly.react.mod.EffectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-json-comparison", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(effect: EffectCallback): Unit = js.native
  def default(effect: EffectCallback, dependencies: js.Object): Unit = js.native
  /**
    * 一个更加安全的 stringify，可以解决循环依赖的问题
    * @param value
    */
  def stringify(value: js.Any): String = js.native
}

