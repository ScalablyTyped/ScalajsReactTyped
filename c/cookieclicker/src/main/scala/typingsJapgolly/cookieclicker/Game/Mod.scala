package typingsJapgolly.cookieclicker.Game

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cookieclicker.cookieclickerInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mod extends StObject {
  
  var dir: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[js.Function0[Unit] | `0`] = js.undefined
  
  var load: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  
  var save: js.UndefOr[js.Function0[String]] = js.undefined
}
object Mod {
  
  inline def apply(): Mod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mod]
  }
  
  extension [Self <: Mod](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInit(value: js.Function0[Unit] | `0`): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setInitCallback(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLoad(value: /* data */ String => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* data */ String) => value(t0).runNow()))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setSave(value: CallbackTo[String]): Self = StObject.set(x, "save", value.toJsFn)
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
  }
}
