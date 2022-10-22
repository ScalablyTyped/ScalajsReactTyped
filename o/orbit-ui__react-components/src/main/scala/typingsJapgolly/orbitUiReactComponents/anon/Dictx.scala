package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.ghost
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.outline
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.solid
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx[Shape]
  extends StObject
     with /* x */ StringDictionary[String | Boolean | ForwardedRef[Any] | Shape] {
  
  var active: Boolean
  
  def onClick(event: ReactMouseEventFrom[HTMLButtonElement]): Unit
  
  var ref: ForwardedRef[Any]
  
  var shape: Shape
  
  var value: String
  
  var variant: outline | solid | ghost
}
object Dictx {
  
  inline def apply[Shape](
    active: Boolean,
    onClick: ReactMouseEventFrom[HTMLButtonElement] => Callback,
    shape: Shape,
    value: String,
    variant: outline | solid | ghost
  ): Dictx[Shape] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => onClick(t0).runNow()), shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], ref = null)
    __obj.asInstanceOf[Dictx[Shape]]
  }
  
  extension [Self <: Dictx[?], Shape](x: Self & Dictx[Shape]) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def setRef(value: ForwardedRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVariant(value: outline | solid | ghost): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
  }
}
