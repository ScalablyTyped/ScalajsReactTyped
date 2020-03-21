package typingsJapgolly.jupyterlabDocregistry.registryMod.DocumentRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabDocregistry.jupyterlabDocregistryStrings.started
  - typingsJapgolly.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed
  - typingsJapgolly.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed
*/
trait SaveState extends js.Object

object SaveState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typingsJapgolly.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed = this.cast("completed")
  @scala.inline
  def failed: typingsJapgolly.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed = this.cast("failed")
  @scala.inline
  def started: typingsJapgolly.jupyterlabDocregistry.jupyterlabDocregistryStrings.started = this.cast("started")
}

