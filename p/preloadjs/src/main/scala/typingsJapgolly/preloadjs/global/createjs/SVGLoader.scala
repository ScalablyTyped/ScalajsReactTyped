package typingsJapgolly.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.SVGLoader")
@js.native
open class SVGLoader protected ()
  extends StObject
     with typingsJapgolly.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object, preferXHR: Boolean) = this()
}
/* static members */
object SVGLoader {
  
  @JSGlobal("createjs.SVGLoader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
