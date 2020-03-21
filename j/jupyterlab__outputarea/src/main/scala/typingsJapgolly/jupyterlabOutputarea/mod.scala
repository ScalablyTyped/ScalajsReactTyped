package typingsJapgolly.jupyterlabOutputarea

import typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession
import typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typingsJapgolly.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import typingsJapgolly.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OutputArea protected ()
    extends typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class OutputAreaModel ()
    extends typingsJapgolly.jupyterlabOutputarea.modelMod.OutputAreaModel {
    def this(options: typingsJapgolly.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class OutputPrompt ()
    extends typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputPrompt
  
  @js.native
  class SimplifiedOutputArea ()
    extends typingsJapgolly.jupyterlabOutputarea.widgetMod.SimplifiedOutputArea
  
  @js.native
  class Stdin protected ()
    extends typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typingsJapgolly.jupyterlabOutputarea.widgetMod.Stdin.IOptions) = this()
  }
  
  @js.native
  object OutputArea extends js.Object {
    /**
      * The default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    val defaultContentFactory: typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory = js.native
    /**
      * Execute code on an output area.
      */
    def execute(
      code: String,
      output: typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea,
      session: IClientSession
    ): js.Promise[IExecuteReplyMsg] = js.native
    def execute(
      code: String,
      output: typingsJapgolly.jupyterlabOutputarea.widgetMod.OutputArea,
      session: IClientSession,
      metadata: JSONObject
    ): js.Promise[IExecuteReplyMsg] = js.native
    def isIsolated(mimeType: String, metadata: ReadonlyJSONObject): Boolean = js.native
  }
  
  @js.native
  object OutputAreaModel extends js.Object {
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsJapgolly.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    val defaultContentFactory: typingsJapgolly.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory = js.native
  }
  
}

