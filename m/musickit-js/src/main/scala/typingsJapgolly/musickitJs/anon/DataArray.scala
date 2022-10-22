package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.AppleCurators
import typingsJapgolly.musickitJs.MusicKit.Curators
import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.RecordLabels
import typingsJapgolly.musickitJs.MusicKit.Songs
import typingsJapgolly.musickitJs.MusicKit.Stations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray extends StObject {
  
  var data: js.Array[
    typingsJapgolly.musickitJs.MusicKit.Activities | typingsJapgolly.musickitJs.MusicKit.Albums | AppleCurators | typingsJapgolly.musickitJs.MusicKit.Artists | Curators | MusicVideos | typingsJapgolly.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations
  ]
}
object DataArray {
  
  inline def apply(
    data: js.Array[
      typingsJapgolly.musickitJs.MusicKit.Activities | typingsJapgolly.musickitJs.MusicKit.Albums | AppleCurators | typingsJapgolly.musickitJs.MusicKit.Artists | Curators | MusicVideos | typingsJapgolly.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations
    ]
  ): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  extension [Self <: DataArray](x: Self) {
    
    inline def setData(
      value: js.Array[
          typingsJapgolly.musickitJs.MusicKit.Activities | typingsJapgolly.musickitJs.MusicKit.Albums | AppleCurators | typingsJapgolly.musickitJs.MusicKit.Artists | Curators | MusicVideos | typingsJapgolly.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations
        ]
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(
      value: (typingsJapgolly.musickitJs.MusicKit.Activities | typingsJapgolly.musickitJs.MusicKit.Albums | AppleCurators | typingsJapgolly.musickitJs.MusicKit.Artists | Curators | MusicVideos | typingsJapgolly.musickitJs.MusicKit.Playlists | RecordLabels | Songs | Stations)*
    ): Self = StObject.set(x, "data", js.Array(value*))
  }
}
