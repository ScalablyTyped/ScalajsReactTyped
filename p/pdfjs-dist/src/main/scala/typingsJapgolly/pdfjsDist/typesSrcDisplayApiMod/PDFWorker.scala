package typingsJapgolly.pdfjsDist.typesSrcDisplayApiMod

import org.scalajs.dom.Worker
import typingsJapgolly.pdfjsDist.anon.Name
import typingsJapgolly.pdfjsDist.typesSrcSharedMessageHandlerMod.MessageHandler
import typingsJapgolly.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFWorker")
@js.native
open class PDFWorker () extends StObject {
  def this(hasNamePortVerbosity: Name) = this()
  
  def _initialize(): Unit = js.native
  
  def _initializeFromPort(port: Any): Unit = js.native
  
  var _messageHandler: MessageHandler | Null = js.native
  
  var _port: Any = js.native
  
  var _readyCapability: PromiseCapability = js.native
  
  def _setupFakeWorker(): Unit = js.native
  
  var _webWorker: Worker | Null = js.native
  
  /**
    * Destroys the worker instance.
    */
  def destroy(): Unit = js.native
  
  var destroyed: Boolean = js.native
  
  /**
    * The current MessageHandler-instance.
    * @type {MessageHandler}
    */
  def messageHandler: MessageHandler = js.native
  
  var name: Any = js.native
  
  /**
    * The current `workerPort`, when it exists.
    * @type {Worker}
    */
  def port: Worker = js.native
  
  /**
    * Promise for worker initialization completion.
    * @type {Promise<void>}
    */
  def promise: js.Promise[Unit] = js.native
  
  var verbosity: Double = js.native
}
/* static members */
object PDFWorker {
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFWorker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pdfjs-dist/types/src/display/api", "PDFWorker.__#17@#workerPorts")
  @js.native
  val `__Numbersign17@NumbersignworkerPorts`: WeakMap[js.Object, Any] = js.native
  
  /**
    * @param {PDFWorkerParameters} params - The worker initialization parameters.
    */
  inline def fromPort(params: PDFWorkerParameters): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPort")(params.asInstanceOf[js.Any]).asInstanceOf[Any]
}
