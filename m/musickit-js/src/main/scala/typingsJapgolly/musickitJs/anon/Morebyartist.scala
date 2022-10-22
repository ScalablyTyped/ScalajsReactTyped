package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.MusicVideos
import typingsJapgolly.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Morebyartist extends StObject {
  
  var `more-by-artist`: View[MusicVideos]
  
  var `more-in-genre`: View[MusicVideos]
}
object Morebyartist {
  
  inline def apply(`more-by-artist`: View[MusicVideos], `more-in-genre`: View[MusicVideos]): Morebyartist = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("more-by-artist")(`more-by-artist`.asInstanceOf[js.Any])
    __obj.updateDynamic("more-in-genre")(`more-in-genre`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Morebyartist]
  }
  
  extension [Self <: Morebyartist](x: Self) {
    
    inline def `setMore-by-artist`(value: View[MusicVideos]): Self = StObject.set(x, "more-by-artist", value.asInstanceOf[js.Any])
    
    inline def `setMore-in-genre`(value: View[MusicVideos]): Self = StObject.set(x, "more-in-genre", value.asInstanceOf[js.Any])
  }
}
