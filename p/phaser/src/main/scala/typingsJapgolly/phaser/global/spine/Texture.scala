package typingsJapgolly.phaser.global.spine

import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSGlobal("spine.Texture")
@js.native
open class Texture protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.Texture {
  def this(image: HTMLImageElement) = this()
  
  /* protected */ /* CompleteClass */
  var _image: HTMLImageElement = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  
  /* CompleteClass */
  override def setFilters(
    minFilter: typingsJapgolly.phaser.spine.TextureFilter,
    magFilter: typingsJapgolly.phaser.spine.TextureFilter
  ): Unit = js.native
  
  /* CompleteClass */
  override def setWraps(uWrap: typingsJapgolly.phaser.spine.TextureWrap, vWrap: typingsJapgolly.phaser.spine.TextureWrap): Unit = js.native
}
object Texture {
  
  @JSGlobal("spine.Texture")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def filterFromString(text: String): typingsJapgolly.phaser.spine.TextureFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFromString")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.TextureFilter]
  
  /* static member */
  inline def wrapFromString(text: String): typingsJapgolly.phaser.spine.TextureWrap = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapFromString")(text.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.phaser.spine.TextureWrap]
}
