package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of color materials used in the 3D model. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DColorMaterialGroup")
@js.native
class Printing3DColorMaterialGroup protected () extends js.Object {
  /**
    * Creates an instance of the Printing3DColorMaterialGroup class.
    * @param MaterialGroupId The identifier for the group of color materials used in the 3D model; a value greater than zero.
    */
  def this(MaterialGroupId: Double) = this()
  /** Gets a group of color materials used in the 3D model. */
  var colors: IVector[Printing3DColorMaterial] = js.native
  /** Gets the identifier (ID) for the color material group. */
  var materialGroupId: Double = js.native
}

