package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsPullToRefreshPullToRefreshMod.PullStatus
import typingsJapgolly.antdMobile.esComponentsPullToRefreshPullToRefreshMod.PullToRefreshProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullToRefresh {
  
  @JSImport("antd-mobile", "PullToRefresh")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def canReleaseText(value: VdomNode): this.type = set("canReleaseText", value.rawNode.asInstanceOf[js.Any])
    
    inline def canReleaseTextNull: this.type = set("canReleaseText", null)
    
    inline def canReleaseTextVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("canReleaseText", js.Array(value*))
    
    inline def canReleaseTextVdomElement(value: VdomElement): this.type = set("canReleaseText", value.rawElement.asInstanceOf[js.Any])
    
    inline def completeDelay(value: Double): this.type = set("completeDelay", value.asInstanceOf[js.Any])
    
    inline def completeText(value: VdomNode): this.type = set("completeText", value.rawNode.asInstanceOf[js.Any])
    
    inline def completeTextNull: this.type = set("completeText", null)
    
    inline def completeTextVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("completeText", js.Array(value*))
    
    inline def completeTextVdomElement(value: VdomElement): this.type = set("completeText", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def headHeight(value: Double): this.type = set("headHeight", value.asInstanceOf[js.Any])
    
    inline def onRefresh(value: CallbackTo[js.Promise[Any]]): this.type = set("onRefresh", value.toJsFn)
    
    inline def pullingText(value: VdomNode): this.type = set("pullingText", value.rawNode.asInstanceOf[js.Any])
    
    inline def pullingTextNull: this.type = set("pullingText", null)
    
    inline def pullingTextVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("pullingText", js.Array(value*))
    
    inline def pullingTextVdomElement(value: VdomElement): this.type = set("pullingText", value.rawElement.asInstanceOf[js.Any])
    
    inline def refreshingText(value: VdomNode): this.type = set("refreshingText", value.rawNode.asInstanceOf[js.Any])
    
    inline def refreshingTextNull: this.type = set("refreshingText", null)
    
    inline def refreshingTextVarargs(value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | Element)*): this.type = set("refreshingText", js.Array(value*))
    
    inline def refreshingTextVdomElement(value: VdomElement): this.type = set("refreshingText", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderText(value: /* status */ PullStatus => Node): this.type = set("renderText", js.Any.fromFunction1(value))
    
    inline def threshold(value: Double): this.type = set("threshold", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PullToRefresh.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PullToRefreshProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
