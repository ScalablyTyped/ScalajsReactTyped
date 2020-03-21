package typingsJapgolly.materialToolbar

import typingsJapgolly.materialToolbar.adapterMod.MDCToolbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/toolbar/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCToolbarFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCToolbarAdapter] {
    def updateAdjustElementStyles(): Unit = js.native
  }
  
  @js.native
  class default () extends MDCToolbarFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialToolbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCToolbarAdapter = js.native
    val numbers: typingsJapgolly.materialToolbar.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialToolbar.constantsMod.strings = js.native
  }
  
}

