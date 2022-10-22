package typingsJapgolly.firebaseApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAppSrcTypesMod {
  
  trait HeartbeatService extends StObject {
    
    /**
      * Returns a base64 encoded string which can be attached to the heartbeat-specific header directly.
      * It also clears all heartbeats from memory as well as in IndexedDB.
      */
    def getHeartbeatsHeader(): js.Promise[String]
    
    /**
      * Called to report a heartbeat. The function will generate
      * a HeartbeatsByUserAgent object, update heartbeatsCache, and persist it
      * to IndexedDB.
      * Note that we only store one heartbeat per day. So if a heartbeat for today is
      * already logged, subsequent calls to this function in the same day will be ignored.
      */
    def triggerHeartbeat(): js.Promise[Unit]
  }
  object HeartbeatService {
    
    inline def apply(
      getHeartbeatsHeader: CallbackTo[js.Promise[String]],
      triggerHeartbeat: CallbackTo[js.Promise[Unit]]
    ): HeartbeatService = {
      val __obj = js.Dynamic.literal(getHeartbeatsHeader = getHeartbeatsHeader.toJsFn, triggerHeartbeat = triggerHeartbeat.toJsFn)
      __obj.asInstanceOf[HeartbeatService]
    }
    
    extension [Self <: HeartbeatService](x: Self) {
      
      inline def setGetHeartbeatsHeader(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getHeartbeatsHeader", value.toJsFn)
      
      inline def setTriggerHeartbeat(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "triggerHeartbeat", value.toJsFn)
    }
  }
  
  trait HeartbeatStorage extends StObject {
    
    def add(heartbeats: HeartbeatsInIndexedDB): js.Promise[Unit]
    
    def overwrite(heartbeats: HeartbeatsInIndexedDB): js.Promise[Unit]
    
    def read(): js.Promise[HeartbeatsInIndexedDB]
  }
  object HeartbeatStorage {
    
    inline def apply(
      add: HeartbeatsInIndexedDB => js.Promise[Unit],
      overwrite: HeartbeatsInIndexedDB => js.Promise[Unit],
      read: CallbackTo[js.Promise[HeartbeatsInIndexedDB]]
    ): HeartbeatStorage = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), overwrite = js.Any.fromFunction1(overwrite), read = read.toJsFn)
      __obj.asInstanceOf[HeartbeatStorage]
    }
    
    extension [Self <: HeartbeatStorage](x: Self) {
      
      inline def setAdd(value: HeartbeatsInIndexedDB => js.Promise[Unit]): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setOverwrite(value: HeartbeatsInIndexedDB => js.Promise[Unit]): Self = StObject.set(x, "overwrite", js.Any.fromFunction1(value))
      
      inline def setRead(value: CallbackTo[js.Promise[HeartbeatsInIndexedDB]]): Self = StObject.set(x, "read", value.toJsFn)
    }
  }
  
  trait HeartbeatsByUserAgent extends StObject {
    
    var agent: String
    
    var dates: js.Array[String]
  }
  object HeartbeatsByUserAgent {
    
    inline def apply(agent: String, dates: js.Array[String]): HeartbeatsByUserAgent = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], dates = dates.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeartbeatsByUserAgent]
    }
    
    extension [Self <: HeartbeatsByUserAgent](x: Self) {
      
      inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setDates(value: js.Array[String]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: String*): Self = StObject.set(x, "dates", js.Array(value*))
    }
  }
  
  trait HeartbeatsInIndexedDB extends StObject {
    
    var heartbeats: js.Array[SingleDateHeartbeat]
    
    var lastSentHeartbeatDate: js.UndefOr[String] = js.undefined
  }
  object HeartbeatsInIndexedDB {
    
    inline def apply(heartbeats: js.Array[SingleDateHeartbeat]): HeartbeatsInIndexedDB = {
      val __obj = js.Dynamic.literal(heartbeats = heartbeats.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeartbeatsInIndexedDB]
    }
    
    extension [Self <: HeartbeatsInIndexedDB](x: Self) {
      
      inline def setHeartbeats(value: js.Array[SingleDateHeartbeat]): Self = StObject.set(x, "heartbeats", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatsVarargs(value: SingleDateHeartbeat*): Self = StObject.set(x, "heartbeats", js.Array(value*))
      
      inline def setLastSentHeartbeatDate(value: String): Self = StObject.set(x, "lastSentHeartbeatDate", value.asInstanceOf[js.Any])
      
      inline def setLastSentHeartbeatDateUndefined: Self = StObject.set(x, "lastSentHeartbeatDate", js.undefined)
    }
  }
  
  trait PlatformLoggerService extends StObject {
    
    def getPlatformInfoString(): String
  }
  object PlatformLoggerService {
    
    inline def apply(getPlatformInfoString: CallbackTo[String]): PlatformLoggerService = {
      val __obj = js.Dynamic.literal(getPlatformInfoString = getPlatformInfoString.toJsFn)
      __obj.asInstanceOf[PlatformLoggerService]
    }
    
    extension [Self <: PlatformLoggerService](x: Self) {
      
      inline def setGetPlatformInfoString(value: CallbackTo[String]): Self = StObject.set(x, "getPlatformInfoString", value.toJsFn)
    }
  }
  
  trait SingleDateHeartbeat extends StObject {
    
    var agent: String
    
    var date: String
  }
  object SingleDateHeartbeat {
    
    inline def apply(agent: String, date: String): SingleDateHeartbeat = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleDateHeartbeat]
    }
    
    extension [Self <: SingleDateHeartbeat](x: Self) {
      
      inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait VersionService extends StObject {
    
    var library: String
    
    var version: String
  }
  object VersionService {
    
    inline def apply(library: String, version: String): VersionService = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionService]
    }
    
    extension [Self <: VersionService](x: Self) {
      
      inline def setLibrary(value: String): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
