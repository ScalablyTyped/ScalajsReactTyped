package typingsJapgolly.devextreme.mod.default

import typingsJapgolly.devextreme.mod.DevExpress.fileProvider.AjaxFileProviderOptions
import typingsJapgolly.devextreme.mod.DevExpress.fileProvider.ArrayFileProviderOptions
import typingsJapgolly.devextreme.mod.DevExpress.fileProvider.CustomFileProviderOptions
import typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProviderOptions
import typingsJapgolly.devextreme.mod.DevExpress.fileProvider.RemoteFileProviderOptions
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "fileProvider")
@js.native
object fileProvider extends js.Object {
  @js.native
  class AjaxFileProvider ()
    extends typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: AjaxFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class ArrayFileProvider ()
    extends typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: ArrayFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class CustomFileProvider ()
    extends typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: CustomFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class FileProvider ()
    extends typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: FileProviderOptions[typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProvider]) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
  @js.native
  class RemoteFileProvider ()
    extends typingsJapgolly.devextreme.mod.DevExpress.fileProvider.FileProvider {
    def this(options: RemoteFileProviderOptions) = this()
    /** Gets the specified items' content. */
    /* CompleteClass */
    override def getItemContent(items: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  }
  
}

