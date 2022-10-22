package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntryPoints extends StObject {
  
  var entryPoints: Record[String, js.Array[String]]
  
  var noInjectNames: js.Array[String]
  
  var paths: js.Array[String]
}
object EntryPoints {
  
  inline def apply(
    entryPoints: Record[String, js.Array[String]],
    noInjectNames: js.Array[String],
    paths: js.Array[String]
  ): EntryPoints = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], noInjectNames = noInjectNames.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPoints]
  }
  
  extension [Self <: EntryPoints](x: Self) {
    
    inline def setEntryPoints(value: Record[String, js.Array[String]]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setNoInjectNames(value: js.Array[String]): Self = StObject.set(x, "noInjectNames", value.asInstanceOf[js.Any])
    
    inline def setNoInjectNamesVarargs(value: String*): Self = StObject.set(x, "noInjectNames", js.Array(value*))
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
