package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.Component
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.officeUiFabricReact.anon.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libViewportMod {
  
  @JSImport("office-ui-fabric-react/lib/Viewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withViewport[TProps /* <: Viewport */, TState](
    ComposedComponent: Instantiable2[
      /* props */ TProps, 
      /* args (repeated) */ Any, 
      Component[TProps & js.Object, js.Object]
    ]
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withViewport")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[Any]
}
