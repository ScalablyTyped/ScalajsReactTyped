package typingsJapgolly.smartwizard

import org.scalajs.dom.Event
import typingsJapgolly.smartwizard.JQuerySmartwizard.SmartWizardOptions
import typingsJapgolly.smartwizard.smartwizardStrings.disable
import typingsJapgolly.smartwizard.smartwizardStrings.getStepIndex
import typingsJapgolly.smartwizard.smartwizardStrings.goToStep
import typingsJapgolly.smartwizard.smartwizardStrings.hide
import typingsJapgolly.smartwizard.smartwizardStrings.leaveStep
import typingsJapgolly.smartwizard.smartwizardStrings.loader
import typingsJapgolly.smartwizard.smartwizardStrings.next
import typingsJapgolly.smartwizard.smartwizardStrings.prev
import typingsJapgolly.smartwizard.smartwizardStrings.reset
import typingsJapgolly.smartwizard.smartwizardStrings.setOptions
import typingsJapgolly.smartwizard.smartwizardStrings.show
import typingsJapgolly.smartwizard.smartwizardStrings.showStep
import typingsJapgolly.smartwizard.smartwizardStrings.stepContent
import typingsJapgolly.smartwizard.smartwizardStrings.stepState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def on(
    eventName: showStep | stepContent,
    callback: js.Function4[
      /* e */ Event, 
      /* anchorObject */ this.type, 
      /* stepIndex */ Double, 
      /* stepDirection */ String, 
      Unit
    ]
  ): Unit = js.native
  /**
    * The leaveStep event triggers just before leaving from a step. You can
    * cancel the event by returning false, so the navigation is also be
    * cancelled and the wizard will retain the current state.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#event-leavestep}
    */
  @JSName("on")
  def on_leaveStep(
    eventName: leaveStep,
    callback: js.Function5[
      /* e */ Event, 
      /* anchorObject */ this.type, 
      /* currentStepIndex */ Double, 
      /* nextStepIndex */ Double, 
      /* stepDirection */ String, 
      Unit
    ]
  ): Unit = js.native
  
  def smartWizard(): Unit = js.native
  def smartWizard(functionName: next | prev | reset): Unit = js.native
  /**
    * Allow you to show/hide the built-n loader animation.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-loader}
    */
  def smartWizard(functionName: loader, action: show | hide): Unit = js.native
  /**
    * Change the state of a step
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-stepstate}
    */
  def smartWizard(functionName: stepState, steps: js.Array[Double], action: disable | hide): Unit = js.native
  /**
    * Gets the current step index
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-getstepindex}
    */
  @JSName("smartWizard")
  def smartWizard_getStepIndex(functionName: getStepIndex): Double = js.native
  /**
    * Allow you to go to a certain step.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-gotostep}
    */
  @JSName("smartWizard")
  def smartWizard_goToStep(functionName: goToStep, step: Double): Unit = js.native
  /**
    * Allow you to set the options dynamically.
    *
    * @see {@link http://techlaboratory.net/jquery-smartwizard#func-setoptions}
    */
  @JSName("smartWizard")
  def smartWizard_setOptions(functionName: setOptions, options: SmartWizardOptions): Unit = js.native
}
