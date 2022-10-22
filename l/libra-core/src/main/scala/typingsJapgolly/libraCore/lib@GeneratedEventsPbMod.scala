package typingsJapgolly.libraCore

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.`lib@GeneratedAccessPathPbMod`.AccessPath
import typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.EventProof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `lib@GeneratedEventsPbMod` {
  
  @JSImport("libra-core/lib/@/generated/events_pb", "Event")
  @js.native
  open class Event () extends Message {
    
    def clearAccessPath(): Unit = js.native
    
    def getAccessPath(): js.UndefOr[AccessPath] = js.native
    
    def getEventData(): js.typedarray.Uint8Array | String = js.native
    
    def getEventData_asB64(): String = js.native
    
    def getEventData_asU8(): js.typedarray.Uint8Array = js.native
    
    def getSequenceNumber(): String = js.native
    
    def hasAccessPath(): Boolean = js.native
    
    def setAccessPath(): Unit = js.native
    def setAccessPath(value: AccessPath): Unit = js.native
    
    def setEventData(value: String): Unit = js.native
    def setEventData(value: js.typedarray.Uint8Array): Unit = js.native
    
    def setSequenceNumber(value: String): Unit = js.native
  }
  /* static members */
  object Event {
    
    @JSImport("libra-core/lib/@/generated/events_pb", "Event")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): Event = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Event]
    
    inline def deserializeBinaryFromReader(message: Event, reader: BinaryReader): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[Event]
    
    @JSImport("libra-core/lib/@/generated/events_pb", "Event.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/events_pb", "Event.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: Event, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: Event): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var accessPath: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedAccessPathPbMod`.AccessPath.AsObject] = js.undefined
      
      var eventData: js.typedarray.Uint8Array | String
      
      var sequenceNumber: String
    }
    object AsObject {
      
      inline def apply(eventData: js.typedarray.Uint8Array | String, sequenceNumber: String): AsObject = {
        val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setAccessPath(value: typingsJapgolly.libraCore.`lib@GeneratedAccessPathPbMod`.AccessPath.AsObject): Self = StObject.set(x, "accessPath", value.asInstanceOf[js.Any])
        
        inline def setAccessPathUndefined: Self = StObject.set(x, "accessPath", js.undefined)
        
        inline def setEventData(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
        
        inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/events_pb", "EventWithProof")
  @js.native
  open class EventWithProof () extends Message {
    
    def clearEvent(): Unit = js.native
    
    def clearProof(): Unit = js.native
    
    def getEvent(): js.UndefOr[Event] = js.native
    
    def getEventIndex(): String = js.native
    
    def getProof(): js.UndefOr[EventProof] = js.native
    
    def getTransactionVersion(): String = js.native
    
    def hasEvent(): Boolean = js.native
    
    def hasProof(): Boolean = js.native
    
    def setEvent(): Unit = js.native
    def setEvent(value: Event): Unit = js.native
    
    def setEventIndex(value: String): Unit = js.native
    
    def setProof(): Unit = js.native
    def setProof(value: EventProof): Unit = js.native
    
    def setTransactionVersion(value: String): Unit = js.native
  }
  /* static members */
  object EventWithProof {
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventWithProof")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EventWithProof = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EventWithProof]
    
    inline def deserializeBinaryFromReader(message: EventWithProof, reader: BinaryReader): EventWithProof = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EventWithProof]
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventWithProof.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventWithProof.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: EventWithProof, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: EventWithProof): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var event: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.Event.AsObject] = js.undefined
      
      var eventIndex: String
      
      var proof: js.UndefOr[typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.EventProof.AsObject] = js.undefined
      
      var transactionVersion: String
    }
    object AsObject {
      
      inline def apply(eventIndex: String, transactionVersion: String): AsObject = {
        val __obj = js.Dynamic.literal(eventIndex = eventIndex.asInstanceOf[js.Any], transactionVersion = transactionVersion.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setEvent(value: typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.Event.AsObject): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setEventIndex(value: String): Self = StObject.set(x, "eventIndex", value.asInstanceOf[js.Any])
        
        inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        inline def setProof(value: typingsJapgolly.libraCore.`lib@GeneratedProofPbMod`.EventProof.AsObject): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
        
        inline def setProofUndefined: Self = StObject.set(x, "proof", js.undefined)
        
        inline def setTransactionVersion(value: String): Self = StObject.set(x, "transactionVersion", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/events_pb", "EventsForVersions")
  @js.native
  open class EventsForVersions () extends Message {
    
    def addEventsForVersion(): EventsList = js.native
    def addEventsForVersion(value: Unit, index: Double): EventsList = js.native
    def addEventsForVersion(value: EventsList): EventsList = js.native
    def addEventsForVersion(value: EventsList, index: Double): EventsList = js.native
    
    def clearEventsForVersionList(): Unit = js.native
    
    def getEventsForVersionList(): js.Array[EventsList] = js.native
    
    def setEventsForVersionList(value: js.Array[EventsList]): Unit = js.native
  }
  /* static members */
  object EventsForVersions {
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventsForVersions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EventsForVersions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EventsForVersions]
    
    inline def deserializeBinaryFromReader(message: EventsForVersions, reader: BinaryReader): EventsForVersions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EventsForVersions]
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventsForVersions.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventsForVersions.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: EventsForVersions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: EventsForVersions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var eventsForVersionList: js.Array[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventsList.AsObject]
    }
    object AsObject {
      
      inline def apply(
        eventsForVersionList: js.Array[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventsList.AsObject]
      ): AsObject = {
        val __obj = js.Dynamic.literal(eventsForVersionList = eventsForVersionList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setEventsForVersionList(value: js.Array[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventsList.AsObject]): Self = StObject.set(x, "eventsForVersionList", value.asInstanceOf[js.Any])
        
        inline def setEventsForVersionListVarargs(value: typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.EventsList.AsObject*): Self = StObject.set(x, "eventsForVersionList", js.Array(value*))
      }
    }
  }
  
  @JSImport("libra-core/lib/@/generated/events_pb", "EventsList")
  @js.native
  open class EventsList () extends Message {
    
    def addEvents(): Event = js.native
    def addEvents(value: Unit, index: Double): Event = js.native
    def addEvents(value: Event): Event = js.native
    def addEvents(value: Event, index: Double): Event = js.native
    
    def clearEventsList(): Unit = js.native
    
    def getEventsList(): js.Array[Event] = js.native
    
    def setEventsList(value: js.Array[Event]): Unit = js.native
  }
  /* static members */
  object EventsList {
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventsList")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserializeBinary(bytes: js.typedarray.Uint8Array): EventsList = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EventsList]
    
    inline def deserializeBinaryFromReader(message: EventsList, reader: BinaryReader): EventsList = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[EventsList]
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventsList.extensions")
    @js.native
    def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
    
    @JSImport("libra-core/lib/@/generated/events_pb", "EventsList.extensionsBinary")
    @js.native
    def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
    inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
    
    inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
    
    inline def serializeBinaryToWriter(message: EventsList, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toObject(includeInstance: Boolean, msg: EventsList): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
    
    trait AsObject extends StObject {
      
      var eventsList: js.Array[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.Event.AsObject]
    }
    object AsObject {
      
      inline def apply(eventsList: js.Array[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.Event.AsObject]): AsObject = {
        val __obj = js.Dynamic.literal(eventsList = eventsList.asInstanceOf[js.Any])
        __obj.asInstanceOf[AsObject]
      }
      
      extension [Self <: AsObject](x: Self) {
        
        inline def setEventsList(value: js.Array[typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.Event.AsObject]): Self = StObject.set(x, "eventsList", value.asInstanceOf[js.Any])
        
        inline def setEventsListVarargs(value: typingsJapgolly.libraCore.`lib@GeneratedEventsPbMod`.Event.AsObject*): Self = StObject.set(x, "eventsList", js.Array(value*))
      }
    }
  }
}
