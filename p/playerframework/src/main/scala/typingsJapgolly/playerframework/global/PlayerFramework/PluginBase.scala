package typingsJapgolly.playerframework.global.PlayerFramework

import typingsJapgolly.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PlayerFramework.PluginBase")
@js.native
open class PluginBase ()
  extends StObject
     with typingsJapgolly.playerframework.PlayerFramework.PluginBase {
  
  /* CompleteClass */
  var currentMediaSource: MediaSource = js.native
  
  /* CompleteClass */
  var isActive: Boolean = js.native
  
  /* CompleteClass */
  var isEnabled: Boolean = js.native
  
  /* CompleteClass */
  var isLoaded: Boolean = js.native
  
  /* CompleteClass */
  override def load(): Unit = js.native
  
  /* CompleteClass */
  var mediaPlayer: typingsJapgolly.playerframework.PlayerFramework.MediaPlayer = js.native
  
  /* CompleteClass */
  override def unload(): Unit = js.native
  
  /* CompleteClass */
  override def update(mediaSource: MediaSource): Unit = js.native
}
