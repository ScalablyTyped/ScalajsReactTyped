package typingsJapgolly.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpack.mod.SyntheticDependencyLocation
  - typingsJapgolly.webpack.mod.RealDependencyLocation
*/
trait DependencyLocation extends StObject
object DependencyLocation {
  
  inline def RealDependencyLocation(start: SourcePosition): typingsJapgolly.webpack.mod.RealDependencyLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.RealDependencyLocation]
  }
  
  inline def SyntheticDependencyLocation(name: String): typingsJapgolly.webpack.mod.SyntheticDependencyLocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.mod.SyntheticDependencyLocation]
  }
}
