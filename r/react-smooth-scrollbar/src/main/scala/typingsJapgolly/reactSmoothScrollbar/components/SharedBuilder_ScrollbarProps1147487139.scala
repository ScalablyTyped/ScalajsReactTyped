package typingsJapgolly.reactSmoothScrollbar.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.EventTarget
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.smoothScrollbar.interfacesScrollbarMod.ScrollStatus
import typingsJapgolly.smoothScrollbar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ScrollbarProps1147487139[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def alwaysShowTracks(value: Boolean): this.type = set("alwaysShowTracks", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def continuousScrolling(value: Boolean): this.type = set("continuousScrolling", value.asInstanceOf[js.Any])
  
  inline def damping(value: Double): this.type = set("damping", value.asInstanceOf[js.Any])
  
  inline def delegateTo(value: EventTarget): this.type = set("delegateTo", value.asInstanceOf[js.Any])
  
  inline def delegateToNull: this.type = set("delegateTo", null)
  
  inline def onScroll(value: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Callback): this.type = set("onScroll", js.Any.fromFunction2((t0: /* status */ ScrollStatus, t1: /* scrollbarInstance */ default) => (value(t0, t1)).runNow()))
  
  inline def plugins(value: Any): this.type = set("plugins", value.asInstanceOf[js.Any])
  
  inline def renderByPixels(value: Boolean): this.type = set("renderByPixels", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def thumbMinSize(value: Double): this.type = set("thumbMinSize", value.asInstanceOf[js.Any])
  
  inline def wheelEventTarget(value: EventTarget): this.type = set("wheelEventTarget", value.asInstanceOf[js.Any])
  
  inline def wheelEventTargetNull: this.type = set("wheelEventTarget", null)
}
