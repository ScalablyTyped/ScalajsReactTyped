package typingsJapgolly.parcelCache

import typingsJapgolly.parcelCache.libTypesMod.Cache
import typingsJapgolly.parcelTypes.mod.FilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/cache", "FSCache")
  @js.native
  open class FSCache protected ()
    extends StObject
       with Cache {
    def this(cacheDir: FilePath) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@parcel/cache", "LMDBCache")
  @js.native
  open class LMDBCache protected ()
    extends StObject
       with Cache {
    def this(cacheDir: FilePath) = this()
  }
}
