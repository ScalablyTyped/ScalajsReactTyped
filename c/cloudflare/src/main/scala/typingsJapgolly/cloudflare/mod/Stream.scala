package typingsJapgolly.cloudflare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  def deleteVideo(accountId: String, id: String): js.Promise[js.Object]
  
  def listVideos(accountId: String): js.Promise[js.Object]
  
  def videoDetails(accountId: String, id: String): js.Promise[js.Object]
}
object Stream {
  
  inline def apply(
    deleteVideo: (String, String) => js.Promise[js.Object],
    listVideos: String => js.Promise[js.Object],
    videoDetails: (String, String) => js.Promise[js.Object]
  ): Stream = {
    val __obj = js.Dynamic.literal(deleteVideo = js.Any.fromFunction2(deleteVideo), listVideos = js.Any.fromFunction1(listVideos), videoDetails = js.Any.fromFunction2(videoDetails))
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setDeleteVideo(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "deleteVideo", js.Any.fromFunction2(value))
    
    inline def setListVideos(value: String => js.Promise[js.Object]): Self = StObject.set(x, "listVideos", js.Any.fromFunction1(value))
    
    inline def setVideoDetails(value: (String, String) => js.Promise[js.Object]): Self = StObject.set(x, "videoDetails", js.Any.fromFunction2(value))
  }
}
