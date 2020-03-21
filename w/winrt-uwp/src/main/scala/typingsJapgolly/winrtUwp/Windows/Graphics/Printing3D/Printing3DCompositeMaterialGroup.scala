package typingsJapgolly.winrtUwp.Windows.Graphics.Printing3D

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a group of composite materials. */
@JSGlobal("Windows.Graphics.Printing3D.Printing3DCompositeMaterialGroup")
@js.native
class Printing3DCompositeMaterialGroup protected () extends js.Object {
  /**
    * Creates an instance of the Printing3DCompositeMaterialGroup class.
    * @param MaterialGroupId The identifier (ID) of the composite material group; a value greater than zero.
    */
  def this(MaterialGroupId: Double) = this()
  /** Gets an list of mixtures that define individual composite materials. Each mixture is defined by listing the proportion of the overall mixture for each base material (values between 0 and 1), where the proportion values are specified in the same order as the base materials in MaterialIndices . */
  var composites: IVector[Printing3DCompositeMaterial] = js.native
  /** Gets the identifier (ID) of the base material group that defines the materials used in the composite material group. */
  var materialGroupId: Double = js.native
  /** Gets an ordered list of base materials that are used to make the composite materials in the group. The order of base materials is maintained in the mixture values defined by Composites . */
  var materialIndices: IVector[Double] = js.native
}

