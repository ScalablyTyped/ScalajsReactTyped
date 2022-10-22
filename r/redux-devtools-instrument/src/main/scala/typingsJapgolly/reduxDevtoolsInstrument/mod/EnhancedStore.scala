package typingsJapgolly.reduxDevtoolsInstrument.mod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnhancedStore[S, A /* <: Action[Any] */, MonitorState]
  extends StObject
     with Store[S, A]
     with InstrumentExt[S, A, MonitorState]
