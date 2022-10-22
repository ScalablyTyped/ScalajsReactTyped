package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.wixUiCore.distEsSrcComponentsImageImageMod.ImageProps
import typingsJapgolly.wixUiCore.wixUiCoreStrings.contain
import typingsJapgolly.wixUiCore.wixUiCoreStrings.cover
import typingsJapgolly.wixUiCore.wixUiCoreStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  @JSImport("wix-ui-core/dist/es/src", "Image")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Image] {
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def errorImage(value: String): this.type = set("errorImage", value.asInstanceOf[js.Any])
    
    inline def nativeProps(value: ImgHTMLAttributes[HTMLImageElement]): this.type = set("nativeProps", value.asInstanceOf[js.Any])
    
    inline def nativeRef(value: Ref[HTMLImageElement]): this.type = set("nativeRef", value.asInstanceOf[js.Any])
    
    inline def nativeRefFunction1(value: HTMLImageElement | Null => Callback): this.type = set("nativeRef", js.Any.fromFunction1((t0: HTMLImageElement | Null) => value(t0).runNow()))
    
    inline def nativeRefNull: this.type = set("nativeRef", null)
    
    inline def onError(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
    
    inline def onLoad(value: /* event */ ReactEventFrom[HTMLImageElement] => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLImageElement]) => value(t0).runNow()))
    
    inline def resizeMode(value: fill | contain | cover): this.type = set("resizeMode", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Image.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
