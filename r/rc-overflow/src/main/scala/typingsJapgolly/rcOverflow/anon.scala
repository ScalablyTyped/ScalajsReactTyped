package typingsJapgolly.rcOverflow

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var display: Boolean = js.native
    
    var invalidate: Boolean = js.native
    
    var item: js.UndefOr[Any] = js.native
    
    var itemKey: js.UndefOr[Key] = js.native
    
    var order: Double = js.native
    
    var prefixCls: String = js.native
    
    def registerSize(key: Key): Unit = js.native
    def registerSize(key: Key, width: Double): Unit = js.native
    
    var responsive: Boolean = js.native
  }
  
  trait Ref extends StObject {
    
    var ref: js.UndefOr[typingsJapgolly.react.mod.Ref[HTMLDivElement]] = js.undefined
  }
  object Ref {
    
    inline def apply(): Ref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: typingsJapgolly.react.mod.Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
