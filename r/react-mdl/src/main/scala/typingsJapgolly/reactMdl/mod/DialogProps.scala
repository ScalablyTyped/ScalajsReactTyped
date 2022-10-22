package typingsJapgolly.reactMdl.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogProps
  extends StObject
     with HTMLProps[Any] {
  
  var onCancel: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
}
object DialogProps {
  
  inline def apply(): DialogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogProps]
  }
  
  extension [Self <: DialogProps](x: Self) {
    
    inline def setOnCancel(value: /* e */ Any => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction1((t0: /* e */ Any) => value(t0).runNow()))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
  }
}
