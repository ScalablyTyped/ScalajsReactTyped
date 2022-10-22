package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pusherJs.typesSrcCoreTimelineLevelMod.TimelineLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTimelineTimelineMod {
  
  @JSImport("pusher-js/types/src/core/timeline/timeline", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Timeline {
    def this(key: String, session: Double, options: TimelineOptions) = this()
    
    /* CompleteClass */
    override def debug(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def error(event: Any): Unit = js.native
    
    /* CompleteClass */
    var events: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def generateUniqueID(): Double = js.native
    
    /* CompleteClass */
    override def info(event: Any): Unit = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    var key: String = js.native
    
    /* CompleteClass */
    override def log(level: Any, event: Any): Unit = js.native
    
    /* CompleteClass */
    var options: TimelineOptions = js.native
    
    /* CompleteClass */
    override def send(sendfn: Any, callback: Any): Boolean = js.native
    
    /* CompleteClass */
    var sent: Double = js.native
    
    /* CompleteClass */
    var session: Double = js.native
    
    /* CompleteClass */
    var uniqueID: Double = js.native
  }
  
  trait Timeline extends StObject {
    
    def debug(event: Any): Unit
    
    def error(event: Any): Unit
    
    var events: js.Array[Any]
    
    def generateUniqueID(): Double
    
    def info(event: Any): Unit
    
    def isEmpty(): Boolean
    
    var key: String
    
    def log(level: Any, event: Any): Unit
    
    var options: TimelineOptions
    
    def send(sendfn: Any, callback: Any): Boolean
    
    var sent: Double
    
    var session: Double
    
    var uniqueID: Double
  }
  object Timeline {
    
    inline def apply(
      debug: Any => Callback,
      error: Any => Callback,
      events: js.Array[Any],
      generateUniqueID: CallbackTo[Double],
      info: Any => Callback,
      isEmpty: CallbackTo[Boolean],
      key: String,
      log: (Any, Any) => Callback,
      options: TimelineOptions,
      send: (Any, Any) => Boolean,
      sent: Double,
      session: Double,
      uniqueID: Double
    ): Timeline = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1((t0: Any) => debug(t0).runNow()), error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), events = events.asInstanceOf[js.Any], generateUniqueID = generateUniqueID.toJsFn, info = js.Any.fromFunction1((t0: Any) => info(t0).runNow()), isEmpty = isEmpty.toJsFn, key = key.asInstanceOf[js.Any], log = js.Any.fromFunction2((t0: Any, t1: Any) => (log(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), sent = sent.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], uniqueID = uniqueID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeline]
    }
    
    extension [Self <: Timeline](x: Self) {
      
      inline def setDebug(value: Any => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setEvents(value: js.Array[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Any*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setGenerateUniqueID(value: CallbackTo[Double]): Self = StObject.set(x, "generateUniqueID", value.toJsFn)
      
      inline def setInfo(value: Any => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLog(value: (Any, Any) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOptions(value: TimelineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSend(value: (Any, Any) => Boolean): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Double): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setUniqueID(value: Double): Self = StObject.set(x, "uniqueID", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineOptions extends StObject {
    
    var cluster: js.UndefOr[String] = js.undefined
    
    var features: js.UndefOr[js.Array[String]] = js.undefined
    
    var level: js.UndefOr[TimelineLevel] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[Any] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object TimelineOptions {
    
    inline def apply(): TimelineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineOptions]
    }
    
    extension [Self <: TimelineOptions](x: Self) {
      
      inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setLevel(value: TimelineLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
