package typingsJapgolly.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import extends StObject {
  
  var `import`: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import
}
object Import {
  
  inline def apply(`import`: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import): Import = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
  
  extension [Self <: Import](x: Self) {
    
    inline def setImport(value: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Import): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
  }
}
