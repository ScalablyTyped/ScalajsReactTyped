package typingsJapgolly.ckeditor4.CKEDITOR.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditor4.CKEDITOR.dom.element
import typingsJapgolly.ckeditor4.CKEDITOR.fileTools.fileLoader
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebase {
  
  trait imageWidgetDefinition
    extends StObject
       with definition {
    
    var features: js.Array[String]
    
    @JSName("upcast")
    var upcast_imageWidgetDefinition: String
  }
  object imageWidgetDefinition {
    
    inline def apply(features: js.Array[String], upcast: String): imageWidgetDefinition = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], upcast = upcast.asInstanceOf[js.Any])
      __obj.asInstanceOf[imageWidgetDefinition]
    }
    
    extension [Self <: imageWidgetDefinition](x: Self) {
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setUpcast(value: String): Self = StObject.set(x, "upcast", value.asInstanceOf[js.Any])
    }
  }
  
  trait progressBar
    extends StObject
       with progressReporter {
    
    var bar: element
  }
  object progressBar {
    
    inline def apply(
      aborted: Callback,
      bar: element,
      bindLoader: fileLoader => Callback,
      done: Callback,
      failed: Callback,
      remove: Callback,
      updated: Double => Callback,
      wrapper: element
    ): progressBar = {
      val __obj = js.Dynamic.literal(aborted = aborted.toJsFn, bar = bar.asInstanceOf[js.Any], bindLoader = js.Any.fromFunction1((t0: fileLoader) => bindLoader(t0).runNow()), done = done.toJsFn, failed = failed.toJsFn, remove = remove.toJsFn, updated = js.Any.fromFunction1((t0: Double) => updated(t0).runNow()), wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[progressBar]
    }
    
    extension [Self <: progressBar](x: Self) {
      
      inline def setBar(value: element): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    }
  }
  
  trait progressReporter extends StObject {
    
    def aborted(): Unit
    
    def bindLoader(loader: fileLoader): Unit
    
    def done(): Unit
    
    def failed(): Unit
    
    def remove(): Unit
    
    def updated(progress: Double): Unit
    
    var wrapper: element
  }
  object progressReporter {
    
    inline def apply(
      aborted: Callback,
      bindLoader: fileLoader => Callback,
      done: Callback,
      failed: Callback,
      remove: Callback,
      updated: Double => Callback,
      wrapper: element
    ): progressReporter = {
      val __obj = js.Dynamic.literal(aborted = aborted.toJsFn, bindLoader = js.Any.fromFunction1((t0: fileLoader) => bindLoader(t0).runNow()), done = done.toJsFn, failed = failed.toJsFn, remove = remove.toJsFn, updated = js.Any.fromFunction1((t0: Double) => updated(t0).runNow()), wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[progressReporter]
    }
    
    extension [Self <: progressReporter](x: Self) {
      
      inline def setAborted(value: Callback): Self = StObject.set(x, "aborted", value.toJsFn)
      
      inline def setBindLoader(value: fileLoader => Callback): Self = StObject.set(x, "bindLoader", js.Any.fromFunction1((t0: fileLoader) => value(t0).runNow()))
      
      inline def setDone(value: Callback): Self = StObject.set(x, "done", value.toJsFn)
      
      inline def setFailed(value: Callback): Self = StObject.set(x, "failed", value.toJsFn)
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setUpdated(value: Double => Callback): Self = StObject.set(x, "updated", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setWrapper(value: element): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
