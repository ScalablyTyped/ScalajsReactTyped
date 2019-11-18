package typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.reactMod.ComponentClass
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.StatelessComponent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalActionsMod.ModalActionsProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalContentMod.ModalContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalDescriptionMod.ModalDescriptionProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsModulesModalModalHeaderMod.ModalHeaderProps
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

