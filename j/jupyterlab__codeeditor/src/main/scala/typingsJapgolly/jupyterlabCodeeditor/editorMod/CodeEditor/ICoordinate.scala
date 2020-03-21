package typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor

import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface describing editor state coordinates.
  */
trait ICoordinate
  extends JSONObject
     with ClientRect

object ICoordinate {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): ICoordinate = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICoordinate]
  }
}

