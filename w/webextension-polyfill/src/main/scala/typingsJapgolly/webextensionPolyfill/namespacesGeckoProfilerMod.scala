package typingsJapgolly.webextensionPolyfill

import japgolly.scalajs.react.Callback
import typingsJapgolly.webextensionPolyfill.namespacesEventsMod.Events.Event
import typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.windowLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesGeckoProfilerMod {
  
  object GeckoProfiler {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.java_
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.js_
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.leaf
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mainthreadio
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.fileio
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.fileioall
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.noiostacks
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.screenshots
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.seqstyle
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.stackwalk
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.jstracer
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.jsallocations
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nostacksampling
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.preferencereads
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nativeallocations
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ipcmessages
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.audiocallbacktracing
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.cpu
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.notimerresolutionchange
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.cpuallthreads
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.samplingallthreads
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.markersallthreads
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unregisteredthreads
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.processcpu
      - typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.responsiveness
    */
    trait ProfilerFeature extends StObject
    object ProfilerFeature {
      
      inline def audiocallbacktracing: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.audiocallbacktracing = "audiocallbacktracing".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.audiocallbacktracing]
      
      inline def cpu: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.cpu = "cpu".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.cpu]
      
      inline def cpuallthreads: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.cpuallthreads = "cpuallthreads".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.cpuallthreads]
      
      inline def fileio: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.fileio = "fileio".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.fileio]
      
      inline def fileioall: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.fileioall = "fileioall".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.fileioall]
      
      inline def ipcmessages: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ipcmessages = "ipcmessages".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.ipcmessages]
      
      inline def java_ : typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.java_ = "java".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.java_]
      
      inline def js_ : typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.js_ = "js".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.js_]
      
      inline def jsallocations: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.jsallocations = "jsallocations".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.jsallocations]
      
      inline def jstracer: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.jstracer = "jstracer".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.jstracer]
      
      inline def leaf: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.leaf = "leaf".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.leaf]
      
      inline def mainthreadio: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mainthreadio = "mainthreadio".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.mainthreadio]
      
      inline def markersallthreads: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.markersallthreads = "markersallthreads".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.markersallthreads]
      
      inline def nativeallocations: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nativeallocations = "nativeallocations".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nativeallocations]
      
      inline def noiostacks: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.noiostacks = "noiostacks".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.noiostacks]
      
      inline def nostacksampling: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nostacksampling = "nostacksampling".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.nostacksampling]
      
      inline def notimerresolutionchange: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.notimerresolutionchange = "notimerresolutionchange".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.notimerresolutionchange]
      
      inline def preferencereads: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.preferencereads = "preferencereads".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.preferencereads]
      
      inline def processcpu: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.processcpu = "processcpu".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.processcpu]
      
      inline def responsiveness: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.responsiveness = "responsiveness".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.responsiveness]
      
      inline def samplingallthreads: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.samplingallthreads = "samplingallthreads".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.samplingallthreads]
      
      inline def screenshots: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.screenshots = "screenshots".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.screenshots]
      
      inline def seqstyle: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.seqstyle = "seqstyle".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.seqstyle]
      
      inline def stackwalk: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.stackwalk = "stackwalk".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.stackwalk]
      
      inline def unregisteredthreads: typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unregisteredthreads = "unregisteredthreads".asInstanceOf[typingsJapgolly.webextensionPolyfill.webextensionPolyfillStrings.unregisteredthreads]
    }
    
    trait StartSettingsType extends StObject {
      
      /**
        * The maximum size in bytes of the buffer used to store profiling data. A larger value allows capturing a profile that
        * covers a greater amount of time.
        */
      var bufferSize: Double
      
      /**
        * A list of active features for the profiler.
        */
      var features: js.Array[ProfilerFeature]
      
      /**
        * Interval in milliseconds between samples of profiling data. A smaller value will increase the detail of the profiles
        * captured.
        */
      var interval: Double
      
      /**
        * A list of thread names for which to capture profiles.
        * Optional.
        */
      var threads: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The length of the window of time that's kept in the buffer. Any collected samples are discarded as soon as they are
        * older than the number of seconds specified in this setting. Zero means no duration restriction.
        * Optional.
        */
      var windowLength: js.UndefOr[Double] = js.undefined
    }
    object StartSettingsType {
      
      inline def apply(bufferSize: Double, features: js.Array[ProfilerFeature], interval: Double): StartSettingsType = {
        val __obj = js.Dynamic.literal(bufferSize = bufferSize.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
        __obj.asInstanceOf[StartSettingsType]
      }
      
      extension [Self <: StartSettingsType](x: Self) {
        
        inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
        
        inline def setFeatures(value: js.Array[ProfilerFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
        
        inline def setFeaturesVarargs(value: ProfilerFeature*): Self = StObject.set(x, "features", js.Array(value*))
        
        inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
        
        inline def setThreads(value: js.Array[String]): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
        
        inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
        
        inline def setThreadsVarargs(value: String*): Self = StObject.set(x, "threads", js.Array(value*))
        
        inline def setWindowLength(value: Double): Self = StObject.set(x, "windowLength", value.asInstanceOf[js.Any])
        
        inline def setWindowLengthUndefined: Self = StObject.set(x, "windowLength", js.undefined)
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Gathers the profile data from the current profiling session, and writes it to disk.
        * The returned promise resolves to a path that locates the created file.
        *
        * @param fileName The name of the file inside the profile/profiler directory
        */
      def dumpProfileToFile(fileName: String): Unit
      
      /**
        * Gathers the profile data from the current profiling session.
        */
      def getProfile(): Unit
      
      /**
        * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer that
        * contains a JSON string.
        */
      def getProfileAsArrayBuffer(): Unit
      
      /**
        * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer that
        * contains a gzipped JSON string.
        */
      def getProfileAsGzippedArrayBuffer(): Unit
      
      /**
        * Gets the debug symbols for a particular library.
        *
        * @param debugName The name of the library's debug file. For example, 'xul.pdb
        * @param breakpadId The Breakpad ID of the library
        */
      def getSymbols(debugName: String, breakpadId: String): Unit
      
      /**
        * Fires when the profiler starts/stops running.
        *
        * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
        */
      var onRunning: Event[js.Function1[/* isRunning */ Boolean, Unit]]
      
      /**
        * Pauses the profiler, keeping any profile data that is already written.
        */
      def pause(): Unit
      
      /**
        * Resumes the profiler with the settings that were initially used to start it.
        */
      def resume(): Unit
      
      /**
        * Starts the profiler with the specified settings.
        *
        * @param settings
        */
      def start(settings: StartSettingsType): Unit
      
      /**
        * Stops the profiler and discards any captured profile data.
        */
      def stop(): Unit
    }
    object Static {
      
      inline def apply(
        dumpProfileToFile: String => Callback,
        getProfile: Callback,
        getProfileAsArrayBuffer: Callback,
        getProfileAsGzippedArrayBuffer: Callback,
        getSymbols: (String, String) => Callback,
        onRunning: Event[js.Function1[/* isRunning */ Boolean, Unit]],
        pause: Callback,
        resume: Callback,
        start: StartSettingsType => Callback,
        stop: Callback
      ): Static = {
        val __obj = js.Dynamic.literal(dumpProfileToFile = js.Any.fromFunction1((t0: String) => dumpProfileToFile(t0).runNow()), getProfile = getProfile.toJsFn, getProfileAsArrayBuffer = getProfileAsArrayBuffer.toJsFn, getProfileAsGzippedArrayBuffer = getProfileAsGzippedArrayBuffer.toJsFn, getSymbols = js.Any.fromFunction2((t0: String, t1: String) => (getSymbols(t0, t1)).runNow()), onRunning = onRunning.asInstanceOf[js.Any], pause = pause.toJsFn, resume = resume.toJsFn, start = js.Any.fromFunction1((t0: StartSettingsType) => start(t0).runNow()), stop = stop.toJsFn)
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setDumpProfileToFile(value: String => Callback): Self = StObject.set(x, "dumpProfileToFile", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setGetProfile(value: Callback): Self = StObject.set(x, "getProfile", value.toJsFn)
        
        inline def setGetProfileAsArrayBuffer(value: Callback): Self = StObject.set(x, "getProfileAsArrayBuffer", value.toJsFn)
        
        inline def setGetProfileAsGzippedArrayBuffer(value: Callback): Self = StObject.set(x, "getProfileAsGzippedArrayBuffer", value.toJsFn)
        
        inline def setGetSymbols(value: (String, String) => Callback): Self = StObject.set(x, "getSymbols", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
        
        inline def setOnRunning(value: Event[js.Function1[/* isRunning */ Boolean, Unit]]): Self = StObject.set(x, "onRunning", value.asInstanceOf[js.Any])
        
        inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
        
        inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
        
        inline def setStart(value: StartSettingsType => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: StartSettingsType) => value(t0).runNow()))
        
        inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      }
    }
    
    type supports = windowLength
  }
}
