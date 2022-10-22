package typingsJapgolly.reduxLocalstorage

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Storage
import typingsJapgolly.reduxLocalstorage.mod.StorageAdapterCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptersSessionStorageMod extends Shortcut {
  
  @JSImport("redux-localstorage/lib/adapters/sessionStorage", JSImport.Namespace)
  @js.native
  val ^ : StorageAdapterCreator[Storage] = js.native
  
  type _To = StorageAdapterCreator[Storage]
  
  /* This means you don't have to write `^`, but can instead just say `libAdaptersSessionStorageMod.foo` */
  override def _to: StorageAdapterCreator[Storage] = ^
}
