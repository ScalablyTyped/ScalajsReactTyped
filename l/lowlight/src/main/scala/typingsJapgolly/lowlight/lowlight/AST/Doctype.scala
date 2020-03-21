package typingsJapgolly.lowlight.lowlight.AST

import typingsJapgolly.lowlight.lowlight.AST.Unist.Data
import typingsJapgolly.lowlight.lowlight.AST.Unist.Location
import typingsJapgolly.lowlight.lowlight.AST.Unist.Node
import typingsJapgolly.lowlight.lowlight.HastNode
import typingsJapgolly.lowlight.lowlightStrings.doctype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doctype
  extends Node
     with HastNode {
  var name: String
  var public: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_Doctype: doctype
}

object Doctype {
  @scala.inline
  def apply(
    name: String,
    `type`: doctype,
    data: Data = null,
    position: Location = null,
    public: String = null,
    system: String = null
  ): Doctype = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doctype]
  }
}

