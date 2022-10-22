package typingsJapgolly.dva.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.reactRouterBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Route {
  
  object IndexRouteProps {
    
    inline def apply(children: Unit): Builder = {
      val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], index = true)
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactRouter.distLibComponentsMod.IndexRouteProps]))
    }
    
    @JSImport("dva/router", "Route")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def action(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['action'] */ js.Any
      ): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def caseSensitive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['caseSensitive'] */ js.Any
      ): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
      
      inline def element(value: VdomNode): this.type = set("element", value.rawNode.asInstanceOf[js.Any])
      
      inline def elementNull: this.type = set("element", null)
      
      inline def elementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("element", js.Array(value*))
      
      inline def elementVdomElement(value: VdomElement): this.type = set("element", value.rawElement.asInstanceOf[js.Any])
      
      inline def errorElement(value: VdomNode): this.type = set("errorElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def errorElementNull: this.type = set("errorElement", null)
      
      inline def errorElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorElement", js.Array(value*))
      
      inline def errorElementVdomElement(value: VdomElement): this.type = set("errorElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def handle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['handle'] */ js.Any
      ): this.type = set("handle", value.asInstanceOf[js.Any])
      
      inline def hasErrorBoundary(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['hasErrorBoundary'] */ js.Any
      ): this.type = set("hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def id(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['id'] */ js.Any
      ): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def loader(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['loader'] */ js.Any
      ): this.type = set("loader", value.asInstanceOf[js.Any])
      
      inline def path(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['path'] */ js.Any
      ): this.type = set("path", value.asInstanceOf[js.Any])
      
      inline def shouldRevalidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticIndexRouteObject['shouldRevalidate'] */ js.Any
      ): this.type = set("shouldRevalidate", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.reactRouter.distLibComponentsMod.IndexRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object PathRouteProps {
    
    @JSImport("dva/router", "Route")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def action(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['action'] */ js.Any
      ): this.type = set("action", value.asInstanceOf[js.Any])
      
      inline def caseSensitive(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['caseSensitive'] */ js.Any
      ): this.type = set("caseSensitive", value.asInstanceOf[js.Any])
      
      inline def element(value: VdomNode): this.type = set("element", value.rawNode.asInstanceOf[js.Any])
      
      inline def elementNull: this.type = set("element", null)
      
      inline def elementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("element", js.Array(value*))
      
      inline def elementVdomElement(value: VdomElement): this.type = set("element", value.rawElement.asInstanceOf[js.Any])
      
      inline def errorElement(value: VdomNode): this.type = set("errorElement", value.rawNode.asInstanceOf[js.Any])
      
      inline def errorElementNull: this.type = set("errorElement", null)
      
      inline def errorElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorElement", js.Array(value*))
      
      inline def errorElementVdomElement(value: VdomElement): this.type = set("errorElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def handle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['handle'] */ js.Any
      ): this.type = set("handle", value.asInstanceOf[js.Any])
      
      inline def hasErrorBoundary(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['hasErrorBoundary'] */ js.Any
      ): this.type = set("hasErrorBoundary", value.asInstanceOf[js.Any])
      
      inline def id(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['id'] */ js.Any
      ): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def index(value: `false`): this.type = set("index", value.asInstanceOf[js.Any])
      
      inline def loader(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['loader'] */ js.Any
      ): this.type = set("loader", value.asInstanceOf[js.Any])
      
      inline def path(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['path'] */ js.Any
      ): this.type = set("path", value.asInstanceOf[js.Any])
      
      inline def shouldRevalidate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @remix-run/router.@remix-run/router/dist/utils.AgnosticNonIndexRouteObject['shouldRevalidate'] */ js.Any
      ): this.type = set("shouldRevalidate", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: PathRouteProps.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: typingsJapgolly.reactRouter.distLibComponentsMod.PathRouteProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
