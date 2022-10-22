package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.meteorStrings.nearest
import typingsJapgolly.meteor.meteorStrings.primary
import typingsJapgolly.meteor.meteorStrings.primaryPreferred
import typingsJapgolly.meteor.meteorStrings.secondary
import typingsJapgolly.meteor.meteorStrings.secondaryPreferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReadPreferenceMode extends StObject {
  
  val nearest: typingsJapgolly.meteor.meteorStrings.nearest
  
  val primary: typingsJapgolly.meteor.meteorStrings.primary
  
  val primaryPreferred: typingsJapgolly.meteor.meteorStrings.primaryPreferred
  
  val secondary: typingsJapgolly.meteor.meteorStrings.secondary
  
  val secondaryPreferred: typingsJapgolly.meteor.meteorStrings.secondaryPreferred
}
object TypeofReadPreferenceMode {
  
  inline def apply(): TypeofReadPreferenceMode = {
    val __obj = js.Dynamic.literal(nearest = "nearest", primary = "primary", primaryPreferred = "primaryPreferred", secondary = "secondary", secondaryPreferred = "secondaryPreferred")
    __obj.asInstanceOf[TypeofReadPreferenceMode]
  }
  
  extension [Self <: TypeofReadPreferenceMode](x: Self) {
    
    inline def setNearest(value: nearest): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryPreferred(value: primaryPreferred): Self = StObject.set(x, "primaryPreferred", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPreferred(value: secondaryPreferred): Self = StObject.set(x, "secondaryPreferred", value.asInstanceOf[js.Any])
  }
}
