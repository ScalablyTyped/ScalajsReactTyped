package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.DependencySpecifier
import typingsJapgolly.parcelTypes.mod.FilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageName extends StObject {
  
  var packageName: DependencySpecifier
  
  var resolveFrom: FilePath
}
object PackageName {
  
  inline def apply(packageName: DependencySpecifier, resolveFrom: FilePath): PackageName = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any], resolveFrom = resolveFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageName]
  }
  
  extension [Self <: PackageName](x: Self) {
    
    inline def setPackageName(value: DependencySpecifier): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setResolveFrom(value: FilePath): Self = StObject.set(x, "resolveFrom", value.asInstanceOf[js.Any])
  }
}
