package typingsJapgolly.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var internal: js.UndefOr[Boolean] = js.undefined
  
  var noSnapshot: js.UndefOr[Boolean] = js.undefined
}
object Callback {
  
  inline def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setNoSnapshot(value: Boolean): Self = StObject.set(x, "noSnapshot", value.asInstanceOf[js.Any])
    
    inline def setNoSnapshotUndefined: Self = StObject.set(x, "noSnapshot", js.undefined)
  }
}
