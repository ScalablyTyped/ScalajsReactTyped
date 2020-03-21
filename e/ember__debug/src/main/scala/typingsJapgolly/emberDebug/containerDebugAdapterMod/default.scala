package typingsJapgolly.emberDebug.containerDebugAdapterMod

import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/debug/container-debug-adapter", JSImport.Default)
@js.native
class default () extends ContainerDebugAdapter {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /* CompleteClass */
  override var resolver: typingsJapgolly.emberEngine.resolverMod.default = js.native
  /* CompleteClass */
  override def canCatalogEntriesByType(`type`: String): Boolean = js.native
  /* CompleteClass */
  override def catalogEntriesByType(`type`: String): js.Array[String] = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* CompleteClass */
  override def hasOwnProperty(v: PropertyKey): Boolean = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* CompleteClass */
  override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
}

