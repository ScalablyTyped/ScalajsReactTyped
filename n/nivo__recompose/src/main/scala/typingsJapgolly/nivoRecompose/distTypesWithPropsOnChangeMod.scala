package typingsJapgolly.nivoRecompose

import typingsJapgolly.nivoRecompose.distTypesTypesMod.InferableComponentEnhancerWithProps
import typingsJapgolly.nivoRecompose.distTypesTypesMod.Mapper
import typingsJapgolly.nivoRecompose.distTypesTypesMod.PredicateDiff
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWithPropsOnChangeMod {
  
  @JSImport("@nivo/recompose/dist/types/withPropsOnChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withPropsOnChange[TInner, TOuter /* <: Record[String, Any] */](shouldMapOrKeys: js.Array[String], propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
  inline def withPropsOnChange[TInner, TOuter /* <: Record[String, Any] */](shouldMapOrKeys: PredicateDiff[TOuter], propsMapper: Mapper[TOuter, TInner]): InferableComponentEnhancerWithProps[TInner & TOuter, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("withPropsOnChange")(shouldMapOrKeys.asInstanceOf[js.Any], propsMapper.asInstanceOf[js.Any])).asInstanceOf[InferableComponentEnhancerWithProps[TInner & TOuter, TOuter]]
}
