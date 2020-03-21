package typingsJapgolly.materialAutoInit

import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/auto-init", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait MDCAutoInit extends js.Object {
    def apply(): MDCAutoInit = js.native
    def apply(root: Document_): MDCAutoInit = js.native
    def apply(root: Document_, warn: MDCLogger): MDCAutoInit = js.native
    def deregister(componentName: String): Unit = js.native
    def deregisterAll(): Unit = js.native
    def register(componentName: String, Ctor: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
    def register(componentName: String, Ctor: js.Function1[/* repeated */ js.Any, _], warn: MDCLogger): Unit = js.native
  }
  
  /**
    * Auto-initializes all mdc components on a page.
    */
  // tslint:disable-next-line:strict-export-declare-modifiers
  val default: MDCAutoInit = js.native
  type MDCLogger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
}

