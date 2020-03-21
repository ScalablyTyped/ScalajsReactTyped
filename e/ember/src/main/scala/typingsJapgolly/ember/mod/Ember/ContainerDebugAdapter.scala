package typingsJapgolly.ember.mod.Ember

import typingsJapgolly.emberEngine.resolverMod.default
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "Ember.ContainerDebugAdapter")
@js.native
class ContainerDebugAdapter ()
  extends typingsJapgolly.emberDebug.containerDebugAdapterMod.ContainerDebugAdapter {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* CompleteClass */
  override var constructor: js.Function = js.native
  /* CompleteClass */
  override var resolver: default = js.native
  /* CompleteClass */
  override def canCatalogEntriesByType(`type`: java.lang.String): Boolean = js.native
  /* CompleteClass */
  override def catalogEntriesByType(`type`: java.lang.String): js.Array[java.lang.String] = js.native
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

