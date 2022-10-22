package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildPaths extends StObject {
  
  var buildPaths: js.Array[String]
  
  var testPaths: js.Array[String]
}
object BuildPaths {
  
  inline def apply(buildPaths: js.Array[String], testPaths: js.Array[String]): BuildPaths = {
    val __obj = js.Dynamic.literal(buildPaths = buildPaths.asInstanceOf[js.Any], testPaths = testPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildPaths]
  }
  
  extension [Self <: BuildPaths](x: Self) {
    
    inline def setBuildPaths(value: js.Array[String]): Self = StObject.set(x, "buildPaths", value.asInstanceOf[js.Any])
    
    inline def setBuildPathsVarargs(value: String*): Self = StObject.set(x, "buildPaths", js.Array(value*))
    
    inline def setTestPaths(value: js.Array[String]): Self = StObject.set(x, "testPaths", value.asInstanceOf[js.Any])
    
    inline def setTestPathsVarargs(value: String*): Self = StObject.set(x, "testPaths", js.Array(value*))
  }
}
