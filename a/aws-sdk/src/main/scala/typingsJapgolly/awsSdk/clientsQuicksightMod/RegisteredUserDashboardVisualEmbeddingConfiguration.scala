package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserDashboardVisualEmbeddingConfiguration extends StObject {
  
  /**
    * The visual ID for the visual that you want the user to embed. This ID is included in the output URL. When the URL in response is accessed, Amazon QuickSight renders this visual. The Amazon Resource Name (ARN) of the dashboard that the visual belongs to must be included in the AuthorizedResourceArns parameter. Otherwise, the request will fail with InvalidParameterValueException.
    */
  var InitialDashboardVisualId: DashboardVisualId
}
object RegisteredUserDashboardVisualEmbeddingConfiguration {
  
  inline def apply(InitialDashboardVisualId: DashboardVisualId): RegisteredUserDashboardVisualEmbeddingConfiguration = {
    val __obj = js.Dynamic.literal(InitialDashboardVisualId = InitialDashboardVisualId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredUserDashboardVisualEmbeddingConfiguration]
  }
  
  extension [Self <: RegisteredUserDashboardVisualEmbeddingConfiguration](x: Self) {
    
    inline def setInitialDashboardVisualId(value: DashboardVisualId): Self = StObject.set(x, "InitialDashboardVisualId", value.asInstanceOf[js.Any])
  }
}
