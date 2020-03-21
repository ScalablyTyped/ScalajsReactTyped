package typingsJapgolly.semanticUiReact.labelLabelMod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.labelDetailMod.LabelDetailProps
import typingsJapgolly.semanticUiReact.labelGroupMod.LabelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelComponent extends ComponentClass[LabelProps, ComponentState] {
  var Detail: StatelessComponent[LabelDetailProps] = js.native
  var Group: StatelessComponent[LabelGroupProps] = js.native
}

