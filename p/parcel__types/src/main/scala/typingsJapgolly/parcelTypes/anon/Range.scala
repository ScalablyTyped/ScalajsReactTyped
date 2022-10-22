package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.DependencySpecifier
import typingsJapgolly.parcelTypes.mod.FilePath
import typingsJapgolly.parcelTypes.mod.SemverRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  var range: js.UndefOr[SemverRange | Null] = js.undefined
  
  var resolveFrom: FilePath
  
  var specifier: DependencySpecifier
}
object Range {
  
  inline def apply(resolveFrom: FilePath, specifier: DependencySpecifier): Range = {
    val __obj = js.Dynamic.literal(resolveFrom = resolveFrom.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setRange(value: SemverRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setResolveFrom(value: FilePath): Self = StObject.set(x, "resolveFrom", value.asInstanceOf[js.Any])
    
    inline def setSpecifier(value: DependencySpecifier): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
  }
}
