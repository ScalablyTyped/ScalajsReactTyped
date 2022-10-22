package typingsJapgolly.reactDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Document
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("react-dom/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRoot(container: DocumentFragment): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def createRoot(container: DocumentFragment, options: RootOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def createRoot(container: Element): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any]).asInstanceOf[Root]
  inline def createRoot(container: Element, options: RootOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(container.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  inline def hydrateRoot(container: Document, initialChildren: Node): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Document, initialChildren: Node, options: HydrationOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Element, initialChildren: Node): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any])).asInstanceOf[Root]
  inline def hydrateRoot(container: Element, initialChildren: Node, options: HydrationOptions): Root = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrateRoot")(container.asInstanceOf[js.Any], initialChildren.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Root]
  
  trait HydrationOptions extends StObject {
    
    /**
      * Prefix for `useId`.
      */
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var onRecoverableError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  }
  object HydrationOptions {
    
    inline def apply(): HydrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrationOptions]
    }
    
    extension [Self <: HydrationOptions](x: Self) {
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setOnRecoverableError(value: /* error */ Any => Callback): Self = StObject.set(x, "onRecoverableError", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setOnRecoverableErrorUndefined: Self = StObject.set(x, "onRecoverableError", js.undefined)
    }
  }
  
  trait Root extends StObject {
    
    def render(children: Node): Unit
    
    def unmount(): Unit
  }
  object Root {
    
    inline def apply(render: Node => Callback, unmount: Callback): Root = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1((t0: Node) => render(t0).runNow()), unmount = unmount.toJsFn)
      __obj.asInstanceOf[Root]
    }
    
    extension [Self <: Root](x: Self) {
      
      inline def setRender(value: Node => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setUnmount(value: Callback): Self = StObject.set(x, "unmount", value.toJsFn)
    }
  }
  
  trait RootOptions extends StObject {
    
    /**
      * Prefix for `useId`.
      */
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var onRecoverableError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
  }
  object RootOptions {
    
    inline def apply(): RootOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootOptions]
    }
    
    extension [Self <: RootOptions](x: Self) {
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setOnRecoverableError(value: /* error */ Any => Callback): Self = StObject.set(x, "onRecoverableError", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setOnRecoverableErrorUndefined: Self = StObject.set(x, "onRecoverableError", js.undefined)
    }
  }
}
