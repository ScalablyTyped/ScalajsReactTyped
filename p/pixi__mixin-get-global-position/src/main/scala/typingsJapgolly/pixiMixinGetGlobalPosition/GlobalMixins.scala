package typingsJapgolly.pixiMixinGetGlobalPosition

import typingsJapgolly.pixiMath.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  @js.native
  trait DisplayObject extends StObject {
    
    def getGlobalPosition(): Point = js.native
    def getGlobalPosition(point: Unit, skipUpdate: Boolean): Point = js.native
    def getGlobalPosition(point: Point): Point = js.native
    def getGlobalPosition(point: Point, skipUpdate: Boolean): Point = js.native
  }
}
