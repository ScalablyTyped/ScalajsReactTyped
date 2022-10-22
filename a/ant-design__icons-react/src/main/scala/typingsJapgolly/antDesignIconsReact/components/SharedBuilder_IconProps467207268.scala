package typingsJapgolly.antDesignIconsReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IconProps467207268[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def focusable(value: String): this.type = set("focusable", value.asInstanceOf[js.Any])
  
  inline def onClick(value: ReactMouseEventFrom[SVGSVGElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[SVGSVGElement & Element]) => value(t0).runNow()))
  
  inline def primaryColor(value: String): this.type = set("primaryColor", value.asInstanceOf[js.Any])
  
  inline def secondaryColor(value: String): this.type = set("secondaryColor", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
