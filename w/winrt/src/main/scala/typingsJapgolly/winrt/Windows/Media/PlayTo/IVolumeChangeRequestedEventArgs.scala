package typingsJapgolly.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVolumeChangeRequestedEventArgs extends StObject {
  
  var volume: Double
}
object IVolumeChangeRequestedEventArgs {
  
  inline def apply(volume: Double): IVolumeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVolumeChangeRequestedEventArgs]
  }
  
  extension [Self <: IVolumeChangeRequestedEventArgs](x: Self) {
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
