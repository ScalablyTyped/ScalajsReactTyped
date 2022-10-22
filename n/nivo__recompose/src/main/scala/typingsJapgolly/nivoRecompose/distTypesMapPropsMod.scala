package typingsJapgolly.nivoRecompose

import typingsJapgolly.nivoRecompose.distTypesTypesMod.InferableComponentEnhancerWithProps
import typingsJapgolly.nivoRecompose.distTypesTypesMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMapPropsMod {
  
  @JSImport("@nivo/recompose/dist/types/mapProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapProps[TInner, TOuter](propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner, TOuter] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapProps")(propsMapper.asInstanceOf[js.Any]).asInstanceOf[InferableComponentEnhancerWithProps[TInner, TOuter]]
}
