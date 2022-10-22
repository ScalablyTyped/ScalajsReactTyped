package typingsJapgolly.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageRequest extends StObject {
  
  /**
    * Description of the package.
    */
  var PackageDescription: js.UndefOr[typingsJapgolly.awsSdk.clientsEsMod.PackageDescription] = js.undefined
  
  /**
    * Unique identifier for the package.
    */
  var PackageName: typingsJapgolly.awsSdk.clientsEsMod.PackageName
  
  /**
    * The customer S3 location PackageSource for importing the package.
    */
  var PackageSource: typingsJapgolly.awsSdk.clientsEsMod.PackageSource
  
  /**
    * Type of package. Currently supports only TXT-DICTIONARY.
    */
  var PackageType: typingsJapgolly.awsSdk.clientsEsMod.PackageType
}
object CreatePackageRequest {
  
  inline def apply(PackageName: PackageName, PackageSource: PackageSource, PackageType: PackageType): CreatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageName = PackageName.asInstanceOf[js.Any], PackageSource = PackageSource.asInstanceOf[js.Any], PackageType = PackageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageRequest]
  }
  
  extension [Self <: CreatePackageRequest](x: Self) {
    
    inline def setPackageDescription(value: PackageDescription): Self = StObject.set(x, "PackageDescription", value.asInstanceOf[js.Any])
    
    inline def setPackageDescriptionUndefined: Self = StObject.set(x, "PackageDescription", js.undefined)
    
    inline def setPackageName(value: PackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageSource(value: PackageSource): Self = StObject.set(x, "PackageSource", value.asInstanceOf[js.Any])
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
  }
}
