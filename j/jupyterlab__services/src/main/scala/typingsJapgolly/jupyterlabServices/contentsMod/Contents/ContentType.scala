package typingsJapgolly.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contents file type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.notebook
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.file
  - typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.directory
*/
trait ContentType extends js.Object

object ContentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.directory = this.cast("directory")
  @scala.inline
  def file: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.file = this.cast("file")
  @scala.inline
  def notebook: typingsJapgolly.jupyterlabServices.jupyterlabServicesStrings.notebook = this.cast("notebook")
}

