package typingsJapgolly.reactMdMaterialIcons.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdIcon.typesFontIconMod.FontIconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HdFontIcon {
  
  @JSImport("@react-md/material-icons", "HdFontIcon")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: HdFontIcon.type): SharedBuilder_FontIconPropsRefAttributes_1255488271[HTMLElement] = new SharedBuilder_FontIconPropsRefAttributes_1255488271[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FontIconProps & RefAttributes[HTMLElement]): SharedBuilder_FontIconPropsRefAttributes_1255488271[HTMLElement] = new SharedBuilder_FontIconPropsRefAttributes_1255488271[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
