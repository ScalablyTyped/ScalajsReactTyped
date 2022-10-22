package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.stormReactDiagrams.anon.Id
import typingsJapgolly.stormReactDiagrams.anon.Locked
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBaseEntityMod {
  
  @JSImport("storm-react-diagrams/dist/src/BaseEntity", "BaseEntity")
  @js.native
  open class BaseEntity[T /* <: BaseListener[Any] */] () extends StObject {
    def this(id: String) = this()
    
    def addListener(listener: T): String = js.native
    
    def clearListeners(): Unit = js.native
    
    def clone(lookupTable: StringDictionary[Any]): Any = js.native
    
    def deSerialize(data: StringDictionary[Any], engine: DiagramEngine): Unit = js.native
    
    def doClone(lookupTable: StringDictionary[Any], clone: Any): Unit = js.native
    
    def getID(): String = js.native
    
    var id: String = js.native
    
    def isLocked(): Boolean = js.native
    
    def iterateListeners(cb: js.Function2[/* t */ T, /* event */ BaseEvent[Any], Any]): Unit = js.native
    
    var listeners: StringDictionary[T] = js.native
    
    var locked: Boolean = js.native
    
    def removeListener(listener: String): Boolean = js.native
    
    def serialize(): Id = js.native
    
    def setLocked(): Unit = js.native
    def setLocked(locked: Boolean): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.node
    - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.link
    - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.port
    - typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.point
  */
  trait BaseEntityType extends StObject
  object BaseEntityType {
    
    inline def link: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.link = "link".asInstanceOf[typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.link]
    
    inline def node: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.node = "node".asInstanceOf[typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.node]
    
    inline def point: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.point = "point".asInstanceOf[typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.point]
    
    inline def port: typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.port = "port".asInstanceOf[typingsJapgolly.stormReactDiagrams.stormReactDiagramsStrings.port]
  }
  
  trait BaseEvent[T /* <: BaseEntity[BaseListener[Any]] */] extends StObject {
    
    var entity: BaseEntity[BaseListener[Any]]
    
    var firing: Boolean
    
    var id: String
    
    def stopPropagation(): Any
  }
  object BaseEvent {
    
    inline def apply[T /* <: BaseEntity[BaseListener[Any]] */](
      entity: BaseEntity[BaseListener[Any]],
      firing: Boolean,
      id: String,
      stopPropagation: CallbackTo[Any]
    ): BaseEvent[T] = {
      val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[BaseEvent[T]]
    }
    
    extension [Self <: BaseEvent[?], T /* <: BaseEntity[BaseListener[Any]] */](x: Self & BaseEvent[T]) {
      
      inline def setEntity(value: BaseEntity[BaseListener[Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: CallbackTo[Any]): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    }
  }
  
  trait BaseListener[T /* <: BaseEntity[BaseListener[Any]] */] extends StObject {
    
    var lockChanged: js.UndefOr[js.Function1[/* event */ BaseEvent[T] & Locked, Unit]] = js.undefined
  }
  object BaseListener {
    
    inline def apply[T /* <: BaseEntity[BaseListener[Any]] */](): BaseListener[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseListener[T]]
    }
    
    extension [Self <: BaseListener[?], T /* <: BaseEntity[BaseListener[Any]] */](x: Self & BaseListener[T]) {
      
      inline def setLockChanged(value: /* event */ BaseEvent[T] & Locked => Callback): Self = StObject.set(x, "lockChanged", js.Any.fromFunction1((t0: /* event */ BaseEvent[T] & Locked) => value(t0).runNow()))
      
      inline def setLockChangedUndefined: Self = StObject.set(x, "lockChanged", js.undefined)
    }
  }
}
