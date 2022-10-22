package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsJestCompileOptions extends StObject {
  
  var depGraphs: Map[
    String, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraphInfo */ Any
  ]
  
  var supportsStaticESM: Boolean
  
  var watchMode: Boolean
}
object TsJestCompileOptions {
  
  inline def apply(
    depGraphs: Map[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraphInfo */ Any
    ],
    supportsStaticESM: Boolean,
    watchMode: Boolean
  ): TsJestCompileOptions = {
    val __obj = js.Dynamic.literal(depGraphs = depGraphs.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], watchMode = watchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TsJestCompileOptions]
  }
  
  extension [Self <: TsJestCompileOptions](x: Self) {
    
    inline def setDepGraphs(
      value: Map[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraphInfo */ Any
        ]
    ): Self = StObject.set(x, "depGraphs", value.asInstanceOf[js.Any])
    
    inline def setSupportsStaticESM(value: Boolean): Self = StObject.set(x, "supportsStaticESM", value.asInstanceOf[js.Any])
    
    inline def setWatchMode(value: Boolean): Self = StObject.set(x, "watchMode", value.asInstanceOf[js.Any])
  }
}
