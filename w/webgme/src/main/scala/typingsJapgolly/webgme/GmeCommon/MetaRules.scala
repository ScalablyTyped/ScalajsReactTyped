package typingsJapgolly.webgme.GmeCommon

import typingsJapgolly.webgme.AnonFilter
import typingsJapgolly.webgme.AnonLevel
import typingsJapgolly.webgme.AnonPtr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaRules extends js.Object {
  var aspects: AnonFilter
  var attributes: AnonLevel
  var children: MetaCardRule
  var constraints: Dictionary[typingsJapgolly.webgme.Core.Constraint]
  var pointers: AnonPtr
}

object MetaRules {
  @scala.inline
  def apply(
    aspects: AnonFilter,
    attributes: AnonLevel,
    children: MetaCardRule,
    constraints: Dictionary[typingsJapgolly.webgme.Core.Constraint],
    pointers: AnonPtr
  ): MetaRules = {
    val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaRules]
  }
}

