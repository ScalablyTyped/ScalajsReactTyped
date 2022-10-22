package typingsJapgolly.fluxibleRouter

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.fluxibleRouter.mod.RouteStore
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofComponent extends StObject {
    
    // tslint won't let me format the sample code in a way that vscode likes it :(
    /**
      * If set, `this.context` will be set at runtime to the current value of the given Context.
      *
      * Usage:
      *
      * ```ts
      * type MyContext = number
      * const Ctx = React.createContext<MyContext>(0)
      *
      * class Foo extends React.Component {
      *   static contextType = Ctx
      *   context!: React.ContextType<typeof Ctx>
      *   render () {
      *     return <>My context's value: {this.context}</>;
      *   }
      * }
      * ```
      *
      * @see https://reactjs.org/docs/context.html#classcontexttype
      */
    /* static member */
    var contextType: js.UndefOr[Context[Any]] = js.undefined
  }
  object TypeofComponent {
    
    inline def apply(): TypeofComponent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeofComponent]
    }
    
    extension [Self <: TypeofComponent](x: Self) {
      
      inline def setContextType(value: Context[Any]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
      
      inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    }
  }
  
  @js.native
  trait TypeofRouteStore
    extends StObject
       with Instantiable0[RouteStore] {
    
    def withStaticRoutes(routes: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof RouteStore */ js.Any = js.native
  }
}
