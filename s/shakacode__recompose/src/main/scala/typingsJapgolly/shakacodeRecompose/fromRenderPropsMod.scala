package typingsJapgolly.shakacodeRecompose

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.shakacodeRecompose.mod.ComponentEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/shakacode/recompose/blob/master/docs/API.md#fromrenderprops
object fromRenderPropsMod {
  
  @JSImport("@shakacode/recompose/fromRenderProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[Any],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(RenderPropsComponent.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[TInner & TOutter, TOutter]]
  inline def default[TInner, TOutter, TRenderProps](
    RenderPropsComponent: ComponentType[Any],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: String
  ): ComponentEnhancer[TInner & TOutter, TOutter] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(RenderPropsComponent.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any], renderPropName.asInstanceOf[js.Any])).asInstanceOf[ComponentEnhancer[TInner & TOutter, TOutter]]
}
