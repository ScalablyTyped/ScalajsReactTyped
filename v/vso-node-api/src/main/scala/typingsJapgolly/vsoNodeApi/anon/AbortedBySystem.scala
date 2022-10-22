package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortedBySystem extends StObject {
  
  var abortedBySystem: scala.Double
  
  var analyzed: scala.Double
  
  var canceledByUser: scala.Double
  
  var cancellationInProgress: scala.Double
  
  var creatingEnvironment: scala.Double
  
  var none: scala.Double
  
  var pendingAnalysis: scala.Double
  
  var runningTests: scala.Double
  
  var timedOut: scala.Double
}
object AbortedBySystem {
  
  inline def apply(
    abortedBySystem: scala.Double,
    analyzed: scala.Double,
    canceledByUser: scala.Double,
    cancellationInProgress: scala.Double,
    creatingEnvironment: scala.Double,
    none: scala.Double,
    pendingAnalysis: scala.Double,
    runningTests: scala.Double,
    timedOut: scala.Double
  ): AbortedBySystem = {
    val __obj = js.Dynamic.literal(abortedBySystem = abortedBySystem.asInstanceOf[js.Any], analyzed = analyzed.asInstanceOf[js.Any], canceledByUser = canceledByUser.asInstanceOf[js.Any], cancellationInProgress = cancellationInProgress.asInstanceOf[js.Any], creatingEnvironment = creatingEnvironment.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pendingAnalysis = pendingAnalysis.asInstanceOf[js.Any], runningTests = runningTests.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortedBySystem]
  }
  
  extension [Self <: AbortedBySystem](x: Self) {
    
    inline def setAbortedBySystem(value: scala.Double): Self = StObject.set(x, "abortedBySystem", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed(value: scala.Double): Self = StObject.set(x, "analyzed", value.asInstanceOf[js.Any])
    
    inline def setCanceledByUser(value: scala.Double): Self = StObject.set(x, "canceledByUser", value.asInstanceOf[js.Any])
    
    inline def setCancellationInProgress(value: scala.Double): Self = StObject.set(x, "cancellationInProgress", value.asInstanceOf[js.Any])
    
    inline def setCreatingEnvironment(value: scala.Double): Self = StObject.set(x, "creatingEnvironment", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPendingAnalysis(value: scala.Double): Self = StObject.set(x, "pendingAnalysis", value.asInstanceOf[js.Any])
    
    inline def setRunningTests(value: scala.Double): Self = StObject.set(x, "runningTests", value.asInstanceOf[js.Any])
    
    inline def setTimedOut(value: scala.Double): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
  }
}
