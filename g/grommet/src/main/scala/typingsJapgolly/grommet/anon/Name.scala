package typingsJapgolly.grommet.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.grommet.grommetStrings.Africa
import typingsJapgolly.grommet.grommetStrings.Asia
import typingsJapgolly.grommet.grommetStrings.Australia
import typingsJapgolly.grommet.grommetStrings.Europe
import typingsJapgolly.grommet.grommetStrings.`North America`
import typingsJapgolly.grommet.grommetStrings.`South America`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var color: js.UndefOr[String | Dark] = js.undefined
  
  var name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)
  
  var onClick: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  
  var onHover: js.UndefOr[js.Function1[/* hovered */ Boolean, Unit]] = js.undefined
}
object Name {
  
  inline def apply(name: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setColor(value: String | Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setName(value: Africa | Asia | Australia | Europe | (`North America`) | (`South America`)): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: /* name */ String => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* name */ String) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnHover(value: /* hovered */ Boolean => Callback): Self = StObject.set(x, "onHover", js.Any.fromFunction1((t0: /* hovered */ Boolean) => value(t0).runNow()))
    
    inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
  }
}
