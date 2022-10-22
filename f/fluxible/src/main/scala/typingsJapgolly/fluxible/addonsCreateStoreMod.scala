package typingsJapgolly.fluxible

import typingsJapgolly.dispatchr.addonsCreateStoreMod.StoreOptions
import typingsJapgolly.dispatchr.addonsCreateStoreMod.StoreThis
import typingsJapgolly.dispatchr.mod.StoreClass
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addonsCreateStoreMod {
  
  inline def apply[T /* <: StoreOptions */](options: T & ThisType[StoreThis[T]]): StoreClass = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
  
  @JSImport("fluxible/addons/createStore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
