package typingsJapgolly.semanticUiReact.modalModalMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.modalActionsMod.ModalActionsProps
import typingsJapgolly.semanticUiReact.modalContentMod.ModalContentProps
import typingsJapgolly.semanticUiReact.modalDescriptionMod.ModalDescriptionProps
import typingsJapgolly.semanticUiReact.modalHeaderMod.ModalHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalComponent extends ComponentClass[ModalProps, ComponentState] {
  var Actions: ComponentClassP[ModalActionsProps with js.Object] = js.native
  var Content: StatelessComponent[ModalContentProps] = js.native
  var Description: StatelessComponent[ModalDescriptionProps] = js.native
  var Header: StatelessComponent[ModalHeaderProps] = js.native
}

