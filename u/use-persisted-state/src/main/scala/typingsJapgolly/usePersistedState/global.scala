package typingsJapgolly.usePersistedState

import typingsJapgolly.usePersistedState.anon.FnCall
import typingsJapgolly.usePersistedState.anon.PickStoragegetItemsetItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def createPersistedState[S](key: String): FnCall[S] = js.Dynamic.global.applyDynamic("createPersistedState")(key.asInstanceOf[js.Any]).asInstanceOf[FnCall[S]]
  inline def createPersistedState[S](key: String, provider: PickStoragegetItemsetItem): FnCall[S] = (js.Dynamic.global.applyDynamic("createPersistedState")(key.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[FnCall[S]]
}
