package typingsJapgolly.reduxPersist

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reduxPersist.esTypesMod.WebStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStorageMod extends Shortcut {
  
  @JSImport("redux-persist/es/storage", JSImport.Default)
  @js.native
  val default: WebStorage = js.native
  
  type _To = WebStorage
  
  /* This means you don't have to write `default`, but can instead just say `esStorageMod.foo` */
  override def _to: WebStorage = default
}
