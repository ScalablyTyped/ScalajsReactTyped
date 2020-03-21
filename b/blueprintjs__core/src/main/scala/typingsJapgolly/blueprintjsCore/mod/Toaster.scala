package typingsJapgolly.blueprintjsCore.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.toasterMod.IToaster
import typingsJapgolly.blueprintjsCore.toasterMod.IToasterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Toaster")
@js.native
class Toaster ()
  extends typingsJapgolly.blueprintjsCore.componentsMod.Toaster

/* static members */
@JSImport("@blueprintjs/core", "Toaster")
@js.native
object Toaster extends js.Object {
  var defaultProps: IToasterProps = js.native
  var displayName: String = js.native
  /**
    * Create a new `Toaster` instance that can be shared around your application.
    * The `Toaster` will be rendered into a new element appended to the given container.
    */
  def create(): IToaster = js.native
  def create(props: IToasterProps): IToaster = js.native
  def create(props: IToasterProps, container: HTMLElement): IToaster = js.native
}

