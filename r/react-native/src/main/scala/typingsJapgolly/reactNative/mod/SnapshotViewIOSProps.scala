package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotViewIOSProps
  extends StObject
     with ViewProps {
  
  // A callback when the Snapshot view is ready to be compared
  def onSnapshotReady(): Any
  
  // A name to identify the individual instance to the SnapshotView
  var testIdentifier: String
}
object SnapshotViewIOSProps {
  
  inline def apply(onSnapshotReady: CallbackTo[Any], testIdentifier: String): SnapshotViewIOSProps = {
    val __obj = js.Dynamic.literal(onSnapshotReady = onSnapshotReady.toJsFn, testIdentifier = testIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotViewIOSProps]
  }
  
  extension [Self <: SnapshotViewIOSProps](x: Self) {
    
    inline def setOnSnapshotReady(value: CallbackTo[Any]): Self = StObject.set(x, "onSnapshotReady", value.toJsFn)
    
    inline def setTestIdentifier(value: String): Self = StObject.set(x, "testIdentifier", value.asInstanceOf[js.Any])
  }
}
