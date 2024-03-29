package typingsJapgolly.inferno.distCoreTypesMod.Inferno

import typingsJapgolly.inferno.distCoreTypesMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassicComponent[P, S]
  extends StObject
     with IComponent[P, S] {
  
  var getInitialState: js.UndefOr[js.Function0[S]] = js.native
  
  def isMounted(): Boolean = js.native
  
  def replaceState(nextState: S): Unit = js.native
  def replaceState(nextState: S, callback: js.Function0[Any]): Unit = js.native
}
