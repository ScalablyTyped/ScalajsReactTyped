package typingsJapgolly.recompose

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.recompose.mod.ObservableConfig
import typingsJapgolly.recompose.mod.Subscribable
import typingsJapgolly.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#componentfromstream
object componentFromStreamMod {
  
  @JSImport("recompose/componentFromStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[Node]]): ComponentType[TProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propsToReactNode.asInstanceOf[js.Any]).asInstanceOf[ComponentType[TProps]]
  
  inline def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[Any], Subscribable[Node]], 
    ComponentType[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("componentFromStreamWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* propsToReactNode */ mapper[Subscribable[Any], Subscribable[Node]], 
    ComponentType[Any]
  ]]
}
