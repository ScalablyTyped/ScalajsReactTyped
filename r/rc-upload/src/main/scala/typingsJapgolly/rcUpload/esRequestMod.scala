package typingsJapgolly.rcUpload

import typingsJapgolly.rcUpload.anon.Abort
import typingsJapgolly.rcUpload.esInterfaceMod.UploadRequestOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRequestMod {
  
  @JSImport("rc-upload/es/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(option: UploadRequestOption[Any]): Abort = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(option.asInstanceOf[js.Any]).asInstanceOf[Abort]
}
