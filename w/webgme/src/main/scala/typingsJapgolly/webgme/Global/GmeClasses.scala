package typingsJapgolly.webgme.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeClasses {
  
  @JSGlobal("GmeClasses.Project")
  @js.native
  open class Project ()
    extends StObject
       with typingsJapgolly.webgme.GmeClasses.Project
  
  @JSGlobal("GmeClasses.TraversalOrder")
  @js.native
  object TraversalOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.webgme.GmeClasses.TraversalOrder & Double] = js.native
    
    /* 0 */ val BFS: typingsJapgolly.webgme.GmeClasses.TraversalOrder.BFS & Double = js.native
    
    /* 1 */ val DFS: typingsJapgolly.webgme.GmeClasses.TraversalOrder.DFS & Double = js.native
  }
}
