package typingsJapgolly.awsSdkTypes

import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/types/build/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  @js.native
  trait ServiceException[Details]
    extends Error
       with MetadataBearer {
    var details: Details = js.native
  }
  
  @js.native
  trait UnkownServiceException
    extends ServiceException[js.UndefOr[scala.Nothing]] {
    @JSName("name")
    var name_UnkownServiceException: typingsJapgolly.awsSdkTypes.awsSdkTypesStrings.Error = js.native
  }
  
}

