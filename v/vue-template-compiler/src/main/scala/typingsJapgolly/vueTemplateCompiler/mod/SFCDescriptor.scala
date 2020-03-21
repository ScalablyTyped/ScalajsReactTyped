package typingsJapgolly.vueTemplateCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFCDescriptor extends js.Object {
  var customBlocks: js.Array[SFCBlock]
  var script: js.UndefOr[SFCBlock] = js.undefined
  var styles: js.Array[SFCBlock]
  var template: js.UndefOr[SFCBlock] = js.undefined
}

object SFCDescriptor {
  @scala.inline
  def apply(
    customBlocks: js.Array[SFCBlock],
    styles: js.Array[SFCBlock],
    script: SFCBlock = null,
    template: SFCBlock = null
  ): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCDescriptor]
  }
}

