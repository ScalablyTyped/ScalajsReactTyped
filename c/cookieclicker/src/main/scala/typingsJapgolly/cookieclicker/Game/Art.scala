package typingsJapgolly.cookieclicker.Game

import typingsJapgolly.cookieclicker.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cookieclicker.Game.BaselessArt
  - typingsJapgolly.cookieclicker.Game.BaseArt
*/
trait Art extends StObject
object Art {
  
  inline def BaseArt(base: String): typingsJapgolly.cookieclicker.Game.BaseArt = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cookieclicker.Game.BaseArt]
  }
  
  inline def BaselessArt(
    bg: String | (js.Function2[/* building */ GameObject, /* ctx */ CanvasRenderingContext2D, Unit]),
    pic: String | (js.Function2[/* building */ GameObject, /* i */ Double, String])
  ): typingsJapgolly.cookieclicker.Game.BaselessArt = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.cookieclicker.Game.BaselessArt]
  }
}
