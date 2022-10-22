package typingsJapgolly.reactOverlays.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefFn
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arialabelledby extends StObject {
  
  var `aria-labelledby`: js.UndefOr[String] = js.undefined
  
  var ref: RefFn[HTMLElement]
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object Arialabelledby {
  
  inline def apply(ref: HTMLElement | Null => Callback): Arialabelledby = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1((t0: HTMLElement | Null) => ref(t0).runNow()))
    __obj.asInstanceOf[Arialabelledby]
  }
  
  extension [Self <: Arialabelledby](x: Self) {
    
    inline def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
    
    inline def setRef(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
