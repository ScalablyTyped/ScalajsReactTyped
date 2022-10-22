package typingsJapgolly.ahooks

import typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Data
import typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.InfiniteScrollOptions
import typingsJapgolly.ahooks.libUseInfiniteScrollTypesMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseInfiniteScrollMod {
  
  @JSImport("ahooks/lib/useInfiniteScroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TData /* <: Data */](service: Service[TData]): typingsJapgolly.ahooks.anon.Data[TData] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ahooks.anon.Data[TData]]
  inline def default[TData /* <: Data */](service: Service[TData], options: InfiniteScrollOptions[TData]): typingsJapgolly.ahooks.anon.Data[TData] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ahooks.anon.Data[TData]]
}
