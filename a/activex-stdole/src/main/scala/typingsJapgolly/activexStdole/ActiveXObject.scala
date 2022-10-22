package typingsJapgolly.activexStdole

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexStdole.activexStdoleStrings.FontChanged
import typingsJapgolly.activexStdole.activexStdoleStrings.PropertyName
import typingsJapgolly.activexStdole.stdole.StdFont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObject extends StObject {
  
  def on(
    obj: StdFont,
    event: FontChanged,
    argNames: js.Array[PropertyName],
    handler: js.ThisFunction1[
      /* this */ StdFont, 
      /* parameter */ typingsJapgolly.activexStdole.anon.PropertyName, 
      Unit
    ]
  ): Unit
}
object ActiveXObject {
  
  inline def apply(
    on: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[
      /* this */ StdFont, 
      /* parameter */ typingsJapgolly.activexStdole.anon.PropertyName, 
      Unit
    ]) => Callback
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction4((t0: StdFont, t1: FontChanged, t2: js.Array[PropertyName], t3: js.ThisFunction1[
      /* this */ StdFont, 
      /* parameter */ typingsJapgolly.activexStdole.anon.PropertyName, 
      Unit
    ]) => (on(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[ActiveXObject]
  }
  
  extension [Self <: ActiveXObject](x: Self) {
    
    inline def setOn(
      value: (StdFont, FontChanged, js.Array[PropertyName], js.ThisFunction1[
          /* this */ StdFont, 
          /* parameter */ typingsJapgolly.activexStdole.anon.PropertyName, 
          Unit
        ]) => Callback
    ): Self = StObject.set(x, "on", js.Any.fromFunction4((t0: StdFont, t1: FontChanged, t2: js.Array[PropertyName], t3: js.ThisFunction1[
          /* this */ StdFont, 
          /* parameter */ typingsJapgolly.activexStdole.anon.PropertyName, 
          Unit
        ]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
