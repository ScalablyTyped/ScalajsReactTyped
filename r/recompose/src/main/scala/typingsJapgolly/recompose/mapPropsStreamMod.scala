package typingsJapgolly.recompose

import typingsJapgolly.recompose.mod.ComponentEnhancer
import typingsJapgolly.recompose.mod.ObservableConfig
import typingsJapgolly.recompose.mod.Subscribable
import typingsJapgolly.recompose.mod.mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/acdlite/recompose/blob/master/docs/API.md#mappropsstream
object mapPropsStreamMod {
  
  @JSImport("recompose/mapPropsStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(transform.asInstanceOf[js.Any]).asInstanceOf[ComponentEnhancer[TInner, TOutter]]
  
  inline def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[
    /* transform */ mapper[Subscribable[Any], Subscribable[Any]], 
    ComponentEnhancer[Any, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapPropsStreamWithConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* transform */ mapper[Subscribable[Any], Subscribable[Any]], 
    ComponentEnhancer[Any, Any]
  ]]
}
