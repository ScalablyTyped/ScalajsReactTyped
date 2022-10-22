package typingsJapgolly.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowingPyong extends StObject {
  
  var following: Boolean
  
  var pyong: Boolean
}
object FollowingPyong {
  
  inline def apply(following: Boolean, pyong: Boolean): FollowingPyong = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowingPyong]
  }
  
  extension [Self <: FollowingPyong](x: Self) {
    
    inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
    
    inline def setPyong(value: Boolean): Self = StObject.set(x, "pyong", value.asInstanceOf[js.Any])
  }
}
