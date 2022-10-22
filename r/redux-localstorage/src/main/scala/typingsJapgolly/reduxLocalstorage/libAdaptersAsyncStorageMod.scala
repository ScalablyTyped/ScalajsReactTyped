package typingsJapgolly.reduxLocalstorage

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reduxLocalstorage.mod.StorageAdapterCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersAsyncStorageMod extends Shortcut {
  
  @JSImport("redux-localstorage/lib/adapters/AsyncStorage", JSImport.Namespace)
  @js.native
  val ^ : StorageAdapterCreator[Any] = js.native
  
  type _To = StorageAdapterCreator[Any]
  
  /* This means you don't have to write `^`, but can instead just say `libAdaptersAsyncStorageMod.foo` */
  override def _to: StorageAdapterCreator[Any] = ^
}
