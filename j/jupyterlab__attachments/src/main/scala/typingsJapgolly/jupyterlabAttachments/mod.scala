package typingsJapgolly.jupyterlabAttachments

import typingsJapgolly.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typingsJapgolly.jupyterlabAttachments.modelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class AttachmentsResolver protected ()
    extends typingsJapgolly.jupyterlabAttachments.modelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typingsJapgolly.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions) = this()
  }
  
  @js.native
  object AttachmentsModel extends js.Object {
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsJapgolly.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    val defaultContentFactory: typingsJapgolly.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory = js.native
  }
  
}

