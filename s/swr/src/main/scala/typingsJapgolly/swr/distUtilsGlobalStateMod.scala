package typingsJapgolly.swr

import typingsJapgolly.std.Record
import typingsJapgolly.std.WeakMap
import typingsJapgolly.swr.distTypesMod.Cache
import typingsJapgolly.swr.distTypesMod.RevalidateCallback
import typingsJapgolly.swr.distTypesMod.ScopedMutator
import typingsJapgolly.swr.distTypesMod.StateUpdateCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsGlobalStateMod {
  
  @JSImport("swr/dist/utils/global-state", "SWRGlobalState")
  @js.native
  val SWRGlobalState: WeakMap[Cache[Any], GlobalState] = js.native
  
  type GlobalState = js.Tuple5[
    Record[String, js.Array[RevalidateCallback]], 
    Record[String, js.Array[StateUpdateCallback[Any, Any]]], 
    Record[String, js.Tuple2[Double, Double]], 
    Record[String, js.Tuple2[Any, Double]], 
    ScopedMutator[Any]
  ]
}
