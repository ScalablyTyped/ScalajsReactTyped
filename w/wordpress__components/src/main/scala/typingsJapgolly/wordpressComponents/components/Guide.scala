package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.guideMod.GuidePage
import typingsJapgolly.wordpressComponents.guideMod.GuideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Guide {
  
  @JSImport("@wordpress/components", "Guide")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentLabel(value: String): this.type = set("contentLabel", value.asInstanceOf[js.Any])
    
    inline def finishButtonText(value: VdomNode): this.type = set("finishButtonText", value.rawNode.asInstanceOf[js.Any])
    
    inline def finishButtonTextNull: this.type = set("finishButtonText", null)
    
    inline def finishButtonTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("finishButtonText", js.Array(value*))
    
    inline def finishButtonTextVdomElement(value: VdomElement): this.type = set("finishButtonText", value.rawElement.asInstanceOf[js.Any])
    
    inline def onFinish(value: Callback): this.type = set("onFinish", value.toJsFn)
    
    inline def pages(value: js.Array[GuidePage]): this.type = set("pages", value.asInstanceOf[js.Any])
    
    inline def pagesVarargs(value: GuidePage*): this.type = set("pages", js.Array(value*))
  }
  
  implicit def make(companion: Guide.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GuideProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
