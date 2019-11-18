package typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepMod

import typingsJapgolly.react.reactMod.ComponentClass
import typingsJapgolly.react.reactMod.ComponentState
import typingsJapgolly.react.reactMod.StatelessComponent
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepContentMod.StepContentProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepDescriptionMod.StepDescriptionProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepGroupMod.StepGroupProps
import typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsStepStepTitleMod.StepTitleProps
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

