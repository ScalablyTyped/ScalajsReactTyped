package typingsJapgolly.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.SoundLoader")
@js.native
open class SoundLoader protected ()
  extends StObject
     with typingsJapgolly.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}
/* static members */
object SoundLoader {
  
  @JSGlobal("createjs.SoundLoader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
