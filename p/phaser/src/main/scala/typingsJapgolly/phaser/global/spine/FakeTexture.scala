package typingsJapgolly.phaser.global.spine

import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.FakeTexture")
@js.native
open class FakeTexture ()
  extends StObject
     with typingsJapgolly.phaser.spine.FakeTexture {
  
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
