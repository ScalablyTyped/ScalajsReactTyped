package typingsJapgolly.materialTopAppBar

import typingsJapgolly.materialTopAppBar.adapterMod.MDCTopAppBarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/top-app-bar/foundation", JSImport.Namespace)
@js.native
object materialTopAppBarMod extends js.Object {
  @js.native
  class default ()
    extends typingsJapgolly.materialBase.foundationMod.default[MDCTopAppBarAdapter]
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialTopAppBar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCTopAppBarAdapter = js.native
    val numbers: typingsJapgolly.materialTopAppBar.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialTopAppBar.constantsMod.strings = js.native
  }
  
  type MDCTopAppBarBaseFoundation = typingsJapgolly.materialBase.foundationMod.default[MDCTopAppBarAdapter]
}

