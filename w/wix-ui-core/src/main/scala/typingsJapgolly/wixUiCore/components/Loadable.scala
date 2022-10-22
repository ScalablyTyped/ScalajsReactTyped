package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.distEsSrcComponentsLoadableLoadableMod.LoadableProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsLoadableLoadableMod.LoadedMap
import typingsJapgolly.wixUiCore.distEsSrcComponentsLoadableLoadableMod.LoaderMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loadable {
  
  inline def apply[LoadableExports](
    children: LoadedMap[LoadableExports] => Element,
    defaultComponent: VdomElement,
    loader: LoaderMap[LoadableExports]
  ): Builder[LoadableExports] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), defaultComponent = defaultComponent.rawElement.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
    new Builder[LoadableExports](js.Array(this.component, __props.asInstanceOf[LoadableProps[LoadableExports]]))
  }
  
  @JSImport("wix-ui-core/dist/es/src", "Loadable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[LoadableExports] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.Loadable[LoadableExports]] {
    
    inline def loadingComponent(value: VdomElement): this.type = set("loadingComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def namedExports(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof LoadableExports ]:? string} */ js.Any
    ): this.type = set("namedExports", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: CallbackTo[js.Function]): this.type = set("onLoad", value.toJsFn)
    
    inline def shouldLoadComponent(value: Boolean): this.type = set("shouldLoadComponent", value.asInstanceOf[js.Any])
  }
  
  def withProps[LoadableExports](p: LoadableProps[LoadableExports]): Builder[LoadableExports] = new Builder[LoadableExports](js.Array(this.component, p.asInstanceOf[js.Any]))
}
