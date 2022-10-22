package typingsJapgolly.reactPlotlyJs.anon

import typingsJapgolly.plotlyJs.anon.Frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.FrameAnimationEvent> */
trait ReadonlyFrameAnimationEve extends StObject {
  
  val animation: Frame
  
  val frame: typingsJapgolly.plotlyJs.mod.Frame
  
  val name: String
}
object ReadonlyFrameAnimationEve {
  
  inline def apply(animation: Frame, frame: typingsJapgolly.plotlyJs.mod.Frame, name: String): ReadonlyFrameAnimationEve = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFrameAnimationEve]
  }
  
  extension [Self <: ReadonlyFrameAnimationEve](x: Self) {
    
    inline def setAnimation(value: Frame): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: typingsJapgolly.plotlyJs.mod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
