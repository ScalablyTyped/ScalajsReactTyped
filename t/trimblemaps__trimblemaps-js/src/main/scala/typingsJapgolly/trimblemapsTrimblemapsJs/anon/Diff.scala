package typingsJapgolly.trimblemapsTrimblemapsJs.anon

import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.alkcurated
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.default
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sat1
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sat2
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sat3
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sat4
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sat5
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sat6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
  var diff: js.UndefOr[Boolean] = js.undefined
  
  var localIdeographFontFamily: js.UndefOr[String] = js.undefined
  
  var satelliteProvider: js.UndefOr[sat4 | alkcurated | sat3 | sat1 | sat2 | default | sat6 | sat5] = js.undefined
}
object Diff {
  
  inline def apply(): Diff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Diff]
  }
  
  extension [Self <: Diff](x: Self) {
    
    inline def setDiff(value: Boolean): Self = StObject.set(x, "diff", value.asInstanceOf[js.Any])
    
    inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
    
    inline def setLocalIdeographFontFamily(value: String): Self = StObject.set(x, "localIdeographFontFamily", value.asInstanceOf[js.Any])
    
    inline def setLocalIdeographFontFamilyUndefined: Self = StObject.set(x, "localIdeographFontFamily", js.undefined)
    
    inline def setSatelliteProvider(value: sat4 | alkcurated | sat3 | sat1 | sat2 | default | sat6 | sat5): Self = StObject.set(x, "satelliteProvider", value.asInstanceOf[js.Any])
    
    inline def setSatelliteProviderUndefined: Self = StObject.set(x, "satelliteProvider", js.undefined)
  }
}
