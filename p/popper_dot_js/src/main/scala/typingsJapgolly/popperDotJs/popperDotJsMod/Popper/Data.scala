package typingsJapgolly.popperDotJs.popperDotJsMod.Popper

import org.scalajs.dom.raw.CSSStyleDeclaration
import org.scalajs.dom.raw.Element
import typingsJapgolly.popperDotJs.Anon_Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var arrowElement: Element
  var arrowStyles: CSSStyleDeclaration
  var attributes: Attributes
  var boundaries: js.Object
  var flipped: Boolean
  var hide: Boolean
  var instance: typingsJapgolly.popperDotJs.popperDotJsMod.Popper
  var offsets: Anon_Arrow
  var originalPlacement: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.Placement
  var placement: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.Placement
  var styles: CSSStyleDeclaration
}

object Data {
  @scala.inline
  def apply(
    arrowElement: Element,
    arrowStyles: CSSStyleDeclaration,
    attributes: Attributes,
    boundaries: js.Object,
    flipped: Boolean,
    hide: Boolean,
    instance: typingsJapgolly.popperDotJs.popperDotJsMod.Popper,
    offsets: Anon_Arrow,
    originalPlacement: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.Placement,
    placement: typingsJapgolly.popperDotJs.popperDotJsMod.Popper.Placement,
    styles: CSSStyleDeclaration
  ): Data = {
    val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

