package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SkinInstance
  * @classdesc A skin instance is responsible for generating the matrix palette that is used to
  * skin vertices from object space to world space.
  * @param {pc.Skin} skin - The skin that will provide the inverse bind pose matrices to
  * generate the final matrix palette.
  */
@JSImport("playcanvas", "SkinInstance")
@js.native
class SkinInstance protected ()
  extends typingsJapgolly.playcanvas.pc.SkinInstance {
  def this(skin: typingsJapgolly.playcanvas.pc.Skin) = this()
}

