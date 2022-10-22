package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Color")
@js.native
open class Color ()
  extends StObject
     with typingsJapgolly.phaser.spine.Color {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Unit, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Unit, b: Double) = this()
  def this(r: Unit, g: Double, b: Double) = this()
  def this(r: Unit, g: Unit, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  def this(r: Double, g: Double, b: Unit, a: Double) = this()
  def this(r: Double, g: Unit, b: Double, a: Double) = this()
  def this(r: Double, g: Unit, b: Unit, a: Double) = this()
  def this(r: Unit, g: Double, b: Double, a: Double) = this()
  def this(r: Unit, g: Double, b: Unit, a: Double) = this()
  def this(r: Unit, g: Unit, b: Double, a: Double) = this()
  def this(r: Unit, g: Unit, b: Unit, a: Double) = this()
  
  /* CompleteClass */
  var a: Double = js.native
  
  /* CompleteClass */
  override def add(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  /* CompleteClass */
  var b: Double = js.native
  
  /* CompleteClass */
  override def clamp(): this.type = js.native
  
  /* CompleteClass */
  var g: Double = js.native
  
  /* CompleteClass */
  var r: Double = js.native
  
  /* CompleteClass */
  override def set(r: Double, g: Double, b: Double, a: Double): this.type = js.native
  
  /* CompleteClass */
  override def setFromColor(c: typingsJapgolly.phaser.spine.Color): this.type = js.native
  
  /* CompleteClass */
  override def setFromString(hex: String): this.type = js.native
}
object Color {
  
  @JSGlobal("spine.Color")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.Color.BLUE")
  @js.native
  def BLUE: typingsJapgolly.phaser.spine.Color = js.native
  inline def BLUE_=(x: typingsJapgolly.phaser.spine.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Color.GREEN")
  @js.native
  def GREEN: typingsJapgolly.phaser.spine.Color = js.native
  inline def GREEN_=(x: typingsJapgolly.phaser.spine.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Color.MAGENTA")
  @js.native
  def MAGENTA: typingsJapgolly.phaser.spine.Color = js.native
  inline def MAGENTA_=(x: typingsJapgolly.phaser.spine.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGENTA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Color.RED")
  @js.native
  def RED: typingsJapgolly.phaser.spine.Color = js.native
  inline def RED_=(x: typingsJapgolly.phaser.spine.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Color.WHITE")
  @js.native
  def WHITE: typingsJapgolly.phaser.spine.Color = js.native
  inline def WHITE_=(x: typingsJapgolly.phaser.spine.Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def rgb888ToColor(color: typingsJapgolly.phaser.spine.Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def rgba8888ToColor(color: typingsJapgolly.phaser.spine.Color, value: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba8888ToColor")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
