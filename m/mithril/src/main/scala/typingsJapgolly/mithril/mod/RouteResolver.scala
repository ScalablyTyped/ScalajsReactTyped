package typingsJapgolly.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteResolver[Attrs, State] extends StObject {
  
  /** The onmatch hook is called when the router needs to find a component to render. */
  var onmatch: js.UndefOr[
    js.ThisFunction3[
      /* this */ this.type, 
      /* args */ Attrs, 
      /* requestedPath */ String, 
      /* route */ String, 
      (ComponentTypes[Any, Any]) | js.Promise[Any] | Unit
    ]
  ] = js.undefined
  
  /** The render method is called on every redraw for a matching route. */
  var render: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* vnode */ Vnode[Attrs, State], Children]
  ] = js.undefined
}
object RouteResolver {
  
  inline def apply[Attrs, State](): RouteResolver[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteResolver[Attrs, State]]
  }
  
  extension [Self <: RouteResolver[?, ?], Attrs, State](x: Self & (RouteResolver[Attrs, State])) {
    
    inline def setOnmatch(
      value: js.ThisFunction3[
          RouteResolver[Attrs, State], 
          /* args */ Attrs, 
          /* requestedPath */ String, 
          /* route */ String, 
          (ComponentTypes[Any, Any]) | js.Promise[Any] | Unit
        ]
    ): Self = StObject.set(x, "onmatch", value.asInstanceOf[js.Any])
    
    inline def setOnmatchUndefined: Self = StObject.set(x, "onmatch", js.undefined)
    
    inline def setRender(value: js.ThisFunction1[RouteResolver[Attrs, State], /* vnode */ Vnode[Attrs, State], Children]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
