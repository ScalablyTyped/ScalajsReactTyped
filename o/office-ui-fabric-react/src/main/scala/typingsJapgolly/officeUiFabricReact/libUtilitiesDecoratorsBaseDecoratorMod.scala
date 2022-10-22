package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilitiesDecoratorsBaseDecoratorMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/decorators/BaseDecorator", "BaseDecorator")
  @js.native
  open class BaseDecorator[TProps, TState] protected () extends Component[TProps, TState, Any] {
    def this(props: TProps) = this()
    
    /* protected */ var _composedComponentInstance: japgolly.scalajs.react.facade.React.Component[TProps & js.Object, js.Object] = js.native
    
    /* private */ var _hoisted: Any = js.native
    
    /**
      * Updates the ref to the component composed by the decorator, which will also take care of hoisting
      * (and unhoisting as appropriate) methods from said component.
      *
      * Pass this method as the argument to the 'ref' property of the composed component.
      */
    /* protected */ def _updateComposedComponentRef(
      composedComponentInstance: japgolly.scalajs.react.facade.React.Component[TProps & js.Object, js.Object]
    ): Unit = js.native
  }
}
