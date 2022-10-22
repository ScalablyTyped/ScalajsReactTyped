package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsModulesRatingRatingIconMod.RatingIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RatingIconProps_1213113030[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
  
  inline def onClick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ RatingIconProps) => (value(t0, t1)).runNow()))
  
  inline def onKeyUp(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback): this.type = set("onKeyUp", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ RatingIconProps) => (value(t0, t1)).runNow()))
  
  inline def onMouseEnter(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ RatingIconProps) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ RatingIconProps) => (value(t0, t1)).runNow()))
  
  inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
}
