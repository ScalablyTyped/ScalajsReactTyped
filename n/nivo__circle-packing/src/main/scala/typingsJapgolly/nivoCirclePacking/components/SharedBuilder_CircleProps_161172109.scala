package typingsJapgolly.nivoCirclePacking.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CircleProps_161172109[RawDatum] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def onClick(value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  
  inline def onMouseEnter(value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  
  inline def onMouseLeave(value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
  
  inline def onMouseMove(value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
}
