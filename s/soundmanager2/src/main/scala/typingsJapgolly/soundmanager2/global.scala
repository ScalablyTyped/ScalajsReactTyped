package typingsJapgolly.soundmanager2

import typingsJapgolly.soundmanager2.soundmanager.SoundManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("soundManager")
  @js.native
  def soundManager_ : SoundManager = js.native
  
  inline def soundManager__=(x: SoundManager): Unit = js.Dynamic.global.updateDynamic("soundManager")(x.asInstanceOf[js.Any])
  
  object soundmanager {
    
    @JSGlobal("soundmanager.SMSound")
    @js.native
    open class SMSound ()
      extends StObject
         with typingsJapgolly.soundmanager2.soundmanager.SMSound
  }
}
