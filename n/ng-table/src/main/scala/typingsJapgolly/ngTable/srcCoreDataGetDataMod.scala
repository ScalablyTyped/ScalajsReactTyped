package typingsJapgolly.ngTable

import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.ngTable.srcCoreNgTableParamsMod.NgTableParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreDataGetDataMod {
  
  type IGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], js.Array[T] | IPromise[js.Array[T]]]
  
  type IInterceptableGetDataFunc[T] = js.Function1[/* params */ NgTableParams[T], Any]
}
