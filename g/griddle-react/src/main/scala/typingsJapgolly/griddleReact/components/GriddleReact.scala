package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.anon.FilterPlaceholder
import typingsJapgolly.griddleReact.mod.GriddleComponents
import typingsJapgolly.griddleReact.mod.GriddleEvents
import typingsJapgolly.griddleReact.mod.GriddleInitialState
import typingsJapgolly.griddleReact.mod.GriddlePageProperties
import typingsJapgolly.griddleReact.mod.GriddlePlugin
import typingsJapgolly.griddleReact.mod.GriddleProps
import typingsJapgolly.griddleReact.mod.GriddleRenderProperties
import typingsJapgolly.griddleReact.mod.GriddleSortKey
import typingsJapgolly.griddleReact.mod.GriddleStyleConfig
import typingsJapgolly.griddleReact.mod.Listener
import typingsJapgolly.griddleReact.mod.PropertyBag
import typingsJapgolly.griddleReact.mod.Reducer
import typingsJapgolly.griddleReact.mod.Selector
import typingsJapgolly.griddleReact.mod.SettingsComponentObject
import typingsJapgolly.griddleReact.mod.default
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GriddleReact {
  
  inline def apply[T](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[GriddleProps[T]]))
  }
  
  @JSImport("griddle-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def components(value: GriddleComponents): this.type = set("components", value.asInstanceOf[js.Any])
    
    inline def core(value: GriddlePlugin): this.type = set("core", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[T]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: T*): this.type = set("data", js.Array(value*))
    
    inline def enableSettings(value: Boolean): this.type = set("enableSettings", value.asInstanceOf[js.Any])
    
    inline def events(value: GriddleEvents): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def initialState(value: GriddleInitialState): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def listeners(value: PropertyBag[Listener]): this.type = set("listeners", value.asInstanceOf[js.Any])
    
    inline def pageProperties(value: GriddlePageProperties): this.type = set("pageProperties", value.asInstanceOf[js.Any])
    
    inline def plugins(value: js.Array[GriddlePlugin]): this.type = set("plugins", value.asInstanceOf[js.Any])
    
    inline def pluginsVarargs(value: GriddlePlugin*): this.type = set("plugins", js.Array(value*))
    
    inline def reducer(value: PropertyBag[Reducer]): this.type = set("reducer", value.asInstanceOf[js.Any])
    
    inline def reduxMiddleware(value: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]): this.type = set("reduxMiddleware", value.asInstanceOf[js.Any])
    
    inline def reduxMiddlewareVarargs(value: (Middleware[js.Object, Any, Dispatch[AnyAction]])*): this.type = set("reduxMiddleware", js.Array(value*))
    
    inline def renderProperties(value: GriddleRenderProperties): this.type = set("renderProperties", value.asInstanceOf[js.Any])
    
    inline def selectors(value: PropertyBag[Selector]): this.type = set("selectors", value.asInstanceOf[js.Any])
    
    inline def settingsComponentObjects(value: PropertyBag[SettingsComponentObject]): this.type = set("settingsComponentObjects", value.asInstanceOf[js.Any])
    
    inline def sortMethod(
      value: (/* data */ js.Array[Any], /* column */ String, /* sortAscending */ js.UndefOr[Boolean]) => Double
    ): this.type = set("sortMethod", js.Any.fromFunction3(value))
    
    inline def sortProperties(value: js.Array[GriddleSortKey]): this.type = set("sortProperties", value.asInstanceOf[js.Any])
    
    inline def sortPropertiesVarargs(value: GriddleSortKey*): this.type = set("sortProperties", js.Array(value*))
    
    inline def storeKey(value: String): this.type = set("storeKey", value.asInstanceOf[js.Any])
    
    inline def styleConfig(value: GriddleStyleConfig): this.type = set("styleConfig", value.asInstanceOf[js.Any])
    
    inline def textProperties(value: FilterPlaceholder): this.type = set("textProperties", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T](companion: GriddleReact.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T](p: GriddleProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
