package typingsJapgolly.angularLocalStorage

import typingsJapgolly.angularLocalStorage.mod.angularAugmentingMod.local.storage.StorageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angularLocalStorageStrings {
  
  @js.native
  sealed trait localStorage
    extends StObject
       with StorageType
  inline def localStorage: localStorage = "localStorage".asInstanceOf[localStorage]
  
  @js.native
  sealed trait sessionStorage
    extends StObject
       with StorageType
  inline def sessionStorage: sessionStorage = "sessionStorage".asInstanceOf[sessionStorage]
}
