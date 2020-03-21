package typingsJapgolly.semanticUiReact.stepStepMod

import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.stepContentMod.StepContentProps
import typingsJapgolly.semanticUiReact.stepDescriptionMod.StepDescriptionProps
import typingsJapgolly.semanticUiReact.stepGroupMod.StepGroupProps
import typingsJapgolly.semanticUiReact.stepTitleMod.StepTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepComponent extends ComponentClass[StepProps, ComponentState] {
  var Content: StatelessComponent[StepContentProps] = js.native
  var Description: StatelessComponent[StepDescriptionProps] = js.native
  var Group: StatelessComponent[StepGroupProps] = js.native
  var Title: StatelessComponent[StepTitleProps] = js.native
}

