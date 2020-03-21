package typingsJapgolly.coreDecorators.mod

import typingsJapgolly.std.MethodDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typingsJapgolly.std.PropertyDecorator because var conflicts: length. Inlined  */ @js.native
trait PropertyOrMethodDecorator extends MethodDecorator {
  def apply(target: js.Object, propertyKey: String): Unit = js.native
  def apply(target: js.Object, propertyKey: js.Symbol): Unit = js.native
}

