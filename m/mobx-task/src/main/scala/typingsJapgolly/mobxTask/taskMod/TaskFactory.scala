package typingsJapgolly.mobxTask.taskMod

import typingsJapgolly.mobxTask.mobxTaskStrings.state
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.MethodDecorator
import typingsJapgolly.std.Pick
import typingsJapgolly.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskFactory extends TaskCreator[String] {
  /**
    * Creates a task in the `rejected` state.
    */
  @JSName("rejected")
  var rejected_Original: TaskCreator[Exclude[String, state]] = js.native
  /**
    * Creates a task in the `resolved` state.
    */
  @JSName("resolved")
  var resolved_Original: TaskCreator[Exclude[String, state]] = js.native
  /**
    * Calls the actual task function.
    */
  /**
    * Creates a task in the `rejected` state.
    */
  def rejected[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  /**
    * Creates a task in the `rejected` state.
    */
  @JSName("rejected")
  def rejected_state(options: Pick[TaskOptions[_, _], Exclude[String, state]]): MethodDecorator = js.native
  @JSName("rejected")
  def rejected_state[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], Exclude[String, state]]): Task_[A, R] = js.native
  /**
    * Creates a task in the `rejected` state.
    */
  @JSName("rejected")
  def rejected_state_PropertyDecorator(options: Pick[TaskOptions[_, _], Exclude[String, state]]): PropertyDecorator = js.native
  /**
    * Calls the actual task function.
    */
  /**
    * Creates a task in the `resolved` state.
    */
  def resolved[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R]): Task_[A, R] = js.native
  /**
    * Creates a task in the `resolved` state.
    */
  @JSName("resolved")
  def resolved_state(options: Pick[TaskOptions[_, _], Exclude[String, state]]): MethodDecorator = js.native
  @JSName("resolved")
  def resolved_state[A /* <: js.Array[_] */, R](func: js.Function1[/* args */ A, R], options: Pick[TaskOptions[A, R], Exclude[String, state]]): Task_[A, R] = js.native
  /**
    * Creates a task in the `resolved` state.
    */
  @JSName("resolved")
  def resolved_state_PropertyDecorator(options: Pick[TaskOptions[_, _], Exclude[String, state]]): PropertyDecorator = js.native
}

