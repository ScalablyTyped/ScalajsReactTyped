package typingsJapgolly.leafletGeosearch

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.leafletGeosearch.anon.Container
import typingsJapgolly.leafletGeosearch.anon.QueryString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchElementMod {
  
  @JSImport("leaflet-geosearch/dist/SearchElement", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SearchElement {
    def this(hasHandleSubmitSearchLabelClassNames: SearchElementProps) = this()
    
    /* CompleteClass */
    var container: HTMLDivElement = js.native
    
    /* CompleteClass */
    var form: HTMLFormElement = js.native
    
    /* CompleteClass */
    override def handleSubmit(args: QueryString): Unit = js.native
    
    /* CompleteClass */
    var hasError: Boolean = js.native
    
    /* CompleteClass */
    var input: HTMLInputElement = js.native
    
    /* CompleteClass */
    override def onBlur(): Unit = js.native
    
    /* CompleteClass */
    override def onFocus(): Unit = js.native
    
    /* CompleteClass */
    override def onInput(): Unit = js.native
    
    /* CompleteClass */
    override def onKeyPress(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def onKeyUp(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    override def onSubmit(event: Event): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setQuery(query: String): Unit = js.native
  }
  
  trait SearchElement extends StObject {
    
    var container: HTMLDivElement
    
    var form: HTMLFormElement
    
    def handleSubmit(args: QueryString): Unit
    
    var hasError: Boolean
    
    var input: HTMLInputElement
    
    def onBlur(): Unit
    
    def onFocus(): Unit
    
    def onInput(): Unit
    
    def onKeyPress(event: KeyboardEvent): Unit
    
    def onKeyUp(event: KeyboardEvent): Unit
    
    def onSubmit(event: Event): js.Promise[Unit]
    
    def setQuery(query: String): Unit
  }
  object SearchElement {
    
    inline def apply(
      container: HTMLDivElement,
      form: HTMLFormElement,
      handleSubmit: QueryString => Callback,
      hasError: Boolean,
      input: HTMLInputElement,
      onBlur: Callback,
      onFocus: Callback,
      onInput: Callback,
      onKeyPress: KeyboardEvent => Callback,
      onKeyUp: KeyboardEvent => Callback,
      onSubmit: Event => js.Promise[Unit],
      setQuery: String => Callback
    ): SearchElement = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], handleSubmit = js.Any.fromFunction1((t0: QueryString) => handleSubmit(t0).runNow()), hasError = hasError.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onFocus = onFocus.toJsFn, onInput = onInput.toJsFn, onKeyPress = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyPress(t0).runNow()), onKeyUp = js.Any.fromFunction1((t0: KeyboardEvent) => onKeyUp(t0).runNow()), onSubmit = js.Any.fromFunction1(onSubmit), setQuery = js.Any.fromFunction1((t0: String) => setQuery(t0).runNow()))
      __obj.asInstanceOf[SearchElement]
    }
    
    extension [Self <: SearchElement](x: Self) {
      
      inline def setContainer(value: HTMLDivElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setForm(value: HTMLFormElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setHandleSubmit(value: QueryString => Callback): Self = StObject.set(x, "handleSubmit", js.Any.fromFunction1((t0: QueryString) => value(t0).runNow()))
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setInput(value: HTMLInputElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setOnInput(value: Callback): Self = StObject.set(x, "onInput", value.toJsFn)
      
      inline def setOnKeyPress(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnKeyUp(value: KeyboardEvent => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
      
      inline def setOnSubmit(value: Event => js.Promise[Unit]): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setSetQuery(value: String => Callback): Self = StObject.set(x, "setQuery", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait SearchElementProps extends StObject {
    
    var classNames: js.UndefOr[Container] = js.undefined
    
    def handleSubmit(args: QueryString): Unit
    
    var searchLabel: js.UndefOr[String] = js.undefined
  }
  object SearchElementProps {
    
    inline def apply(handleSubmit: QueryString => Callback): SearchElementProps = {
      val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction1((t0: QueryString) => handleSubmit(t0).runNow()))
      __obj.asInstanceOf[SearchElementProps]
    }
    
    extension [Self <: SearchElementProps](x: Self) {
      
      inline def setClassNames(value: Container): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      inline def setHandleSubmit(value: QueryString => Callback): Self = StObject.set(x, "handleSubmit", js.Any.fromFunction1((t0: QueryString) => value(t0).runNow()))
      
      inline def setSearchLabel(value: String): Self = StObject.set(x, "searchLabel", value.asInstanceOf[js.Any])
      
      inline def setSearchLabelUndefined: Self = StObject.set(x, "searchLabel", js.undefined)
    }
  }
}
