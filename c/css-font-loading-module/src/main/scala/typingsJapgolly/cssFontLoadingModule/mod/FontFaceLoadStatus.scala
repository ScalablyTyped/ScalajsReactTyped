package typingsJapgolly.cssFontLoadingModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded
  - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading
  - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded
  - typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.error
*/
trait FontFaceLoadStatus extends js.Object

object FontFaceLoadStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.error = this.cast("error")
  @scala.inline
  def loaded: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loaded = this.cast("loaded")
  @scala.inline
  def loading: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.loading = this.cast("loading")
  @scala.inline
  def unloaded: typingsJapgolly.cssFontLoadingModule.cssFontLoadingModuleStrings.unloaded = this.cast("unloaded")
}

