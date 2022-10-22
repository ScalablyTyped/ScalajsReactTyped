package typingsJapgolly.awsSdkServiceModel

import typingsJapgolly.awsSdkBuildTypes.buildApiModelMod.ApiModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTreeModelIsMemberMod {
  
  @JSImport("@aws-sdk/service-model/build/TreeModel/isMember", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMember(model: ApiModel, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMember")(model.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
