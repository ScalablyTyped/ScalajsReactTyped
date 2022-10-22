package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.jestTypes.mod.InitialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialOptionsTsJest
  extends StObject
     with InitialOptions {
  
  @JSName("globals")
  var globals_InitialOptionsTsJest: js.UndefOr[GlobalConfigTsJest] = js.undefined
}
object InitialOptionsTsJest {
  
  inline def apply(): InitialOptionsTsJest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialOptionsTsJest]
  }
  
  extension [Self <: InitialOptionsTsJest](x: Self) {
    
    inline def setGlobals(value: GlobalConfigTsJest): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
  }
}
