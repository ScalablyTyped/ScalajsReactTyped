package typingsJapgolly.activexLibreoffice.com_.sun.star.xml

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XUnoTunnel
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrapper {
  
  /** Service of {@link XMLDocumentWrapper} */
  trait XMLDocumentWrapper
    extends StObject
       with XXMLDocumentWrapper
       with XInitialization
  object XMLDocumentWrapper {
    
    inline def apply(
      CurrentElement: XXMLElementWrapper,
      acquire: Callback,
      clearUselessData: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Callback,
      collapse: XXMLElementWrapper => Callback,
      generateSAXEvents: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Callback,
      getCurrentElement: CallbackTo[XXMLElementWrapper],
      getNodeName: XXMLElementWrapper => String,
      getTree: XDocumentHandler => Callback,
      initialize: SeqEquiv[Any] => Callback,
      isCurrent: XXMLElementWrapper => Boolean,
      isCurrentElementEmpty: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      rebuildIDLink: XXMLElementWrapper => Callback,
      release: Callback,
      removeCurrentElement: Callback,
      setCurrentElement: XXMLElementWrapper => Callback
    ): XMLDocumentWrapper = {
      val __obj = js.Dynamic.literal(CurrentElement = CurrentElement.asInstanceOf[js.Any], acquire = acquire.toJsFn, clearUselessData = js.Any.fromFunction3((t0: XXMLElementWrapper, t1: SeqEquiv[XXMLElementWrapper], t2: XXMLElementWrapper) => (clearUselessData(t0, t1, t2)).runNow()), collapse = js.Any.fromFunction1((t0: XXMLElementWrapper) => collapse(t0).runNow()), generateSAXEvents = js.Any.fromFunction4((t0: XDocumentHandler, t1: XDocumentHandler, t2: XXMLElementWrapper, t3: XXMLElementWrapper) => (generateSAXEvents(t0, t1, t2, t3)).runNow()), getCurrentElement = getCurrentElement.toJsFn, getNodeName = js.Any.fromFunction1(getNodeName), getTree = js.Any.fromFunction1((t0: XDocumentHandler) => getTree(t0).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), isCurrent = js.Any.fromFunction1(isCurrent), isCurrentElementEmpty = isCurrentElementEmpty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rebuildIDLink = js.Any.fromFunction1((t0: XXMLElementWrapper) => rebuildIDLink(t0).runNow()), release = release.toJsFn, removeCurrentElement = removeCurrentElement.toJsFn, setCurrentElement = js.Any.fromFunction1((t0: XXMLElementWrapper) => setCurrentElement(t0).runNow()))
      __obj.asInstanceOf[XMLDocumentWrapper]
    }
  }
  
  /** Service of {@link XMLElementWrapper} */
  trait XMLElementWrapper
    extends StObject
       with XUnoTunnel
       with XInitialization
  object XMLElementWrapper {
    
    inline def apply(
      acquire: Callback,
      getSomething: SeqEquiv[Double] => Double,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XMLElementWrapper = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getSomething = js.Any.fromFunction1(getSomething), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XMLElementWrapper]
    }
  }
  
  /**
    * Interface of XML Document Wrapper.
    *
    * When converting SAX events into a DOM tree, this interface is used to manipulate the DOM data in UNO perspective.
    *
    * Every language has its own methods to manipulate its native DOM data structure, this interface provides a common method set which each language have
    * to implement.
    *
    * In another word, this interface wraps language dependent methods, then other component can manipulate DOM data through UNO methods.
    */
  trait XXMLDocumentWrapper
    extends StObject
       with XInterface {
    
    /**
      * Gets the current element.
      * @returns the current element in the SAX event stream
      */
    var CurrentElement: XXMLElementWrapper
    
    /**
      * Clears all useless element in a branch of the DOM tree along the tree order.
      * @param node the start point of the branch to clear
      * @param reservedDescendants an array including all elements that need to be reserved (along their ancestor path)
      * @param stopAtNode the stop element. The operation have to interrupt when this element is met during clearing
      */
    def clearUselessData(
      node: XXMLElementWrapper,
      reservedDescendants: SeqEquiv[XXMLElementWrapper],
      stopAtNode: XXMLElementWrapper
    ): Unit
    
    /**
      * Collapses a tree path
      *
      * Each element in the ancestor path of the node will be checked, if this element is empty, then deletes it.
      * @param node the start point of the path from where the tree path will be collapsed
      */
    def collapse(node: XXMLElementWrapper): Unit
    
    /**
      * Converts a part of the DOM tree into SAX events.
      * @param handler the document handler which will receive generated SAX events
      * @param saxEventKeeperHandler the SAXEventKeeper connecting with this XMLDocumentHandler
      * @param startNode the start point to generate SAX events
      * @param endNode the end point where to stop generating
      */
    def generateSAXEvents(
      handler: XDocumentHandler,
      saxEventKeeperHandler: XDocumentHandler,
      startNode: XXMLElementWrapper,
      endNode: XXMLElementWrapper
    ): Unit
    
    /**
      * Gets the current element.
      * @returns the current element in the SAX event stream
      */
    def getCurrentElement(): XXMLElementWrapper
    
    /**
      * Gets the name of the element.
      * @param node the element whose name will be gotten
      * @returns the name of the element
      */
    def getNodeName(node: XXMLElementWrapper): String
    
    /**
      * Converts the whole DOM tree into a SAX event stream.
      * @param handler the document handler which will receive the SAX event stream
      */
    def getTree(handler: XDocumentHandler): Unit
    
    /**
      * Checks whether an element is the current element.
      * @param node the element to be checked
      * @returns `true` if the node is the current element, `false` otherwise
      */
    def isCurrent(node: XXMLElementWrapper): Boolean
    
    /**
      * Checks whether the current element is empty.
      * @returns `true` if the current element is empty, `false` otherwise
      */
    def isCurrentElementEmpty(): Boolean
    
    /**
      * Rebuild the ID attribute in the branch starting from the particular element.
      * @param node the root element of the branch whose ID link will be built
      */
    def rebuildIDLink(node: XXMLElementWrapper): Unit
    
    /**
      * Removes the current element.
      *
      * When the current element is removed, then its parent element becomes the new current element.
      */
    def removeCurrentElement(): Unit
    
    /**
      * Sets the current element.
      *
      * When the current element is replaced outside of this interface, then uses this method can update the current element pointer.
      * @param element the new current element
      */
    def setCurrentElement(element: XXMLElementWrapper): Unit
  }
  object XXMLDocumentWrapper {
    
    inline def apply(
      CurrentElement: XXMLElementWrapper,
      acquire: Callback,
      clearUselessData: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Callback,
      collapse: XXMLElementWrapper => Callback,
      generateSAXEvents: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Callback,
      getCurrentElement: CallbackTo[XXMLElementWrapper],
      getNodeName: XXMLElementWrapper => String,
      getTree: XDocumentHandler => Callback,
      isCurrent: XXMLElementWrapper => Boolean,
      isCurrentElementEmpty: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      rebuildIDLink: XXMLElementWrapper => Callback,
      release: Callback,
      removeCurrentElement: Callback,
      setCurrentElement: XXMLElementWrapper => Callback
    ): XXMLDocumentWrapper = {
      val __obj = js.Dynamic.literal(CurrentElement = CurrentElement.asInstanceOf[js.Any], acquire = acquire.toJsFn, clearUselessData = js.Any.fromFunction3((t0: XXMLElementWrapper, t1: SeqEquiv[XXMLElementWrapper], t2: XXMLElementWrapper) => (clearUselessData(t0, t1, t2)).runNow()), collapse = js.Any.fromFunction1((t0: XXMLElementWrapper) => collapse(t0).runNow()), generateSAXEvents = js.Any.fromFunction4((t0: XDocumentHandler, t1: XDocumentHandler, t2: XXMLElementWrapper, t3: XXMLElementWrapper) => (generateSAXEvents(t0, t1, t2, t3)).runNow()), getCurrentElement = getCurrentElement.toJsFn, getNodeName = js.Any.fromFunction1(getNodeName), getTree = js.Any.fromFunction1((t0: XDocumentHandler) => getTree(t0).runNow()), isCurrent = js.Any.fromFunction1(isCurrent), isCurrentElementEmpty = isCurrentElementEmpty.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rebuildIDLink = js.Any.fromFunction1((t0: XXMLElementWrapper) => rebuildIDLink(t0).runNow()), release = release.toJsFn, removeCurrentElement = removeCurrentElement.toJsFn, setCurrentElement = js.Any.fromFunction1((t0: XXMLElementWrapper) => setCurrentElement(t0).runNow()))
      __obj.asInstanceOf[XXMLDocumentWrapper]
    }
    
    extension [Self <: XXMLDocumentWrapper](x: Self) {
      
      inline def setClearUselessData(value: (XXMLElementWrapper, SeqEquiv[XXMLElementWrapper], XXMLElementWrapper) => Callback): Self = StObject.set(x, "clearUselessData", js.Any.fromFunction3((t0: XXMLElementWrapper, t1: SeqEquiv[XXMLElementWrapper], t2: XXMLElementWrapper) => (value(t0, t1, t2)).runNow()))
      
      inline def setCollapse(value: XXMLElementWrapper => Callback): Self = StObject.set(x, "collapse", js.Any.fromFunction1((t0: XXMLElementWrapper) => value(t0).runNow()))
      
      inline def setCurrentElement(value: XXMLElementWrapper): Self = StObject.set(x, "CurrentElement", value.asInstanceOf[js.Any])
      
      inline def setGenerateSAXEvents(value: (XDocumentHandler, XDocumentHandler, XXMLElementWrapper, XXMLElementWrapper) => Callback): Self = StObject.set(x, "generateSAXEvents", js.Any.fromFunction4((t0: XDocumentHandler, t1: XDocumentHandler, t2: XXMLElementWrapper, t3: XXMLElementWrapper) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setGetCurrentElement(value: CallbackTo[XXMLElementWrapper]): Self = StObject.set(x, "getCurrentElement", value.toJsFn)
      
      inline def setGetNodeName(value: XXMLElementWrapper => String): Self = StObject.set(x, "getNodeName", js.Any.fromFunction1(value))
      
      inline def setGetTree(value: XDocumentHandler => Callback): Self = StObject.set(x, "getTree", js.Any.fromFunction1((t0: XDocumentHandler) => value(t0).runNow()))
      
      inline def setIsCurrent(value: XXMLElementWrapper => Boolean): Self = StObject.set(x, "isCurrent", js.Any.fromFunction1(value))
      
      inline def setIsCurrentElementEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCurrentElementEmpty", value.toJsFn)
      
      inline def setRebuildIDLink(value: XXMLElementWrapper => Callback): Self = StObject.set(x, "rebuildIDLink", js.Any.fromFunction1((t0: XXMLElementWrapper) => value(t0).runNow()))
      
      inline def setRemoveCurrentElement(value: Callback): Self = StObject.set(x, "removeCurrentElement", value.toJsFn)
      
      inline def setSetCurrentElement(value: XXMLElementWrapper => Callback): Self = StObject.set(x, "setCurrentElement", js.Any.fromFunction1((t0: XXMLElementWrapper) => value(t0).runNow()))
    }
  }
  
  /**
    * Interface of XML Element Wrapper.
    *
    * This interface is used to wrap a element information, which make it enable to transfer the element information between different languages, such as
    * C++/Java.
    */
  type XXMLElementWrapper = XInterface
}
