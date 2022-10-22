package typingsJapgolly.pulumiPulumi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var state: Any
    
    var urn: String
  }
  object Id {
    
    inline def apply(state: Any, urn: String): Id = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Init extends StObject {
    
    def init(): js.Promise[Inputs]
  }
  object Init {
    
    inline def apply(init: CallbackTo[js.Promise[Inputs]]): Init = {
      val __obj = js.Dynamic.literal(init = init.toJsFn)
      __obj.asInstanceOf[Init]
    }
    
    extension [Self <: Init](x: Self) {
      
      inline def setInit(value: CallbackTo[js.Promise[Inputs]]): Self = StObject.set(x, "init", value.toJsFn)
    }
  }
  
  trait State extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var state: Record[String, Any]
  }
  object State {
    
    inline def apply(state: Record[String, Any]): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setState(value: Record[String, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
