package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Latestreleases extends StObject {
  
  var `latest-releases`: View[typingsJapgolly.musickitJs.MusicKit.Albums]
  
  var `top-releases`: View[typingsJapgolly.musickitJs.MusicKit.Albums]
}
object Latestreleases {
  
  inline def apply(
    `latest-releases`: View[typingsJapgolly.musickitJs.MusicKit.Albums],
    `top-releases`: View[typingsJapgolly.musickitJs.MusicKit.Albums]
  ): Latestreleases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latest-releases")(`latest-releases`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-releases")(`top-releases`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latestreleases]
  }
  
  extension [Self <: Latestreleases](x: Self) {
    
    inline def `setLatest-releases`(value: View[typingsJapgolly.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "latest-releases", value.asInstanceOf[js.Any])
    
    inline def `setTop-releases`(value: View[typingsJapgolly.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "top-releases", value.asInstanceOf[js.Any])
  }
}
