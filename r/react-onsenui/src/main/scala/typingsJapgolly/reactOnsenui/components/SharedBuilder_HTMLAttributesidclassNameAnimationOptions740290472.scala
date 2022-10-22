package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.mod.AnimationOptions
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.default
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_HTMLAttributesidclassNameAnimationOptions740290472[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animation(value: none | default): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def animationOptions(value: AnimationOptions): this.type = set("animationOptions", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  
  inline def isCancelable(value: Boolean): this.type = set("isCancelable", value.asInstanceOf[js.Any])
  
  inline def isDisabled(value: Boolean): this.type = set("isDisabled", value.asInstanceOf[js.Any])
  
  inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
  
  inline def maskColor(value: String): this.type = set("maskColor", value.asInstanceOf[js.Any])
  
  inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
  
  inline def onCancel(value: Callback): this.type = set("onCancel", value.toJsFn)
  
  inline def onPostHide(value: Callback): this.type = set("onPostHide", value.toJsFn)
  
  inline def onPostShow(value: Callback): this.type = set("onPostShow", value.toJsFn)
  
  inline def onPreHide(value: Callback): this.type = set("onPreHide", value.toJsFn)
  
  inline def onPreShow(value: Callback): this.type = set("onPreShow", value.toJsFn)
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
