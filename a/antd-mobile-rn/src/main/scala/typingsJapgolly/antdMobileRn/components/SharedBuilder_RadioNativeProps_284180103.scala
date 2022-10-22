package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.anon.Target
import typingsJapgolly.antdMobileRn.libRadioStyleIndexDotnativeMod.IRadioStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_RadioNativeProps_284180103[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
  
  inline def defaultChecked(value: Boolean): this.type = set("defaultChecked", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* e */ Target => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ Target) => value(t0).runNow()))
  
  inline def style(value: StyleProp[ImageStyle]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def styleNull: this.type = set("style", null)
  
  inline def styles(value: IRadioStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def wrapLabel(value: Boolean): this.type = set("wrapLabel", value.asInstanceOf[js.Any])
}
