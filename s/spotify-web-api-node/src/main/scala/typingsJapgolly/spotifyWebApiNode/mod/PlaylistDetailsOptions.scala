package typingsJapgolly.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistDetailsOptions
  extends StObject
     with PublicOptions {
  
  var collaborative: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
}
object PlaylistDetailsOptions {
  
  inline def apply(): PlaylistDetailsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistDetailsOptions]
  }
  
  extension [Self <: PlaylistDetailsOptions](x: Self) {
    
    inline def setCollaborative(value: Boolean): Self = StObject.set(x, "collaborative", value.asInstanceOf[js.Any])
    
    inline def setCollaborativeUndefined: Self = StObject.set(x, "collaborative", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
