package typingsJapgolly.cordovaPluginStatusbar

import org.scalajs.dom.Event
import typingsJapgolly.cordovaPluginStatusbar.cordovaPluginStatusbarStrings.statusTap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var StatusBar: typingsJapgolly.cordovaPluginStatusbar.StatusBar = js.native
  
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusTap(`type`: statusTap, listener: js.Function1[/* ev */ Event, Any], useCapture: Boolean): Unit = js.native
}
