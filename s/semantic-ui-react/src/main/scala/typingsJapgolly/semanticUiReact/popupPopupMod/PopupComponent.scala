package typingsJapgolly.semanticUiReact.popupPopupMod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.popupContentMod.PopupContentProps
import typingsJapgolly.semanticUiReact.popupHeaderMod.PopupHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupComponent extends ComponentClass[PopupProps, ComponentState] {
  var Content: StatelessComponent[PopupContentProps] = js.native
  var Header: StatelessComponent[PopupHeaderProps] = js.native
}

