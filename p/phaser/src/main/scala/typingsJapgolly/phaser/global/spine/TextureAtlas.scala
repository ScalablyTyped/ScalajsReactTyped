package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.TextureAtlas")
@js.native
open class TextureAtlas protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.TextureAtlas {
  def this(atlasText: String, textureLoader: js.Function1[/* path */ String, Any]) = this()
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* CompleteClass */
  override def findRegion(name: String): typingsJapgolly.phaser.spine.TextureAtlasRegion = js.native
  
  /* private */ /* CompleteClass */
  var load: Any = js.native
  
  /* CompleteClass */
  var pages: js.Array[typingsJapgolly.phaser.spine.TextureAtlasPage] = js.native
  
  /* CompleteClass */
  var regions: js.Array[typingsJapgolly.phaser.spine.TextureAtlasRegion] = js.native
}
