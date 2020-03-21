package typingsJapgolly.pixiJs

import typingsJapgolly.pixiJs.PIXI.Extract
import typingsJapgolly.pixiJs.PIXI.Prepare
import typingsJapgolly.pixiJs.PIXI.accessibility.AccessibilityManager
import typingsJapgolly.pixiJs.PIXI.interaction.InteractionManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessibility extends js.Object {
  var accessibility: AccessibilityManager
  var extract: Extract
  var interaction: InteractionManager
  var prepare: Prepare
}

object AnonAccessibility {
  @scala.inline
  def apply(
    accessibility: AccessibilityManager,
    extract: Extract,
    interaction: InteractionManager,
    prepare: Prepare
  ): AnonAccessibility = {
    val __obj = js.Dynamic.literal(accessibility = accessibility.asInstanceOf[js.Any], extract = extract.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any], prepare = prepare.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccessibility]
  }
}

