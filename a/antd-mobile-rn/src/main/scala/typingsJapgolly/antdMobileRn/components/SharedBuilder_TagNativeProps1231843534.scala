package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.libTagStyleIndexDotnativeMod.ITagStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TagNativeProps1231843534[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
  
  inline def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* selected */ Boolean => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* selected */ Boolean) => value(t0).runNow()))
  
  inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
  
  inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
  
  inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
  
  inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
  
  inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def styles(value: ITagStyle): this.type = set("styles", value.asInstanceOf[js.Any])
}
