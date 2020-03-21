package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.elementsMod.Element
import typingsJapgolly.mendixmodelsdk.structuresMod.Structure
import typingsJapgolly.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCopy extends js.Object {
  var copy: Element
  var idMap: IMap[Structure]
}

object AnonCopy {
  @scala.inline
  def apply(copy: Element, idMap: IMap[Structure]): AnonCopy = {
    val __obj = js.Dynamic.literal(copy = copy.asInstanceOf[js.Any], idMap = idMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCopy]
  }
}

