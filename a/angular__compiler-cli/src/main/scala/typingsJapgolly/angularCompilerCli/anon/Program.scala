package typingsJapgolly.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Program extends StObject {
  
  var program: js.UndefOr[typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program] = js.undefined
}
object Program {
  
  inline def apply(): Program = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Program]
  }
  
  extension [Self <: Program](x: Self) {
    
    inline def setProgram(value: typingsJapgolly.angularCompilerCli.srcTransformersApiMod.Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
  }
}
