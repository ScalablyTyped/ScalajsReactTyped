package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimeFrame extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimeFrame")
@js.native
object TimeFrame extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeFrame & Double] = js.native
  
  @js.native
  sealed trait Current
    extends StObject
       with TimeFrame
  /* 1 */ val Current: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.TimeFrame.Current & Double = js.native
  
  @js.native
  sealed trait Future
    extends StObject
       with TimeFrame
  /* 2 */ val Future: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.TimeFrame.Future & Double = js.native
  
  @js.native
  sealed trait Past
    extends StObject
       with TimeFrame
  /* 0 */ val Past: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.TimeFrame.Past & Double = js.native
}
