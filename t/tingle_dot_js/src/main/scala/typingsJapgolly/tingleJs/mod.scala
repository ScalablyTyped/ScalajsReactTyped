package typingsJapgolly.tingleJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tingle.js", "modal")
  @js.native
  open class modal () extends StObject {
    def this(options: Options) = this()
    
    def addFooterBtn(label: String): HTMLButtonElement = js.native
    def addFooterBtn(label: String, cssClass: String): HTMLButtonElement = js.native
    def addFooterBtn(
      label: String,
      cssClass: String,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]
    ): HTMLButtonElement = js.native
    def addFooterBtn(
      label: String,
      cssClass: Unit,
      listener: js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, Any]
    ): HTMLButtonElement = js.native
    
    def checkOverflow(): Unit = js.native
    
    def close(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getContent(): HTMLDivElement = js.native
    
    def getFooterContent(): js.UndefOr[HTMLDivElement] = js.native
    
    def isOpen(): Boolean = js.native
    
    def isOverflow(): Boolean = js.native
    
    def open(): Unit = js.native
    
    def setContent(content: String): Unit = js.native
    def setContent(content: Node): Unit = js.native
    
    def setFooterContent(content: String): Unit = js.native
    
    def setStickyFooter(sticky: Boolean): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var beforeClose: js.UndefOr[js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]] = js.undefined
    
    var beforeOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var closeLabel: js.UndefOr[String] = js.undefined
    
    var closeMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var cssClass: js.UndefOr[js.Array[String]] = js.undefined
    
    var footer: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.ThisFunction0[/* this */ modal, Unit]] = js.undefined
    
    var stickyFooter: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBeforeClose(value: js.ThisFunction0[/* this */ modal, js.UndefOr[Boolean]]): Self = StObject.set(x, "beforeClose", value.asInstanceOf[js.Any])
      
      inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      inline def setBeforeOpen(value: Callback): Self = StObject.set(x, "beforeOpen", value.toJsFn)
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
      
      inline def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
      
      inline def setCloseMethods(value: js.Array[String]): Self = StObject.set(x, "closeMethods", value.asInstanceOf[js.Any])
      
      inline def setCloseMethodsUndefined: Self = StObject.set(x, "closeMethods", js.undefined)
      
      inline def setCloseMethodsVarargs(value: String*): Self = StObject.set(x, "closeMethods", js.Array(value*))
      
      inline def setCssClass(value: js.Array[String]): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCssClassVarargs(value: String*): Self = StObject.set(x, "cssClass", js.Array(value*))
      
      inline def setFooter(value: Boolean): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setOnClose(value: js.ThisFunction0[/* this */ modal, Unit]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: js.ThisFunction0[/* this */ modal, Unit]): Self = StObject.set(x, "onOpen", value.asInstanceOf[js.Any])
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setStickyFooter(value: Boolean): Self = StObject.set(x, "stickyFooter", value.asInstanceOf[js.Any])
      
      inline def setStickyFooterUndefined: Self = StObject.set(x, "stickyFooter", js.undefined)
    }
  }
}
