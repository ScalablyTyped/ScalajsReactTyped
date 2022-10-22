package typingsJapgolly.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlaybackRateChangeRequestedEventArgs extends StObject {
  
  var rate: Double
}
object IPlaybackRateChangeRequestedEventArgs {
  
  inline def apply(rate: Double): IPlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaybackRateChangeRequestedEventArgs]
  }
  
  extension [Self <: IPlaybackRateChangeRequestedEventArgs](x: Self) {
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
