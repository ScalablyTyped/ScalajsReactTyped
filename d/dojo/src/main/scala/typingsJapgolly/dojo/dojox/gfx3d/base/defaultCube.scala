package typingsJapgolly.dojo.dojox.gfx3d.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx3d/_base.defaultCube.html
  *
  *
  */
trait defaultCube extends js.Object {
  /**
    *
    */
  var bottom: Object
  /**
    *
    */
  var top: Object
  /**
    *
    */
  var `type`: String
}

object defaultCube {
  @scala.inline
  def apply(bottom: Object, top: Object, `type`: String): defaultCube = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultCube]
  }
}

