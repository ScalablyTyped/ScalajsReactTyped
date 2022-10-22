package typingsJapgolly.activexLibreoffice.com_.sun.star.xml

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xforms.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.XNode
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.XNodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xpath {
  
  trait Libxml2ExtensionHandle extends StObject {
    
    var functionData: Double
    
    var functionLookupFunction: Double
    
    var variableData: Double
    
    var variableLookupFunction: Double
  }
  object Libxml2ExtensionHandle {
    
    inline def apply(
      functionData: Double,
      functionLookupFunction: Double,
      variableData: Double,
      variableLookupFunction: Double
    ): Libxml2ExtensionHandle = {
      val __obj = js.Dynamic.literal(functionData = functionData.asInstanceOf[js.Any], functionLookupFunction = functionLookupFunction.asInstanceOf[js.Any], variableData = variableData.asInstanceOf[js.Any], variableLookupFunction = variableLookupFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[Libxml2ExtensionHandle]
    }
    
    extension [Self <: Libxml2ExtensionHandle](x: Self) {
      
      inline def setFunctionData(value: Double): Self = StObject.set(x, "functionData", value.asInstanceOf[js.Any])
      
      inline def setFunctionLookupFunction(value: Double): Self = StObject.set(x, "functionLookupFunction", value.asInstanceOf[js.Any])
      
      inline def setVariableData(value: Double): Self = StObject.set(x, "variableData", value.asInstanceOf[js.Any])
      
      inline def setVariableLookupFunction(value: Double): Self = StObject.set(x, "variableLookupFunction", value.asInstanceOf[js.Any])
    }
  }
  
  type XPathAPI = XXPathAPI
  
  /**
    * Exception that may occur when evaluating an XPath expression.
    * @see XXPathAPI
    * @since OOo 3.0
    */
  type XPathException = Exception
  
  trait XPathExtension
    extends StObject
       with XXPathExtension {
    
    def createWithModel(Model: XModel, ContextNode: XNode): Unit
  }
  object XPathExtension {
    
    inline def apply(
      Libxml2ExtensionHandle: Libxml2ExtensionHandle,
      acquire: Callback,
      createWithModel: (XModel, XNode) => Callback,
      getLibxml2ExtensionHandle: CallbackTo[Libxml2ExtensionHandle],
      queryInterface: `type` => Any,
      release: Callback
    ): XPathExtension = {
      val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle.asInstanceOf[js.Any], acquire = acquire.toJsFn, createWithModel = js.Any.fromFunction2((t0: XModel, t1: XNode) => (createWithModel(t0, t1)).runNow()), getLibxml2ExtensionHandle = getLibxml2ExtensionHandle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XPathExtension]
    }
    
    extension [Self <: XPathExtension](x: Self) {
      
      inline def setCreateWithModel(value: (XModel, XNode) => Callback): Self = StObject.set(x, "createWithModel", js.Any.fromFunction2((t0: XModel, t1: XNode) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
  */
  trait XPathObjectType extends StObject
  object XPathObjectType {
    
    inline def XPATH_BOOLEAN: `2` = 2.asInstanceOf[`2`]
    
    inline def XPATH_LOCATIONSET: `7` = 7.asInstanceOf[`7`]
    
    inline def XPATH_NODESET: `1` = 1.asInstanceOf[`1`]
    
    inline def XPATH_NUMBER: `3` = 3.asInstanceOf[`3`]
    
    inline def XPATH_POINT: `5` = 5.asInstanceOf[`5`]
    
    inline def XPATH_RANGE: `6` = 6.asInstanceOf[`6`]
    
    inline def XPATH_STRING: `4` = 4.asInstanceOf[`4`]
    
    inline def XPATH_UNDEFINED: `0` = 0.asInstanceOf[`0`]
    
    inline def XPATH_USERS: `8` = 8.asInstanceOf[`8`]
    
    inline def XPATH_XSLT_TREE: `9` = 9.asInstanceOf[`9`]
  }
  
  trait XXPathAPI
    extends StObject
       with XInterface {
    
    /**
      * Evaluate XPath Expression.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @returns an object representing the result of the XPath evaluation
      * @see XXPathObject
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def eval(contextNode: XNode, expr: String): XXPathObject
    
    /**
      * Evaluate XPath Expression.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @param namespaceNode all namespaces declared on this node will be registered
      * @returns an object representing the result of the XPath evaluation
      * @see XXPathObject
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def evalNS(contextNode: XNode, expr: String, namespaceNode: XNode): XXPathObject
    
    def registerExtension(serviceName: String): Unit
    
    def registerExtensionInstance(aExtension: XXPathExtension): Unit
    
    def registerNS(prefix: String, url: String): Unit
    
    /**
      * Evaluate an XPath expression to select a list of nodes.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @returns result of the XPath evaluation: a list of nodes
      * @see XNodeList
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectNodeList(contextNode: XNode, expr: String): XNodeList
    
    /**
      * Evaluate an XPath expression to select a list of nodes.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @param namespaceNode all namespaces declared on this node will be registered
      * @returns result of the XPath evaluation: a list of nodes
      * @see XNodeList
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectNodeListNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNodeList
    
    /**
      * Evaluate an XPath expression to select a single node.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @returns result of the XPath evaluation: a single node
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectSingleNode(contextNode: XNode, expr: String): XNode
    
    /**
      * Evaluate an XPath expression to select a single node.
      * @param contextNode the context node (expression is relative to this node)
      * @param expr the XPath expression
      * @param namespaceNode all namespaces declared on this node will be registered
      * @returns result of the XPath evaluation: a single node
      * @throws XPathException if the expression is malformed, or evaluation fails
      */
    def selectSingleNodeNS(contextNode: XNode, expr: String, namespaceNode: XNode): XNode
    
    def unregisterNS(prefix: String, url: String): Unit
  }
  object XXPathAPI {
    
    inline def apply(
      acquire: Callback,
      eval: (XNode, String) => XXPathObject,
      evalNS: (XNode, String, XNode) => XXPathObject,
      queryInterface: `type` => Any,
      registerExtension: String => Callback,
      registerExtensionInstance: XXPathExtension => Callback,
      registerNS: (String, String) => Callback,
      release: Callback,
      selectNodeList: (XNode, String) => XNodeList,
      selectNodeListNS: (XNode, String, XNode) => XNodeList,
      selectSingleNode: (XNode, String) => XNode,
      selectSingleNodeNS: (XNode, String, XNode) => XNode,
      unregisterNS: (String, String) => Callback
    ): XXPathAPI = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, eval = js.Any.fromFunction2(eval), evalNS = js.Any.fromFunction3(evalNS), queryInterface = js.Any.fromFunction1(queryInterface), registerExtension = js.Any.fromFunction1((t0: String) => registerExtension(t0).runNow()), registerExtensionInstance = js.Any.fromFunction1((t0: XXPathExtension) => registerExtensionInstance(t0).runNow()), registerNS = js.Any.fromFunction2((t0: String, t1: String) => (registerNS(t0, t1)).runNow()), release = release.toJsFn, selectNodeList = js.Any.fromFunction2(selectNodeList), selectNodeListNS = js.Any.fromFunction3(selectNodeListNS), selectSingleNode = js.Any.fromFunction2(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction3(selectSingleNodeNS), unregisterNS = js.Any.fromFunction2((t0: String, t1: String) => (unregisterNS(t0, t1)).runNow()))
      __obj.asInstanceOf[XXPathAPI]
    }
    
    extension [Self <: XXPathAPI](x: Self) {
      
      inline def setEval(value: (XNode, String) => XXPathObject): Self = StObject.set(x, "eval", js.Any.fromFunction2(value))
      
      inline def setEvalNS(value: (XNode, String, XNode) => XXPathObject): Self = StObject.set(x, "evalNS", js.Any.fromFunction3(value))
      
      inline def setRegisterExtension(value: String => Callback): Self = StObject.set(x, "registerExtension", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRegisterExtensionInstance(value: XXPathExtension => Callback): Self = StObject.set(x, "registerExtensionInstance", js.Any.fromFunction1((t0: XXPathExtension) => value(t0).runNow()))
      
      inline def setRegisterNS(value: (String, String) => Callback): Self = StObject.set(x, "registerNS", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setSelectNodeList(value: (XNode, String) => XNodeList): Self = StObject.set(x, "selectNodeList", js.Any.fromFunction2(value))
      
      inline def setSelectNodeListNS(value: (XNode, String, XNode) => XNodeList): Self = StObject.set(x, "selectNodeListNS", js.Any.fromFunction3(value))
      
      inline def setSelectSingleNode(value: (XNode, String) => XNode): Self = StObject.set(x, "selectSingleNode", js.Any.fromFunction2(value))
      
      inline def setSelectSingleNodeNS(value: (XNode, String, XNode) => XNode): Self = StObject.set(x, "selectSingleNodeNS", js.Any.fromFunction3(value))
      
      inline def setUnregisterNS(value: (String, String) => Callback): Self = StObject.set(x, "unregisterNS", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  trait XXPathExtension
    extends StObject
       with XInterface {
    
    val Libxml2ExtensionHandle: typingsJapgolly.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle
    
    def getLibxml2ExtensionHandle(): typingsJapgolly.activexLibreoffice.com_.sun.star.xml.xpath.Libxml2ExtensionHandle
  }
  object XXPathExtension {
    
    inline def apply(
      Libxml2ExtensionHandle: Libxml2ExtensionHandle,
      acquire: Callback,
      getLibxml2ExtensionHandle: CallbackTo[Libxml2ExtensionHandle],
      queryInterface: `type` => Any,
      release: Callback
    ): XXPathExtension = {
      val __obj = js.Dynamic.literal(Libxml2ExtensionHandle = Libxml2ExtensionHandle.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLibxml2ExtensionHandle = getLibxml2ExtensionHandle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XXPathExtension]
    }
    
    extension [Self <: XXPathExtension](x: Self) {
      
      inline def setGetLibxml2ExtensionHandle(value: CallbackTo[Libxml2ExtensionHandle]): Self = StObject.set(x, "getLibxml2ExtensionHandle", value.toJsFn)
      
      inline def setLibxml2ExtensionHandle(value: Libxml2ExtensionHandle): Self = StObject.set(x, "Libxml2ExtensionHandle", value.asInstanceOf[js.Any])
    }
  }
  
  trait XXPathObject
    extends StObject
       with XInterface {
    
    /** get value of a boolean object */
    val Boolean: scala.Boolean
    
    /** get number as byte */
    val Byte: scala.Double
    
    /** get number as double */
    val Double: scala.Double
    
    /** get number as float */
    val Float: scala.Double
    
    /** get number as hyper */
    val Hyper: scala.Double
    
    /** get number as long */
    val Long: scala.Double
    
    /** get the nodes from a node list type object */
    val NodeList: XNodeList
    
    /** get object type */
    val ObjectType: XPathObjectType
    
    /** get number as short */
    val Short: scala.Double
    
    /** get string value */
    val String: java.lang.String
    
    /** get value of a boolean object */
    def getBoolean(): scala.Boolean
    
    /** get number as byte */
    def getByte(): scala.Double
    
    /** get number as double */
    def getDouble(): scala.Double
    
    /** get number as float */
    def getFloat(): scala.Double
    
    /** get number as hyper */
    def getHyper(): scala.Double
    
    /** get number as long */
    def getLong(): scala.Double
    
    /** get the nodes from a node list type object */
    def getNodeList(): XNodeList
    
    /** get object type */
    def getObjectType(): XPathObjectType
    
    /** get number as short */
    def getShort(): scala.Double
    
    /** get string value */
    def getString(): java.lang.String
  }
  object XXPathObject {
    
    inline def apply(
      Boolean: Boolean,
      Byte: Double,
      Double: Double,
      Float: Double,
      Hyper: Double,
      Long: Double,
      NodeList: XNodeList,
      ObjectType: XPathObjectType,
      Short: Double,
      String: String,
      acquire: Callback,
      getBoolean: CallbackTo[Boolean],
      getByte: CallbackTo[Double],
      getDouble: CallbackTo[Double],
      getFloat: CallbackTo[Double],
      getHyper: CallbackTo[Double],
      getLong: CallbackTo[Double],
      getNodeList: CallbackTo[XNodeList],
      getObjectType: CallbackTo[XPathObjectType],
      getShort: CallbackTo[Double],
      getString: CallbackTo[String],
      queryInterface: `type` => Any,
      release: Callback
    ): XXPathObject = {
      val __obj = js.Dynamic.literal(Boolean = Boolean.asInstanceOf[js.Any], Byte = Byte.asInstanceOf[js.Any], Double = Double.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Hyper = Hyper.asInstanceOf[js.Any], Long = Long.asInstanceOf[js.Any], NodeList = NodeList.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Short = Short.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBoolean = getBoolean.toJsFn, getByte = getByte.toJsFn, getDouble = getDouble.toJsFn, getFloat = getFloat.toJsFn, getHyper = getHyper.toJsFn, getLong = getLong.toJsFn, getNodeList = getNodeList.toJsFn, getObjectType = getObjectType.toJsFn, getShort = getShort.toJsFn, getString = getString.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XXPathObject]
    }
    
    extension [Self <: XXPathObject](x: Self) {
      
      inline def setBoolean(value: Boolean): Self = StObject.set(x, "Boolean", value.asInstanceOf[js.Any])
      
      inline def setByte(value: Double): Self = StObject.set(x, "Byte", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: Double): Self = StObject.set(x, "Double", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Double): Self = StObject.set(x, "Float", value.asInstanceOf[js.Any])
      
      inline def setGetBoolean(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBoolean", value.toJsFn)
      
      inline def setGetByte(value: CallbackTo[Double]): Self = StObject.set(x, "getByte", value.toJsFn)
      
      inline def setGetDouble(value: CallbackTo[Double]): Self = StObject.set(x, "getDouble", value.toJsFn)
      
      inline def setGetFloat(value: CallbackTo[Double]): Self = StObject.set(x, "getFloat", value.toJsFn)
      
      inline def setGetHyper(value: CallbackTo[Double]): Self = StObject.set(x, "getHyper", value.toJsFn)
      
      inline def setGetLong(value: CallbackTo[Double]): Self = StObject.set(x, "getLong", value.toJsFn)
      
      inline def setGetNodeList(value: CallbackTo[XNodeList]): Self = StObject.set(x, "getNodeList", value.toJsFn)
      
      inline def setGetObjectType(value: CallbackTo[XPathObjectType]): Self = StObject.set(x, "getObjectType", value.toJsFn)
      
      inline def setGetShort(value: CallbackTo[Double]): Self = StObject.set(x, "getShort", value.toJsFn)
      
      inline def setGetString(value: CallbackTo[String]): Self = StObject.set(x, "getString", value.toJsFn)
      
      inline def setHyper(value: Double): Self = StObject.set(x, "Hyper", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Double): Self = StObject.set(x, "Long", value.asInstanceOf[js.Any])
      
      inline def setNodeList(value: XNodeList): Self = StObject.set(x, "NodeList", value.asInstanceOf[js.Any])
      
      inline def setObjectType(value: XPathObjectType): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "Short", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    }
  }
}
