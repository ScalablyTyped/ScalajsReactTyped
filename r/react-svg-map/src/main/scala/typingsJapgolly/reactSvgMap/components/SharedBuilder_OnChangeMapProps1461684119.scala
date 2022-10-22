package typingsJapgolly.reactSvgMap.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_OnChangeMapProps1461684119[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def childrenAfter(value: VdomElement): this.type = set("childrenAfter", value.rawElement.asInstanceOf[js.Any])
  
  inline def childrenBefore(value: VdomElement): this.type = set("childrenBefore", value.rawElement.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def locationClassName(value: String | (js.Function1[/* repeated */ Any, Any])): this.type = set("locationClassName", value.asInstanceOf[js.Any])
  
  inline def locationClassNameFunction1(value: /* repeated */ Any => Any): this.type = set("locationClassName", js.Any.fromFunction1(value))
  
  inline def onChange(value: /* repeated */ Any => Any): this.type = set("onChange", js.Any.fromFunction1(value))
  
  inline def onLocationBlur(value: /* repeated */ Any => Any): this.type = set("onLocationBlur", js.Any.fromFunction1(value))
  
  inline def onLocationFocus(value: /* repeated */ Any => Any): this.type = set("onLocationFocus", js.Any.fromFunction1(value))
  
  inline def onLocationMouseMove(value: /* repeated */ Any => Any): this.type = set("onLocationMouseMove", js.Any.fromFunction1(value))
  
  inline def onLocationMouseOut(value: /* repeated */ Any => Any): this.type = set("onLocationMouseOut", js.Any.fromFunction1(value))
  
  inline def onLocationMouseOver(value: /* repeated */ Any => Any): this.type = set("onLocationMouseOver", js.Any.fromFunction1(value))
}
