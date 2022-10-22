package typingsJapgolly.rcSwipeout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSwipeout.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IPropTypes_1705893743[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def left(value: js.Array[ClassName]): this.type = set("left", value.asInstanceOf[js.Any])
  
  inline def leftVarargs(value: ClassName*): this.type = set("left", js.Array(value*))
  
  inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
  
  inline def onOpen(value: Callback): this.type = set("onOpen", value.toJsFn)
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def right(value: js.Array[ClassName]): this.type = set("right", value.asInstanceOf[js.Any])
  
  inline def rightVarargs(value: ClassName*): this.type = set("right", js.Array(value*))
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
}
