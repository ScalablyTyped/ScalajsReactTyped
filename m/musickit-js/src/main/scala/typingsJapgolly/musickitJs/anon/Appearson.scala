package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearson extends StObject {
  
  var `appears-on`: View[typingsJapgolly.musickitJs.MusicKit.Playlists]
  
  var `other-versions`: View[typingsJapgolly.musickitJs.MusicKit.Albums]
  
  var `related-albums`: View[typingsJapgolly.musickitJs.MusicKit.Albums]
  
  var `related-videos`: View[MusicVideos]
}
object Appearson {
  
  inline def apply(
    `appears-on`: View[typingsJapgolly.musickitJs.MusicKit.Playlists],
    `other-versions`: View[typingsJapgolly.musickitJs.MusicKit.Albums],
    `related-albums`: View[typingsJapgolly.musickitJs.MusicKit.Albums],
    `related-videos`: View[MusicVideos]
  ): Appearson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appears-on")(`appears-on`.asInstanceOf[js.Any])
    __obj.updateDynamic("other-versions")(`other-versions`.asInstanceOf[js.Any])
    __obj.updateDynamic("related-albums")(`related-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("related-videos")(`related-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearson]
  }
  
  extension [Self <: Appearson](x: Self) {
    
    inline def `setAppears-on`(value: View[typingsJapgolly.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "appears-on", value.asInstanceOf[js.Any])
    
    inline def `setOther-versions`(value: View[typingsJapgolly.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "other-versions", value.asInstanceOf[js.Any])
    
    inline def `setRelated-albums`(value: View[typingsJapgolly.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "related-albums", value.asInstanceOf[js.Any])
    
    inline def `setRelated-videos`(value: View[MusicVideos]): Self = StObject.set(x, "related-videos", value.asInstanceOf[js.Any])
  }
}
