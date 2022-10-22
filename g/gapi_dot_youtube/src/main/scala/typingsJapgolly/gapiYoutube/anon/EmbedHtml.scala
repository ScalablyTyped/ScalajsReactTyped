package typingsJapgolly.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbedHtml extends StObject {
  
  /**
    * An <iframe> tag that embeds a player that will play the video.
    */
  var embedHtml: String
}
object EmbedHtml {
  
  inline def apply(embedHtml: String): EmbedHtml = {
    val __obj = js.Dynamic.literal(embedHtml = embedHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedHtml]
  }
  
  extension [Self <: EmbedHtml](x: Self) {
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
  }
}
