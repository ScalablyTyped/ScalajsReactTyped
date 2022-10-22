package typingsJapgolly.ejWebAll.ej

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Print
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Print: Model = js.native
  
  /** Print the specific page or an element.
    * @returns {void}
    */
  def print(): Unit = js.native
}
object Print {
  
  trait BeforeStartEventArgs extends StObject {
    
    /** Set this option as true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the printed element
      */
    var content: js.UndefOr[Any] = js.undefined
    
    /** Returns the Print model
      */
    var model: js.UndefOr[typingsJapgolly.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of an event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeStartEventArgs {
    
    inline def apply(): BeforeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeStartEventArgs]
    }
    
    extension [Self <: BeforeStartEventArgs](x: Self) {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setModel(value: typingsJapgolly.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Append the custom HTML after the selected content.
      * @Default {null}
      */
    var append: js.UndefOr[String] = js.undefined
    
    /** Event triggers before the document page or an element in it gets printed.
      */
    var beforeStart: js.UndefOr[js.Function1[/* e */ BeforeStartEventArgs, Unit]] = js.undefined
    
    /** Prepend a docType to the document frame.
      * @Default {&lt;!doctype html&gt;}
      */
    var docType: js.UndefOr[String] = js.undefined
    
    /** A selector that specifies a particular element to be excluded from printing.
      * @Default {null}
      */
    var excludeSelector: js.UndefOr[String] = js.undefined
    
    /** Specifies whether the URL of an external stylesheet can be included to customize and print that page.
      * @Default {null}
      */
    var externalStyles: js.UndefOr[String] = js.undefined
    
    /** Specifies whether the global styles can be applied to the element to be printed.
      * @Default {true}
      */
    var globalStyles: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the height of the print window.
      * @Default {454}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Prepends the custom HTML before the selected content.
      * @Default {null}
      */
    var prepend: js.UndefOr[String] = js.undefined
    
    /** Allows printing the content in a new window.
      * @Default {false}
      */
    var printInNewWindow: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the period of time to wait before printing the content.
      * @Default {1000}
      */
    var timeOutPeriod: js.UndefOr[Double] = js.undefined
    
    /** Sets the title of the print document.
      * @Default {null}
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the print window.
      * @Default {1024}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.Print.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.Print.Model]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.Print.Model](x: Self) {
      
      inline def setAppend(value: String): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setBeforeStart(value: /* e */ BeforeStartEventArgs => Callback): Self = StObject.set(x, "beforeStart", js.Any.fromFunction1((t0: /* e */ BeforeStartEventArgs) => value(t0).runNow()))
      
      inline def setBeforeStartUndefined: Self = StObject.set(x, "beforeStart", js.undefined)
      
      inline def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
      
      inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
      
      inline def setExcludeSelector(value: String): Self = StObject.set(x, "excludeSelector", value.asInstanceOf[js.Any])
      
      inline def setExcludeSelectorUndefined: Self = StObject.set(x, "excludeSelector", js.undefined)
      
      inline def setExternalStyles(value: String): Self = StObject.set(x, "externalStyles", value.asInstanceOf[js.Any])
      
      inline def setExternalStylesUndefined: Self = StObject.set(x, "externalStyles", js.undefined)
      
      inline def setGlobalStyles(value: Boolean): Self = StObject.set(x, "globalStyles", value.asInstanceOf[js.Any])
      
      inline def setGlobalStylesUndefined: Self = StObject.set(x, "globalStyles", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPrepend(value: String): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setPrintInNewWindow(value: Boolean): Self = StObject.set(x, "printInNewWindow", value.asInstanceOf[js.Any])
      
      inline def setPrintInNewWindowUndefined: Self = StObject.set(x, "printInNewWindow", js.undefined)
      
      inline def setTimeOutPeriod(value: Double): Self = StObject.set(x, "timeOutPeriod", value.asInstanceOf[js.Any])
      
      inline def setTimeOutPeriodUndefined: Self = StObject.set(x, "timeOutPeriod", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
