package typingsJapgolly.insertCss

import org.scalajs.dom.CSSStyleSheet
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("insert-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def insertCss(css: String): InsertCssStyleElement = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCss")(css.asInstanceOf[js.Any]).asInstanceOf[InsertCssStyleElement]
  inline def insertCss(css: String, options: InsertCssOptions): InsertCssStyleElement = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCss")(css.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[InsertCssStyleElement]
  
  trait InsertCssOptions extends StObject {
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var prepend: js.UndefOr[Boolean] = js.undefined
  }
  object InsertCssOptions {
    
    inline def apply(): InsertCssOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InsertCssOptions]
    }
    
    extension [Self <: InsertCssOptions](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
  
  @js.native
  trait InsertCssStyleElement
    extends StObject
       with HTMLStyleElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var styleSheet: js.UndefOr[CSSStyleSheet] = js.native
  }
}
