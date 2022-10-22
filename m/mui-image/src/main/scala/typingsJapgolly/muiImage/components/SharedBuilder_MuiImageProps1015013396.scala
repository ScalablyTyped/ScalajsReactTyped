package typingsJapgolly.muiImage.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.BackgroundColor
import typingsJapgolly.csstype.mod.Property.Height
import typingsJapgolly.csstype.mod.Property.ObjectFit
import typingsJapgolly.csstype.mod.Property.Position
import typingsJapgolly.csstype.mod.Property.TransitionTimingFunction
import typingsJapgolly.csstype.mod.Property.Width
import typingsJapgolly.muiImage.muiImageBooleans.`false`
import typingsJapgolly.muiImage.muiImageStrings.bottom
import typingsJapgolly.muiImage.muiImageStrings.left
import typingsJapgolly.muiImage.muiImageStrings.right
import typingsJapgolly.muiImage.muiImageStrings.top
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_MuiImageProps1015013396 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
  
  inline def bgColor(value: BackgroundColor): this.type = set("bgColor", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def distance(value: String | Double): this.type = set("distance", value.asInstanceOf[js.Any])
  
  inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
  
  inline def easing(value: TransitionTimingFunction): this.type = set("easing", value.asInstanceOf[js.Any])
  
  inline def errorIcon(value: Boolean | Node): this.type = set("errorIcon", value.asInstanceOf[js.Any])
  
  inline def errorIconNull: this.type = set("errorIcon", null)
  
  inline def errorIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorIcon", js.Array(value*))
  
  inline def errorIconVdomElement(value: VdomElement): this.type = set("errorIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def fit(value: ObjectFit): this.type = set("fit", value.asInstanceOf[js.Any])
  
  inline def height(value: (Height[String | Double]) | Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def iconWrapperClassName(value: String): this.type = set("iconWrapperClassName", value.asInstanceOf[js.Any])
  
  inline def iconWrapperStyle(value: CSSProperties): this.type = set("iconWrapperStyle", value.asInstanceOf[js.Any])
  
  inline def onError(value: /* repeated */ Any => js.UndefOr[Unit]): this.type = set("onError", js.Any.fromFunction1(value))
  
  inline def onLoad(value: /* repeated */ Any => js.UndefOr[Unit]): this.type = set("onLoad", js.Any.fromFunction1(value))
  
  inline def position(value: Position): this.type = set("position", value.asInstanceOf[js.Any])
  
  inline def shift(value: left | right | top | bottom | `false`): this.type = set("shift", value.asInstanceOf[js.Any])
  
  inline def shiftDuration(value: Double): this.type = set("shiftDuration", value.asInstanceOf[js.Any])
  
  inline def shiftNull: this.type = set("shift", null)
  
  inline def showLoading(value: Boolean | Node): this.type = set("showLoading", value.asInstanceOf[js.Any])
  
  inline def showLoadingNull: this.type = set("showLoading", null)
  
  inline def showLoadingVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("showLoading", js.Array(value*))
  
  inline def showLoadingVdomElement(value: VdomElement): this.type = set("showLoading", value.rawElement.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  
  inline def width(value: (Width[String | Double]) | Double): this.type = set("width", value.asInstanceOf[js.Any])
  
  inline def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
  
  inline def wrapperStyle(value: CSSProperties): this.type = set("wrapperStyle", value.asInstanceOf[js.Any])
}
