package typingsJapgolly.awsSdkLocationConstraintMiddleware

import typingsJapgolly.awsSdkLocationConstraintMiddleware.anon.LocationConstraint
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/location-constraint-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def locationConstraintMiddleware[Input /* <: LocationConstraintAwareInput */, Output /* <: js.Object */](regionProvider: Provider[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("locationConstraintMiddleware")(regionProvider.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait LocationConstraintAwareInput extends StObject {
    
    var CreateBucketConfiguration: js.UndefOr[LocationConstraint] = js.undefined
  }
  object LocationConstraintAwareInput {
    
    inline def apply(): LocationConstraintAwareInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationConstraintAwareInput]
    }
    
    extension [Self <: LocationConstraintAwareInput](x: Self) {
      
      inline def setCreateBucketConfiguration(value: LocationConstraint): Self = StObject.set(x, "CreateBucketConfiguration", value.asInstanceOf[js.Any])
      
      inline def setCreateBucketConfigurationUndefined: Self = StObject.set(x, "CreateBucketConfiguration", js.undefined)
    }
  }
}
