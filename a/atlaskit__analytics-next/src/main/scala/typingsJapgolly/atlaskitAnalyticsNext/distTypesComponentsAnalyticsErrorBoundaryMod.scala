package typingsJapgolly.atlaskitAnalyticsNext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atlaskitAnalyticsNext.anon.OmitAnalyticsErrorBoundar
import typingsJapgolly.atlaskitAnalyticsNext.distTypesHocsWithAnalyticsEventsMod.WithAnalyticsEventsProps
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAnalyticsErrorBoundaryMod extends Shortcut {
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsErrorBoundary", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OmitAnalyticsErrorBoundar] = js.native
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsErrorBoundary", "BaseAnalyticsErrorBoundary")
  @js.native
  open class BaseAnalyticsErrorBoundary protected () extends Component[AnalyticsErrorBoundaryProps, AnalyticsErrorBoundaryState, Any] {
    def this(props: AnalyticsErrorBoundaryProps) = this()
    
    @JSName("componentDidCatch")
    def componentDidCatch_MBaseAnalyticsErrorBoundary(error: js.Error): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MBaseAnalyticsErrorBoundary(error: js.Error, info: AnalyticsErrorBoundaryErrorInfo): Unit = js.native
    
    def fireAnalytics(analyticsErrorPayload: AnalyticsErrorBoundaryPayload): Unit = js.native
  }
  
  trait AnalyticsErrorBoundaryErrorInfo extends StObject {
    
    var componentStack: String
  }
  object AnalyticsErrorBoundaryErrorInfo {
    
    inline def apply(componentStack: String): AnalyticsErrorBoundaryErrorInfo = {
      val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsErrorBoundaryErrorInfo]
    }
    
    extension [Self <: AnalyticsErrorBoundaryErrorInfo](x: Self) {
      
      inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsErrorBoundaryPayload
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var error: js.Error | String
    
    var info: js.UndefOr[AnalyticsErrorBoundaryErrorInfo] = js.undefined
  }
  object AnalyticsErrorBoundaryPayload {
    
    inline def apply(error: js.Error | String): AnalyticsErrorBoundaryPayload = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsErrorBoundaryPayload]
    }
    
    extension [Self <: AnalyticsErrorBoundaryPayload](x: Self) {
      
      inline def setError(value: js.Error | String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: AnalyticsErrorBoundaryErrorInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    }
  }
  
  trait AnalyticsErrorBoundaryProps
    extends StObject
       with WithAnalyticsEventsProps {
    
    var ErrorComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var channel: String
    
    /** React component to be wrapped */
    var children: Node
    
    var onError: js.UndefOr[
        js.Function2[/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo], Unit]
      ] = js.undefined
  }
  object AnalyticsErrorBoundaryProps {
    
    inline def apply(channel: String): AnalyticsErrorBoundaryProps = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[AnalyticsErrorBoundaryProps]
    }
    
    extension [Self <: AnalyticsErrorBoundaryProps](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setErrorComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "ErrorComponent", value.asInstanceOf[js.Any])
      
      inline def setErrorComponentUndefined: Self = StObject.set(x, "ErrorComponent", js.undefined)
      
      inline def setOnError(value: (/* error */ js.Error, /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo]) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* info */ js.UndefOr[AnalyticsErrorBoundaryErrorInfo]) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
  
  trait AnalyticsErrorBoundaryState extends StObject {
    
    var hasError: Boolean
  }
  object AnalyticsErrorBoundaryState {
    
    inline def apply(hasError: Boolean): AnalyticsErrorBoundaryState = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsErrorBoundaryState]
    }
    
    extension [Self <: AnalyticsErrorBoundaryState](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[OmitAnalyticsErrorBoundar]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesComponentsAnalyticsErrorBoundaryMod.foo` */
  override def _to: ForwardRefExoticComponent[OmitAnalyticsErrorBoundar] = default
}
