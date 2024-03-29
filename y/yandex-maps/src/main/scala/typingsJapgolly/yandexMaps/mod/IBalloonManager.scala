package typingsJapgolly.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBalloonManager[T]
  extends StObject
     with IPopupManager[T] {
  
  def autoPan(): js.Promise[T] = js.native
}
