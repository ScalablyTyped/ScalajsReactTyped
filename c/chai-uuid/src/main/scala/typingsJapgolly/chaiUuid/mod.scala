package typingsJapgolly.chaiUuid

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.chai.Chai.ChaiPlugin
import typingsJapgolly.chai.Chai.LanguageChains
import typingsJapgolly.chai.Chai.NumericComparison
import typingsJapgolly.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-uuid", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def guid(guid: String): Unit = js.native
        def guid(guid: String, version: Any): Unit = js.native
        
        def uuid(uuid: String): Unit = js.native
        def uuid(uuid: String, version: UuidVersion): Unit = js.native
      }
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def guid(): Unit = js.native
        def guid(guid: Any): Unit = js.native
        
        def uuid(): Unit = js.native
        def uuid(uuid: UuidVersion): Unit = js.native
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.chaiUuid.chaiUuidStrings.v1
        - typingsJapgolly.chaiUuid.chaiUuidStrings.v2
        - typingsJapgolly.chaiUuid.chaiUuidStrings.v3
        - typingsJapgolly.chaiUuid.chaiUuidStrings.v4
        - typingsJapgolly.chaiUuid.chaiUuidStrings.v5
        - typingsJapgolly.chaiUuid.chaiUuidStrings._empty
      */
      trait UuidVersion extends StObject
      object UuidVersion {
        
        inline def _empty: typingsJapgolly.chaiUuid.chaiUuidStrings._empty = "".asInstanceOf[typingsJapgolly.chaiUuid.chaiUuidStrings._empty]
        
        inline def v1: typingsJapgolly.chaiUuid.chaiUuidStrings.v1 = "v1".asInstanceOf[typingsJapgolly.chaiUuid.chaiUuidStrings.v1]
        
        inline def v2: typingsJapgolly.chaiUuid.chaiUuidStrings.v2 = "v2".asInstanceOf[typingsJapgolly.chaiUuid.chaiUuidStrings.v2]
        
        inline def v3: typingsJapgolly.chaiUuid.chaiUuidStrings.v3 = "v3".asInstanceOf[typingsJapgolly.chaiUuid.chaiUuidStrings.v3]
        
        inline def v4: typingsJapgolly.chaiUuid.chaiUuidStrings.v4 = "v4".asInstanceOf[typingsJapgolly.chaiUuid.chaiUuidStrings.v4]
        
        inline def v5: typingsJapgolly.chaiUuid.chaiUuidStrings.v5 = "v5".asInstanceOf[typingsJapgolly.chaiUuid.chaiUuidStrings.v5]
      }
    }
  }
}
