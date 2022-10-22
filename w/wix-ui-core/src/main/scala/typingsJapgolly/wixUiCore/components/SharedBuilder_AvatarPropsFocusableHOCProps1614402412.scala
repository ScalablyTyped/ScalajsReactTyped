package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.anon.ImgHTMLAttributesHTMLImag
import typingsJapgolly.wixUiCore.wixUiCoreInts.`1`
import typingsJapgolly.wixUiCore.wixUiCoreInts.`2`
import typingsJapgolly.wixUiCore.wixUiCoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_AvatarPropsFocusableHOCProps1614402412[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
  
  inline def focusableOnBlur(value: Callback): this.type = set("focusableOnBlur", value.toJsFn)
  
  inline def focusableOnFocus(value: Callback): this.type = set("focusableOnFocus", value.toJsFn)
  
  inline def imgProps(value: ImgHTMLAttributesHTMLImag): this.type = set("imgProps", value.asInstanceOf[js.Any])
  
  inline def initialsLimit(value: `1` | `2` | `3`): this.type = set("initialsLimit", value.asInstanceOf[js.Any])
  
  inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
  
  inline def placeholder(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
  
  inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
}
