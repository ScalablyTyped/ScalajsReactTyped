package typingsJapgolly.antdMobile

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPullToRefreshPullToRefreshMod {
  
  @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "PullToRefresh")
  @js.native
  val PullToRefresh: FC[PullToRefreshProps] = js.native
  
  object defaultProps {
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.canReleaseText")
    @js.native
    def canReleaseText: String = js.native
    inline def canReleaseText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canReleaseText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.completeDelay")
    @js.native
    def completeDelay: Double = js.native
    inline def completeDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.completeText")
    @js.native
    def completeText: String = js.native
    inline def completeText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    inline def onRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRefresh")().asInstanceOf[Unit]
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.pullingText")
    @js.native
    def pullingText: String = js.native
    inline def pullingText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pullingText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.refreshingText")
    @js.native
    def refreshingText: String = js.native
    inline def refreshingText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.antdMobileStrings.pulling
    - typingsJapgolly.antdMobile.antdMobileStrings.canRelease
    - typingsJapgolly.antdMobile.antdMobileStrings.refreshing
    - typingsJapgolly.antdMobile.antdMobileStrings.complete
  */
  trait PullStatus extends StObject
  object PullStatus {
    
    inline def canRelease: typingsJapgolly.antdMobile.antdMobileStrings.canRelease = "canRelease".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.canRelease]
    
    inline def complete: typingsJapgolly.antdMobile.antdMobileStrings.complete = "complete".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.complete]
    
    inline def pulling: typingsJapgolly.antdMobile.antdMobileStrings.pulling = "pulling".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.pulling]
    
    inline def refreshing: typingsJapgolly.antdMobile.antdMobileStrings.refreshing = "refreshing".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.refreshing]
  }
  
  trait PullToRefreshProps extends StObject {
    
    var canReleaseText: js.UndefOr[Node] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var completeDelay: js.UndefOr[Double] = js.undefined
    
    var completeText: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var headHeight: js.UndefOr[Double] = js.undefined
    
    var onRefresh: js.UndefOr[js.Function0[js.Promise[Any]]] = js.undefined
    
    var pullingText: js.UndefOr[Node] = js.undefined
    
    var refreshingText: js.UndefOr[Node] = js.undefined
    
    var renderText: js.UndefOr[js.Function1[/* status */ PullStatus, Node]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PullToRefreshProps {
    
    inline def apply(): PullToRefreshProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullToRefreshProps]
    }
    
    extension [Self <: PullToRefreshProps](x: Self) {
      
      inline def setCanReleaseText(value: VdomNode): Self = StObject.set(x, "canReleaseText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCanReleaseTextNull: Self = StObject.set(x, "canReleaseText", null)
      
      inline def setCanReleaseTextUndefined: Self = StObject.set(x, "canReleaseText", js.undefined)
      
      inline def setCanReleaseTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "canReleaseText", js.Array(value*))
      
      inline def setCanReleaseTextVdomElement(value: VdomElement): Self = StObject.set(x, "canReleaseText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCompleteDelay(value: Double): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
      inline def setCompleteDelayUndefined: Self = StObject.set(x, "completeDelay", js.undefined)
      
      inline def setCompleteText(value: VdomNode): Self = StObject.set(x, "completeText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCompleteTextNull: Self = StObject.set(x, "completeText", null)
      
      inline def setCompleteTextUndefined: Self = StObject.set(x, "completeText", js.undefined)
      
      inline def setCompleteTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "completeText", js.Array(value*))
      
      inline def setCompleteTextVdomElement(value: VdomElement): Self = StObject.set(x, "completeText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeadHeight(value: Double): Self = StObject.set(x, "headHeight", value.asInstanceOf[js.Any])
      
      inline def setHeadHeightUndefined: Self = StObject.set(x, "headHeight", js.undefined)
      
      inline def setOnRefresh(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "onRefresh", value.toJsFn)
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setPullingText(value: VdomNode): Self = StObject.set(x, "pullingText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPullingTextNull: Self = StObject.set(x, "pullingText", null)
      
      inline def setPullingTextUndefined: Self = StObject.set(x, "pullingText", js.undefined)
      
      inline def setPullingTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "pullingText", js.Array(value*))
      
      inline def setPullingTextVdomElement(value: VdomElement): Self = StObject.set(x, "pullingText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRefreshingText(value: VdomNode): Self = StObject.set(x, "refreshingText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRefreshingTextNull: Self = StObject.set(x, "refreshingText", null)
      
      inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
      
      inline def setRefreshingTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "refreshingText", js.Array(value*))
      
      inline def setRefreshingTextVdomElement(value: VdomElement): Self = StObject.set(x, "refreshingText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRenderText(value: /* status */ PullStatus => Node): Self = StObject.set(x, "renderText", js.Any.fromFunction1(value))
      
      inline def setRenderTextUndefined: Self = StObject.set(x, "renderText", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
