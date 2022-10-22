package typingsJapgolly.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.SpriteSheetLoader")
@js.native
open class SpriteSheetLoader protected ()
  extends StObject
     with typingsJapgolly.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object) = this()
}
/* static members */
object SpriteSheetLoader {
  
  @JSGlobal("createjs.SpriteSheetLoader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
