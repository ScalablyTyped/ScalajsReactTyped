package typingsJapgolly.samchon

import typingsJapgolly.samchon.entityMod.Entity
import typingsJapgolly.std.Uint8Array
import typingsJapgolly.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/invoke/InvokeParameter", JSImport.Namespace)
@js.native
object invokeParameterMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeParameter () extends Entity {
    def this(`val`: String) = this()
    def this(`val`: Boolean) = this()
    def this(`val`: Double) = this()
    def this(`val`: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(`val`: XML) = this()
    def this(name: String, `val`: String) = this()
    /**
      * Construct from variable name and number value.
      *
      * @param name
      * @param val
      */
    def this(name: String, `val`: Boolean) = this()
    def this(name: String, `val`: Double) = this()
    def this(name: String, `val`: scala.scalajs.js.typedarray.Uint8Array) = this()
    def this(name: String, `val`: XML) = this()
    /**
      * Name of the parameter.
      *
      * @details Optional property, can be omitted.
      */
    var name: String = js.native
    /**
      * Type of the parameter.
      */
    var `type`: String = js.native
    /**
      * Value of the parameter.
      */
    var value: Boolean | Double | String | XML | scala.scalajs.js.typedarray.Uint8Array = js.native
    /**
      * Get name.
      */
    def getName(): String = js.native
    /**
      * Get type.
      */
    def getType(): String = js.native
    /**
      * Get value.
      */
    def getValue(): js.Any = js.native
    def setValue(value: String): Unit = js.native
    def setValue(value: Boolean): Unit = js.native
    def setValue(value: Double): Unit = js.native
    def setValue(value: Uint8Array): Unit = js.native
    def setValue(value: XML): Unit = js.native
  }
  
}

