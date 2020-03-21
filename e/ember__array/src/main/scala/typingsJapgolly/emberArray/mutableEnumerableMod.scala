package typingsJapgolly.emberArray

import typingsJapgolly.emberArray.enumerableMod.Enumerable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/-private/mutable-enumerable", JSImport.Namespace)
@js.native
object mutableEnumerableMod extends js.Object {
  /**
    * This mixin defines the API for modifying generic enumerables. These methods
    * can be applied to an object regardless of whether it is ordered or
    * unordered.
    */
  @js.native
  trait MutableEnumerable[T] extends Enumerable[T] {
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def addObject(`object`: T): T = js.native
    /**
      * Adds each object in the passed enumerable to the receiver.
      */
    def addObjects(objects: Enumerable[T]): this.type = js.native
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def removeObject(`object`: T): T = js.native
    /**
      * Removes each object in the passed enumerable from the receiver.
      */
    def removeObjects(objects: Enumerable[T]): this.type = js.native
  }
  
  val default: typingsJapgolly.emberObject.mixinMod.default[MutableEnumerable[js.Any], typingsJapgolly.emberObject.mod.default] = js.native
}

