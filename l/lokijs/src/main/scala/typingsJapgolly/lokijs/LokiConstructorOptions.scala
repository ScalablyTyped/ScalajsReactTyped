package typingsJapgolly.lokijs

import typingsJapgolly.lokijs.lokijsStrings.BROWSER
import typingsJapgolly.lokijs.lokijsStrings.CORDOVA
import typingsJapgolly.lokijs.lokijsStrings.NA
import typingsJapgolly.lokijs.lokijsStrings.NATIVESCRIPT
import typingsJapgolly.lokijs.lokijsStrings.NODEJS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LokiConstructorOptions extends StObject {
  
  var env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA
  
  var verbose: Boolean
}
object LokiConstructorOptions {
  
  inline def apply(env: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA, verbose: Boolean): LokiConstructorOptions = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[LokiConstructorOptions]
  }
  
  extension [Self <: LokiConstructorOptions](x: Self) {
    
    inline def setEnv(value: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
