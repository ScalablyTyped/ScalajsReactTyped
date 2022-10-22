package typingsJapgolly.firebaseDatabase

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.DataSnapshot
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.EventRegistration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreViewEventMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/Event", "CancelEvent")
  @js.native
  open class CancelEvent protected ()
    extends StObject
       with Event {
    def this(eventRegistration: EventRegistration, error: js.Error, path: Path) = this()
    
    var error: js.Error = js.native
    
    var eventRegistration: EventRegistration = js.native
    
    /* CompleteClass */
    override def getEventRunner(): js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def getEventType(): String = js.native
    
    /* CompleteClass */
    override def getPath(): Path = js.native
    
    var path: Path = js.native
  }
  
  @JSImport("@firebase/database/dist/node-esm/src/core/view/Event", "DataEvent")
  @js.native
  open class DataEvent protected ()
    extends StObject
       with Event {
    /**
      * @param eventType - One of: value, child_added, child_changed, child_moved, child_removed
      * @param eventRegistration - The function to call to with the event data. User provided
      * @param snapshot - The data backing the event
      * @param prevName - Optional, the name of the previous child for child_* events.
      */
    def this(eventType: EventType, eventRegistration: EventRegistration, snapshot: DataSnapshot) = this()
    def this(
      eventType: EventType,
      eventRegistration: EventRegistration,
      snapshot: DataSnapshot,
      prevName: String
    ) = this()
    
    var eventRegistration: EventRegistration = js.native
    
    var eventType: EventType = js.native
    
    /* CompleteClass */
    override def getEventRunner(): js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def getEventType(): String = js.native
    
    /* CompleteClass */
    override def getPath(): Path = js.native
    
    var prevName: js.UndefOr[String | Null] = js.native
    
    var snapshot: DataSnapshot = js.native
  }
  
  trait Event extends StObject {
    
    def getEventRunner(): js.Function0[Unit]
    
    def getEventType(): String
    
    def getPath(): Path
  }
  object Event {
    
    inline def apply(
      getEventRunner: CallbackTo[js.Function0[Unit]],
      getEventType: CallbackTo[String],
      getPath: CallbackTo[Path]
    ): Event = {
      val __obj = js.Dynamic.literal(getEventRunner = getEventRunner.toJsFn, getEventType = getEventType.toJsFn, getPath = getPath.toJsFn)
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setGetEventRunner(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "getEventRunner", value.toJsFn)
      
      inline def setGetEventType(value: CallbackTo[String]): Self = StObject.set(x, "getEventType", value.toJsFn)
      
      inline def setGetPath(value: CallbackTo[Path]): Self = StObject.set(x, "getPath", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.value
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_added
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_changed
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_moved
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_removed
  */
  trait EventType extends StObject
  object EventType {
    
    inline def child_added: typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_added = "child_added".asInstanceOf[typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_added]
    
    inline def child_changed: typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_changed = "child_changed".asInstanceOf[typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_changed]
    
    inline def child_moved: typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_moved = "child_moved".asInstanceOf[typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_moved]
    
    inline def child_removed: typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_removed = "child_removed".asInstanceOf[typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.child_removed]
    
    inline def value: typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.value = "value".asInstanceOf[typingsJapgolly.firebaseDatabase.firebaseDatabaseStrings.value]
  }
}
