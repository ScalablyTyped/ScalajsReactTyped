package typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjectsDatabasesDocumentsApiClientXgafvEnum extends StObject {
  
  var `1`: ProjectsDatabasesDocumentsApiClientXgafv
  
  var `2`: ProjectsDatabasesDocumentsApiClientXgafv
  
  def values(): js.Array[ProjectsDatabasesDocumentsApiClientXgafv]
}
object IProjectsDatabasesDocumentsApiClientXgafvEnum {
  
  inline def apply(
    `1`: ProjectsDatabasesDocumentsApiClientXgafv,
    `2`: ProjectsDatabasesDocumentsApiClientXgafv,
    values: CallbackTo[js.Array[ProjectsDatabasesDocumentsApiClientXgafv]]
  ): IProjectsDatabasesDocumentsApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal(values = values.toJsFn)
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesDocumentsApiClientXgafvEnum]
  }
  
  extension [Self <: IProjectsDatabasesDocumentsApiClientXgafvEnum](x: Self) {
    
    inline def set1(value: ProjectsDatabasesDocumentsApiClientXgafv): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: ProjectsDatabasesDocumentsApiClientXgafv): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def setValues(value: CallbackTo[js.Array[ProjectsDatabasesDocumentsApiClientXgafv]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
