package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionViewDragMod {
  
  /**
    * @ignore
    * View 支持 Drag 的 Action
    */
  @JSImport("@antv/g2/lib/interaction/action/view/drag", JSImport.Default)
  @js.native
  open class default () extends Drag
  
  /**
    * @ignore
    * View 支持 Drag 的 Action
    */
  @js.native
  trait Drag
    extends typingsJapgolly.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 拖拽
      */
    def drag(): Unit = js.native
    
    /* protected */ var dragStart: Boolean = js.native
    
    /**
      * 结束
      */
    def end(): Unit = js.native
    
    /**
      * 开始
      */
    def start(): Unit = js.native
    
    /* protected */ var startPoint: Point = js.native
    
    /* protected */ var starting: Boolean = js.native
  }
}
