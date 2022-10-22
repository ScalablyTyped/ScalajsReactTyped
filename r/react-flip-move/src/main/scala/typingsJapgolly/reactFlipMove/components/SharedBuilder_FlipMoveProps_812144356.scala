package typingsJapgolly.reactFlipMove.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFlipMove.mod.FlipMove.AnimationProp
import typingsJapgolly.reactFlipMove.mod.FlipMove.Styles
import typingsJapgolly.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FlipMoveProps_812144356[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def appearAnimation(value: AnimationProp): this.type = set("appearAnimation", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def delay(value: Double | String): this.type = set("delay", value.asInstanceOf[js.Any])
  
  inline def disableAllAnimations(value: Boolean): this.type = set("disableAllAnimations", value.asInstanceOf[js.Any])
  
  inline def duration(value: Double | String): this.type = set("duration", value.asInstanceOf[js.Any])
  
  inline def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
  
  inline def enterAnimation(value: AnimationProp): this.type = set("enterAnimation", value.asInstanceOf[js.Any])
  
  inline def getPosition(value: /* node */ HTMLElement => ClientRect): this.type = set("getPosition", js.Any.fromFunction1(value))
  
  inline def leaveAnimation(value: AnimationProp): this.type = set("leaveAnimation", value.asInstanceOf[js.Any])
  
  inline def maintainContainerHeight(value: Boolean): this.type = set("maintainContainerHeight", value.asInstanceOf[js.Any])
  
  inline def onFinish(value: (/* childElement */ Element, /* domNode */ HTMLElement) => Callback): this.type = set("onFinish", js.Any.fromFunction2((t0: /* childElement */ Element, t1: /* domNode */ HTMLElement) => (value(t0, t1)).runNow()))
  
  inline def onFinishAll(value: (/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement]) => Callback): this.type = set("onFinishAll", js.Any.fromFunction2((t0: /* childElements */ js.Array[Element], t1: /* domNodes */ js.Array[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def onStart(value: (/* childElement */ Element, /* domNode */ HTMLElement) => Callback): this.type = set("onStart", js.Any.fromFunction2((t0: /* childElement */ Element, t1: /* domNode */ HTMLElement) => (value(t0, t1)).runNow()))
  
  inline def onStartAll(value: (/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement]) => Callback): this.type = set("onStartAll", js.Any.fromFunction2((t0: /* childElements */ js.Array[Element], t1: /* domNodes */ js.Array[HTMLElement]) => (value(t0, t1)).runNow()))
  
  inline def staggerDelayBy(value: Double | String): this.type = set("staggerDelayBy", value.asInstanceOf[js.Any])
  
  inline def staggerDurationBy(value: Double | String): this.type = set("staggerDurationBy", value.asInstanceOf[js.Any])
  
  inline def style(value: Styles): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def typeName(value: String): this.type = set("typeName", value.asInstanceOf[js.Any])
  
  inline def typeNameNull: this.type = set("typeName", null)
  
  inline def verticalAlignment(value: String): this.type = set("verticalAlignment", value.asInstanceOf[js.Any])
}
