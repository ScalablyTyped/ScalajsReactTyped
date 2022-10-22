package typingsJapgolly.interactjsTypes

import org.scalajs.dom.Node
import typingsJapgolly.interactjsTypes.anon.Duration
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerEventType
import typingsJapgolly.interactjsTypes.coreTypesMod.PointerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePointerInfoMod {
  
  @JSImport("@interactjs/core/PointerInfo", "PointerInfo")
  @js.native
  open class PointerInfo protected () extends StObject {
    def this(id: Double, pointer: PointerType, event: PointerEventType, downTime: Double, downTarget: Node) = this()
    
    var downTarget: Node = js.native
    
    var downTime: Double = js.native
    
    var event: PointerEventType = js.native
    
    var hold: js.UndefOr[Duration] = js.native
    
    var id: Double = js.native
    
    var pointer: PointerType = js.native
  }
}
