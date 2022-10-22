package typingsJapgolly.klaw

import typingsJapgolly.klaw.mod.Event
import typingsJapgolly.klaw.mod.QueueMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object klawStrings {
  
  @js.native
  sealed trait close
    extends StObject
       with Event
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait data
    extends StObject
       with Event
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end
    extends StObject
       with Event
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with Event
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait pause
    extends StObject
       with Event
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pop
    extends StObject
       with QueueMethod
  inline def pop: pop = "pop".asInstanceOf[pop]
  
  @js.native
  sealed trait readable
    extends StObject
       with Event
  inline def readable: readable = "readable".asInstanceOf[readable]
  
  @js.native
  sealed trait resume
    extends StObject
       with Event
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait shift
    extends StObject
       with QueueMethod
  inline def shift: shift = "shift".asInstanceOf[shift]
}
