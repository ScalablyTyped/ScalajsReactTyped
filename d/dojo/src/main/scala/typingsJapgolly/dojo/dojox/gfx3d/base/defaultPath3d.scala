package typingsJapgolly.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.defaultPath3d.html
  *
  *
  */
trait defaultPath3d extends js.Object {
  /**
    *
    */
  var path: js.Array[_]
  /**
    *
    */
  var `type`: String
}

object defaultPath3d {
  @scala.inline
  def apply(path: js.Array[_], `type`: String): defaultPath3d = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultPath3d]
  }
}

