package typingsJapgolly.reactImageCrop.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageCrop.mod.Crop
import typingsJapgolly.reactImageCrop.mod.PercentCrop
import typingsJapgolly.reactImageCrop.reactImageCropStrings.`use-credentials`
import typingsJapgolly.reactImageCrop.reactImageCropStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ReactCropProps_546455056[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def circularCrop(value: Boolean): this.type = set("circularCrop", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def crop(value: Crop): this.type = set("crop", value.asInstanceOf[js.Any])
  
  inline def crossorigin(value: anonymous | `use-credentials`): this.type = set("crossorigin", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def imageAlt(value: String): this.type = set("imageAlt", value.asInstanceOf[js.Any])
  
  inline def imageStyle(value: CSSProperties): this.type = set("imageStyle", value.asInstanceOf[js.Any])
  
  inline def keepSelection(value: Boolean): this.type = set("keepSelection", value.asInstanceOf[js.Any])
  
  inline def locked(value: Boolean): this.type = set("locked", value.asInstanceOf[js.Any])
  
  inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
  
  inline def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
  
  inline def minHeight(value: Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
  
  inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
  
  inline def onComplete(value: (/* crop */ Crop, /* percentCrop */ PercentCrop) => Callback): this.type = set("onComplete", js.Any.fromFunction2((t0: /* crop */ Crop, t1: /* percentCrop */ PercentCrop) => (value(t0, t1)).runNow()))
  
  inline def onDragEnd(value: Callback): this.type = set("onDragEnd", value.toJsFn)
  
  inline def onDragStart(value: Callback): this.type = set("onDragStart", value.toJsFn)
  
  inline def onImageError(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): this.type = set("onImageError", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
  
  inline def onImageLoaded(value: /* target */ HTMLImageElement => Callback): this.type = set("onImageLoaded", js.Any.fromFunction1((t0: /* target */ HTMLImageElement) => value(t0).runNow()))
  
  inline def renderComponent(value: VdomNode): this.type = set("renderComponent", value.rawNode.asInstanceOf[js.Any])
  
  inline def renderComponentNull: this.type = set("renderComponent", null)
  
  inline def renderComponentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("renderComponent", js.Array(value*))
  
  inline def renderComponentVdomElement(value: VdomElement): this.type = set("renderComponent", value.rawElement.asInstanceOf[js.Any])
  
  inline def renderSelectionAddon(value: /* state */ Any => Node): this.type = set("renderSelectionAddon", js.Any.fromFunction1(value))
  
  inline def ruleOfThirds(value: Boolean): this.type = set("ruleOfThirds", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
