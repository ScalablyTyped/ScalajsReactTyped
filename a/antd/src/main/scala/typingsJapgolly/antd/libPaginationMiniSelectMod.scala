package typingsJapgolly.antd

import typingsJapgolly.antd.libPaginationMiniSelectMod.MiniSelect
import typingsJapgolly.antd.libSelectMod.OptionProps
import typingsJapgolly.react.reactMod.ClassicComponentClass
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/pagination/MiniSelect", JSImport.Namespace)
@js.native
object libPaginationMiniSelectMod extends js.Object {
  @js.native
  trait MiniSelect
    extends Component[js.Any, js.Any, js.Any]
  
  @js.native
  class default () extends MiniSelect
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Option: ClassicComponentClass[OptionProps] = js.native
  }
  
}

