package typingsJapgolly.xsdSchemaValidator

import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.xsdSchemaValidator.anon.File
import typingsJapgolly.xsdSchemaValidator.anon.Messages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xsd-schema-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateXML(
    xml: String,
    pathToXsd: String,
    callback: js.Function2[/* err */ js.Error, /* result */ Messages, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateXML")(xml.asInstanceOf[js.Any], pathToXsd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateXML(
    xml: ReadableStream,
    pathToXsd: String,
    callback: js.Function2[/* err */ js.Error, /* result */ Messages, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateXML")(xml.asInstanceOf[js.Any], pathToXsd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateXML(
    xml: File,
    pathToXsd: String,
    callback: js.Function2[/* err */ js.Error, /* result */ Messages, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateXML")(xml.asInstanceOf[js.Any], pathToXsd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
