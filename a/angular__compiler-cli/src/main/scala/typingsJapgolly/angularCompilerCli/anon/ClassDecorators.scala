package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.angularCompilerCli.ngccSrcHostEsm2015HostMod.ParamInfo
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassDecorators extends StObject {
  
  var classDecorators: js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator] | Null
  
  var constructorParamInfo: js.Array[ParamInfo] | Null
  
  var memberDecorators: (Map[
    String, 
    js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator]
  ]) | Null
}
object ClassDecorators {
  
  inline def apply(): ClassDecorators = {
    val __obj = js.Dynamic.literal(classDecorators = null, constructorParamInfo = null, memberDecorators = null)
    __obj.asInstanceOf[ClassDecorators]
  }
  
  extension [Self <: ClassDecorators](x: Self) {
    
    inline def setClassDecorators(value: js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator]): Self = StObject.set(x, "classDecorators", value.asInstanceOf[js.Any])
    
    inline def setClassDecoratorsNull: Self = StObject.set(x, "classDecorators", null)
    
    inline def setClassDecoratorsVarargs(value: typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator*): Self = StObject.set(x, "classDecorators", js.Array(value*))
    
    inline def setConstructorParamInfo(value: js.Array[ParamInfo]): Self = StObject.set(x, "constructorParamInfo", value.asInstanceOf[js.Any])
    
    inline def setConstructorParamInfoNull: Self = StObject.set(x, "constructorParamInfo", null)
    
    inline def setConstructorParamInfoVarargs(value: ParamInfo*): Self = StObject.set(x, "constructorParamInfo", js.Array(value*))
    
    inline def setMemberDecorators(
      value: Map[
          String, 
          js.Array[typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Decorator]
        ]
    ): Self = StObject.set(x, "memberDecorators", value.asInstanceOf[js.Any])
    
    inline def setMemberDecoratorsNull: Self = StObject.set(x, "memberDecorators", null)
  }
}
