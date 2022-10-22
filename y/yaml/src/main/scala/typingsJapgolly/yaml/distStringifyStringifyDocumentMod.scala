package typingsJapgolly.yaml

import typingsJapgolly.yaml.anon.ReadonlyDocumentNodeunkno
import typingsJapgolly.yaml.distOptionsMod.ToStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyStringifyDocumentMod {
  
  @JSImport("yaml/dist/stringify/stringifyDocument", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyDocument(doc: ReadonlyDocumentNodeunkno, options: ToStringOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyDocument")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
