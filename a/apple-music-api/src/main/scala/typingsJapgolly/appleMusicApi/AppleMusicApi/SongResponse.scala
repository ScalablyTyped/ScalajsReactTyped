package typingsJapgolly.appleMusicApi.AppleMusicApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/songresponse
trait SongResponse extends StObject {
  
  var data: js.Array[Song]
}
object SongResponse {
  
  inline def apply(data: js.Array[Song]): SongResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SongResponse]
  }
  
  extension [Self <: SongResponse](x: Self) {
    
    inline def setData(value: js.Array[Song]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Song*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
