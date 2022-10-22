package typingsJapgolly.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererID extends StObject {
  
  var rendererID: typingsJapgolly.reactDevtoolsInline.commonsMod.RendererID
}
object RendererID {
  
  inline def apply(rendererID: typingsJapgolly.reactDevtoolsInline.commonsMod.RendererID): RendererID = {
    val __obj = js.Dynamic.literal(rendererID = rendererID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererID]
  }
  
  extension [Self <: RendererID](x: Self) {
    
    inline def setRendererID(value: typingsJapgolly.reactDevtoolsInline.commonsMod.RendererID): Self = StObject.set(x, "rendererID", value.asInstanceOf[js.Any])
  }
}
