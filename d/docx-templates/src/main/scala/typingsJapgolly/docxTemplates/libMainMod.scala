package typingsJapgolly.docxTemplates

import typingsJapgolly.docxTemplates.anon.Category
import typingsJapgolly.docxTemplates.anon.ContentTypes
import typingsJapgolly.docxTemplates.docxTemplatesStrings.JS
import typingsJapgolly.docxTemplates.docxTemplatesStrings.XML
import typingsJapgolly.docxTemplates.libTypesMod.CommandSummary
import typingsJapgolly.docxTemplates.libTypesMod.Node
import typingsJapgolly.docxTemplates.libTypesMod.NonTextNode
import typingsJapgolly.docxTemplates.libTypesMod.UserOptions
import typingsJapgolly.jszip.mod.JSZip
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMainMod {
  
  @JSImport("docx-templates/lib/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * const report = await createReport({
    *   template,
    *   data: query => graphqlServer.execute(query),
    *   additionalJsContext: {
    *     // all of these will be available to JS snippets in your template commands
    *     foo: 'bar',
    *     qrCode: async url => {
    *       // do stuff
    *     },
    *   },
    *   cmdDelimiter: '+++',
    *   literalXmlDelimiter: '||',
    *   processLineBreaks: true,
    *   noSandbox: false,
    * });
    * ```
    *
    * @param options Options for Report
    */
  inline def default(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getMainDoc(contentTypes: NonTextNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainDoc")(contentTypes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getMetadata(template: Buffer): js.Promise[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Category]]
  
  inline def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  inline def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  inline def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  
  inline def parseTemplate(template: Buffer): js.Promise[ContentTypes] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ContentTypes]]
  
  inline def readContentTypes(zip: JSZip): js.Promise[NonTextNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("readContentTypes")(zip.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NonTextNode]]
}
