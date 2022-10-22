package typingsJapgolly.ionicReact

import typingsJapgolly.ionicReact.distTypesContextsNavContextMod.NavContextState
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsIonRouteMod {
  
  @JSImport("@ionic/react/dist/types/components/IonRoute", "IonRoute")
  @js.native
  open class IonRoute protected () extends PureComponent[IonRouteProps, IonRouteState, Any] {
    def this(props: IonRouteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IonRouteProps, context: Any) = this()
    
    @JSName("context")
    var context_IonRoute: ContextType[Context[NavContextState]] = js.native
  }
  
  @js.native
  trait IonRouteProps extends StObject {
    
    var disableIonPageManagement: js.UndefOr[Boolean] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    def render(): Element = js.native
    def render(props: Any): Element = js.native
    
    var show: js.UndefOr[Boolean] = js.native
  }
  
  trait IonRouteState extends StObject
}
