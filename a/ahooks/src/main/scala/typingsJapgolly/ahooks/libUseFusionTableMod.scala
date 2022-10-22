package typingsJapgolly.ahooks

import typingsJapgolly.ahooks.libUseAntdTableTypesMod.Data
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.Params
import typingsJapgolly.ahooks.libUseAntdTableTypesMod.Service
import typingsJapgolly.ahooks.libUseFusionTableTypesMod.FusionTableOptions
import typingsJapgolly.ahooks.libUseFusionTableTypesMod.FusionTableResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFusionTableMod {
  
  @JSImport("ahooks/lib/useFusionTable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams]): FusionTableResult[TData, TParams] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[FusionTableResult[TData, TParams]]
  inline def default[TData /* <: Data */, TParams /* <: Params */](service: Service[TData, TParams], options: FusionTableOptions[TData, TParams]): FusionTableResult[TData, TParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FusionTableResult[TData, TParams]]
}
