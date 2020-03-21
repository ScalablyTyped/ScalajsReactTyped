package typingsJapgolly.mendixmodelsdk.commonMod.common

import typingsJapgolly.mendixmodelsdk.deltasDeltasMod._PrimitiveValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a size, e.g. of an entity box.
  */
trait ISize extends _PrimitiveValue {
  var height: Double
  var width: Double
}

object ISize {
  @scala.inline
  def apply(height: Double, width: Double): ISize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISize]
  }
}

