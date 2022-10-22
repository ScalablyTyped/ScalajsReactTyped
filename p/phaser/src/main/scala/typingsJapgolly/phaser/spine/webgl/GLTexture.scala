package typingsJapgolly.phaser.spine.webgl

import typingsJapgolly.phaser.spine.Disposable
import typingsJapgolly.phaser.spine.Restorable
import typingsJapgolly.phaser.spine.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GLTexture
  extends StObject
     with Texture
     with Disposable
     with Restorable {
  
  def bind(): Unit = js.native
  def bind(unit: Double): Unit = js.native
  
  /* private */ var boundUnit: Any = js.native
  
  /* private */ var context: Any = js.native
  
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  /* private */ var texture: Any = js.native
  
  def unbind(): Unit = js.native
  
  def update(useMipMaps: Boolean): Unit = js.native
  
  /* private */ var useMipMaps: Any = js.native
}
