package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_CheckableTagProps568634517 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* checked */ Boolean => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* checked */ Boolean) => value(t0).runNow()))
  
  inline def onClick(value: /* e */ ReactMouseEventFrom[HTMLSpanElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[HTMLSpanElement]) => value(t0).runNow()))
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
