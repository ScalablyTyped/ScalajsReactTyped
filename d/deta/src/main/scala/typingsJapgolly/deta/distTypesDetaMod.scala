package typingsJapgolly.deta

import typingsJapgolly.deta.distTypesTypesKeyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDetaMod {
  
  @JSImport("deta/dist/types/deta", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Deta {
    def this(key: String, `type`: KeyType, projectId: String) = this()
  }
  
  @js.native
  trait Deta extends StObject {
    
    def Base(baseName: String): typingsJapgolly.deta.distTypesBaseMod.default = js.native
    def Base(baseName: String, host: String): typingsJapgolly.deta.distTypesBaseMod.default = js.native
    
    def Drive(driveName: String): typingsJapgolly.deta.distTypesDriveMod.default = js.native
    def Drive(driveName: String, host: String): typingsJapgolly.deta.distTypesDriveMod.default = js.native
    
    /* private */ var key: Any = js.native
    
    /* private */ var projectId: Any = js.native
    
    /* private */ var `type`: Any = js.native
  }
}
