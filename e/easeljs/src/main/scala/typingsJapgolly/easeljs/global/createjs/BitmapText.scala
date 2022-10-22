package typingsJapgolly.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.BitmapText")
@js.native
open class BitmapText ()
  extends StObject
     with typingsJapgolly.easeljs.createjs.BitmapText {
  def this(text: String) = this()
  def this(text: String, spriteSheet: typingsJapgolly.easeljs.createjs.SpriteSheet) = this()
  def this(text: Unit, spriteSheet: typingsJapgolly.easeljs.createjs.SpriteSheet) = this()
}
/* static members */
object BitmapText {
  
  @JSGlobal("createjs.BitmapText")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.BitmapText.maxPoolSize")
  @js.native
  def maxPoolSize: Double = js.native
  inline def maxPoolSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxPoolSize")(x.asInstanceOf[js.Any])
}
