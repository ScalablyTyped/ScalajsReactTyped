package typingsJapgolly.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projectpbxproj extends StObject {
  
  @JSName("project.pbxproj")
  var projectDotpbxproj: Any
}
object Projectpbxproj {
  
  inline def apply(projectDotpbxproj: Any): Projectpbxproj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("project.pbxproj")(projectDotpbxproj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projectpbxproj]
  }
  
  extension [Self <: Projectpbxproj](x: Self) {
    
    inline def setProjectDotpbxproj(value: Any): Self = StObject.set(x, "project.pbxproj", value.asInstanceOf[js.Any])
  }
}
