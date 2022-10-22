package typingsJapgolly.docxTemplates

import typingsJapgolly.docxTemplates.anon.Category
import typingsJapgolly.docxTemplates.docxTemplatesStrings.JS
import typingsJapgolly.docxTemplates.docxTemplatesStrings.XML
import typingsJapgolly.docxTemplates.libTypesMod.CommandSummary
import typingsJapgolly.docxTemplates.libTypesMod.Node
import typingsJapgolly.docxTemplates.libTypesMod.UserOptions
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("docx-templates", JSImport.Namespace)
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
  
  @JSImport("docx-templates", "CommandExecutionError")
  @js.native
  open class CommandExecutionError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.CommandExecutionError {
    def this(err: js.Error, command: String) = this()
  }
  
  @JSImport("docx-templates", "CommandSyntaxError")
  @js.native
  open class CommandSyntaxError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.CommandSyntaxError {
    def this(command: String) = this()
  }
  
  @JSImport("docx-templates", "ImageError")
  @js.native
  open class ImageError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.ImageError {
    def this(err: js.Error, command: String) = this()
  }
  
  @JSImport("docx-templates", "InternalError")
  @js.native
  open class InternalError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.InternalError {
    def this(msg: String) = this()
  }
  
  @JSImport("docx-templates", "InvalidCommandError")
  @js.native
  open class InvalidCommandError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.InvalidCommandError {
    def this(msg: String, command: String) = this()
  }
  
  @JSImport("docx-templates", "NullishCommandResultError")
  @js.native
  open class NullishCommandResultError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.NullishCommandResultError {
    def this(command: String) = this()
  }
  
  @JSImport("docx-templates", "ObjectCommandResultError")
  @js.native
  open class ObjectCommandResultError protected ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.ObjectCommandResultError {
    def this(command: String) = this()
  }
  
  @JSImport("docx-templates", "TemplateParseError")
  @js.native
  open class TemplateParseError ()
    extends typingsJapgolly.docxTemplates.libErrorsMod.TemplateParseError
  
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
  inline def createReport(options: UserOptions): js.Promise[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.Uint8Array]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def createReport_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def createReport_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createReport")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  inline def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], _probe.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getMetadata(template: Buffer): js.Promise[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Category]]
  
  inline def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  inline def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
  inline def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listCommands")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[CommandSummary]]]
}
