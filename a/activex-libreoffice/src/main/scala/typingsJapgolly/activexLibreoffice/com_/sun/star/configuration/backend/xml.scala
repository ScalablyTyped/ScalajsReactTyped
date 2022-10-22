package typingsJapgolly.activexLibreoffice.com_.sun.star.configuration.backend

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XActiveDataSink
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xml {
  
  /**
    * represents a configuration data layer that is stored in a stream in OOR {@link Update} XML format.
    *
    * The configuration layer XML from a given stream is parsed and fed to a {@link com.sun.star.configuration.backend.XLayerHandler} .
    * @see com.sun.star.configuration.backend.xml.SchemaParser Service that represents a configuration schema stored in XML.
    * @see com.sun.star.configuration.backend.xml.LayerWriter Service that writes OOR Update XML for data described via com.sun.star.configuration.backend.X
    * @since OOo 1.1.2
    */
  trait LayerParser
    extends StObject
       with XLayer
       with XActiveDataSink
       with XInitialization
  object LayerParser {
    
    inline def apply(
      InputStream: XInputStream,
      acquire: Callback,
      getInputStream: CallbackTo[XInputStream],
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      readData: XLayerHandler => Callback,
      release: Callback,
      setInputStream: XInputStream => Callback
    ): LayerParser = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInputStream = getInputStream.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1((t0: XLayerHandler) => readData(t0).runNow()), release = release.toJsFn, setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()))
      __obj.asInstanceOf[LayerParser]
    }
  }
  
  /**
    * can be used to parse a stream of configuration layer XML.
    *
    * The configuration layer data described to a {@link com.sun.star.configuration.backend.XLayerHandler} is written to a stream as OOR {@link Update} XML.
    * @see com.sun.star.configuration.backend.xml.LayerParser Service that parses configuration layer XML.
    * @since OOo 1.1.2
    */
  trait LayerWriter
    extends StObject
       with XLayerHandler
       with XActiveDataSource
       with XInitialization
  object LayerWriter {
    
    inline def apply(
      OutputStream: XOutputStream,
      acquire: Callback,
      addOrReplaceNode: (String, Double) => Callback,
      addOrReplaceNodeFromTemplate: (String, TemplateIdentifier, Double) => Callback,
      addProperty: (String, Double, `type`) => Callback,
      addPropertyWithValue: (String, Double, Any) => Callback,
      dropNode: String => Callback,
      endLayer: Callback,
      endNode: Callback,
      endProperty: Callback,
      getOutputStream: CallbackTo[XOutputStream],
      initialize: SeqEquiv[Any] => Callback,
      overrideNode: (String, Double, Boolean) => Callback,
      overrideProperty: (String, Double, `type`, Boolean) => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      setOutputStream: XOutputStream => Callback,
      setPropertyValue: Any => Callback,
      setPropertyValueForLocale: (Any, String) => Callback,
      startLayer: Callback
    ): LayerWriter = {
      val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, addOrReplaceNode = js.Any.fromFunction2((t0: String, t1: Double) => (addOrReplaceNode(t0, t1)).runNow()), addOrReplaceNodeFromTemplate = js.Any.fromFunction3((t0: String, t1: TemplateIdentifier, t2: Double) => (addOrReplaceNodeFromTemplate(t0, t1, t2)).runNow()), addProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: `type`) => (addProperty(t0, t1, t2)).runNow()), addPropertyWithValue = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addPropertyWithValue(t0, t1, t2)).runNow()), dropNode = js.Any.fromFunction1((t0: String) => dropNode(t0).runNow()), endLayer = endLayer.toJsFn, endNode = endNode.toJsFn, endProperty = endProperty.toJsFn, getOutputStream = getOutputStream.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), overrideNode = js.Any.fromFunction3((t0: String, t1: Double, t2: Boolean) => (overrideNode(t0, t1, t2)).runNow()), overrideProperty = js.Any.fromFunction4((t0: String, t1: Double, t2: `type`, t3: Boolean) => (overrideProperty(t0, t1, t2, t3)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setOutputStream = js.Any.fromFunction1((t0: XOutputStream) => setOutputStream(t0).runNow()), setPropertyValue = js.Any.fromFunction1((t0: Any) => setPropertyValue(t0).runNow()), setPropertyValueForLocale = js.Any.fromFunction2((t0: Any, t1: String) => (setPropertyValueForLocale(t0, t1)).runNow()), startLayer = startLayer.toJsFn)
      __obj.asInstanceOf[LayerWriter]
    }
  }
  
  /**
    * represents a configuration schema that is stored in a stream in OOR {@link Schema} XML format.
    *
    * The configuration schema XML from a given stream is parsed and fed to a {@link com.sun.star.configuration.backend.XSchemaHandler} .
    * @see com.sun.star.configuration.backend.xml.LayerParser Service that parses configuration layer XML.
    * @since OOo 1.1.2
    */
  trait SchemaParser
    extends StObject
       with XSchema
       with XActiveDataSink
       with XInitialization
  object SchemaParser {
    
    inline def apply(
      InputStream: XInputStream,
      acquire: Callback,
      getInputStream: CallbackTo[XInputStream],
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      readComponent: XSchemaHandler => Callback,
      readSchema: XSchemaHandler => Callback,
      readTemplates: XSchemaHandler => Callback,
      release: Callback,
      setInputStream: XInputStream => Callback
    ): SchemaParser = {
      val __obj = js.Dynamic.literal(InputStream = InputStream.asInstanceOf[js.Any], acquire = acquire.toJsFn, getInputStream = getInputStream.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), readComponent = js.Any.fromFunction1((t0: XSchemaHandler) => readComponent(t0).runNow()), readSchema = js.Any.fromFunction1((t0: XSchemaHandler) => readSchema(t0).runNow()), readTemplates = js.Any.fromFunction1((t0: XSchemaHandler) => readTemplates(t0).runNow()), release = release.toJsFn, setInputStream = js.Any.fromFunction1((t0: XInputStream) => setInputStream(t0).runNow()))
      __obj.asInstanceOf[SchemaParser]
    }
  }
}
