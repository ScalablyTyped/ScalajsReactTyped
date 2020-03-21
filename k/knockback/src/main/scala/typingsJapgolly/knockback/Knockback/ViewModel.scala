package typingsJapgolly.knockback.Knockback

import typingsJapgolly.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Knockback.ViewModel")
@js.native
class ViewModel () extends Destroyable {
  def this(model: Model) = this()
  def this(model: Model, options: ViewModelOptions) = this()
  def this(model: Model, options: ViewModelOptions, viewModel: ViewModel) = this()
  def extend(source: js.Any): js.Any = js.native
  def model(): Model = js.native
  def shareOptions(): ViewModelOptions = js.native
}

