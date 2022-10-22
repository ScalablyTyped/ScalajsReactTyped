package typingsJapgolly.antvComponent

import typingsJapgolly.antvComponent.libTypesMod.LineAxisCfg
import typingsJapgolly.glMatrix.mod.vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAxisLineMod {
  
  @JSImport("@antv/component/lib/axis/line", JSImport.Default)
  @js.native
  open class default () extends Line
  
  @js.native
  trait Line
    extends typingsJapgolly.antvComponent.libAxisBaseMod.default[LineAxisCfg] {
    
    /* private */ var autoProcessOverlap: Any = js.native
    
    /**
      * 是否可以执行某一 overlap
      * @param name
      */
    /* private */ var canProcessOverlap: Any = js.native
    
    /* protected */ def getAxisVector(): js.Tuple2[Double, Double] = js.native
    
    /* protected */ def getSideVector(offset: Double): vec2 = js.native
    
    /* protected */ def isHorizontal(): Boolean = js.native
    
    /* protected */ def isVertical(): Boolean = js.native
  }
}
