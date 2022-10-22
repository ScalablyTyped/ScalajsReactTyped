package typingsJapgolly.cloudeventsSdk

import typingsJapgolly.cloudeventsSdk.libCloudeventMod.CloudEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsHttpValidationBinaryMod {
  
  @JSImport("cloudevents-sdk/lib/bindings/http/validation/binary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(payload: Any, headers: Any, receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(payload.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(payload: Any, headers: Any, receiver: Any): CloudEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(payload.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[CloudEvent]
}
