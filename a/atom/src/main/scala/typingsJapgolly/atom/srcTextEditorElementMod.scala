package typingsJapgolly.atom

import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.PointLike
import typingsJapgolly.atom.mod.Disposable
import typingsJapgolly.atom.mod.TextEditor
import typingsJapgolly.atom.srcOtherTypesMod.PixelPosition
import typingsJapgolly.atom.srcTextEditorComponentMod.TextEditorComponent
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTextEditorElementMod {
  
  @js.native
  trait TextEditorElement
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /** Extended: get the width of an `x` character displayed in this element. */
    def getBaseCharacterWidth(): Double = js.native
    
    def getComponent(): TextEditorComponent = js.native
    
    def getModel(): TextEditor = js.native
    
    /**
      * Extended: Get a promise that resolves the next time the element's
      * DOM is updated in any way.
      */
    def getNextUpdatePromise(): js.Promise[Unit] = js.native
    
    def getScrollHeight(): Double = js.native
    
    def getScrollLeft(): Double = js.native
    
    def getScrollTop(): Double = js.native
    
    def hasFocus(): Boolean = js.native
    
    /** Called when the editor is attached to the DOM. */
    def onDidAttach(callback: js.Function0[Unit]): Disposable = js.native
    
    def onDidChangeScrollLeft(callback: js.Function1[/* scrollLeft */ Double, Unit]): Disposable = js.native
    
    // Event subscription
    def onDidChangeScrollTop(callback: js.Function1[/* scrollTop */ Double, Unit]): Disposable = js.native
    
    /** Called when the editor is detached from the DOM. */
    def onDidDetach(callback: js.Function0[Unit]): Disposable = js.native
    
    /** Extended: Converts a buffer position to a pixel position. */
    def pixelPositionForBufferPosition(bufferPosition: PointLike): PixelPosition = js.native
    
    /** Extended: Converts a screen position to a pixel position. */
    def pixelPositionForScreenPosition(screenPosition: PointLike): PixelPosition = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /** Essential: Scrolls the editor to the bottom. */
    def scrollToBottom(): Unit = js.native
    
    /** Essential: Scrolls the editor to the top. */
    def scrollToTop(): Unit = js.native
    
    def setScrollLeft(scrollLeft: Double): Unit = js.native
    
    def setScrollTop(scrollTop: Double): Unit = js.native
  }
}
