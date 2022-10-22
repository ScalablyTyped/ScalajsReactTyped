package typingsJapgolly.unsplashJs

import org.scalajs.dom.Response
import typingsJapgolly.unsplashJs.anon.AppId
import typingsJapgolly.unsplashJs.anon.PhotoId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBeaconMod {
  
  @JSImport("unsplash-js/dist/beacon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trackNonHotLinkedPhotoView(hasAppId: AppId): js.Function1[/* hasPhotoId */ PhotoId, js.Promise[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("trackNonHotLinkedPhotoView")(hasAppId.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasPhotoId */ PhotoId, js.Promise[Response]]]
}
