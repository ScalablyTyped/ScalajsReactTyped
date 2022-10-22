package typingsJapgolly.easeljs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.BitmapCache")
@js.native
open class BitmapCache ()
  extends StObject
     with typingsJapgolly.easeljs.createjs.BitmapCache
/* static members */
object BitmapCache {
  
  @JSGlobal("createjs.BitmapCache")
  @js.native
  val ^ : js.Any = js.native
  
  // methods
  inline def getFilterBounds(target: typingsJapgolly.easeljs.createjs.DisplayObject): typingsJapgolly.easeljs.createjs.Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterBounds")(target.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.easeljs.createjs.Rectangle]
  inline def getFilterBounds(
    target: typingsJapgolly.easeljs.createjs.DisplayObject,
    output: typingsJapgolly.easeljs.createjs.Rectangle
  ): typingsJapgolly.easeljs.createjs.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterBounds")(target.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.easeljs.createjs.Rectangle]
}
