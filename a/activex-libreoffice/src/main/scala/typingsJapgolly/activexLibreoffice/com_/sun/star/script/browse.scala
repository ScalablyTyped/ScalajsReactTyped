package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XIntrospectionAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browse {
  
  /**
    * This service provides access to the Macros and Macro containers via the {@link XBrowseNode} interface. {@link XInvocation} is an optional interface
    * that is used to execute macros, or to create/delete/rename macros or macro containers.
    * @since OOo 2.0
    */
  trait BrowseNode
    extends StObject
       with XBrowseNode
       with XInvocation
  object BrowseNode {
    
    inline def apply(
      ChildNodes: SafeArray[XBrowseNode],
      Introspection: XIntrospectionAccess,
      Name: String,
      Type: Double,
      acquire: Callback,
      getChildNodes: CallbackTo[SafeArray[XBrowseNode]],
      getIntrospection: CallbackTo[XIntrospectionAccess],
      getName: CallbackTo[String],
      getType: CallbackTo[Double],
      getValue: String => Any,
      hasChildNodes: CallbackTo[Boolean],
      hasMethod: String => Boolean,
      hasProperty: String => Boolean,
      invoke: (String, SeqEquiv[Any], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[Any]]) => Any,
      queryInterface: `type` => Any,
      release: Callback,
      setValue: (String, Any) => Callback
    ): BrowseNode = {
      val __obj = js.Dynamic.literal(ChildNodes = ChildNodes.asInstanceOf[js.Any], Introspection = Introspection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getChildNodes = getChildNodes.toJsFn, getIntrospection = getIntrospection.toJsFn, getName = getName.toJsFn, getType = getType.toJsFn, getValue = js.Any.fromFunction1(getValue), hasChildNodes = hasChildNodes.toJsFn, hasMethod = js.Any.fromFunction1(hasMethod), hasProperty = js.Any.fromFunction1(hasProperty), invoke = js.Any.fromFunction4(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setValue = js.Any.fromFunction2((t0: String, t1: Any) => (setValue(t0, t1)).runNow()))
      __obj.asInstanceOf[BrowseNode]
    }
  }
  
  /**
    * This service is used to create Root XBrowseNodes.
    * @deprecated Deprecateduse the singleton theBrowseNodeFactory
    * @since OOo 2.0
    */
  type BrowseNodeFactory = XBrowseNodeFactory
  
  object BrowseNodeFactoryViewTypes {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def MACROORGANIZER: `1` = 1.asInstanceOf[`1`]
      
      inline def MACROSELECTOR: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  object BrowseNodeTypes {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def CONTAINER: `1` = 1.asInstanceOf[`1`]
      
      inline def ROOT: `2` = 2.asInstanceOf[`2`]
      
      inline def SCRIPT: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /**
    * This interface represents a node in the hierarchy used to browse available scripts. Objects implementing this interface are expected to also implement
    * {@link com.sun.star.beans.XPropertySet} and, optionally, {@link com.sun.star.script.XInvocation} (see the Developer's Guide for more details).
    */
  trait XBrowseNode
    extends StObject
       with XInterface {
    
    /**
      * Get the children of this node
      * @returns sequence of child nodes
      */
    val ChildNodes: SafeArray[XBrowseNode]
    
    /**
      * Get the name of the node
      * @returns The `string` name of this node
      */
    val Name: String
    
    /**
      * the type of the node.
      * @returns A `short` representing the type of this node.
      */
    val Type: Double
    
    /**
      * Get the children of this node
      * @returns sequence of child nodes
      */
    def getChildNodes(): SafeArray[XBrowseNode]
    
    /**
      * Get the name of the node
      * @returns The `string` name of this node
      */
    def getName(): String
    
    /**
      * the type of the node.
      * @returns A `short` representing the type of this node.
      */
    def getType(): Double
    
    /**
      * Indicates if this node contains any children
      * @returns `boolean` true if there are child nodes.
      */
    def hasChildNodes(): Boolean
  }
  object XBrowseNode {
    
    inline def apply(
      ChildNodes: SafeArray[XBrowseNode],
      Name: String,
      Type: Double,
      acquire: Callback,
      getChildNodes: CallbackTo[SafeArray[XBrowseNode]],
      getName: CallbackTo[String],
      getType: CallbackTo[Double],
      hasChildNodes: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback
    ): XBrowseNode = {
      val __obj = js.Dynamic.literal(ChildNodes = ChildNodes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getChildNodes = getChildNodes.toJsFn, getName = getName.toJsFn, getType = getType.toJsFn, hasChildNodes = hasChildNodes.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XBrowseNode]
    }
    
    extension [Self <: XBrowseNode](x: Self) {
      
      inline def setChildNodes(value: SafeArray[XBrowseNode]): Self = StObject.set(x, "ChildNodes", value.asInstanceOf[js.Any])
      
      inline def setGetChildNodes(value: CallbackTo[SafeArray[XBrowseNode]]): Self = StObject.set(x, "getChildNodes", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setHasChildNodes(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasChildNodes", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  /** This interface provides a factory for obtaining objects implementing the {@link XBrowseNode} interface. */
  trait XBrowseNodeFactory
    extends StObject
       with XInterface {
    
    /**
      * a factory method for the creation of XBrowseNodes ( view ) {@link com.sun.star.script.browse.BrowseNodeFactoryViewTypes} specifies the type of view to
      * be returned
      * @returns an object implementing {@link com.sun.star.script.browse.XBrowseNode}
      */
    def createView(viewType: Double): XBrowseNode
  }
  object XBrowseNodeFactory {
    
    inline def apply(
      acquire: Callback,
      createView: Double => XBrowseNode,
      queryInterface: `type` => Any,
      release: Callback
    ): XBrowseNodeFactory = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createView = js.Any.fromFunction1(createView), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XBrowseNodeFactory]
    }
    
    extension [Self <: XBrowseNodeFactory](x: Self) {
      
      inline def setCreateView(value: Double => XBrowseNode): Self = StObject.set(x, "createView", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The one and only {@link BrowseNodeFactory} .
    *
    * To get the singleton call getValueByName on the component context `; /singletons/com.sun.star.script.theBrowseNodeFactory; `
    * @since OOo 2.0
    */
  type theBrowseNodeFactory = XBrowseNodeFactory
}
