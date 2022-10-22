package typingsJapgolly.promiseStateMachineEs6

import typingsJapgolly.promiseStateMachineEs6.anon.Replacer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait DotNode[State, Transitions] extends StObject {
    
    var from: State
    
    var to: State
    
    var transition: Transitions
  }
  object DotNode {
    
    inline def apply[State, Transitions](from: State, to: State, transition: Transitions): DotNode[State, Transitions] = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotNode[State, Transitions]]
    }
    
    extension [Self <: DotNode[?, ?], State, Transitions](x: Self & (DotNode[State, Transitions])) {
      
      inline def setFrom(value: State): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: State): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: Transitions): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait DotNodeStringified extends StObject {
    
    var from: String
    
    var to: String
    
    var transition: String
  }
  object DotNodeStringified {
    
    inline def apply(from: String, to: String, transition: String): DotNodeStringified = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotNodeStringified]
    }
    
    extension [Self <: DotNodeStringified](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ name in Transitions ]: {  from :State | std.Array<State>,   to :State}}
    }}}
    */
  @js.native
  trait Events[State, Transitions /* <: String */] extends StObject
  
  @js.native
  trait FsmBase[State, Transitions] extends StObject {
    
    def can(args: Transitions*): Boolean = js.native
    def can(state: Transitions): Boolean = js.native
    
    def is(args: State*): Boolean = js.native
    def is(state: State): Boolean = js.native
    
    var state: State = js.native
    
    def toDOTsync(): String = js.native
    def toDOTsync(options: Replacer[State, Transitions]): String = js.native
  }
}
