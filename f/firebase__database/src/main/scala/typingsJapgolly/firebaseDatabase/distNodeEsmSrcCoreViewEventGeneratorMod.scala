package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapIndexesIndexMod.Index
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewChangeMod.Change
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventMod.Event
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.EventRegistration
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.QueryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreViewEventGeneratorMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/EventGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/EventGenerator", "EventGenerator")
  @js.native
  open class EventGenerator protected () extends StObject {
    def this(query_ : QueryContext) = this()
    
    var index_ : Index = js.native
    
    var query_ : QueryContext = js.native
  }
  
  inline def eventGeneratorGenerateEventsForChanges(
    eventGenerator: EventGenerator,
    changes: js.Array[Change],
    eventCache: Node,
    eventRegistrations: js.Array[EventRegistration]
  ): js.Array[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventGeneratorGenerateEventsForChanges")(eventGenerator.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], eventCache.asInstanceOf[js.Any], eventRegistrations.asInstanceOf[js.Any])).asInstanceOf[js.Array[Event]]
}
