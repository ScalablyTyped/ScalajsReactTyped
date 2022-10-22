package typingsJapgolly.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformers extends StObject {
  
  var transformers: typingsJapgolly.typescript.mod.CustomTransformers
}
object Transformers {
  
  inline def apply(transformers: typingsJapgolly.typescript.mod.CustomTransformers): Transformers = {
    val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformers]
  }
  
  extension [Self <: Transformers](x: Self) {
    
    inline def setTransformers(value: typingsJapgolly.typescript.mod.CustomTransformers): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
  }
}
