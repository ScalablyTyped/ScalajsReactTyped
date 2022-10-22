package typingsJapgolly.unsplashJs

import typingsJapgolly.unsplashJs.distHelpersTypescriptMod.AnyJson
import typingsJapgolly.unsplashJs.distHelpersTypescriptMod.NonEmptyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersErrorsMod {
  
  @JSImport("unsplash-js/dist/helpers/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unsplash-js/dist/helpers/errors", "DecodingError")
  @js.native
  open class DecodingError protected () extends StObject {
    def this(message: String) = this()
    
    val message: String = js.native
  }
  
  inline def getErrorForBadStatusCode(jsonResponse: AnyJson): typingsJapgolly.unsplashJs.anon.Errors = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorForBadStatusCode")(jsonResponse.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.unsplashJs.anon.Errors]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.unsplashJs.unsplashJsStrings.api
    - typingsJapgolly.unsplashJs.unsplashJsStrings.decoding
  */
  trait ErrorSource extends StObject
  object ErrorSource {
    
    inline def api: typingsJapgolly.unsplashJs.unsplashJsStrings.api = "api".asInstanceOf[typingsJapgolly.unsplashJs.unsplashJsStrings.api]
    
    inline def decoding: typingsJapgolly.unsplashJs.unsplashJsStrings.decoding = "decoding".asInstanceOf[typingsJapgolly.unsplashJs.unsplashJsStrings.decoding]
  }
  
  type Errors = NonEmptyArray[String]
}
