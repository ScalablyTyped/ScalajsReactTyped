package typingsJapgolly.ssUtils.ssutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReadyState extends StObject
/**
  * EventSource
  */
@JSGlobal("ssutils.ReadyState")
@js.native
object ReadyState extends StObject {
  
  @js.native
  sealed trait CLOSED
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait CONNECTING
    extends StObject
       with ReadyState
  
  @js.native
  sealed trait OPEN
    extends StObject
       with ReadyState
}
