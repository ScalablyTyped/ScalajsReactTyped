package typingsJapgolly.ionicAngular.anon

import typingsJapgolly.ionicAngular.ionicAngularStrings.closeDuration
import typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
import typingsJapgolly.ionicAngular.ionicAngularStrings.pullFactor
import typingsJapgolly.ionicAngular.ionicAngularStrings.pullMax
import typingsJapgolly.ionicAngular.ionicAngularStrings.pullMin
import typingsJapgolly.ionicAngular.ionicAngularStrings.snapbackDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseDuration extends StObject {
  
  var closeDuration: typingsJapgolly.ionicAngular.ionicAngularStrings.closeDuration
  
  var disabled: typingsJapgolly.ionicAngular.ionicAngularStrings.disabled
  
  var pullFactor: typingsJapgolly.ionicAngular.ionicAngularStrings.pullFactor
  
  var pullMax: typingsJapgolly.ionicAngular.ionicAngularStrings.pullMax
  
  var pullMin: typingsJapgolly.ionicAngular.ionicAngularStrings.pullMin
  
  var snapbackDuration: typingsJapgolly.ionicAngular.ionicAngularStrings.snapbackDuration
}
object CloseDuration {
  
  inline def apply(): CloseDuration = {
    val __obj = js.Dynamic.literal(closeDuration = "closeDuration", disabled = "disabled", pullFactor = "pullFactor", pullMax = "pullMax", pullMin = "pullMin", snapbackDuration = "snapbackDuration")
    __obj.asInstanceOf[CloseDuration]
  }
  
  extension [Self <: CloseDuration](x: Self) {
    
    inline def setCloseDuration(value: closeDuration): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: disabled): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setPullFactor(value: pullFactor): Self = StObject.set(x, "pullFactor", value.asInstanceOf[js.Any])
    
    inline def setPullMax(value: pullMax): Self = StObject.set(x, "pullMax", value.asInstanceOf[js.Any])
    
    inline def setPullMin(value: pullMin): Self = StObject.set(x, "pullMin", value.asInstanceOf[js.Any])
    
    inline def setSnapbackDuration(value: snapbackDuration): Self = StObject.set(x, "snapbackDuration", value.asInstanceOf[js.Any])
  }
}
