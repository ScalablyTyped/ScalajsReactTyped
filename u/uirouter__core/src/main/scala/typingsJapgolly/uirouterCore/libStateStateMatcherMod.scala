package typingsJapgolly.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterCore.libStateInterfaceMod.StateOrName
import typingsJapgolly.uirouterCore.libStateStateObjectMod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateStateMatcherMod {
  
  @JSImport("@uirouter/core/lib/state/stateMatcher", "StateMatcher")
  @js.native
  open class StateMatcher protected () extends StObject {
    def this(_states: StringDictionary[StateObject]) = this()
    
    /* private */ var _states: Any = js.native
    
    def find(stateOrName: StateOrName): StateObject = js.native
    def find(stateOrName: StateOrName, base: Unit, matchGlob: Boolean): StateObject = js.native
    def find(stateOrName: StateOrName, base: StateOrName): StateObject = js.native
    def find(stateOrName: StateOrName, base: StateOrName, matchGlob: Boolean): StateObject = js.native
    
    def isRelative(stateName: String): Boolean = js.native
    
    def resolvePath(name: String, base: StateOrName): String = js.native
  }
}
