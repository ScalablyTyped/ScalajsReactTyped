package typingsJapgolly.reactScrollbar.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactScrollbar.anon.ContainerHeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ScrollAreaProps1626082308[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
  
  inline def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
  
  inline def contentWindow(value: Any): this.type = set("contentWindow", value.asInstanceOf[js.Any])
  
  inline def focusableTabIndex(value: Double): this.type = set("focusableTabIndex", value.asInstanceOf[js.Any])
  
  inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
  
  inline def horizontalContainerStyle(value: CSSProperties): this.type = set("horizontalContainerStyle", value.asInstanceOf[js.Any])
  
  inline def horizontalScrollbarStyle(value: CSSProperties): this.type = set("horizontalScrollbarStyle", value.asInstanceOf[js.Any])
  
  inline def minScrollSize(value: Double): this.type = set("minScrollSize", value.asInstanceOf[js.Any])
  
  inline def onScroll(value: /* value */ ContainerHeight => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* value */ ContainerHeight) => value(t0).runNow()))
  
  inline def ownerDocument(value: Any): this.type = set("ownerDocument", value.asInstanceOf[js.Any])
  
  inline def smoothScrolling(value: Boolean): this.type = set("smoothScrolling", value.asInstanceOf[js.Any])
  
  inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
  
  inline def stopScrollPropagation(value: Boolean): this.type = set("stopScrollPropagation", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def swapWheelAxes(value: Boolean): this.type = set("swapWheelAxes", value.asInstanceOf[js.Any])
  
  inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  
  inline def verticalContainerStyle(value: CSSProperties): this.type = set("verticalContainerStyle", value.asInstanceOf[js.Any])
  
  inline def verticalScrollbarStyle(value: CSSProperties): this.type = set("verticalScrollbarStyle", value.asInstanceOf[js.Any])
}
