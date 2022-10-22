package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Featuredartists extends StObject {
  
  var `featured-artists`: View[typingsJapgolly.musickitJs.MusicKit.Artists]
  
  var `more-by-curator`: View[typingsJapgolly.musickitJs.MusicKit.Playlists]
}
object Featuredartists {
  
  inline def apply(
    `featured-artists`: View[typingsJapgolly.musickitJs.MusicKit.Artists],
    `more-by-curator`: View[typingsJapgolly.musickitJs.MusicKit.Playlists]
  ): Featuredartists = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("featured-artists")(`featured-artists`.asInstanceOf[js.Any])
    __obj.updateDynamic("more-by-curator")(`more-by-curator`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Featuredartists]
  }
  
  extension [Self <: Featuredartists](x: Self) {
    
    inline def `setFeatured-artists`(value: View[typingsJapgolly.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "featured-artists", value.asInstanceOf[js.Any])
    
    inline def `setMore-by-curator`(value: View[typingsJapgolly.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "more-by-curator", value.asInstanceOf[js.Any])
  }
}
