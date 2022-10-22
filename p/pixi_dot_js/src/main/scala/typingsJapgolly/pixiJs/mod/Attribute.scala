package typingsJapgolly.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Attribute")
@js.native
open class Attribute protected ()
  extends typingsJapgolly.pixiCore.mod.Attribute {
  /**
    * @param buffer - the id of the buffer that this attribute will look for
    * @param size - the size of the attribute. If you have 2 floats per vertex (eg position x and y) this would be 2.
    * @param normalized - should the data be normalized.
    * @param {PIXI.TYPES} [type=PIXI.TYPES.FLOAT] - what type of number is the attribute. Check {@link PIXI.TYPES} to see the ones available
    * @param [stride=0] - How far apart, in bytes, the start of each value is. (used for interleaving data)
    * @param [start=0] - How far into the array to start reading values (used for interleaving data)
    * @param [instance=false] - Whether the geometry is instanced.
    */
  def this(
    buffer: Double,
    size: js.UndefOr[Double],
    normalized: js.UndefOr[Boolean],
    `type`: js.UndefOr[typingsJapgolly.pixiConstants.mod.TYPES],
    stride: js.UndefOr[Double],
    start: js.UndefOr[Double],
    instance: js.UndefOr[Boolean]
  ) = this()
}
/* static members */
object Attribute {
  
  @JSImport("pixi.js", "Attribute")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function that creates an Attribute based on the information provided
    * @param buffer - the id of the buffer that this attribute will look for
    * @param [size=0] - the size of the attribute. If you have 2 floats per vertex (eg position x and y) this would be 2
    * @param [normalized=false] - should the data be normalized.
    * @param [type=PIXI.TYPES.FLOAT] - what type of number is the attribute. Check {@link PIXI.TYPES} to see the ones available
    * @param [stride=0] - How far apart, in bytes, the start of each value is. (used for interleaving data)
    * @returns - A new {@link PIXI.Attribute} based on the information provided
    */
  inline def from(buffer: Double): typingsJapgolly.pixiCore.mod.Attribute = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Double): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Double, normalized: Boolean): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Double, normalized: Boolean, `type`: Unit, stride: Double): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Double, normalized: Boolean, `type`: typingsJapgolly.pixiConstants.mod.TYPES): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(
    buffer: Double,
    size: Double,
    normalized: Boolean,
    `type`: typingsJapgolly.pixiConstants.mod.TYPES,
    stride: Double
  ): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Double, normalized: Unit, `type`: Unit, stride: Double): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Double, normalized: Unit, `type`: typingsJapgolly.pixiConstants.mod.TYPES): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(
    buffer: Double,
    size: Double,
    normalized: Unit,
    `type`: typingsJapgolly.pixiConstants.mod.TYPES,
    stride: Double
  ): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Unit, normalized: Boolean): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Unit, normalized: Boolean, `type`: Unit, stride: Double): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Unit, normalized: Boolean, `type`: typingsJapgolly.pixiConstants.mod.TYPES): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(
    buffer: Double,
    size: Unit,
    normalized: Boolean,
    `type`: typingsJapgolly.pixiConstants.mod.TYPES,
    stride: Double
  ): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Unit, normalized: Unit, `type`: Unit, stride: Double): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(buffer: Double, size: Unit, normalized: Unit, `type`: typingsJapgolly.pixiConstants.mod.TYPES): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
  inline def from(
    buffer: Double,
    size: Unit,
    normalized: Unit,
    `type`: typingsJapgolly.pixiConstants.mod.TYPES,
    stride: Double
  ): typingsJapgolly.pixiCore.mod.Attribute = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], normalized.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stride.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pixiCore.mod.Attribute]
}
